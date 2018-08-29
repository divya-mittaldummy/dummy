package com;

public final class ImmutableClassEx {
    private String name;
    private int age;

    Employee employee;

    ImmutableClassEx(String name, int age, Employee employee){
        this.name = name;
        this.age = age;
        this.employee = new Employee(employee.getCompanyName(), employee.getSalary());
    }

    public Employee getEmployee() {
        return employee;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }
}

class MainClass{
    public static void main(String[] args) {
        Employee employee = new Employee("xyz", 34000);
        ImmutableClassEx immutableClassEx = new ImmutableClassEx("Sivya", 4, employee);


    }
}

class Employee{
    String companyName;
    Integer salary;


    Employee(String companyName, Integer salary){
        this.salary = salary;
        this.companyName = companyName;
    }

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    public Integer getSalary() {
        return salary;
    }

    public void setSalary(Integer salary) {
        this.salary = salary;
    }
}

class People extends Employee{
    String name;

    People(String name){
        super("companyame", 89);
        this.name = name;
    }

}
