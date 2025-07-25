
import java.util.Scanner;

class LinearEquation {
    private double a, b, c, d, e, f;

    public LinearEquation(double a, double b, double c, double d, double e, double f) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
        this.e = e;
        this.f = f;
    }

    public double getA() {
        return a;
    }

    public double getB() {
        return b;
    }

    public double getC() {
        return c;
    }

    public double getD() {
        return d;
    }

    public double getE() {
        return e;
    }

    public double getF() {
        return f;
    }

    public boolean isSolvable() {
        return ((a * d) - (b * c)) != 0;
    }

    public double getX() {
        return ((e * d) - (b * f)) / ((a * d) - (b * c));
    }

    public double getY() {
        return ((a * f) - (e * c)) / ((a * d) - (b * c));
    }
}

public class LinearEquation1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a, b, c, d, e, f: ");
        double a = scanner.nextDouble();
        double b = scanner.nextDouble();
        double c = scanner.nextDouble();
        double d = scanner.nextDouble();
        double e = scanner.nextDouble();
        double f = scanner.nextDouble();

        LinearEquation linearEquation = new LinearEquation(a, b, c, d, e, f);

        if (linearEquation.isSolvable()) {
            System.out.printf("x is %.1f and y is %.1f%n", linearEquation.getX(), linearEquation.getY());
        } else {
            System.out.println("The equation has no solution.");
        }
    }
}