package com.company;

import java.util.Random;
import java.util.Scanner;

public class Main
{
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        Random r = new Random();

        /*
        // 1. when we do not know the array size
        // 2. long array
        //int[] arr = {1,2,3,4,5,6,}

        //int range = r.nextInt(100);

        //                               0  1  2  3
        int[] arr_int = new int[4];  // {0, 0, 0, 0} -- length = 4
        for (int index = 0; index < arr_int.length; index++)
        {
            arr_int[index] = index;
        }
        for (int index = 0; index < arr_int.length; index++)
        {
            System.out.println(arr_int[index]);
        }

        // define array in length of 10
        // populate the array 10 random numbers
        // print the array
        int[] arr_rnd = new int[10];
        for (int index = 0; index < arr_rnd.length; index++)
        {
            arr_rnd[index] = r.nextInt(100) + 1;
        }
        for (int index = 0; index < arr_rnd.length; index++)
        {
            System.out.println(arr_rnd[index]);
        }

        // define array in length of 20
        // populate the array with numbers from 20 to 1
        // { 1, 2, 3, ... 20 }
        // { 20, 19, 18, 17, 16 ...}
        int[] twenty = new int[3];
        for (int index = 0; index < twenty.length; index++)
        {
            // 0 --> 1
            // 1 --> 2
            twenty[index] = index;
        }
        for (int index = 0; index < twenty.length; index++)
        {
            // 0 --> 20
            // 1 --> 19
            twenty[index] = 20 - index;
        }

        // how to create random size array
        float[] arr_float = new float[r.nextInt(100)+1];

        // input a number from user (int)
        // define an array of double[] in this size
        System.out.println("Please enter array size:");
        int size = s.nextInt();
        double[] arr_double = new double[size];
*/
        // ask user for the array size (class)
        // create an array of this size (int)
        // input all numbers from the user into the array
        System.out.println("please enter array size:");
        int array_size_of_numbers = s.nextInt();
        int[] grades = new int[ array_size_of_numbers ];
        for (int index = 0 ; index < grades.length; index++)
        {
            System.out.println(String.format("Please enter grade #%d:", index + 1));
            grades[index] = s.nextInt();
        }

        int sum = 0;
        for (int index = 0; index < grades.length; index++)
        {
            sum = sum + grades[index];
        }
        float avg = sum / grades.length;
        System.out.println(avg);

        // 1. input array size from user
        //    create int array in the given size
        //    populate the array with random numbers
        //    sum the array
        //    print the average number
        // 2. ***etgar crazy:
        //    input number of classes from user
        //    for each size input number of students
        //    input all numbers from user
        //    calculate the average of each class in an array
        //    calculate the average of averages

        System.out.println("Goodbye...");
    }
}
