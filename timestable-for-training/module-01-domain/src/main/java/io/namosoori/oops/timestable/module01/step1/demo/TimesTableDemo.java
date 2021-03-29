package io.namosoori.oops.timestable.module01.step1.demo;

import io.namosoori.oops.timestable.module01.step1.domain.*;

public class TimesTableDemo {
    //
    public static void main(String[] args) {
        //
        TimesTable timesTable = new TimesTable();

//        TableOption tableOption = timesTable.getTableOption();
//        tableOption.setTableFormat(Format.InJava);
//        tableOption.setTableOrder(SortOrder.Ascending);
//        tableOption.setEquationOrder(SortOrder.Descending);
//        timesTable.setTableOption(tableOption);

        showTimesTable(timesTable);
    }

    public static void showTimesTable(TimesTable timesTable) {
        //
        System.out.println("Times table ");
        System.out.println("............");
//        for(Table table : timesTable.requestTables()) {
//            showUnitTable(table);
//            System.out.println("............");
//        }
    }

    public static void showUnitTable(Table table) {
        //
//        for(String formattedEquation  : table.requestFormattedEquations()) {
//            System.out.println(formattedEquation);
//        }
    }
}