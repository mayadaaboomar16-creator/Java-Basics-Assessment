import java.util.Scanner;

public class StudentMarks {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        for (int i = 1; i <= 5; i++) {
            System.out.println("Enter student name : ");
            String name = input.next();
            double sum = 0;
            for (int j = 1; j <= 3; j++) {
                System.out.println("Enter mark " + j + ":");
                sum += input.nextDouble();
            }
                double average = sum / 3;
                String grade = "";
                if (average >= 90) {
                    System.out.println("Grade = Excellent");
                } else if (average >= 75) {
                    System.out.println("Grade = Good");
                } else if (average >= 50) {
                    System.out.println("Grade = pass");
                } else {
                    System.out.println("Grade = fail");
                }
                System.out.println("Student : " + name);
                System.out.println("Average :" + average);
                System.out.println("Grade :" + grade);
            }
        }
    }