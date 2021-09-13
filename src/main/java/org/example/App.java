package org.example;
import java.util.Scanner;
/*
 *  UCF COP3330 Fall 2021 Assignment 1 Solution
 *  Copyright 2021 Kontawat Niyamabha
 */
public class App
{
    public static void main( String[] args )
    {
        int length, width, feet;
        double meter;
        System.out.println("What is the length of the room in feet?");
        Scanner input = new Scanner(System.in);
        length = input.nextInt();
        System.out.println("What is the width of the room in feet?");
        width = input.nextInt();
        feet = length * width;
        meter = feet * 0.09290304;
        System.out.println("You entered dimensions of " + length + " feet by " + width + " feet.");
        System.out.println("The area is\n" + feet + " square feet\n" + String.format("%.3f", meter) + " square meters");

    }
}