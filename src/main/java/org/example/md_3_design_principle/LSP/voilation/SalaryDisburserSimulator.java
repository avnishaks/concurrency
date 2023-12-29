package org.example.md_3_design_principle.LSP.voilation;

import java.util.ArrayList;
import java.util.List;

public class SalaryDisburserSimulator {
    public static void main(String[] args) {
        List<Employee> employees=new ArrayList<>();
        employees.add(new ContractEmployee(1));
        employees.add(new FullTimeEmployee(2));
        employees.add(new InternEmployee(3));
        employees.add(new Volunteer(4));
        SalaryDisburser salaryDisburser=new SalaryDisburser();
        salaryDisburser.disburseSalary(employees);
    }
}
