package chapter2_fundamentals;

import java.util.Scanner;

public class Assignment {

    public static void main(String[] args) {

        System.out.println("Enter season of the year");
        Scanner scanner = new Scanner(System.in);
        String season = scanner.next();

        System.out.println("Enter whole number");
        int number = scanner.nextInt();

        System.out.println("Enter adjective");
        String adjective = scanner.next();

        scanner.close();

        System.out.println("On a "+adjective+" "+season+" day, I drink a minimum of "+number+" cups of coffee.");

    }
}
