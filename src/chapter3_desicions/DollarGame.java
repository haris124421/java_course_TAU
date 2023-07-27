package chapter3_desicions;

import java.util.Scanner;

public class DollarGame {

    public static void main (String[] args) {

        int nickles = 5;
        int dimes = 10;
        int quarters = 25;
        int dollar = 100;

        Scanner sc = new Scanner(System.in);

        System.out.println("How many pennies?");
        int userPennies = sc.nextInt();

        System.out.println("How many nickles?");
        int userNickles = sc.nextInt();
        userNickles *= nickles;

        System.out.println("How many dimes?");
        int userDimes = sc.nextInt();
        userDimes *= dimes;

        System.out.println("How many quarters?");
        int userQuarters = sc.nextInt();
        userQuarters *= quarters;

        int userTotal = userPennies + userNickles + userDimes + userQuarters;

        if(userTotal == dollar){
            System.out.println("Congrats!! You Won :)");
        }
        else if(userTotal > dollar){
            int exceeding = userTotal - dollar;
            System.out.println("Oops you lost!! It's " + exceeding + " cents more than dollar");
        }
        else{
            int lesser = dollar - userTotal;
            System.out.println("Sorry you lost!! It's " + lesser + " cents less than dollar");
        }

    }
}
