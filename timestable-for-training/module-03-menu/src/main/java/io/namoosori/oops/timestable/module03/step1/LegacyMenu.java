package io.namoosori.oops.timestable.module03.step1;

import io.namoosori.oops.timestable.module02.step1.view.TableLineType;
import io.namoosori.oops.timestable.module02.step1.view.ConsoleView;
import io.namoosori.oops.timestable.module02.step1.view.TableLineViewOption;
import io.namosoori.oops.timestable.module01.step1.domain.Format;
import io.namosoori.oops.timestable.module01.step1.domain.SortOrder;
import io.namosoori.oops.timestable.module01.step1.domain.TableOption;
import io.namosoori.oops.timestable.module01.step1.domain.TimesTable;

import java.util.Scanner;

public class LegacyMenu {
    //
    private static final String EXIT_MENU = "0";
    private Scanner scanner;
    private TimesTable timesTable;

    public static void main(String[] args) {
        //
        LegacyMenu legacyMenu = new LegacyMenu();
        legacyMenu.showMenu();
    }

    public LegacyMenu() {
        //
        this.scanner = new Scanner(System.in);
        this.timesTable = new TimesTable();
    }

    public void showMenu() {
        //
        int inputNumber = 0;

        while (true) {
            displayMainMenu();
            inputNumber = selectMenu();

            switch (inputNumber) {
                //
                case 1:
                    displayColumnTypeSubMenu();
                    break;

                case 2:
                    displaySquareTypeSubMenu();
                    break;

                case 3:
                    displayTriangleTableTypeSubMenu();
                    break;

                case 0:
                    exitProgram();
                    return;

                default:
                    System.out.println("Please select again!");
            }
        }
    }

    private void displayMainMenu() {
        //
        System.out.println("");
        System.out.println("..............................");
        System.out.println(" TimesTable menu ");
        System.out.println("..............................");
        System.out.println(" 1. Column type");
        System.out.println(" 2. Square type");
        System.out.println(" 3. Triangle type");
        System.out.println(" 0. Exit");
        System.out.println("..............................");
    }

    private int selectMenu() {
        //
        System.out.print(" > Select number: ");
        int menuNumber = scanner.nextInt();

        if (menuNumber >= 0 && menuNumber <= 3) {
            scanner.nextLine();
            return menuNumber;
        } else {
            System.out.println(" > Invalid number --> " + menuNumber);
            return -1;
        }
    }

    private void exitProgram() {
        //
        scanner.close();
        System.out.println("Program exit. Bye...");
        System.exit(0);
    }

    private void displayColumnTypeSubMenu() {
        //
        while(true) {
            int columnCount = selectColumnCount();

            if (columnCount == 0) {
                break;
            }

            String tableFormatTypeInitial = selectTableFormatType();
            if (tableFormatTypeInitial.equals(EXIT_MENU)) {
                break;
            }

            String tableOrderInitial = selectTableOrder();
            if(tableOrderInitial.equals(EXIT_MENU)) {
                break;
            }

            String equationOrderInitial = selectEquationOrder();
            if(equationOrderInitial.equals(EXIT_MENU)) {
                break;
            }

            TableLineViewOption tableLineViewOption = new TableLineViewOption();
            tableLineViewOption.setTableLineType(TableLineType.Column);
            tableLineViewOption.setColumnCount(columnCount);
            ConsoleView consoleView = new ConsoleView(tableLineViewOption);

//            TableOption tableOption = new TableOption();
//            tableOption.setTableFormat(Format.valueFromInitial(tableFormatTypeInitial));
//            tableOption.setTableOrder(SortOrder.valueFromInitial(tableOrderInitial));
//            tableOption.setEquationOrder(SortOrder.valueFromInitial(equationOrderInitial));
//            timesTable.setTableOption(tableOption);
//
//            consoleView.show(timesTable);
        }
    }

    private int selectColumnCount() {
        //
        int columnCount;
        while(true) {
            System.out.print(" >> Input column count(Previous:0)): ");
            columnCount = scanner.nextInt();

            if(columnCount == 0) {
                break;
            }

            if (columnCount < 0 || columnCount >= 9) {
                System.out.println(" >> Invalid column count, select again !!");
                continue;
            }

            break;
        }

        return columnCount;
    }

