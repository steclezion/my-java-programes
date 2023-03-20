import java.util.Random; 
import java.util.Scanner;

/** * Java program to find and print largest prime factor of an integer number. 
for * example number 6 has two prime factors 2 and 3, but 3 is the largest prime * 
factor of 6. input 15 output 5 * * @author Javin Paul */ 


public class LargetPrimeFactor{ public static void main(String args[]) 

{ System.out.printf("Largest prime factor of number '%d' is %d %n", 6, largestPrimeFactor(6));
 System.out.printf("highest prime factor of number '%d' is %d %n", 15, largestPrimeFactor(15));
 System.out.printf("Biggest prime factor of number '%d' is %d %n", 392832, largestPrimeFactor(392832));
 System.out.printf("Largest prime factor of number '%d' is %d %n", 1787866, largestPrimeFactor(1787866));
 
 } 
 /** * @return largest prime factor of a number */ public static int largestPrimeFactor(long number) 
 {
 int i; long copyOfInput = number; 
 for (i = 2; i <= copyOfInput; i++) 
 { 
 if (copyOfInput % i == 0) 
 { 
 copyOfInput /= i; i--; }
 
 } 
 
 return i; 
 
 } 
 
 }
