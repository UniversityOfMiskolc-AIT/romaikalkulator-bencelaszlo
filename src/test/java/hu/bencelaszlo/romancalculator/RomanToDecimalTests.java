package hu.bencelaszlo.romancalculator;

import org.junit.Test;
import org.junit.jupiter.api.DisplayName;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class RomanToDecimalTests {
    private final RomanToDecimal romanToDecimal = new RomanToDecimal();

    @Test
    @DisplayName("Codes roman numbers to decimal numbers")
    public void convert() throws Exception {
        assertEquals(17, romanToDecimal.convert("XVII"));
        assertEquals(248, romanToDecimal.convert("CCXLVIII"));
        assertEquals(839, romanToDecimal.convert("DCCCXXXIX"));
        assertEquals(3999, romanToDecimal.convert("MMMCMXCIX"));
    }

    @Test
    @DisplayName("Convert invalid roman numbers to decimal numbers")
    public void convertInvalidNumbers() {
        assertThrows(Exception.class, () -> romanToDecimal.convert("MMMM"));
        assertThrows(Exception.class, () -> romanToDecimal.convert("BB"));
        assertThrows(Exception.class, () -> romanToDecimal.convert(""));
    }
}
