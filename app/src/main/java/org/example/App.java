package org.example;
import java.util.Scanner;

public class App {
  
  public static void main(String[] args) {
    System.out.println("Welcome to the Terribly Accurate Converter App!");
    Scanner in = new Scanner(System.in);
    System.out.print("Enter your number of ounces: ");
    int num = in.nextInt();
    if (!(num == (int)num)) {
        System.out.println("Please enter an integer...");
    } else if (num < 0) {
        System.out.println("Please enter a positive integer...");
    } else {
        System.out.println(Converter.toPounds(num));
        System.out.println(Converter.toPoundsAndOunces(num));
    }
    in.close();
    
  }
}
