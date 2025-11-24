package ru.pliev.labs.lab6.task1_3;

import ru.pliev.labs.lab6.task1_2.Mode;

@ToString
public class Person {
    private String name;
    private int age;

    @ToString(Mode.NO)
    private String password;

    private String email;

    @ToString(Mode.NO)
    private double salary;

    public Person(String name, int age, String password, String email, double salary) {
        this.name = name;
        this.age = age;
        this.password = password;
        this.email = email;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", password='" + password + '\'' +
                ", email='" + email + '\'' +
                ", salary=" + salary +
                '}';
    }
}
