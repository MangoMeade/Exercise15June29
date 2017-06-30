package com.jetBrains;
import java.util.Scanner;
//Authors: Joya and Andres
//Program prints the cube of numbers from 1 to the number chosen by the user

public class Main {

    public static void main(String[] args) {
	// write your code here
        Scanner scnr = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int num = scnr.nextInt();
        cubed(num);
    }
    public static int cubed(int userInput) {
        int cubedEx = 0;
        String numAsStt;
        for (int i = 1; i < userInput + 1; i++) {
            cubedEx = (int)Math.pow(i, 3);
            System.out.print(cubedEx + " ");
        }
        return cubedEx;
    }
}
