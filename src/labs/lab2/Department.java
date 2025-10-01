package labs.lab2;

import java.util.ArrayList;

public class Department {
    private String name;
    private Employee boss;
    private ArrayList<Employee> employees;



    public Department(String name) {
        this.name = name;
        employees = new ArrayList<>();
    }
    public Department(String name, Employee boss) {
        this.name = name;
        this.boss = boss;
        employees = new ArrayList<>();
        employees.add(boss);
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public Employee getBoss() {
        return boss;
    }
    public void setBoss(Employee boss) {
        this.boss = boss;
        if (employees.contains(boss)) {
            return;
        }
        employees.add(boss);
    }
    public ArrayList<Employee> getEmployees() {
        return employees;
    }

    public void setEmployees(ArrayList<Employee> employees) {
        this.employees = employees;
    }

    public void addNewEmployee(Employee employee) {
        if (employees.contains(employee)) {
            throw new IllegalStateException ("Ошибка! Этот сотрудник уже существует!");
        }
        employees.add(employee);
    }
    public void printAllEmployees() {
        System.out.println("Все сотрудники отдела " + name + ":");
        for (Employee i : employees) {
            System.out.println(i.getName());
        }
    }
    @Override
    public String toString() {
        if (boss != null) {
            return "отдел " + name + ", начальник которого " + boss.getName();
        }
        return "отдел " + name;
    }
}
