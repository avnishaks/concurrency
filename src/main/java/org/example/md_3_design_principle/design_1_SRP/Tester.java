package org.example.md_3_design_principle.design_1_SRP;

public class Tester {
    public static void main(String[] args) {
        Employees e=new Employees(0);
        SalaryCalculator salaryCalculator=new SalaryCalculator();
        PerformaceCalculator performaceCalculator=new PerformaceCalculator();
        BioData bioData=new BioData();

        System.out.println(e.getEmployees());
        System.out.println(salaryCalculator.calculateSalary(e));
        System.out.println(performaceCalculator.calculatePerformance(e));
        System.out.println(bioData.retrieveBioData(e));
    }
}
