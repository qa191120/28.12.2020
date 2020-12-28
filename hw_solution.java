package com.company;

import java.util.Random;
import java.util.Scanner;

public class Main
{
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        Random r = new Random();
        /*
        -- targilim:
        -- 1. create an array of double numbers with these numbers:
                0.9, -6.5555, 3.24, 10.11, 20.35
                -- 1.1. print the first element
                -- 1.2. print the last element
                -- 1.3. print the middle element
                -- 1.4. write a for loop which prints all the element in the array
                -- 1.5. write a for loop which prints all the element in the array in reverse
                -- 1.6. use scanner to read a double number from the user.
                 --  print all the elements in the array which are bigger than the user-number
                -- 2. create an array A of integer numbers with these numbers: 4, 10, 20, 40, 1000
                -- 2.1. create a second array B with these numbers: 0, 0, 0, 0, 0
                -- 2.2. copy all elements from A to B
         */

        //                       0      1      2      3       4      5
        double[] arr_double = { 0.9, -6.5555, 3.24, 10.11, 20.35 };
        System.out.println(arr_double[0]);
        System.out.println(arr_double[4]);
        System.out.println(arr_double [ arr_double.length - 1 ] ); // last
        System.out.println(arr_double[ arr_double.length / 2 ]); // middle

        for (int index = 0; index < arr_double.length; index++)
        {
            System.out.println(arr_double[index]);
        }
        for (int index = arr_double.length - 1; index >= 0; index--)
        {
            System.out.println(arr_double[index]);
        }

        System.out.println("Please enter a number:");
        double user_number = s.nextDouble();
        for (int index = 0; index < arr_double.length; index++)
        {
            if (arr_double[index] > user_number)
            {
                System.out.println(arr_double[index]);
            }
        }

        //         0   1   2   3     4
        int[] A = {4, 10, 20, 40, 1000};
        int[] B = {4, 10, 20,  0,    0};
        for (int index = 0; index < arr_double.length; index++)
        {
            B[index] = A[index];
        }

        System.out.println("Goodbye...");
    }
}
