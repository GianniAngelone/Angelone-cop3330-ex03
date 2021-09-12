 /*
  *  UCF COP3330 Fall 2021 Assignment 3 Solution
  *  Copyright 2021 first_name last_name
  */
package com.exercise;
import java.util.Scanner;

public class Exercise03 {

     public static void main(String[] args)
     {
         Scanner input = new Scanner(System.in);
         System.out.print("What is the quote? ");
         String quote = input.nextLine();
         System.out.print("Who said it? ");
         String name = input.nextLine();
         System.out.println(String.format("%s says, \"%s\" ", name, quote));

     }
 }

