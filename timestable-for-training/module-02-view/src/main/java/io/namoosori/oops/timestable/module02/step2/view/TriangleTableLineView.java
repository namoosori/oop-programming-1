/*
 * COPYRIGHT (c) NEXTREE Consulting 2014
 * This software is the proprietary of NEXTREE Consulting CO.
 *
 * @author <a href="mailto:tsong@nextree.co.kr">Song, Taegook</a>
 * @since 2014. 6. 10.
 */
package io.namoosori.oops.timestable.module02.step2.view;

import io.namoosori.oops.timestable.module02.step1.view.AbstractTableLineView;
import io.namoosori.oops.timestable.module02.step1.view.TableLineView;
import io.namoosori.oops.timestable.module02.step1.view.TableLineViewOption;
import io.namosoori.oops.timestable.module01.step1.domain.Table;
import lombok.Getter;
import lombok.Setter;

import java.util.*;

public class TriangleTableLineView extends AbstractTableLineView {
	//
	private static final int DefaultTableLength = 16;

	private int startIndex;
	private List<Iterator<String>> equationIteratorList;

	public TriangleTableLineView(TriangleTableLineView parentView) {
		//
		this(parentView.getTableLineViewOption());
		this.startIndex = parentView.getStartIndex() -1;
		super.setColumnCount(parentView.getColumnCount() + 1);
	}

	public TriangleTableLineView(TableLineViewOption tableLineViewOption) {
		//
		super(tableLineViewOption);
		this.startIndex = 3;
		super.setColumnCount(1);
	}

	public int getStartIndex() {
		//
		return startIndex;
	}

	@Override
	public void takeUnitTables(LinkedList<Table> sourceTables) {
		//
		// 코드를 작성하세요.
	}

	@Override
	public void showTableLine() {
		//
		// 코드를 작성하시오.
	}

}