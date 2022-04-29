package com.bridgelabz.employee.payroll;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Employee_PayRoll_Service_Main {

	Scanner SC = new Scanner(System.in);

    public enum Ioservice {CONSALE_IO, FILE_IO, DB_IO, REST_IO}

    private List<Employee_PayRoll_Details> employeePayrollList;

    public Employee_PayRoll_Service_Main() {
        this.employeePayrollList = new ArrayList<Employee_PayRoll_Details>();
    }

    public Employee_PayRoll_Service_Main(List<Employee_PayRoll_Details> employeePayrollList) {
        this.employeePayrollList = employeePayrollList;
    }

    public static void main(String[] args) {
        ArrayList<Employee_PayRoll_Details> employeePayrollList = new ArrayList<Employee_PayRoll_Details>();
        Employee_PayRoll_Service_Main employeePayrollService = new Employee_PayRoll_Service_Main(employeePayrollList);
        Scanner consoleInputReader = new Scanner(System.in);
        employeePayrollService.readEmployeePayrollData(consoleInputReader);
        employeePayrollService.writeEmployeePayrollData();
    }

    public void readEmployeePayrollData(Scanner consoleInputReader) {
        System.out.println("Enter Employee Id:");
        int employeeId = consoleInputReader.nextInt();
        System.out.println("Enter Employee Name:");
        String employeeName = consoleInputReader.next();
        System.out.println("Enter Employee Salary:");
        double employeeSalary = consoleInputReader.nextDouble();
        employeePayrollList.add(new Employee_PayRoll_Details(employeeId, employeeName, employeeSalary));
    }

    public void writeEmployeePayrollData() {
        System.out.println("\nWriting Employee Payroll Roaster to Cansole\n" + employeePayrollList);
    }
}
