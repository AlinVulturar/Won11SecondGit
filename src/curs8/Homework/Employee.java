package curs8.Homework;

import java.time.LocalDate;

public class Employee implements Person{
private String firstName;
private String lastName;
private LocalDate birthDate;
private String position;
private LocalDate dateOfEmployment;

    public Employee(String firstName, String lastName, LocalDate birthDate, String position, LocalDate dateOfEmployment, String address) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.birthDate = birthDate;
        this.position = position;
        this.dateOfEmployment = dateOfEmployment;
        this.address = address;
    }

    private String address;
    @Override
    public String getFirstName() {
        return firstName;
    }

    @Override
    public String getLastName() {
        return lastName;
    }

    @Override
    public LocalDate getBirthday() {
        return birthDate;
    }

    @Override
    public String getAdress() {
        return address;
    }
}
