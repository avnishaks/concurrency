package org.example.md_3_design_principle.design_3_LSP.voilation;

public class InternEmployee extends Employee{
    protected InternEmployee(int employeeId){
        super(employeeId);
    }
    @Override
    protected double calculateSalary() {
        System.out.println("Calculating the Salary of the Intern Employee ........");
        return 0;
    }
}
