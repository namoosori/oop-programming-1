/*
 * COPYRIGHT (c) NEXTREE Consulting 2014
 * This software is the proprietary of NEXTREE Consulting CO.
 *
 * @author <a href="mailto:tsong@nextree.co.kr">Song, Taegook</a>
 * @since 2014. 6. 10.
 */
package io.namoosori.oops.timestable.module02.step1.view;

import io.namoosori.oops.timestable.module02.step2.view.TriangleTableLineView;
import io.namosoori.oops.timestable.module01.step1.domain.TimesTable;
import io.namosoori.oops.timestable.module01.step1.domain.Table;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class ConsoleView {
	//
	private TableLineViewOption tableLineViewOption;
	private List<AbstractTableLineView> tableLineViews;

	public ConsoleView(TableLineViewOption tableLineViewOption) {
		//
		this.tableLineViewOption = tableLineViewOption;
		this.tableLineViews = new ArrayList<>();
	}

	public void setTableViewOption(TableLineViewOption tableLineViewOption) {
		//
		this.tableLineViewOption = tableLineViewOption;
		for(AbstractTableLineView tableLineView : tableLineViews) {
			tableLineView.setTableLineViewOption(tableLineViewOption);
		}
	}

	public TableLineViewOption getTableViewOption() {
		//
		return tableLineViewOption;
	}

	public void show(TimesTable timesTable) {
		//
		tableLineViews.clear();
		int startLeftNumber = (this.tableLineViewOption.getTableLineType().equals(TableLineType.Square) ? 1 : 2);
		LinkedList<Table> sourceTables = new LinkedList<>(timesTable.requestTables(startLeftNumber));

		while(sourceTables.size() > 0) {
			//
			AbstractTableLineView tableLineView = buildTableLineView();
			tableLineView.takeUnitTables(sourceTables);
			tableLineViews.add(tableLineView);
 		}

		showTables();
	}

	private void showTables() {
		//
		System.out.println("");
		for(AbstractTableLineView tableLineView : tableLineViews) {
			tableLineView.showTableLine();
		}
	}

	private AbstractTableLineView buildTableLineView() {
		//
		AbstractTableLineView tableLineView;

		switch (tableLineViewOption.getTableLineType()) {
			case Column:
				tableLineView = new ColumnTableLineView(tableLineViewOption);
				break;
			case Square:
				tableLineView = new SquareTableLineView(tableLineViewOption);
				break;
			case Triangle:																	// for extension
				int tableViewCount = tableLineViews.size();
				if(tableViewCount == 0) {
					tableLineView = new TriangleTableLineView(tableLineViewOption);
				} else {
					tableLineView = new TriangleTableLineView((TriangleTableLineView) tableLineViews.get(tableViewCount-1));
				}
				break;

			default:
				throw new IllegalArgumentException("Invalid DisplayType: " + tableLineViewOption.getTableLineType());
		}

		return tableLineView;
	}
}