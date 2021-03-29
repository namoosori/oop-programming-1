package io.namosoori.oops.timestable.module01.step1.domain;

public enum SortOrder {
    //
    Ascending("a"),
    Descending("d");

    private String initial;

    SortOrder(String initial) {
        //
        this.initial = initial;
    }

    public String initial() {
        //
        return initial;
    }

    public static SortOrder getDefault() {
        //
        return Ascending;
    }

    public static SortOrder valueFromInitial(String initial) {
        //
        SortOrder sortOrder;
        switch (initial) {
            case "a":
                sortOrder = Ascending;
                break;
            case "d":
                sortOrder = Descending;
                break;

            default:
                throw new IllegalArgumentException("Invalid SortOrder initial: " + initial);
        }

        return sortOrder;
    }

    public static String validString() {
        //
        return "ad";
    }

    public static boolean isValidInitial(String initial) {
        //
        if (initial.equals(Ascending.initial()) || initial.equals(Descending.initial())) {
            return true;
        }

        return false;
    }

    public static boolean isAscendingInitial(String initial) {
        //
        String initialString = "ad";
        String searchInitial = ".*" + initial + ".*";

        return initialString.matches(searchInitial);
    }

    public boolean isAscending() {
        //
        return this == Ascending;
    }

    public static void main(String[] args) {
        //
        System.out.println(Ascending.isAscending());
        System.out.println(Descending.isAscending());
    }
}