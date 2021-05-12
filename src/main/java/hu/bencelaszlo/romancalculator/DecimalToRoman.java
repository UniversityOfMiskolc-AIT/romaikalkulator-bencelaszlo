package hu.bencelaszlo.romancalculator;

import java.util.Map;

/**
 * Responsible for converting decimal numbers to roman numbers.
 * @author Bence László
 */
public class DecimalToRoman {
    /**
     * Converts decimal number to roman number.
     * @param number a decimal number.
     * @return the roman number.
     * @throws Exception
     */
    public static String convert (int number) throws Exception {
        String result = "";

        isValidNumber(number);

        while (number > 0) {
            for (Map.Entry<Integer, String> entry : Constants.romanNumbers.entrySet()) {
                int arabicNumber = entry.getKey();
                String romanNumber = entry.getValue();

                if (number >= arabicNumber) {
                    result += romanNumber;
                    number -= arabicNumber;
                    break;
                }
            }
        }

        return result;
    }

    /**
     * Checks that the given parameter is valid or not.
     * @param number the number.
     * @throws Exception
     */
    private static void isValidNumber(int number) throws Exception {
        if (number > Constants.maximumValidNumber) {
            throw new Exception("Numbers greater than " + Constants.maximumValidNumber + " are invalid in the roman system");
        }

        if (number < 1) {
            throw new Exception("Numbers lesser than " + 1 + " are invalid in the roman system");
        }
    }
}
