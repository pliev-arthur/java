package ru.pliev.labs.lab2.departmentAndEmpoyee;

public class Employee {
    String name;
    Department department;

    public Employee(String name) {
        this.name = name;
        this.department = null;
    }
    public Employee(String name, Department department) {
        this.name = name;
        this.department = department;
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public Department getDepartment() {
        return department;
    }
    public void setDepartment(Department department) {
        this.department = department;
    }

    @Override
    public String toString() {
        if ((department != null) && (department.getBoss().getName() == name)) {
            return name + " начальник отдела " + department.getName();
        }
        if ((department != null) && (department.getBoss() != null)){
            return name + " работает в отделе " + department.getName() + ", начальник которого " + department.getBoss().getName();
        }
        if (department != null) {
            return name + " работает в отделе " + department.getName();
        }
        return name;
    }
}
