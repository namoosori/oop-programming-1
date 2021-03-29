/*
 * COPYRIGHT (c) NEXTREE Consulting 2014
 * This software is the proprietary of NEXTREE Consulting CO.
 *
 * @author <a href="mailto:tsong@nextree.co.kr">Song, Taegook</a>
 * @since 2014. 6. 10.
 */
package io.namoosori.oops.timestable.module02.step1.view;

import io.namosoori.oops.timestable.module01.step1.domain.Equation;
import io.namosoori.oops.timestable.module01.step1.domain.Table;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class ColumnTableLineView extends AbstractTableLineView {
	//
	private static final int DefaultTableLength = 16;

	private List<Table> tables;

	public ColumnTableLineView(TableLineViewOption tableLineViewOption) {
		//
		super(tableLineViewOption);
		this.tables = new ArrayList<>();
	}

	@Override
	public void takeUnitTables(LinkedList<Table> tables) {

	}

	@Override
	public void showTableLine() {

	}

	// 코드를 작성하세요.
}