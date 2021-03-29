package io.namoosori.oops.timestable.module03.step2;

import io.namoosori.oops.timestable.module02.step1.view.ConsoleView;
import io.namoosori.oops.timestable.module02.step1.view.TableLineViewOption;
import io.namosoori.oops.timestable.module01.step1.domain.TableOption;
import io.namosoori.oops.timestable.module01.step1.domain.TimesTable;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.*;

@Getter
@Setter
@NoArgsConstructor
public abstract class AbstractMenu {
    //
    public static final String PREVIOUS_MENU = "0";
    public static final int EXIT_MENU = 0;

    private int sequence;
    private String title;
    private String exitMessage;

    private List<OptionItem> optionItems;

    public AbstractMenu(int sequence, String title) {
        //
        this(sequence, title, null);
    }

    public AbstractMenu(int sequence,
                        String title,
                        String exitMessage) {
        //
        this.sequence = sequence;
        this.title = title;
        this.exitMessage = exitMessage;
        this.optionItems = new ArrayList<>();
    }

    public void assignTableViewOptionValue(TableLineViewOption tableLineViewOption) {
        //
        for(OptionItem optionItem : optionItems) {
            optionItem.setTableViewOptionValue(tableLineViewOption);
        }
    }

    public void assignTableOptionValue(TableOption tableOption) {
        //
        for(OptionItem optionItem : optionItems) {
            optionItem.setTableOptionValue(tableOption);
        }
    }

    public void show(Scanner scanner) {
        //
        boolean exit = false;
        System.out.println(title);

        for (OptionItem optionItem : optionItems) {
            optionItem.takeValue(scanner);
            if(optionItem.getInputValue().equals(PREVIOUS_MENU)) {
                return;
            }
        }

        ConsoleView consoleView = buildConsoleView();
        TimesTable timesTable = buildTimesTable();

        consoleView.show(timesTable);
    }

    public abstract ConsoleView buildConsoleView();
    public abstract TimesTable buildTimesTable();

    public void add(OptionItem optionItem) {
        //
        this.optionItems.add(optionItem);
    }

    public boolean isExitMenu() {
        //
        return sequence == 0;
    }

    public String requestFormatTitle() {
        //
        return String.format("%2d. %s",  sequence, title);
    }
}