package com.company;

import java.util.Scanner;

public class UmarMahmoodLib {
    public static int sumUpTo()
    {
        System.out.println("Enter an integer");
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int output = 0;
        for (int x = 0; n != 0; n--) {
            x = x + n;
            output = x;
        }
        System.out.println("the sum is " + output);
        return output;
    }
}
