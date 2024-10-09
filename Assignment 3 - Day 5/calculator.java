class Calculator {

    public int Addition(int a, int b) {
        return a + b;
    }


    public int Subtraction(int a, int b) {
        return a - b;
    }


    public int Multiplication(int a, int b) {
        return a * b;
    }


    public double Division(int a, int b, int[] remainder) {
        if (b == 0) {
            throw new ArithmeticException("Division by zero is not allowed.");
        }
        double quotient = (double) a / b;
        remainder[0] = a % b;
        return quotient;
    }

    public static void main(String[] args) {
        Calculator calculator = new Calculator();

        int num1 = 10;
        int num2 = 3;


        System.out.println("Addition: " + calculator.Addition(num1, num2));
        System.out.println("Subtraction: " + calculator.Subtraction(num1, num2));
        System.out.println("Multiplication: " + calculator.Multiplication(num1, num2));


        int[] remainder = new int[1];
        double quotient = calculator.Division(num1, num2, remainder);
        System.out.println("Division Quotient: " + quotient);
        System.out.println("Division Remainder: " + remainder[0]);
    }
}
