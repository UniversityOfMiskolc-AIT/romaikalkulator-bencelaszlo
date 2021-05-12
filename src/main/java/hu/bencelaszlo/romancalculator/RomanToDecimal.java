package hu.bencelaszlo.romancalculator;

/**
 * Responsible for converting roman numbers to decimal numbers.
 * @author  Bence László
 */
public class RomanToDecimal {

    /**
     * Converts a roman number string to decimal number.
     * @param s - a string
     * @return a decimal number
     * @throws IllegalArgumentException
     */
    private int convertRecursive(String s) throws IllegalArgumentException {
        if (s.isEmpty()) {
            return 0;
        }

        if (s.startsWith("M")) {
            return 1000 + convertRecursive(s.substring(1));
        } else if (s.startsWith("CM")) {
            return 900 + convertRecursive(s.substring(2));
        } else if (s.startsWith("D")) {
            return 500 + convertRecursive(s.substring(1));
        } else if (s.startsWith("CD")) {
            return 400 + convertRecursive(s.substring(2));
        } else if (s.startsWith("C")) {
            return 100 + convertRecursive(s.substring(1));
        } else if (s.startsWith("XC")) {
            return 90 + convertRecursive(s.substring(2));
        } else if (s.startsWith("L")) {
            return 50 + convertRecursive(s.substring(1));
        } else if (s.startsWith("XL")) {
            return 40 + convertRecursive(s.substring(2));
        } else if (s.startsWith("X")) {
            return 10 + convertRecursive(s.substring(1));
        } else if (s.startsWith("IX")) {
            return 9 + convertRecursive(s.substring(2));
        } else if (s.startsWith("V")) {
            return 5 + convertRecursive(s.substring(1));
        } else if (s.startsWith("IV")) {
            return 4    + convertRecursive(s.substring(2));
        } else if (s.startsWith("I")) {
            return 1    + convertRecursive(s.substring(1));
        } else {
            throw new IllegalArgumentException("Unexpected roman numerals");
        }
    }

    /**
     * Converts a string to a decimal number.
     * @param s - a string
     * @return a roman number
     * @throws Exception
     */
    public int convert(String s) throws Exception {
        if (isInvalidRomanNumber(s)) {
            throw new Exception("The input value (" + s + ") is invalid number in the roman system");
        }

        return convertRecursive(s);
    }

    /**
     * Determines whether a string is a roman number or not.
     * @param s - the string
     * @return true if the string is a valid roman number, false otherwise
     */
    private boolean isInvalidRomanNumber(String s) {
        return s == null || s.isEmpty() || !s.matches("^(M{0,3})(CM|CD|D?C{0,3})(XC|XL|L?X{0,3})(IX|IV|V?I{0,3})$");
    }

}
