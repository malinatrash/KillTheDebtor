package malinatrash.killthedebtor;

import java.io.Serializable;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;

public class Teacher implements Serializable {
    private final String login;
    private final String password;
    private final String firstname;
    private final String lastname;
    private final String thirdname;
    private final ArrayList<Discipline> disciplines;


    private static ArrayList<Student> students = new ArrayList<>(Arrays.asList(
            new Student("Pavel", "Naumov"),
            new Student("Dima", "Utka"),
            new Student("Ayur", "Tapkharov"),
            new Student("Kesha", "Dudar"),
            new Student("Egor", "Aeropov"),
            new Student("Erik", "Sokol"),
            new Student("Boya", "Dimanov"),
            new Student("Pavel", "Naumov"),
            new Student("Dima", "Utka"),
            new Student("Ayur", "Tapkharov"),
            new Student("Kesha", "Dudar"),
            new Student("Egor", "Aeropov"),
            new Student("Erik", "Sokol"),
            new Student("Boya", "Dimanov")
            ));
    private static Group group = new Group("ИСТб-21-1", students);
    public static ArrayList<Teacher> teachers = new ArrayList<>(Arrays.asList(
            new Teacher(
                    "arsh",
                    "pas",
                    "Вадим",
                    "Аршинский",
                    "Да",
                    new ArrayList<>(Arrays.asList(
                            new Discipline("ООП", new ArrayList<>(Arrays.asList(
                                    group,
                                    group,
                                    group
                            )))
                    )))
    ));

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
class Discipline implements Serializable {
    private final String title;
    private ArrayList<Group> groups;
    public String getTitle() {
        return title;
    }
    Discipline(String title, ArrayList<Group> groups) {
        this.title = title;
        this.groups = groups;
    }
}
class Group {
    private String title;
    private ArrayList<Student> students;
    public Group(String title, ArrayList<Student> students) {
        this.title = title;
        this.students = students;
    }
    public ArrayList<Student> getStudents() {
        return students;
    }
    public String getTitle() {
        return title;
    }
}

class Student {
    private String firstname;
    private String lastname;
    public Student(String firstname, String lastname) {
        this.firstname = firstname;
        this.lastname = lastname;
    }
    public String getFirstname() {
        return firstname;
    }
    public String getLastname() {
        return lastname;
    }
}

