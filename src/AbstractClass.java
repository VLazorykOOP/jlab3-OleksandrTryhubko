
abstract class Function {
    abstract double calculate(double x);

    abstract void printResult(double result);
}


class Ellipse extends Function {
    double a;
    double b;

    public Ellipse(double a, double b) {
        this.a = a;
        this.b = b;
    }

    @Override
    double calculate(double x) {
        // Функція еліпса: x^2 / a^2 + y^2 / b^2 = 1
        return b * Math.sqrt(1 - (x * x) / (a * a));
    }

    @Override
    void printResult(double result) {
        System.out.println("Значення функції еліпса: " + result);
    }

    @Override
    public String toString() {
        return "Еліпс з полуосьми a = " + a + ", b = " + b;
    }

    @Override
    public boolean equals(Object obj) {
        return this == obj || (obj instanceof Ellipse other && this.a == other.a && this.b == other.b);
    }
}


class Hyperbola extends Function {
    double a;
    double b;

    public Hyperbola(double a, double b) {
        this.a = a;
        this.b = b;
    }

    @Override
    double calculate(double x) {

        return b * Math.sqrt((x * x) / (a * a) - 1);
    }

    @Override
    void printResult(double result) {
        System.out.println("Значення функції гіперболи: " + result);
    }

    @Override
    public String toString() {
        return "Гіпербола з полуосьми a = " + a + ", b = " + b;
    }

    @Override
    public boolean equals(Object obj) {
        return this == obj || (obj instanceof Hyperbola other && this.a == other.a && this.b == other.b);
    }
}

public class AbstractClass {
    public static void main(String[] args) {

        Function[] functions = { new Ellipse(2, 1), new Hyperbola(2, 1) };


        for (Function function : functions) {
            System.out.println(function);
            double result = function.calculate(0.5);
            function.printResult(result);
            System.out.println("--------------");
        }
    }
}
