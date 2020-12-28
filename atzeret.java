package com.company;

import java.util.Random;
import java.util.Scanner;

public class Main
{
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        Random r = new Random();

        // 5
        // atz = 1 , 2 , 6 , 24 , 120
        // 1 * 2 * 3 * 4 * 5
        // n= input number from user
        // int atz = 1
        // run index from 2 to n
        //      atz = atz * index
        System.out.println("Please enter factorial range");
        int range = s.nextInt();
        int atz = 1;
        for (int index = 1; index <= range; index++)
        {
            atz = atz * index;
        }
        System.out.println(String.format("atzeret for %d result = %d", range, atz));

        System.out.println("Goodbye...");
    }
}
