package classes;

import static java.lang.System.out;

public class tempConverter {
    public double value;
    public void convertToFahr(double celsius){
        out.println(celsius + " Celsius = " + celsius*((double)9/5)+32 + " Fahrenheit");
    }

    public void convertToCelsius(double fahr) {
        out.println(fahr + " Fahrenheit = " + (fahr-32)*5/9 + " Celsius");
    }
}
