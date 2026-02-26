public class TemperatureConverter {

    // Convert Fahrenheit to Celsius
    public double fahrenheitToCelsius(double fahrenheit) {
        return (fahrenheit - 32) * 5.0 / 9.0;
    }

    // Convert Celsius to Fahrenheit
    public double celsiusToFahrenheit(double celsius) {
        return (celsius * 9.0 / 5.0) + 32;
    }

    // Convert Kelvin to Celsius
    // Formula: °C = K - 273.15
    public double kelvinToCelsius(double kelvin) {
        return kelvin - 273.15;
    }

    // Check if temperature is extreme
    public boolean isExtremeTemperature(double celsius) {
        return celsius < -40 || celsius > 50;
    }

    public static void main(String[] args) {

        TemperatureConverter tc = new TemperatureConverter();

        System.out.println("F 32 -> C = " + tc.fahrenheitToCelsius(32));
        System.out.println("C 0 -> F = " + tc.celsiusToFahrenheit(0));
        System.out.println("K 300 -> C = " + tc.kelvinToCelsius(300));
        System.out.println("Is 60°C extreme? " + tc.isExtremeTemperature(60));
    }
}