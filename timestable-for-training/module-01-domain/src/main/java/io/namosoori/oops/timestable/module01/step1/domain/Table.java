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

import java.util.*;

import static java.util.stream.Collectors.toCollection;

public class Table implements JsonSerializable {
	// 단
	private int leftNumber;
	private Format format;
	private SortOrder equationOrder;
	private Map<Integer, Equation> equationMap;

	public List<String> requestFormattedEquations() {
		return null;
	}

	// 코드를 작성하세요.
}