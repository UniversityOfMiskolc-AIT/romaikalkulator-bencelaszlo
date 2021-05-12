package hu.bencelaszlo.romancalculator;

import org.junit.Test;
import org.junit.jupiter.api.DisplayName;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class DecimalToRomanTests {
    private final DecimalToRoman decimalToRoman = new DecimalToRoman();

    @Test
    @DisplayName("Converts decimal numbers to roman numbers")
    public void convert() throws Exception {
        assertEquals("IV", decimalToRoman.convert(4));
        assertEquals("XVII", decimalToRoman.convert(17));
        assertEquals("CCXLVIII", decimalToRoman.convert( 248));
        assertEquals("DCCCXXXIX", decimalToRoman.convert(839));
        assertEquals("MMMCMXCIX", decimalToRoman.convert(3999));
    }

    @Test
    @DisplayName("Converts decimal numbers to roman numbers (invalid values)")
    public void convertInvalidNumbers() {
        assertThrows(Exception.class, () -> decimalToRoman.convert(4000));
        assertThrows(Exception.class, () -> decimalToRoman.convert(0));
        assertThrows(Exception.class, () -> decimalToRoman.convert(-1));
    }
}
