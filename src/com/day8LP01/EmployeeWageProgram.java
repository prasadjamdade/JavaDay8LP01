package com.day8LP01;
/*
A program to simulate Employee wedge.
To check Employee is Present or Absent.
*/

import java.util.Scanner;

public class EmployeeWageProgram {
    //Main method
    public static void main(String[] args) {
        EmployeeWageProgram methodCaller = new EmployeeWageProgram();
        methodCaller.wageCalculator();
    }

    //Method for finding attendance of Employee.
    public void wageCalculator() {
        Scanner shiftTypeInput = new Scanner(System.in);
        System.out.println("""
                1. Full Time working schedule.
                2. Part Time working schedule.
                """);
        int shiftTime = shiftTypeInput.nextInt();
        int empWagePerHour = 20;
        int workingHours = 8;
        if (shiftTime == 1) {
            System.out.println("Employee wage per day for full time schedule is: " + (empWagePerHour * workingHours) + " $");
        }
        else
            System.out.println("Employee wage per day for full time schedule is: " + (empWagePerHour * workingHours/2) + " $");
    }
}
