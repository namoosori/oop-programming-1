package io.namoosori.oops.timestable.module03.step2;

import io.namosoori.oops.timestable.module01.step1.domain.TimesTable;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class MenuBar {
    //
    private Scanner scanner;
    private String title;
    private Map<Integer, AbstractMenu> menuMap;

    public MenuBar(String title) {
        //
        this.scanner = new Scanner(System.in);
        this.title = title;
        this.menuMap = new LinkedHashMap<>();
    }

    public void show() {
        //
        boolean exit = false;

        while(true) {
            System.out.println("\n" + title);
            for (AbstractMenu abstractMenu : menuMap.values()) {
                System.out.println(abstractMenu.requestFormatTitle());
            }

            AbstractMenu selectedMenu = takeValue(scanner);
            if(selectedMenu.isExitMenu()) {
                System.out.println(selectedMenu.getExitMessage());
                break;
            }

            System.out.println("..... ");
            selectedMenu.show(scanner);
        }
    }

    public void addMenu(AbstractMenu abstractMenu) {
        //
        this.menuMap.put(abstractMenu.getSequence(), abstractMenu);
    }

    public boolean isValidSequence(int sequence) {
        //
        if (menuMap.get(sequence) != null) {
            return true;
        }

        return false;
    }

    public AbstractMenu takeValue(Scanner scanner) {
        //
        int menuSequence;

        while(true) {
            System.out.print(buildTopMenuSelectionCommand());
            menuSequence = scanner.nextInt();

            if(menuSequence == AbstractMenu.EXIT_MENU) {
                break;
            }

            if(!isValidSequence(menuSequence)) {
                System.out.println(" >> Invalid input value, input again !!");
                continue;
            }

            break;
        }

        return menuMap.get(menuSequence);
    }

    public static String buildTopMenuSelectionCommand() {
        //
        return String.format(
                " >> Select display format for Timestable (Exit:%s)): ",
                AbstractMenu.PREVIOUS_MENU
        );
    }
}