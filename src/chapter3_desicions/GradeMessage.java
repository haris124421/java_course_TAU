package chapter3_desicions;

import java.util.Scanner;

public class GradeMessage {

    public static void main (String[] args) {

        System.out.println("Enter your grade");
        Scanner sc = new Scanner(System.in);
        String grade = sc.next();

        String message;

        switch(grade){
            case "A":
                message = "Excellent Job!!";
                break;
            case "B":
                message = "Great Job!!";
                break;
            case "C":
                message = "Good Job!!";
                break;
            case "D":
                message = "You need to work a bit harder!";
                break;
            case "F":
                message = "Ah oh!!";
                break;
            default:
                message = "Invalid grade!!";
        }

        System.out.println(message);

    }
}
