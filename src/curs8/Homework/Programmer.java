package curs8.Homework;

import java.time.LocalDate;

public class Programmer extends Employee{
private String language;

    public Programmer(String firstName, String lastName, LocalDate birthDate, String position, LocalDate dateOfEmployment, String address,String language) {
        super(firstName, lastName, birthDate, position, dateOfEmployment, address);
        this.language=language;
    }
}
