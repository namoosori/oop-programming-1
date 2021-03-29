package io.namoosori.oops.timestable.module03.step2;

import io.namoosori.oops.timestable.module02.step1.view.TableLineType;
import io.namoosori.oops.timestable.module02.step1.view.ConsoleView;
import io.namoosori.oops.timestable.module02.step1.view.TableLineViewOption;
import io.namosoori.oops.timestable.module01.step1.domain.TableOption;
import io.namosoori.oops.timestable.module01.step1.domain.TimesTable;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
public class ColumnTableMenu extends AbstractMenu {
    //
    public ColumnTableMenu(int sequence, String title) {
        //
        super(sequence, title);
    }

    public ColumnTableMenu(int sequence, String title, String exitMessage) {
        //
        super(sequence, title, exitMessage);
    }

    public static ColumnTableMenu buildMenu() {
        //
        ColumnTableMenu columnTableMenu = new ColumnTableMenu(1, "Column table");
        columnTableMenu.add(OptionItem.newInstance(OptionType.ColumnCount));
        columnTableMenu.add(OptionItem.newInstance(OptionType.TableFormat));
        columnTableMenu.add(OptionItem.newInstance(OptionType.TableOrder));
        columnTableMenu.add(OptionItem.newInstance(OptionType.EquationOrder));

        return columnTableMenu;
    }

    @Override
    public ConsoleView buildConsoleView() {
        //
        TableLineViewOption tableLineViewOption = new TableLineViewOption(TableLineType.Column);
        super.assignTableViewOptionValue(tableLineViewOption);

        ConsoleView consoleView = new ConsoleView(tableLineViewOption);
        return consoleView;
    }

    @Override
    public TimesTable buildTimesTable() {
        //
        // 주석을 풀고 코딩하여 동작하게 하세요.
        //
//        TableOption tableOption = new TableOption();
//        super.assignTableOptionValue(tableOption);
//
//        TimesTable timesTable = new TimesTable(1, 9);
//        timesTable.setTableOption(tableOption);
//
//        return timesTable;

        return null;
    }
}