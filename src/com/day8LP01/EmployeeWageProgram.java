package com.day8LP01;
/*
A program to simulate Employee wedge.
To check Employee is Present or Absent.
*/

public class EmployeeWageProgram {
    //Main method
    public static void main(String[] args) {
        EmployeeWageProgram methodCaller = new EmployeeWageProgram();
        methodCaller.wageEmployee();
    }

    //Method for calculating the per day wage of part time employee including full time employee.
    public void wageEmployee(){
        int hoursPerDay = 8;
        int fullTime = hoursPerDay;
        int partTime = hoursPerDay/2;
        int wagePerHour = 20;
        System.out.println("Per day wage of Part time Employee is: "+(partTime * wagePerHour)+"$");
        System.out.println("Per day wage of Part time Employee is: "+(fullTime * wagePerHour)+"$");
    }
}
