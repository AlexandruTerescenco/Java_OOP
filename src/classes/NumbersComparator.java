package classes;

import static java.lang.System.out;

public class NumbersComparator {
    public double nr;
    public void max(double a, double b) {
        double max = 0;
        if (a > b) max = a;
        else if (b > a) max = b;
        else out.println("Numbers are equal");
        out.println("max = " + max);
    }

    public void min(double a, double b) {
        double min = 0;
        if (a < b) min = a;
        else if (b < a) min = b;
        else out.println("Numbers are equal");
        out.println("min = " + min);
    }
}
