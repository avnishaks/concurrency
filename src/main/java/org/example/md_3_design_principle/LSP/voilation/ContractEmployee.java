package org.example.md_3_design_principle.LSP.voilation;

public class ContractEmployee extends Employee{

    protected ContractEmployee(int employeeId){
        super(employeeId);
    }
    @Override
    protected double calculateSalary() {
        System.out.println("Calculating the Salary of the ContractEmployee ........");
        return 0;
    }
}
