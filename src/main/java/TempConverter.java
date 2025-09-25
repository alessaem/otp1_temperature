import java.util.Scanner;

public class TempConverter {
    public double fahrenheitToCelsius(double fahrenheit){
        double celsius = (fahrenheit-32)*5/9;
        return celsius;
    }

    public double celsiusToFahrenheit(double celsius){
        double fahrenheit = celsius*9/5+32;
        return fahrenheit;
    }

    public boolean isExtremeTemperature(double celsius){
        if(celsius > 50 || celsius < -40 ){
            return true;
        }
        return false;
    }

    public double kelvinToCelsius(double kelvin){
        double celsius = kelvin-273.15;
        return celsius;
    }

    public static void main(String[] args) {
        TempConverter converter = new TempConverter();
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter temperature in Fahrenheit: ");
        double f = scanner.nextDouble();
        double c = converter.fahrenheitToCelsius(f);
        System.out.println(f + "°F = " + c + "°C");

        System.out.print("Enter temperature in Celsius: ");
        double c2 = scanner.nextDouble();
        double f2 = converter.celsiusToFahrenheit(c2);
        System.out.println(c2 + "°C = " + f2 + "°F");

        System.out.print("Enter temperature in Kelvin: ");
        double k = scanner.nextDouble();
        double c3 = converter.kelvinToCelsius(k);
        System.out.println(k + "K = " + c3 + "°C");

        System.out.println("Is " + c3 + "°C extreme? " + converter.isExtremeTemperature(c3));

        scanner.close();
    }


}