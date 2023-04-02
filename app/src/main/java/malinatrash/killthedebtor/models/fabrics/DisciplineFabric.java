package malinatrash.killthedebtor.models.fabrics;

import java.util.ArrayList;
import java.util.Arrays;

import malinatrash.killthedebtor.models.Discipline;

public class DisciplineFabric {

    public static DisciplineFabric shared = new DisciplineFabric();

    ArrayList<Discipline> katashDisciplines = new ArrayList<>(Arrays.asList(
            new Discipline("WEB- Программирование", "https://www.freepnglogos.com/uploads/php-logo-png/php-logo-php-elephant-logo-vectors-download-5.png",
                    GroupFabric.shared.getWebProgGroups()
            ),
            new Discipline("Технологии программирования", "https://static.wikia.nocookie.net/wikies/images/4/43/Logo-csharp.png/revision/latest/scale-to-width-down/500?cb=20180617092325&path-prefix=ru",
                    GroupFabric.shared.getTechProgGroups()
            )
    ));

    ArrayList<Discipline> arshDisciplines = new ArrayList<>(Arrays.asList(
            new Discipline("Объектно- ориентированное программирование", "https://ic.pics.livejournal.com/asy/89458/542816/542816_900.png",
                    GroupFabric.shared.getOOPArshGroups()
            ),
            new Discipline("Разработка мобильный приложений", "https://uxwing.com/wp-content/themes/uxwing/download/brands-and-social-media/android-icon.png",
                    GroupFabric.shared.getMobileGroups()
            )
    ));

    ArrayList<Discipline> buchDisciplines = new ArrayList<>(Arrays.asList(
            new Discipline("Моделирование процессов и систем", "https://cdn4.iconfinder.com/data/icons/logos-and-brands/512/285_R_Project_logo-512.png",
                    GroupFabric.shared.getModelingGroups()
            ),
            new Discipline("Методы анализа данных", "https://cdn.iconscout.com/icon/free/png-256/data-science-46-1170621.png",
                    GroupFabric.shared.getDataAnalyticsGroups()
            )
    ));

    ArrayList<Discipline> malanDisciplines = new ArrayList<>(Arrays.asList(
            new Discipline("Исследование операций", "https://cdn-icons-png.flaticon.com/512/2640/2640882.png",
                    GroupFabric.shared.getOperationResearchGroups()
            ),
            new Discipline("Объектно- ориентированное программирование", "https://ic.pics.livejournal.com/asy/89458/542816/542816_900.png",
                    GroupFabric.shared.getOOPMalanGroups()
            )
    ));

    ArrayList<Discipline> petrovDisciplines = new ArrayList<>(Arrays.asList(
            new Discipline("Анализ бизнес-процессов", "https://ruli24.ru/wp-content/uploads/2018/07/bpm3-1.png",
                    GroupFabric.shared.getBuisnesProcessGroups()
            )
    ));

    DisciplineFabric() {
    }

    public ArrayList<Discipline> getDisciplinesKatash() {
        return katashDisciplines;
    }

    public ArrayList<Discipline> getDisciplinesArsh() {
        return arshDisciplines;
    }

    public ArrayList<Discipline> getDisciplinesBuch() {
        return buchDisciplines;
    }

    public ArrayList<Discipline> getDisciplinesMalan() {
        return malanDisciplines;
    }

    public ArrayList<Discipline> getDisciplinesPetrov() {
        return petrovDisciplines;
    }
}
