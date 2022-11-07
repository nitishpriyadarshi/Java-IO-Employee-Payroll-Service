package com.bridgelab;

/**
 * UC1:- Create an Employee Payroll Service to Read and Write Employee
 * Payroll to a Console - Create Employee Payroll Class of id, name and Salary
 */

import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;
public class EmployeePayrollService {
    private List<EmployeePayrollData> employeePayrollList;

    public EmployeePayrollService() {
        employeePayrollList = new ArrayList<>();
    }


    public static void main(String[] args) {
        EmployeePayrollService employeePayrollService = new EmployeePayrollService();
        Scanner consoleInputReader = new Scanner(System.in);
        employeePayrollService.readEmployeePayrollData(consoleInputReader);
        employeePayrollService.writeEmployeePayrollData();

    }

    private void readEmployeePayrollData(Scanner consoleInputReader) {
        System.out.println("Enter Employee ID: ");
        int id = consoleInputReader.nextInt();
        System.out.println("Enter Employee Name: ");
        String name = consoleInputReader.next();
        System.out.println("Enter Employee Salary: ");
        double salary = consoleInputReader.nextDouble();
        employeePayrollList.add(new EmployeePayrollData(id, name, salary));
    }

    private void writeEmployeePayrollData() {
        System.out.println("\nWriting Employee Payroll to console\n" + employeePayrollList);
    }
}
