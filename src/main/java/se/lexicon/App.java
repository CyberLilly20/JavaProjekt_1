package se.lexicon;

import java.util.Scanner;

/**
 * Hello world!
 */
public class App {
    public static void main(String[] args) {
        System.out.println("-----------Exercise number 1 -------------");

        System.out.println("Hello World!");
        System.out.println("Hello");
        System.out.println("Liljana!");

        System.out.println("-----------Exercise number 2 -------------");
        // if els if statement
        int year = 2800;
        if (year % 400 == 0) {
            System.out.println("Leap year");
        } else if (year % 100 == 0) {
            System.out.println("Not leap year");
        } else if (year % 4 == 0) {
            System.out.println("Leap year");

        }

        System.out.println("-----------Exercise number 3 -------------");

          // arithmetic operations
            int num1 = 45;
            int num2 = 11;

            int sum = num1 + num2;
            {
                System.out.println( num1 +"+" + num2 + "=" +sum);
            }
            {
            int num3 = 12;
            int num4 = 4;
            System.out.println( num3+ "*" +num4+ "="+( num3*num4));
            }

           int num5 = 24;
           int num6 = 6;
           System.out.println(num5+ "/" +num6+ "=" + (num5/num6));


           int num7 = 55;
           int num8 = 12;
           System.out.println(num7+ "-" + num8 + "=" +(num7-num8));


        System.out.println("-----------Exercise number 4 -------------");
        //average of three numbers

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the first number: ");
        double n1 = scanner.nextDouble();
        System.out.println("Enter the second number: ");
        double n2 = scanner.nextDouble();
        System.out.println("Enter the third number: ");
        double n3 = scanner.nextDouble();

        double average = (n1 + n2 + n3 )/3;
        System.out.println("Average of three numbers is: "+ average);


        System.out.println("-----------Exercise number 5 -------------");

    }










}
