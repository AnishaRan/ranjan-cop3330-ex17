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
        int weight = in.nextInt();
        System.out.print("Enter gender(1 for MALE/2 for FEMALE): ");
        int gender = in.nextInt();
        System.out.print("Enter total alcohol consumed(ounces): ");
        int oz = in.nextInt();
        System.out.print("Enter amount of hours since last drink: ");
        int hours = in.nextInt();

        //0.73 for men
        //0.66 for women
        double rM = 0.73;
        double rF = 0.66;
        double bac;
        if(gender == 1) {
            bac = (oz * 5.14 / weight * rM) - 0.015 * hours;
        } else {
            bac = (oz * 5.14 / weight * rF) - 0.015 * hours;
        }

        System.out.printf("Your BAC is %.2f\n", bac);
        String out = (bac >= 0.08) ? "It is not legal for you to drive." : "It is legal for you to drive.";
        System.out.print(out);

    }
}
