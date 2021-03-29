package io.namoosori.oops.timestable.module02.step1.view;

import io.namosoori.oops.timestable.module01.step1.domain.Table;
import lombok.Getter;
import lombok.Setter;

import java.util.LinkedList;

@Getter
@Setter
public abstract class AbstractTableLineView {
    //
    private TableLineViewOption tableLineViewOption;
    private int columnCount;

    protected AbstractTableLineView(TableLineViewOption tableLineViewOption) {
        //
        this.tableLineViewOption = tableLineViewOption;
        this.columnCount = tableLineViewOption.getColumnCount();
    }

    abstract public void takeUnitTables(LinkedList<Table> tables);
    abstract public void showTableLine();
}