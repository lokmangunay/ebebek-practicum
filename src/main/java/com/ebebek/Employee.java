package com.ebebek;

public class Employee {

    private String name;
    private double salary;
    private double workHours;
    private int hireYear;
    private final int currentYear = 2021;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public double getWorkHours() {
        return workHours;
    }

    public void setWorkHours(double workHours) {
        this.workHours = workHours;
    }

    public int getHireYear() {
        return hireYear;
    }

    public void setHireYear(int hireYear) {
        this.hireYear = hireYear;
    }

    public Employee() {
    }

    public Employee(String name, double salary, double workHours, int hireYear) {
        this.name = name;
        this.salary = salary;
        this.workHours = workHours;
        this.hireYear = hireYear;
    }

    public double tax() {
        if (this.salary > 1000) {
            return this.salary * (0.03);
        }
        return 0;
    }

    public double bonus() {

        if (this.workHours > 40) {
            double overTimeHours = this.workHours - 40;
            return overTimeHours * 30;
        }
        return 0;
    }

    public double raiseSalary() {
        int yearsWorked = currentYear - hireYear;
        if (yearsWorked < 10) {
            return this.salary * 0.05;
        } else if (yearsWorked < 20) {
            return this.salary * 0.1;
        } else return this.salary * 0.15;

    }


    @Override
    public String toString() {
        return "com.ebebek.Employee{" +
                "name='" + name + '\'' +
                ", salary=" + salary +
                ", workHours=" + workHours +
                ", hireYear=" + hireYear +
                ", tax=" + tax() +
                ", bonus=" + bonus() +
                ", raisedSalary=" + raiseSalary() +
                ", salaryInTotal=" + cumulativeSalary() +
                '}';
    }

    public double cumulativeSalary() {
        return this.salary + raiseSalary() + bonus() - tax();
    }

}