    private String selectTableFormatType() {
        //
        String formatTypeInitial;
        while(true) {
            System.out.print(buildFormatSelectionSubMenu());
            formatTypeInitial = scanner.next();

            if(formatTypeInitial.equals(EXIT_MENU)) {
                break;
            }

            if(!Format.isValidInitial(formatTypeInitial)) {
                System.out.println(" >> Invalid format type, select again !!");
                continue;
            }

            break;
        }

        return formatTypeInitial;
    }

    private String selectTableOrder() {
        //
        String tableOrderInitial;
        while(true) {
            System.out.print(buildTableOrderSelectionSubMenu());
            tableOrderInitial = scanner.next();

            if(tableOrderInitial.equals(EXIT_MENU)) {
                break;
            }

            if(!SortOrder.isValidInitial(tableOrderInitial)) {
                System.out.println(" >> Invalid table order, select again !!");
                continue;
            }

            break;
        }

        return tableOrderInitial;
    }

    private String selectEquationOrder() {
        //
        String equationOrderInitial;
        while(true) {
            System.out.print(buildEquationOrderSelectionSubMenu());
            equationOrderInitial = scanner.next();

            if(equationOrderInitial.equals(EXIT_MENU)) {
                break;
            }

            if(!SortOrder.isValidInitial(equationOrderInitial)) {
                System.out.println(" >> Invalid euquation order, select again !!");
                continue;
            }

            break;
        }

        return equationOrderInitial;
    }

    private void displaySquareTypeSubMenu() {
        //
        while(true) {
            String tableOrderInitial = selectTableOrder();
            if(tableOrderInitial.equals(EXIT_MENU)) {
                break;
            }

            String equationOrderInitial = selectEquationOrder();
            if(equationOrderInitial.equals(EXIT_MENU)) {
                break;
            }

            TableLineViewOption tableLineViewOption = new TableLineViewOption();
            tableLineViewOption.setTableLineType(TableLineType.Square);
            ConsoleView consoleView = new ConsoleView(tableLineViewOption);

//            timesTable = new TimesTable(1,9);
//            TableOption tableOption = new TableOption();
//            tableOption.setTableFormat(Format.InResultValue);
//            tableOption.setTableOrder(SortOrder.valueFromInitial(tableOrderInitial));
//            tableOption.setEquationOrder(SortOrder.valueFromInitial(equationOrderInitial));
//            timesTable.setTableOption(tableOption);
//
//            consoleView.show(timesTable);
        }
    }

    private void displayTriangleTableTypeSubMenu() {
        //
        while(true) {
            String tableFormatTypeInitial = selectTableFormatType();
            if (tableFormatTypeInitial.equals(EXIT_MENU)) {
                break;
            }

            String tableOrderInitial = selectTableOrder();
            if(tableOrderInitial.equals(EXIT_MENU)) {
                break;
            }

            String equationOrderInitial = selectEquationOrder();
            if(equationOrderInitial.equals(EXIT_MENU)) {
                break;
            }

            TableLineViewOption tableLineViewOption = new TableLineViewOption();
            tableLineViewOption.setTableLineType(TableLineType.Triangle);
            ConsoleView consoleView = new ConsoleView(tableLineViewOption);

//            TableOption tableOption = new TableOption();
//            tableOption.setTableFormat(Format.valueFromInitial(tableFormatTypeInitial));
//            tableOption.setTableOrder(SortOrder.valueFromInitial(tableOrderInitial));
//            tableOption.setEquationOrder(SortOrder.valueFromInitial(equationOrderInitial));
//            timesTable.setTableOption(tableOption);
//
//            consoleView.show(timesTable);
        }
    }

    private String buildFormatSelectionSubMenu() {
        //
        return String.format(
                " >> Select format(Math type:%s, English type:%s, Java type: %s, Previous:%s)): ",
                Format.InMath.initial(),
                Format.InEnglish.initial(),
                Format.InJava.initial(),
                EXIT_MENU);
    }

    private String buildTableOrderSelectionSubMenu() {
        //
        return String.format(
                " >> Table sort order(Ascending:%s, Descending:%s, Exit:%s)): ",
                SortOrder.Ascending.initial(),
                SortOrder.Descending.initial(),
                EXIT_MENU);
    }

    private String buildEquationOrderSelectionSubMenu() {
        //
        return String.format(
                " >> Equation sort order(Ascending:%s, Descending:%s, Exit:%s)): ",
                SortOrder.Ascending.initial(),
                SortOrder.Descending.initial(),
                EXIT_MENU);
    }
}