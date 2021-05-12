package hu.bencelaszlo.romancalculator;

import java.util.*;

/**
 * Common place for constant values.
 * @author Bence László
 */
public class Constants {
    public static final int maximumValidNumber = 3999;
    public static final Map<Integer, String> romanNumbers = new TreeMap<Integer, String>(Collections.reverseOrder());

    static {
        romanNumbers.put(3000, "MMM");
        romanNumbers.put(2000, "MM");
        romanNumbers.put(1000, "M");
        romanNumbers.put(900, "CM");
        romanNumbers.put(800, "DCCC");
        romanNumbers.put(700, "DCC");
        romanNumbers.put(600, "DC");
        romanNumbers.put(500, "D");
        romanNumbers.put(400, "CD");
        romanNumbers.put(300, "CCC");
        romanNumbers.put(200, "CC");
        romanNumbers.put(100, "C");
        romanNumbers.put(90, "XC");
        romanNumbers.put(80, "LXXX");
        romanNumbers.put(70, "LXX");
        romanNumbers.put(60, "LX");
        romanNumbers.put(50, "L");
        romanNumbers.put(40, "XL");
        romanNumbers.put(30, "XXX");
        romanNumbers.put(20, "XX");
        romanNumbers.put(10, "X");
        romanNumbers.put(9, "IX");
        romanNumbers.put(8, "VIII");
        romanNumbers.put(7, "VII");
        romanNumbers.put(6, "VI");
        romanNumbers.put(5, "V");
        romanNumbers.put(4, "IV");
        romanNumbers.put(3, "III");
        romanNumbers.put(2, "II");
        romanNumbers.put(1, "I");
    }
}