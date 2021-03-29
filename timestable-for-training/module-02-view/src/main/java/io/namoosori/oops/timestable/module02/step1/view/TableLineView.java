/*
 * COPYRIGHT (c) NEXTREE Consulting 2014
 * This software is the proprietary of NEXTREE Consulting CO.
 *
 * @author <a href="mailto:tsong@nextree.co.kr">Song, Taegook</a>
 * @since 2014. 6. 10.
 */
package io.namoosori.oops.timestable.module02.step1.view;

import io.namosoori.oops.timestable.module01.step1.domain.Table;

import java.util.LinkedList;

public interface TableLineView {
	//
	void takeUnitTables(LinkedList<Table> tables);
	void showTableLine();
	void setTableLineViewOption(TableLineViewOption tableLineViewOption);
	TableLineViewOption getTableLineViewOption();
}