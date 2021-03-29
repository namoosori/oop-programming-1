package io.namosoori.oops.timestable.module01.step1.domain;

public enum Format {
    //
    InEnglish("e", " %d times %d is %2d "),
    InMath("m",  " %d x %d = %2d "),
    InJava("j", " %d * %d = %2d "),
    InResultValue("r", "%2d");

    private final String initial;
    private final String formatString;

    Format(String initial, String formatString) {
        //
        this.initial = initial;
        this.formatString = formatString;
    }

    public String initial() {
        //
        return initial;
    }

    public String formatString() {
        return formatString;
    }

    public static Format valueFromInitial(String initial) {
        //
        Format format;
        switch(initial) {
            case "e":
                format = InEnglish;
                break;
            case "m":
                format = InMath;
                break;
            case "j":
                format = InJava;
                break;
            case "r":
                format = InResultValue;
                break;
            default:
                throw new IllegalArgumentException("Invalid Format initial: " + initial);
        }

        return format;
    }

    public static String validString() {
        //
        return "emjr";
    }

    public static boolean isValidInitial(String initial) {
        //
        String initialString = "emjr";
        String searchInitial = ".*" + initial + ".*";

        return initialString.matches(searchInitial);
    }

    public static void main(String[] args) {
        //
        System.out.println(isValidInitial("e"));
        System.out.println(isValidInitial("k"));
        System.out.println(valueFromInitial("j"));
    }
}