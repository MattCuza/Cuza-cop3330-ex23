/*
 *  UCF COP3330 Fall 2021 Assignment 1 Solution
 *  Copyright 2021 Matthew Cuza
 */
package org.example;
import java.util.*;

public class App {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String choice;

        System.out.print("Is the car silent when you turn the key? ");

        choice = sc.nextLine();

        if (choice.equalsIgnoreCase("yes")) {

            System.out.print("Are the Battery terminals corroded? ");

            choice = sc.nextLine();

            if (choice.equalsIgnoreCase("yes"))

                System.out.println("Clean the terminals and try starting again.");

            else

                System.out.println("Replace cables and try again");

        }
        else {

            System.out.print("Does the car make a slicking noise? ");

            choice = sc.nextLine();

            if (choice.equalsIgnoreCase("yes"))

                System.out.println("Replace the Battery.");

            else {

                System.out.print("Does the car crank up but fail to start? ");

                choice = sc.nextLine();

                if (choice.equalsIgnoreCase("yes"))

                    System.out.println("Check spark plug connection.");

                else {

                    System.out.print("Does the engine start and then die? ");

                    choice = sc.nextLine();

                    if (choice.equalsIgnoreCase("yes")) {
                        System.out.println("Does your car have fuel injection? ");
                        choice = sc.nextLine();

                        if (choice.equalsIgnoreCase("yes"))
                            System.out.println("Get in it for service.");
                        else
                            System.out.println("Check to ensure the choke is opening and closing.");
                    }
                    else {
                        System.out.println("This should not be possible.");
                    }
                }
            }
        }
    }
}