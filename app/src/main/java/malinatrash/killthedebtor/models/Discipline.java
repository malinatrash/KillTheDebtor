package malinatrash.killthedebtor.models;


import static malinatrash.killthedebtor.models.Group.group;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Arrays;

public class Discipline implements Serializable {
    private final String title;
    private final ArrayList<Group> groups;
    private final String imageURL;

    public String getTitle() {
        return title;
    }

    public String getImageURL() {
        return imageURL;
    }

    public int getGroupsCount() {
        return groups.size();
    }

    public ArrayList<Group> getGroups() {
        return groups;
    }

    Discipline(String title, String imageURL, ArrayList<Group> groups) {
        this.title = title;
        this.groups = groups;
        this.imageURL = imageURL;
    }

    public static ArrayList<Discipline> disciplines = new ArrayList<>(Arrays.asList(
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
            ))), new Discipline("Анализ бизнес-процессов", "https://ruli24.ru/wp-content/uploads/2018/07/bpm3-1.png", new ArrayList<>(Arrays.asList(
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
    ));
}