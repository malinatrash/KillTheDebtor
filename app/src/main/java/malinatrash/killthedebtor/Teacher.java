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

    public static ArrayList<Teacher> teachers = new ArrayList<>(Arrays.asList(
            new Teacher(
                    "arsh",
                    "pas",
                    "Вадим",
                    "Аршинский",
                    "Да",
                    new ArrayList<>(Arrays.asList(
                            new Discipline("ООП"),
                            new Discipline("Методы анализа данных"),
                            new Discipline("Операционные системы"),
                            new Discipline("Моделирование Процессов и систем"),
                            new Discipline("Анализ бизнес-процессов"),
                            new Discipline("Основы проектной деятельности"),
                            new Discipline("Иностранный язык"),
                            new Discipline("Технологии разработки программных комплексов"),
                            new Discipline("WEB-Программирование"),
                            new Discipline("ООП"),
                            new Discipline("Методы анализа данных"),
                            new Discipline("Операционные системы"),
                            new Discipline("Моделирование Процессов и систем"),
                            new Discipline("Анализ бизнес-процессов"),
                            new Discipline("Основы проектной деятельности"),
                            new Discipline("Иностранный язык"),
                            new Discipline("Технологии разработки программных комплексов"),
                            new Discipline("WEB-Программирование")
                    ))),
            new Teacher(
                    "malan",
                    "malan",
                    "Танюха",
                    "Маланова",
                    "Да",
                    new ArrayList<>(Arrays.asList(
                            new Discipline("ООП"),
                            new Discipline("ООП"),
                            new Discipline("ООП"),
                            new Discipline("ООП"),
                            new Discipline("ООП")
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
    private String title;
    public String getTitle() {
        return title;
    }
    Discipline(String title) {
        this.title = title;
    }
}
class Group {

}

