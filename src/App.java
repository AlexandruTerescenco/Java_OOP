import classes.tempConverter;
import classes.Calculator;
import classes.NumbersComparator;

import java.util.Scanner;

import static java.lang.System.out;

public class App {
    public static void main(String[] args) {
       //1.

        tempConverter C = new tempConverter();
        tempConverter F = new tempConverter();
        //C.value = 100;
        //F.value = 100;

        //2.
        Scanner val = new Scanner(System.in);
//        out.println("Introdu valoarea Celsius");
//        C.value = val.nextDouble();
//        out.println("Introdu valoarea Fahrenheit3");
//        F.value = val.nextDouble();
//
//        C.convertToFahr(C.value);
//        F.convertToCelsius(F.value);

        //3.
        //Calculator a = new Calculator();
        //Calculator b = new Calculator();

//        out.println("Introdu a");
//        a.number = val.nextDouble();
//        out.println("Introdu b");
//        b.number = val.nextDouble();
//
//        a.add(a.number,b.number);
//        a.subtract(a.number,b.number);
//        a.multiply(a.number,b.number);
//        a.divide(a.number,b.number);

        //4.
        NumbersComparator a = new NumbersComparator();
        NumbersComparator b = new NumbersComparator();
        out.println("Introdu a");
        a.nr = val.nextDouble();
        out.println("Introdu b");
        b.nr = val.nextDouble();

        a.max(a.nr, b.nr);
        a.min(a.nr, b.nr);

    }
}
