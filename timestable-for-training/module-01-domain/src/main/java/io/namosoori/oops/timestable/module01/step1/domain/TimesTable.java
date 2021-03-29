/*
 * COPYRIGHT (c) NEXTREE Consulting 2014
 * This software is the proprietary of NEXTREE Consulting CO.
 *
 * @author <a href="mailto:tsong@nextree.co.kr">Song, Taegook</a>
 * @since 2014. 6. 10.
 */
package io.namosoori.oops.timestable.module01.step1.domain;

import io.namosoori.oops.timestable.module01.util.JsonSerializable;

import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

public class TimesTable implements JsonSerializable {
	//
	private int startLeftNumber;
	private int endLeftNumber;
	private TableOption tableOption;
	private Map<Integer, Table> tableMap;

	public List<Table> requestTables(int startLeftNumber) {
		//
		return null;
	}

	// 코드를 채우세요.
 }