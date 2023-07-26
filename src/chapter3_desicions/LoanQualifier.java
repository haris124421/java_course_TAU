package chapter3_desicions;

import java.util.Scanner;

public class LoanQualifier {

    public static void main (String[] args) {

        int baseSalary = 30000;
        int serviceYears = 2;

        System.out.println("Enter you Salary");
        Scanner sc = new Scanner(System.in);
        double salary = sc.nextDouble();

        System.out.println("Enter the number of years for your service with your current employer");
        double years = sc.nextDouble();

        sc.close();

        if (salary >= baseSalary) {
            if(years >= serviceYears){
                System.out.println("Congrats!! You qualified for loan");
            }
            else {
                System.out.println("You must have worked at least "
                        + serviceYears + " years.");
            }
        }
        else {
            System.out.println("You should have a salary of at least "
                    + baseSalary + " to qualify for loan.");
        }
    }
}
