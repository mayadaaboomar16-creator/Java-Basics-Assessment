import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double balance = 1000;
        while (true) {
            System.out.println("current balance : " + balance);
            System.out.println("1- Deposit");
            System.out.println("2-Withdraw");
            System.out.println("3-Exit");
            System.out.println("Choose the option : ");
            int choice = input.nextInt();
            switch (choice) {
                case 1:
                    System.out.println("Enter deposit amount : ");
                    double deposit = input.nextDouble();
                    if (deposit > 0) {
                        balance += deposit;
                        System.out.println("The new balance is : " + balance);
                    } else {
                        System.out.println("Invalid amount ");
                    }
                    break;
                case 2:
                    System.out.println("Enter withdraw amount : ");
                    double withdraw = input.nextDouble();
                    if (withdraw > 0 && withdraw<= balance) {
                        balance -= withdraw;
                        System.out.println("The new balance is : " + balance);
                    } else {
                        System.out.println("invalid amount");
                    }
                    break;
                case 3:
                    System.out.println("Thank you");
                    return;
                default:
                    System.out.println("invalid choise");
            }
        }
    }
}
