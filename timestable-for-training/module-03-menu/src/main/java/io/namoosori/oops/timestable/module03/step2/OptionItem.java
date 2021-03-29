package io.namoosori.oops.timestable.module03.step2;

import io.namoosori.oops.timestable.module02.step1.view.TableLineViewOption;
import io.namosoori.oops.timestable.module01.step1.domain.Format;
import io.namosoori.oops.timestable.module01.step1.domain.SortOrder;
import io.namosoori.oops.timestable.module01.step1.domain.TableOption;
import io.namosoori.oops.timestable.module01.util.JsonSerializable;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

@Getter
@Setter
@NoArgsConstructor
public class OptionItem implements JsonSerializable {
    //
    public static final String PREVIOUS_MENU = "0";
    public static final int EXIT_MENU = 0;

    private OptionType optionType;
    private String command;
    private String validString;
    private String inputValue;

    public OptionItem(OptionType optionType,
                      String command,
                      String validString) {
        //
        this.optionType = optionType;
        this.command = command;
        this.validString = validString;
    }

    public String toString() {
        //
        return toJson();
    }

    public int requestColumnCount() {
        //
        if(!optionType.equals(OptionType.ColumnCount)) {
            return 1;
        }

        return Integer.parseInt(inputValue);
    }

    public void setTableViewOptionValue(TableLineViewOption tableLineViewOption) {
        //
        switch (optionType) {
            case ColumnCount:
                tableLineViewOption.setColumnCount(Integer.parseInt(inputValue));
        }
    }

    public void setTableOptionValue(TableOption tableOption) {
        //
        switch (optionType) {
            case TableFormat:
                tableOption.setTableFormat(Format.valueFromInitial(inputValue));
                break;
            case TableOrder:
                tableOption.setTableOrder(SortOrder.valueFromInitial(inputValue));
                break;
            case EquationOrder:
                tableOption.setEquationOrder(SortOrder.valueFromInitial(inputValue));
                break;
        }
    }

    public static List<OptionItem> newInstances(List<OptionType> optionTypes) {
        //
        List<OptionItem> optionItems = new ArrayList<>();

        for(OptionType optionType : optionTypes) {
            optionItems.add(newInstance(optionType));
        }

        return optionItems;
    }

    public static OptionItem newInstance(OptionType optionType) {
        //
        OptionItem optionItem;
            switch (optionType) {
            case TableFormat:
               optionItem = newTableFormatSelectItem();
                break;
            case ColumnCount:
                optionItem = newColumnCountSelectItem();
                break;
            case TableOrder:
                optionItem = newTableOrderSelectItem();
                break;
            case EquationOrder:
                optionItem = newEquationOrderSelectItem();
                break;

            default:
                throw new IllegalArgumentException("Invalid selection type: " + optionType);
        }

        return optionItem;
    }

    public static OptionItem newTableFormatSelectItem() {
        //
        return new OptionItem(
                OptionType.TableFormat,
                buildTableFormatSelectionCommand(),
                Format.validString()
        );
    }

    public static OptionItem newTableOrderSelectItem() {
        //
        return new OptionItem(
                OptionType.TableOrder,
                buildTableOrderSelectionCommand(),
                SortOrder.validString()
        );
    }

    public static OptionItem newEquationOrderSelectItem() {
        //
        return new OptionItem(
                OptionType.EquationOrder,
                buildEquationOrderSelectionCommand(),
                SortOrder.validString()
        );
    }

    public static OptionItem newColumnCountSelectItem() {
        //
        return new OptionItem(
                OptionType.ColumnCount,
                buildColumnCountSelectionCommand(),
                "12345678"
        );
    }

    public void takeValue(Scanner scanner) {
        //
        String value;

        while(true) {
            System.out.print(command);
            value = scanner.next();

            if(value.equals(PREVIOUS_MENU)) {
                break;
            }

            String expression = ".*" + value + ".*";
            if(!this.validString.matches(expression)) {
                System.out.println(" >> Invalid input value, select again !!");
                continue;
            }

            break;
        }

        this.inputValue = value;
    }

    public static OptionItem sample() {
        //
        OptionItem sample = new OptionItem(
                OptionType.TableFormat,
                buildTableFormatSelectionCommand(),
                Format.validString()
        );

        sample.setInputValue(Format.InMath.initial());

        return sample;
    }

    public static String buildTableFormatSelectionCommand() {
        //
        return String.format(
                " >> Select table format(Math type:%s, English type:%s, Java type: %s, Result type: %s, Previous:%s)): ",
                Format.InMath.initial(),
                Format.InEnglish.initial(),
                Format.InJava.initial(),
                Format.InResultValue.initial(),
                PREVIOUS_MENU
        );
    }

    public static String buildTableOrderSelectionCommand() {
        //
        return String.format(
                " >> Table sort order(Ascending:%s, Descending:%s, Exit:%s)): ",
                SortOrder.Ascending.initial(),
                SortOrder.Descending.initial(),
                PREVIOUS_MENU
        );
    }

    public static String buildEquationOrderSelectionCommand() {
        //
        return String.format(
                " >> Equation sort order(Ascending:%s, Descending:%s, Exit:%s)): ",
                SortOrder.Ascending.initial(),
                SortOrder.Descending.initial(),
                PREVIOUS_MENU
        );
    }

    public static String buildColumnCountSelectionCommand() {
        //
        return String.format(" >> Input column count between 1 and 8 (Previous:%s)): ",
                PREVIOUS_MENU
        );
    }

    public static void main(String[] args) {
        //
        System.out.println(sample().toPrettyJson());
    }
}