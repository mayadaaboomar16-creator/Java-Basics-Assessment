import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter first number : ");
        double num1 = input.nextDouble();
        System.out.print("Enter second number : ");
        double num2 = input.nextDouble();
        System.out.print("Choose operation : ");
        char operation = input.next().charAt(0);
        switch (operation) {
            case '+':
                System.out.println("Result = " + (num1 + num2));
                break;
            case '-':
                System.out.println("Result = " + (num1 - num2));
                break;
            case '*':
                System.out.println("Result = " + (num1 * num2));
                break;
            case '/':
                if (num2 == 0) {
                    System.out.println("Cannot divide by zero");
                } else {
                    System.out.println("Result = " + (num1 / num2));
                    break;
                }
            default:
                System.out.println("Invalid operation");
        }
        input.close();
    }
}
