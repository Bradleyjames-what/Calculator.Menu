package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        menu();

        Scanner scanner = new Scanner(System.in);
        float userInput1, userInput2;
        int userCommand;
        float userResult;
        System.out.print("Please enter the first number");
        userInput1 = scanner.nextFloat();
        System.out.print("Please enter the second number");
        userInput2 = scanner.nextFloat();
        System.out.print("Please select the operation from the calculator menu");
        userCommand = scanner.nextInt();

        while (userCommand > 0 && userCommand < 7) {
            switch (userCommand) {
                case 1:
                    userResult = userInput1 + userInput2;
                    System.out.println(userResult);
                    break;


                case 2:
                    userResult = userInput1 - userInput2;
                    System.out.println(userResult);
                    break;

                case 3:
                    userResult = userInput1 * userInput2;
                    System.out.println(userResult);
                    break;

                case 4:
                    userResult = userInput1 / userInput2;
                    System.out.println(userResult);
                    break;


                case 5:
                    userResult = userInput1 % userInput2;
                    System.out.println(userResult);
                    break;

                case 6:
                    System.out.println("Exit.....");
                    System.exit(6);
                    break;

            }
           menu();
            System.out.print("Please enter the first number");
            userInput1 = scanner.nextFloat();
            System.out.print("Please enter the second number");
            userInput2 = scanner.nextFloat();
            System.out.print("Please select the operation from the calculator menu");
            userCommand = scanner.nextInt();

        }
    }

    public static void menu(){
        System.out.println("Calculator options");
        System.out.println("1.ADD");
        System.out.println("2.Subtract");
        System.out.println("3.Multiply");
        System.out.println("4.Divide");
        System.out.println("5.Modulous Dvision");
        System.out.println("6.Exit");


    }

}



