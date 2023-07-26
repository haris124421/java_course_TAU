package chapter3_desicions;

import java.util.Scanner;

public class TestResult {

    public static void main (String[] args){

        System.out.println("Enter your test score");
        Scanner sc = new Scanner(System.in);
        double score = sc.nextDouble();

        char grade;

        if(score < 60) {
            grade = 'F';
        }
        else if(score < 70) {
            grade = 'D';
        }
        else if(score < 80) {
            grade = 'C';
        }
        else if(score < 90) {
            grade = 'B';
        }
        else {
            grade = 'A';
        }
        System.out.println("You scored "+grade+" grade.");
    }
}
