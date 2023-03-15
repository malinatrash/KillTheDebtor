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
                            new Discipline("ООП", "https://el.istu.edu/pluginfile.php/373507/course/overviewfiles/3monsters%20%281%29.jpg", new ArrayList<>(Arrays.asList(
                                    group,
                                    group,
                                    group
                            )))
//                            ,
//                            new Discipline("Анализ бизнес-процессов", new ArrayList<>(Arrays.asList(
//                                    group,
//                                    group,
//                                    group
//                            ))),
//                            new Discipline("Исследование операций", new ArrayList<>(Arrays.asList(
//                                    group,
//                                    group,
//                                    group
//                            ))),
//                            new Discipline("Моделирование процессов и систем", new ArrayList<>(Arrays.asList(
//                                    group,
//                                    group,
//                                    group
//                            ))),
//                            new Discipline("Методы анализа данных", new ArrayList<>(Arrays.asList(
//                                    group,
//                                    group,
//                                    group
//                            ))),
//                            new Discipline("C#", new ArrayList<>(Arrays.asList(
//                                    group,
//                                    group,
//                                    group
//                            )))

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

class Group implements Serializable {
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

class Student implements  Serializable {
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

