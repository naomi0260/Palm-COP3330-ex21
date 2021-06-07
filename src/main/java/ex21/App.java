package ex21;

import java.util.Scanner;

/*
Write a program that converts a number from 1 to 12 to the corresponding month. Prompt for a number and display the corresponding calendar month, with 1 being January and 12 being December. For any value outside that range, display an appropriate error message.

Example Output
Please enter the number of the month: 3
The name of the month is March.
Constraints
Use a switch or case statement for this program.
Use a single output statement for this program.
 */

public class App {
    static Scanner input = new Scanner(System.in);

    public static void main(String[] args){
        System.out.print("Please enter the number of the month: ");
        int month = input.nextInt();

        while (month < 1 || month > 12){
            System.out.println("Error that is not a valid month.");
            System.out.print("Please enter the number of the month: ");
            month = input.nextInt();
        }
        switch (month){
            case 1:
                System.out.print("The name of the month is January.");
                return;
            case 2:
                System.out.print("The name of the month is February.");
                return;
            case 3:
                System.out.print("The name of the month is March.");
                return;
            case 4:
                System.out.print("The name of the month is April.");
                return;
            case 5:
                System.out.print("The name of the month is May.");
                return;
            case 6:
                System.out.print("The name of the month is June.");
                return;
            case 7:
                System.out.print("The name of the month is July.");
                return;
            case 8:
                System.out.print("The name of the month is August.");
                return;
            case 9:
                System.out.print("The name of the month is September.");
                return;
            case 10:
                System.out.print("The name of the month is October.");
                return;
            case 11:
                System.out.print("The name of the month is November.");
                return;
            case 12:
                System.out.print("The name of the month is Decmber.");
                return;
        }
    }

}
