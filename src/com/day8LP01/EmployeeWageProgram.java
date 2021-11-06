package com.day8LP01;
/*
A program to simulate Employee wage.
to calculate the per day wage of full time employee.
*/

import java.util.Scanner;

public class EmployeeWageProgram {
    //Main method
    public static void main(String[] args) {
        EmployeeWageProgram methodCaller = new EmployeeWageProgram();
        methodCaller.wageCalculator();
    }

    //Method for calculating the per day wage of full time employee.
    public void wageCalculator() {
        int empWagePerHour = 20;
        int workingHours = 8;
        System.out.println("Employee wage per day for full time schedule is: " + (empWagePerHour * workingHours) + " $");

    }
}
