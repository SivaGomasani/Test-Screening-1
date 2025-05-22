import java.util.Scanner;

class Calculator {
    double a, b;
    String operation;

    public Calculator(double a, double b, String operation) {
        this.a = a;
        this.b = b;
        this.operation = operation;
    }

    public double calculate() {
        switch (operation.toLowerCase()) {
            case "addition":
                return a + b;
            case "subtraction":
                return a - b;
            case "multiplication":
                return a * b;
            case "division":
                return (b != 0) ? a / b : Double.NaN;
            default:
                System.out.println("Invalid operation!");
                return Double.NaN;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first number: ");
        double a = sc.nextDouble();
        System.out.println("Enter second number: ");
        double b = sc.nextDouble();
        System.out.println("Enter operation (addition, subtraction, multiplication, division): ");
        String operation = sc.next();

        Calculator calc = new Calculator(a, b, operation);
        System.out.println("Result: " + calc.calculate());
        sc.close();
    }
}