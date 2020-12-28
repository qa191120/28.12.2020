package com.company;

import java.util.Random;
import java.util.Scanner;

public class Main
{
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        Random r = new Random();

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

        System.out.println("Goodbye...");
    }
}
