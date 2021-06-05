package org.example;
import java.util.Scanner;

/*
 *  UCF COP3330 Summer 2021 Assignment 17 Solution
 *  Copyright 2021 Anisha Ranjan
 */
public class App 
{
    public static void main( String[] args ) {

        Scanner in = new Scanner(System.in);

        System.out.print("Enter weight: ");
        int weight = 0;
        if(in.hasNextInt()) {
            weight = in.nextInt();
        } else {
            System.out.println("Please try again and enter a numerical value.");
            System.exit(1);
        }
        System.out.print("Enter gender(1 for MALE/2 for FEMALE): ");
        int gender = -1;
        if(in.hasNextInt()) {
            gender = in.nextInt();
        } else {
            System.out.println("Please try again and enter a numerical value.");
            System.exit(1);
        }
        System.out.print("Enter total alcohol consumed(ounces): ");
        int oz = 0;
        if(in.hasNextInt()) {
            oz = in.nextInt();
        } else {
            System.out.println("Please try again and enter a numerical value.");
            System.exit(1);
        }
        System.out.print("Enter amount of hours since last drink: ");
        int hours = 0;
        if(in.hasNextInt()) {
            oz = in.nextInt();
        } else {
            System.out.println("Please try again and enter a numerical value.");
            System.exit(1);
        }


        //0.73 for men
        //0.66 for women
        double rM = 0.73;
        double rF = 0.66;
        double bac = 0;
        if(gender == 1) {
            bac = (oz * 5.14 / weight * rM) - 0.015 * hours;
        } else if(gender == 2){
            bac = (oz * 5.14 / weight * rF) - 0.015 * hours;
        } else {
            System.out.println("Please enter a valid input for gender (1 for male, 2 for female)");
            System.exit(1);
        }

        System.out.printf("Your BAC is %.2f\n", bac);
        String out = (bac >= 0.08) ? "It is not legal for you to drive." : "It is legal for you to drive.";
        System.out.print(out);

    }
}
