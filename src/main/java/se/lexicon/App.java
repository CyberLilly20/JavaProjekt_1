package se.lexicon;

/**
 * Hello world!
 */
public class App {
    public static void main(String[] args) {
        System.out.println("Hello World!");
        System.out.println("Hello");
        System.out.println("Liljana!");

        // if els if statement


        int year = 2800;
        if (year % 400 == 0) {
            System.out.println("Leap year");
        } else if (year % 100 == 0) {
            System.out.println("Not leap year");
        } else if (year % 4 == 0) {
            System.out.println("Leap year");

        }
        {

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















        }



    }










}
