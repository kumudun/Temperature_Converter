import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class TemperatureConverterTest {

    TemperatureConverter tc = new TemperatureConverter();

    @Test
    void testFahrenheitToCelsius() {
        assertEquals(0.0, tc.fahrenheitToCelsius(32), 0.001);
        assertEquals(100.0, tc.fahrenheitToCelsius(212), 0.001);
    }

    @Test
    void testCelsiusToFahrenheit() {
        assertEquals(32.0, tc.celsiusToFahrenheit(0), 0.001);
        assertEquals(212.0, tc.celsiusToFahrenheit(100), 0.001);
    }

    @Test
    void testKelvinToCelsius() {
        assertEquals(0.0, tc.kelvinToCelsius(273.15), 0.001);
        assertEquals(26.85, tc.kelvinToCelsius(300), 0.001);
    }

    @Test
    void testIsExtremeTemperature() {
        assertTrue(tc.isExtremeTemperature(60));
        assertTrue(tc.isExtremeTemperature(-50));
        assertFalse(tc.isExtremeTemperature(25));
    }
}