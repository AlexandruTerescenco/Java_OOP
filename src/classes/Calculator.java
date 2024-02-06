package classes;

import static java.lang.System.out;

public class Calculator {
    public double number;

    public void add (double a, double b) {
        out.println(a+b);
    }

    public void subtract(double a, double b) {
        out.println(a-b);
    }

    public void multiply(double a, double b) {
        out.println(a*b);
    }

    public void divide(double a, double b) {
        out.println(a/b);
    }
}
