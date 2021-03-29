package io.namoosori.oops.timestable.module03.step2;

import io.namoosori.oops.timestable.module02.step1.view.ConsoleView;
import io.namosoori.oops.timestable.module01.step1.domain.TimesTable;

import java.util.List;

public class ExitMenu extends AbstractMenu {
    //
    public ExitMenu(int sequence, String title) {
        //
        super(sequence, title);
    }

    public ExitMenu(int sequence, String title, String exitMessage) {
        //
        super(sequence, title, exitMessage);
    }

    @Override
    public ConsoleView buildConsoleView() {
        return null;
    }

    @Override
    public TimesTable buildTimesTable() {
        return null;
    }

    public static ExitMenu buildMenu() {
        //
        return new ExitMenu(0, "Exit", "Bye...");
    }
}