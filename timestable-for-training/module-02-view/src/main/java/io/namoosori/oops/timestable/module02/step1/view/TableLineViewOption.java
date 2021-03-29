package io.namoosori.oops.timestable.module02.step1.view;

import io.namosoori.oops.timestable.module01.util.JsonSerializable;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class TableLineViewOption implements JsonSerializable {
    //
    private TableLineType tableLineType;
    private int columnCount;

    public TableLineViewOption() {
        //
        this.tableLineType = TableLineType.Column;
        this.columnCount = 1;
    }

    public TableLineViewOption(TableLineType tableLineType) {
        //
        this.tableLineType = tableLineType;
        this.columnCount = 1;
    }

    public TableLineViewOption(TableLineType tableLineType,
                               int columnCount) {
        //
        this.tableLineType = tableLineType;
        this.columnCount = columnCount;
    }

    public String toString() {
        //
        StringBuilder optionBuilder = new StringBuilder();

        optionBuilder.append("TableLineType:").append(tableLineType).append(", ");
        optionBuilder.append("Column count:").append(columnCount).append(", ");

        return optionBuilder.toString();
    }
}