/*
/Class: CS 1301
/Section: 2
/Name: Daniel McDuffie
/Instructor: Yinka Akinwusi
/Assignment: Homework 5
/Purpose: Generate 4 random numbers.
*/

import java.util.*;

public class RandomNumbers {

  public static void main(String[] args) {
    
    //Create random number generator.
    Random rand = new Random();
  
    //Declare variables.
    int num1, num2, num3;
    double num4;
    
    //Create random number formulas.
    
    num1 = rand.nextInt(50) + 30;
    num2 = rand.nextInt(20) + (-20);
    num3 = rand.nextInt(-20) + (-60);
    num4 = rand.nextDouble(15.9999) + 0.0;
    
    //Create output for the random numbers.
    System.out.println("Random number between 30 and 50: //t" + num1 + ".");
    System.out.println("Random number between -20 and 20: //t" + num2 + ".");
    System.out.println("Random number between -60 and -20: //t" + num3 + ".");
    System.out.println("Random number between 0.0 and 15.9999: //t" + num4 + ".");
    
  }
  
}
