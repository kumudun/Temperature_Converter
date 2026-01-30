import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class TemperatureConverterTest {

    private TemperatureConverter converter;

    @BeforeEach
    void setUp() {
        converter = new TemperatureConverter();
    }

    @Test
    void testFahrenheitToCelsius_freezingPoint() {
        assertEquals(0.0, converter.fahrenheitToCelsius(32), 0.0001);
    }

    @Test
    void testFahrenheitToCelsius_boilingPoint() {
        assertEquals(100.0, converter.fahrenheitToCelsius(212), 0.0001);
    }

    @Test
    void testCelsiusToFahrenheit_freezingPoint() {
        assertEquals(32.0, converter.celsiusToFahrenheit(0), 0.0001);
    }

    @Test
    void testCelsiusToFahrenheit_boilingPoint() {
        assertEquals(212.0, converter.celsiusToFahrenheit(100), 0.0001);
    }

    @Test
    void testExtremeTemperature_low() {
        assertTrue(converter.isExtremeTemperature(-41));
    }

    @Test
    void testExtremeTemperature_high() {
        assertTrue(converter.isExtremeTemperature(51));
    }

    @Test
    void testExtremeTemperature_normal() {
        assertFalse(converter.isExtremeTemperature(25));
    }
}

