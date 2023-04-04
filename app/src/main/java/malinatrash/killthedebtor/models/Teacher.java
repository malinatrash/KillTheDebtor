package malinatrash.killthedebtor.models;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;

import java.io.Serializable;
import java.util.ArrayList;

public class Teacher implements Serializable {
    private String login;
    private String password;
    private String firstname;
    private String lastname;
    private String thirdname;
    private ArrayList<Discipline> disciplines;
    private String id = login;


    public Teacher(String login, String password, String firstname, String lastname, String thirdname, ArrayList<Discipline> disciplines) {
        this.login = login;
        this.password = password;
        this.firstname = firstname;
        this.lastname = lastname;
        this.thirdname = thirdname;
        this.disciplines = disciplines;
    }

    public Teacher() {

    }

    public Teacher(Teacher teacher) {
        this.firstname = teacher.getFirstname();
        this.lastname = teacher.getLastname();
        this.login = teacher.getLogin();
        this.password = teacher.getPassword();
        this.thirdname = teacher.getThirdname();
        this.disciplines = teacher.getDisciplines();
    }

    public ArrayList<Discipline> getDisciplines() {
        return disciplines;
    }

    public void setDisciplines(ArrayList<Discipline> disciplines) {
        this.disciplines = disciplines;
    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getThirdname() {
        return thirdname;
    }

    public void setThirdname(String thirdname) {
        this.thirdname = thirdname;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }
}

