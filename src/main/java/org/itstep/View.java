package org.itstep;

import java.util.Locale;
import java.util.ResourceBundle;

public class View {
    static String MESSAGES_BUNDLE_NAME = "messages";
    public static final ResourceBundle BUNDLE = ResourceBundle.getBundle(MESSAGES_BUNDLE_NAME, new Locale("en"));

    public static final String EQUAL_SING = "=";
    public static final String SPACE_SING = " ";
    public static final String OPEN_SQUARE_BRACKET = "[";
    public static final String CLOSING_SQUARE_BRACKET = "]";

    public static final String INPUT_INT_DATA_KEY = "input.int.data";
    public static final String WRONG_INPUT_INT_DATA = "input.wrong.data";
    public static final String WRONG_RANGE_DATA = "input.wrong.range";
    public static final String CONGRATULATION = "input.congratulation";
    public static final String YOUR_WAY = "input.way";

    public void printMessage(String message) {
        System.out.println(message);
    }

    private String concatenationString(String... message) {
        StringBuilder concatString = new StringBuilder();
        for (String v : message) {
            concatString = concatString.append(v);
        }
        return new String(concatString);
    }

    String getInputMessage(int minBar, int maxBar) {
        String str = concatenationString(BUNDLE.getString(INPUT_INT_DATA_KEY), SPACE_SING, OPEN_SQUARE_BRACKET, String.valueOf(minBar), SPACE_SING, String.valueOf(maxBar), CLOSING_SQUARE_BRACKET, SPACE_SING, EQUAL_SING);
        return str;
    }

    void printWrongRangeInput(Model model) {
        printMessage(BUNDLE.getString(WRONG_RANGE_DATA) + getInputMessage(model.getMinBar(), model.getMaxBar()));
    }
    void printWrongIntInput(Model model) {
        printMessage(BUNDLE.getString(WRONG_INPUT_INT_DATA)+getInputMessage(model.getMinBar(), model.getMaxBar()));
    }

    void printCongratulation(Model model) {
        printMessage(BUNDLE.getString(CONGRATULATION)+ model.getSecretValue());
    }
    void printWay(Model model) {
        printMessage(BUNDLE.getString(YOUR_WAY)+ String.valueOf(model.getYourWay()));
    }
}
