package labs.lab2;

public class Employee {
    private String name;
    private Department department;

    public Employee(String name) {
        this.name = name;
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
        if (department.getBoss().getName() == name) {
            return name + " начальник отдела " + department;
        }
        return name + " работает в отделе " + department + ", начальник которого " + department.getBoss().getName();
    }
}
