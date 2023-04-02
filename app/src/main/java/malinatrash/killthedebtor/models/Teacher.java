package malinatrash.killthedebtor.models;

import java.io.Serializable;
import java.util.ArrayList;

public class Teacher implements Serializable {
    private final String login;
    private final String password;
    private final String firstname;
    private final String lastname;
    private final String thirdname;
    private final ArrayList<Discipline> disciplines;


    public Teacher(String login, String password, String firstname, String lastname, String thirdname, ArrayList<Discipline> disciplines) {
        this.login = login;
        this.password = password;
        this.firstname = firstname;
        this.lastname = lastname;
        this.thirdname = thirdname;
        this.disciplines = disciplines;
    }

    public ArrayList<Discipline> getDisciplines() {
        return disciplines;
    }

    public String getFirstname() {
        return firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public String getLogin() {
        return login;
    }

    public String getPassword() {
        return password;
    }
}

