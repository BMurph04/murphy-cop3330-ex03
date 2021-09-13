/*
 * UCF COP3330 Fall 2021 Assignment 1 Solution
 * Copyright 2021 Brendon Murphy
 */
package org.example;
import java.util.Scanner;


public class App
{
    public static void main( String[] args )
    {
        //input
        System.out.println("What is the quote?");
        Scanner input = new Scanner(System.in);
        String quoteInput = input.nextLine();
        System.out.println("Who said it?");
        String personInput = input.nextLine();

        //output
        System.out.println(personInput + " says, \"" + quoteInput + "\"");
    }
}
