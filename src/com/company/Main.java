package com.company;

import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Podaj swój dochód: ");
        int income = in.nextInt();
        double tax = 0;
        if (income < 85528) {
            tax = income * 0.18 - 556.02;

        }
        if (income > 85528) {
            tax = 14839.02 + ((income - 85528) * 0.32);
        }
        System.out.print("Podatek do zapłacenia to " + tax + " zł");
    }
}
