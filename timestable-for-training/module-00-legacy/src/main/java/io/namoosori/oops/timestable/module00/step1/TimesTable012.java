/*
 * COPYRIGHT (c) NEXTREE Consulting 2014
 * This software is the proprietary of NEXTREE Consulting CO.
 *
 * @author <a href="mailto:tsong@nextree.co.kr">Song, Taegook</a>
 * @since 2014. 6. 10.
 */

package io.namoosori.oops.timestable.module00.step1;

public class TimesTable012 {
	//
	private static String EXPRESSION_FORMAT = " %d x %d = %2d ";

	public static void main(String[] args) {
		//
		TimesTable012 timesTable012 = new TimesTable012();
		timesTable012.showTable();
	}

	public void showTable() {
		//
		System.out.println("Times tables.");
		System.out.println("-------------");

		for (int i = 2; i<=9; i++) {
			for (int j = 1; j <=9; j++) {
				System.out.println(buildLine(i, j));
			}
			System.out.println("-----------");
		}
	}

	public String buildLine(int leftNumber, int rightNumber) {
		//
		return String.format(
				EXPRESSION_FORMAT,
				leftNumber,
				rightNumber,
				(leftNumber * rightNumber)
		);
	}
}