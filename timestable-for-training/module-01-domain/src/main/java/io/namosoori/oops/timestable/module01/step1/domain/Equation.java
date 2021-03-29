/*
 * COPYRIGHT (c) NEXTREE Consulting 2014
 * This software is the proprietary of NEXTREE Consulting CO.
 *
 * @author <a href="mailto:tsong@nextree.co.kr">Song, Taegook</a>
 * @since 2014. 6. 10.
 */
package io.namosoori.oops.timestable.module01.step1.domain;

import io.namosoori.oops.timestable.module01.util.JsonSerializable;
import io.namosoori.oops.timestable.module01.util.JsonUtil;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Equation implements JsonSerializable {
	// 곱셈식
	public static final int DEFAULT_START_LEFT_NUMBER = 2;
	public static final int END_LEFT_NUMBER = 9;
	public static final int START_RIGHT_NUMBER = 1;
	public static final int END_RIGHT_NUMBER = 9;

	private int left;
	private int right;
	private int result;

	public Equation(int left, int right) {
		//
		this.left = left;
		this.right = right;
		this.result = left * right;
	}

	public String toString() {
		//
		return toJson();
	}

	public static Equation fromJson(String json) {
		//
		return JsonUtil.fromJson(json, Equation.class);
	}

	public String toFormatString(Format format) {
		//
		if(format.equals(Format.InResultValue)) {
			return String.format(format.formatString(), result);
		} else {
			return String.format(format.formatString(), left, right, result);
		}
	}

	public static boolean isValidRightNumber(int rightNumber) {
		//
		if(rightNumber >= START_RIGHT_NUMBER && rightNumber <= END_RIGHT_NUMBER) {
			return true;
		}

		return false;
	}

	public static Equation sample() {
		//
		return new Equation(4, 5);
	}

	public static void main(String[] args) {
		//
		System.out.println(sample().toPrettyJson());
	}
}