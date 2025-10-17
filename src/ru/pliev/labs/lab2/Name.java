package ru.pliev.labs.lab2;

public class Name {

    private String firstName;
    private String lastName;
    private String patronymic;

    public Name(String firstName) {
        this.firstName = firstName;
        this.lastName = null;
        this.patronymic = null;
    }
    public Name( String lastName, String firstName) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.patronymic = null;
    }
    public Name(String lastName, String firstName, String patronymic) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.patronymic = patronymic;
    }

    public String getFirstName() {
        return firstName;
    }
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }
    public String getLastName() {
        return lastName;
    }
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
    public String getPatronymic() {
        return patronymic;
    }
    public void setPatronymic(String patronymic) {
        this.patronymic = patronymic;
    }

    @Override
    public String toString() {
        if ((patronymic != null) && (!patronymic.trim().isEmpty())) {
            return firstName + " " + lastName + " " + patronymic;
        }
        if ((lastName != null) && (!lastName.trim().isEmpty())) {
            return firstName + " " + lastName;
        }
        return firstName;
    }
}
