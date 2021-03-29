package io.namoosori.oops.timestable.module03.step2;

import io.namosoori.oops.timestable.module01.step1.domain.Equation;
import io.namosoori.oops.timestable.module01.step1.domain.TimesTable;

public class MenuConsole {
    //
    private MenuBar menuBar;

    public MenuConsole() {
        //
        this.menuBar = buildMenuBar();
    }

    public void showMenuBar() {
        //
        menuBar.show();
    }

    private MenuBar buildMenuBar() {
        //
        MenuBar menuBar = new MenuBar("Timestable menu");

        // 코드를 채우세요.

        return menuBar;
    }

    public static void main(String[] args) {
        //
        MenuConsole menuConsole = new MenuConsole();
        menuConsole.showMenuBar();
    }
}