package io.namoosori.oops.timestable.module02.step2.main;

import io.namoosori.oops.timestable.module02.step1.view.TableLineType;
import io.namoosori.oops.timestable.module02.step1.view.ConsoleView;
import io.namoosori.oops.timestable.module02.step1.view.TableLineViewOption;
import io.namosoori.oops.timestable.module01.step1.domain.*;


public class ViewDemo221 {
    //
    public static void main(String[] args) {
        //
        // 아래 주석을 풀고 동작하도록 관련 코드를 수정/개발하세요.
        //
//        int startLeftNumber = 1;
//        TimesTable timesTable = new TimesTable(startLeftNumber, Equation.END_LEFT_NUMBER);
//
//        showColumnTableDemo(timesTable);
//        showTriangleTableDemo(timesTable);
    }

    public static void showColumnTableDemo(TimesTable timesTable) {
        //
        TableLineViewOption tableLineViewOption = new TableLineViewOption(TableLineType.Column, 4);
        ConsoleView consoleView = new ConsoleView(tableLineViewOption);
        consoleView.show(timesTable);
    }

    public static void showTriangleTableDemo(TimesTable timesTable) {
        //
        TableLineViewOption tableLineViewOption = new TableLineViewOption(TableLineType.Triangle, 9);
        ConsoleView consoleView = new ConsoleView(tableLineViewOption);

//        TableOption tableOption = timesTable.getTableOption();
//        tableOption.setTableFormat(Format.InMath);
//        tableOption.setEquationOrder(SortOrder.Ascending);
//        tableOption.setTableOrder(SortOrder.Ascending);
//        timesTable.setTableOption(tableOption);
//        consoleView.show(timesTable);
    }
}