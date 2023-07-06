package ch04;

import java.util.Scanner;

public class S03Quiz {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int score = scanner.nextInt();
        char grade;
        
        switch (score / 10) {
            case 10:
            case 9:
                grade = 'A';
                break;
            case 8:
                grade = 'B';
                break;
            case 7:
                grade = 'C';
                break;
            case 6:
                grade = 'D';
                break;

            default:
                grade = 'F';
                break;
        }

        System.out.println("학점은 " + grade);
        scanner.close();
    }
}
