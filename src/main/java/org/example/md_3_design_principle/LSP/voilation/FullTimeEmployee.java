package org.example.md_3_design_principle.LSP.voilation;

public class FullTimeEmployee extends Employee{
    protected FullTimeEmployee(int employeeId){
        super(employeeId);
    }
    @Override
    protected double calculateSalary() {
        System.out.println("Calculating the Salary of the Full Time Employee ........");
        return 0;
    }
}
