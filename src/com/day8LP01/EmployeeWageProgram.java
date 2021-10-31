package com.day8LP01;
/*
A program to simulate Employee wedge.
To check Employee is Present or Absent.
*/

public class EmployeeWageProgram {
    //Main method
    public static void main(String[] args) {
        EmployeeWageProgram methodCaller = new EmployeeWageProgram();
        methodCaller.attendanceEmployee();
    }

    //Method for finding attendance of Employee.
    public void attendanceEmployee(){
        int fullTime = 1;
        double empCheck = Math.floor(Math.random() * 10) % 2;
        if (empCheck == fullTime)
            System.out.println("Employee is Present.");
        else
            System.out.println("Employee is Absent.");
    }
}
