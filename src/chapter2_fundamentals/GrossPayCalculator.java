package chapter2_fundamentals;

import java.util.Scanner;

public class GrossPayCalculator {

    public static void main(String args[]) {

        //1. Get number of hours worked
        System.out.println("Enter the number of hours employee worked");
        Scanner scanner = new Scanner(System.in);
        int hoursWorked = scanner.nextInt();

        //2. Get the hourly rate
        System.out.println("Enter the hourly rate of employee");
        double rateHourly = scanner.nextDouble();

        //3. Calculate gross pay
        double grossPay = hoursWorked * rateHourly;

        System.out.println("Employee's gross salary is $" +grossPay);

    }
}
