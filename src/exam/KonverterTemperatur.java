package exam;

public class KonverterTemperatur {

    public static void tilCelsius(double farenheit) {
        double celsius = (farenheit - 32) / 1.8;
        System.out.println("The celsius is " + celsius);
    }

    public static void tilFahrenheit(double celsius) {
        double fahrenheit = celsius * 1.8 + 32;
        System.out.println("The fahrenheit is " + fahrenheit);
    }
}
