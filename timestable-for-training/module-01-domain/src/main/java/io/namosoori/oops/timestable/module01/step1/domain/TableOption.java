package io.namosoori.oops.timestable.module01.step1.domain;

import io.namosoori.oops.timestable.module01.util.JsonSerializable;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class TableOption implements JsonSerializable {
    //
    private Format tableFormat;
    private SortOrder tableOrder;
    private SortOrder equationOrder;

    public TableOption() {
        //
        this.tableFormat = Format.InMath;
        this.tableOrder = SortOrder.Ascending;
        this.equationOrder = SortOrder.Ascending;
    }

    public TableOption(Format tableFormat,
                       SortOrder tableOrder,
                       SortOrder equationOrder) {
        //
        this.tableFormat = tableFormat;
        this.tableOrder = tableOrder;
        this.equationOrder = equationOrder;
    }

    public String toString() {
        //
        return toJson();
    }

    public static TableOption sample() {
        //
        return new TableOption();
    }

    public static void main(String[] args) {
        //
        System.out.println(sample().toPrettyJson());
    }
}