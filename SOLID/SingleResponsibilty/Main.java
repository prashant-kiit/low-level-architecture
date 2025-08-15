package SOLID.SingleResponsibilty;

// Class for handling Employee data
class Employee {
    private String name;
    private double salary;

    public Employee(String name, double salary) {
        this.name = name;
        this.salary = salary;
    }

    public String getName() { return name; }
    public double getSalary() { return salary; }
}

// Class responsible for calculating salary-related operations
class SalaryCalculator {
    public double calculateAnnualSalary(Employee emp) {
        return emp.getSalary() * 12;
    }
}

// Class responsible for printing Employee information
class EmployeePrinter {
    public void printDetails(Employee emp) {
        System.out.println("Employee: " + emp.getName());
        System.out.println("Monthly Salary: " + emp.getSalary());
    }
}

public class Main {
    public static void main(String[] args) {
        Employee emp = new Employee("Prashant", 50000);
        SalaryCalculator calc = new SalaryCalculator();
        EmployeePrinter printer = new EmployeePrinter();

        double annualSalary = calc.calculateAnnualSalary(emp);
        printer.printDetails(emp);
        System.out.println("Annual Salary: " + annualSalary);
    }
}
