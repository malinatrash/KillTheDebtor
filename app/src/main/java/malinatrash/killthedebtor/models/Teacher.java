package malinatrash.killthedebtor.models;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Arrays;

public class Teacher implements Serializable {
    private final String login;
    private final String password;
    private final String firstname;
    private final String lastname;
    private final String thirdname;
    private final ArrayList<Discipline> disciplines;


     static ArrayList<Student> students = new ArrayList<>(Arrays.asList(
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
    public static Group group = new Group("ИСТб-21-1", students);
    public static ArrayList<Teacher> teachers = new ArrayList<>(Arrays.asList(
            new Teacher(
                    "arsh",
                    "pas",
                    "Вадим",
                    "Аршинский",
                    "Да",
                    new ArrayList<>(Arrays.asList(
                            new Discipline("Объектно- ориентированное программирование", "https://ic.pics.livejournal.com/asy/89458/542816/542816_900.png", new ArrayList<>(Arrays.asList(
                                    group,
                                    group,
                                    group
                            ))),
                            new Discipline("WEB- Программирование", "https://www.freepnglogos.com/uploads/php-logo-png/php-logo-php-elephant-logo-vectors-download-5.png", new ArrayList<>(Arrays.asList(
                                    group,
                                    group,
                                    group
                            ))),
                            new Discipline("Технологии программирования", "https://static.wikia.nocookie.net/wikies/images/4/43/Logo-csharp.png/revision/latest/scale-to-width-down/500?cb=20180617092325&path-prefix=ru", new ArrayList<>(Arrays.asList(
                                    group,
                                    group,
                                    group
                            ))),new Discipline("Анализ бизнес-процессов", "https://ruli24.ru/wp-content/uploads/2018/07/bpm3-1.png", new ArrayList<>(Arrays.asList(
                                    group,
                                    group,
                                    group
                            ))),
                            new Discipline("Разработка мобильный приложений", "https://uxwing.com/wp-content/themes/uxwing/download/brands-and-social-media/android-icon.png", new ArrayList<>(Arrays.asList(
                                    group,
                                    group,
                                    group
                           ))),
                            new Discipline("Исследование операций", "https://cdn-icons-png.flaticon.com/512/2640/2640882.png", new ArrayList<>(Arrays.asList(
                                    group,
                                    group,
                                    group
                            ))),
                            new Discipline("Моделирование процессов и систем", "https://cdn4.iconfinder.com/data/icons/logos-and-brands/512/285_R_Project_logo-512.png", new ArrayList<>(Arrays.asList(
                                    group,
                                    group,
                                    group
                            ))),
                            new Discipline("Методы анализа данных", "https://cdn.iconscout.com/icon/free/png-256/data-science-46-1170621.png", new ArrayList<>(Arrays.asList(
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

