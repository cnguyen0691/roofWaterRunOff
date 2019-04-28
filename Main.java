package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the length: ");
        double length = input.nextDouble();
        System.out.println("Enter the width: ");
        double width = input.nextDouble();
        System.out.println("Enter the height: ");
        double height = input.nextDouble();
        //Convert to Inches
        double len = length *12;
        double wid  = width *12;

        //Calculate Volume
        double volume = len * wid * height;
        System.out.println("The Volume amount: " + volume);

        //Calculate gallons
        double gallon = volume/231;
        System.out.println("The gallon: "+gallon);


    }
}
