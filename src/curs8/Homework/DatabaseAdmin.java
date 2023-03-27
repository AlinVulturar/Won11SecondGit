package curs8.Homework;

import java.time.LocalDate;

public class DatabaseAdmin extends Programmer {
    public DatabaseAdmin(String firstName, String lastName, LocalDate birthDate, String position, LocalDate dateOfEmployment, String address, String language, String dbTechnology) {
        super(firstName, lastName, birthDate, position, dateOfEmployment, address, language);
        this.dbTechnology = dbTechnology;
    }

    public String getDbTechnology() {
        return dbTechnology;
    }

    public void setDbTechnology(String dbTechnology) {
        this.dbTechnology = dbTechnology;
    }

    private String dbTechnology;
}
