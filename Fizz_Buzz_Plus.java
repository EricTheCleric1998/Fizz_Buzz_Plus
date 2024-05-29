/**
 * Author: Eric Hillmeyer
 * Course: CS251L Section 3SV
 * Project #1 FizzBuzz
 * Professor: Brooke Chenoweth
 */

public class FizzBuzz
{
    public static void main(String args[])
    {
        /**
         * Unnecessary for the scope of project but decided to add a catch for if user put in
         * too few arguments by accident
         */
        if(args.length != 3)
        {
            System.out.println("Expected 3 arguments from command line but got " + args.length + ".");
        }
        else
        {
            // Initialize variables num1, num2, upperLimit
            int upperLimit = Integer.parseInt(args[0]);
            int num1 = Integer.parseInt(args[1]);
            int num2 = Integer.parseInt(args[2]);
            
            // This loop will iterate starting at 1 and going to max, as determined by user
            for(int i = 1; i <= upperLimit; i++)
            {
                /**
                 * If/Else statements to properly replace specific numbers with Fizz/Buzz or
                 * FizzBuzz. Decided to start by checking if i is modulo num1 and num2 first to
                 * make sure all FizzBuzzes were caught before they were replaced with just
                 * Fizz or Buzz. If nothing else, simply print i
                */
                if(i % num1 == 0 && i % num2 == 0)
                {
                    System.out.println("FizzBuzz");
                }
                else if(i % num1 == 0)
                {
                    System.out.println("Fizz");
                }
                else if(i % num2 == 0)
                {
                    System.out.println("Buzz");
                }
                else
                {
                    System.out.println(i);
                }
            }
        }
    }
}
