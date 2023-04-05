package malinatrash.killthedebtor.models.fabrics;

import java.util.ArrayList;
import java.util.Arrays;

import malinatrash.killthedebtor.models.AcademicPerformance;
import malinatrash.killthedebtor.models.Debt;
import malinatrash.killthedebtor.models.Measure;

public class AcademicPerformanceFabric {
    public static AcademicPerformanceFabric shared = new AcademicPerformanceFabric();

    public AcademicPerformanceFabric() {
    }

    private AcademicPerformance getCSharp() {
        return new AcademicPerformance(
                "Технологии программирования",
                new ArrayList<>(Arrays.asList(
                        new Debt(false, "Разработка консольного приложения на C#"),
                        new Debt(false, "Разработка приложения с графическим интерфейсом"),
                        new Debt(false, "Создание своего типа"),
                        new Debt(false, "Обработка событий"),
                        new Debt(false, "Курсовая: Система частиц")

                )),
                Measure.EXAM
        );
    }

    private AcademicPerformance getDataAnalyse() {
        return new AcademicPerformance(
                "Методы анализа данных",
                new ArrayList<>(Arrays.asList(
                        new Debt(false, "Создаем свой датасет"),
                        new Debt(false, "Корреляционная регрессия"),
                        new Debt(false, "Кластерный анализ"),
                        new Debt(false, "Факторный анализ"),
                        new Debt(false, "Построение деревьев решений")

                )),
                Measure.CREDIT
        );
    }

    private AcademicPerformance getOOP() {
        return new AcademicPerformance(
                "Объектно- ориентированное программирование",
                new ArrayList<>(Arrays.asList(
                        new Debt(false, "Основы Java"),
                        new Debt(false, "Основы ООП"),
                        new Debt(false, "Обработка исключений"),
                        new Debt(false, "Полиморфизм"),
                        new Debt(false, "ООП в Swing")

                )),
                Measure.CREDIT
        );
    }

    private AcademicPerformance getBuisnesProcess() {
        return new AcademicPerformance(
                "Анализ бизнес-процессов",
                new ArrayList<>(Arrays.asList(
                        new Debt(false, "Лабораторная работа 1"),
                        new Debt(false, "Лабораторная работа 2"),
                        new Debt(false, "Лабораторная работа 3"),
                        new Debt(false, "Лабораторная работа 4"),
                        new Debt(false, "Лабораторная работа 5")

                )),
                Measure.EXAM
        );
    }

    private AcademicPerformance getOperationResearch() {
        return new AcademicPerformance(
                "Исследование операций",
                new ArrayList<Debt>(Arrays.asList(
                        new Debt(false, "Симплекс-метод"),
                        new Debt(false, "Табличный симплекс-метод"),
                        new Debt(false, "Транспортная задача"),
                        new Debt(false, "Лабораторная работа 4"),
                        new Debt(false, "Лабораторная работа 5")

                )),
                Measure.CREDIT
        );
    }

    private AcademicPerformance getWeb() {
        return new AcademicPerformance(
                "WEB- Программирование",
                new ArrayList<Debt>(Arrays.asList(
                        new Debt(false, "Основы верстки"),
                        new Debt(false, "JavaScript"),
                        new Debt(false, "CRUD"),
                        new Debt(false, "backend"),
                        new Debt(false, "Production")

                )),
                Measure.CREDIT
        );
    }

    private AcademicPerformance getModel() {
        return new AcademicPerformance(
                "Моделирование процессов и систем",
                new ArrayList<Debt>(Arrays.asList(
                        new Debt(false, "Основы статистики"),
                        new Debt(false, "Создание случайых процессов"),
                        new Debt(false, "Цепи Маркова"),
                        new Debt(false, "Системы массового обслуживания"),
                        new Debt(false, "Планирование эксперимента")

                )),
                Measure.EXAM
        );
    }

    private AcademicPerformance getMobile() {
        return new AcademicPerformance(
                "Разработка мобильный приложений",
                new ArrayList<Debt>(Arrays.asList(
                        new Debt(false, "Жизненный цикл View"),
                        new Debt(false, "Основы работы с ListView"),
                        new Debt(false, "Адаптивный layout"),
                        new Debt(false, "Реактивный подход к разработке"),
                        new Debt(false, "Кроссплатформенная разработка")

                )),
                Measure.EXAM
        );
    }

    public ArrayList<AcademicPerformance> getAcademicPerfomancesFor_pavel_istb_21_1() {
        return new ArrayList<>(Arrays.asList(
                getCSharp(), getDataAnalyse(), getOOP(), getBuisnesProcess(), getOperationResearch()
        ));
    }

    public ArrayList<AcademicPerformance> getAcademicPerfomancesFor_artemiy_istb_21_1() {
        return new ArrayList<>(Arrays.asList(
                getCSharp(), getDataAnalyse(), getOOP(), getBuisnesProcess(), getOperationResearch()
        ));
    }

    public ArrayList<AcademicPerformance> getAcademicPerfomancesFor_mariya_istb_21_1() {
        return new ArrayList<>(Arrays.asList(
                getCSharp(), getDataAnalyse(), getOOP(), getBuisnesProcess(), getOperationResearch()
        ));
    }

    public ArrayList<AcademicPerformance> getAcademicPerfomancesFor_anna_istb_21_1() {
        return new ArrayList<>(Arrays.asList(
                getCSharp(), getDataAnalyse(), getOOP(), getBuisnesProcess(), getOperationResearch()
        ));
    }

    public ArrayList<AcademicPerformance> getAcademicPerfomancesFor_anissia_istb_21_1() {
        return new ArrayList<>(Arrays.asList(
                getCSharp(), getDataAnalyse(), getOOP(), getBuisnesProcess(), getOperationResearch()
        ));
    }

    public ArrayList<AcademicPerformance> getAcademicPerfomancesFor_nikolay_istb_21_2() {
        return new ArrayList<>(Arrays.asList(
                getCSharp(), getDataAnalyse(), getOOP(), getBuisnesProcess(), getOperationResearch()
        ));
    }

    public ArrayList<AcademicPerformance> getAcademicPerfomancesFor_yaroslav_istb_21_2() {
        return new ArrayList<>(Arrays.asList(
                getCSharp(), getDataAnalyse(), getOOP(), getBuisnesProcess(), getOperationResearch()
        ));
    }

    public ArrayList<AcademicPerformance> getAcademicPerfomancesFor_michael_asu_21_3() {
        return new ArrayList<>(Arrays.asList(
                getCSharp(), getDataAnalyse(), getOOP(), getBuisnesProcess(), getOperationResearch()
        ));
    }

    public ArrayList<AcademicPerformance> getAcademicPerfomancesFor_anastasiya_asu_21_3() {
        return new ArrayList<>(Arrays.asList(
                getCSharp(), getDataAnalyse(), getOOP(), getBuisnesProcess(), getOperationResearch()
        ));
    }

    public ArrayList<AcademicPerformance> getAcademicPerfomancesFor_sofia_asu_21_3() {
        return new ArrayList<>(Arrays.asList(
                getCSharp(), getDataAnalyse(), getOOP(), getBuisnesProcess(), getOperationResearch()
        ));
    }

    public ArrayList<AcademicPerformance> getAcademicPerfomancesFor_maxim_asu_21_3() {
        return new ArrayList<>(Arrays.asList(
                getCSharp(), getDataAnalyse(), getOOP(), getBuisnesProcess(), getOperationResearch()
        ));
    }

    public ArrayList<AcademicPerformance> getAcademicPerfomancesFor_alisa_asu_21_3() {
        return new ArrayList<>(Arrays.asList(
                getCSharp(), getDataAnalyse(), getOOP(), getBuisnesProcess(), getOperationResearch()
        ));
    }

    public ArrayList<AcademicPerformance> getAcademicPerfomancesFor_veronika_asu_21_2() {
        return new ArrayList<>(Arrays.asList(
                getCSharp(), getDataAnalyse(), getOOP(), getBuisnesProcess(), getOperationResearch()
        ));
    }

    public ArrayList<AcademicPerformance> getAcademicPerfomancesFor_stanislav_asu_21_2() {
        return new ArrayList<>(Arrays.asList(
                getCSharp(), getDataAnalyse(), getOOP(), getBuisnesProcess(), getOperationResearch()
        ));
    }

    public ArrayList<AcademicPerformance> getAcademicPerfomancesFor_viktoriya_asu_21_2() {
        return new ArrayList<>(Arrays.asList(
                getCSharp(), getDataAnalyse(), getOOP(), getBuisnesProcess(), getOperationResearch()
        ));
    }

    public ArrayList<AcademicPerformance> getAcademicPerfomancesFor_varvara_asu_21_2() {
        return new ArrayList<>(Arrays.asList(
                getCSharp(), getDataAnalyse(), getOOP(), getBuisnesProcess(), getOperationResearch()
        ));
    }

    public ArrayList<AcademicPerformance> getAcademicPerfomancesFor_elina_asu_21_2() {
        return new ArrayList<>(Arrays.asList(
                getCSharp(), getDataAnalyse(), getOOP(), getBuisnesProcess(), getOperationResearch()
        ));
    }

    public ArrayList<AcademicPerformance> getAcademicPerfomancesFor_andrey_asu_21_1() {
        return new ArrayList<>(Arrays.asList(
                getCSharp(), getDataAnalyse(), getOOP(), getBuisnesProcess(), getOperationResearch()
        ));
    }

    public ArrayList<AcademicPerformance> getAcademicPerfomancesFor_konstantin_asu_21_1() {
        return new ArrayList<>(Arrays.asList(
                getCSharp(), getDataAnalyse(), getOOP(), getBuisnesProcess(), getOperationResearch()
        ));
    }

    public ArrayList<AcademicPerformance> getAcademicPerfomancesFor_miron_asu_21_1() {
        return new ArrayList<>(Arrays.asList(
                getCSharp(), getDataAnalyse(), getOOP(), getBuisnesProcess(), getOperationResearch()
        ));
    }

    public ArrayList<AcademicPerformance> getAcademicPerfomancesFor_miya_asu_21_1() {
        return new ArrayList<>(Arrays.asList(
                getCSharp(), getDataAnalyse(), getOOP(), getBuisnesProcess(), getOperationResearch()
        ));
    }

    public ArrayList<AcademicPerformance> getAcademicPerfomancesFor_daniel_asu_21_1() {
        return new ArrayList<>(Arrays.asList(
                getCSharp(), getDataAnalyse(), getOOP(), getBuisnesProcess(), getOperationResearch()
        ));
    }

    public ArrayList<AcademicPerformance> getAcademicPerfomancesFor_adelya_asu_20_2() {
        return new ArrayList<>(Arrays.asList(
                getWeb(), getModel(), getMobile()
        ));
    }

    public ArrayList<AcademicPerformance> getAcademicPerfomancesFor_aleksey_asu_20_2() {
        return new ArrayList<>(Arrays.asList(
                getWeb(), getModel(), getMobile()
        ));
    }

    public ArrayList<AcademicPerformance> getAcademicPerfomancesFor_matvey_asu_20_2() {
        return new ArrayList<>(Arrays.asList(
                getWeb(), getModel(), getMobile()
        ));
    }

    public ArrayList<AcademicPerformance> getAcademicPerfomancesFor_artem_asu_20_2() {
        return new ArrayList<>(Arrays.asList(
                getWeb(), getModel(), getMobile()
        ));
    }

    public ArrayList<AcademicPerformance> getAcademicPerfomancesFor_ilya_asu_20_2() {
        return new ArrayList<>(Arrays.asList(
                getWeb(), getModel(), getMobile()
        ));
    }

    public ArrayList<AcademicPerformance> getAcademicPerfomancesFor_roman_asu_20_1() {
        return new ArrayList<>(Arrays.asList(
                getWeb(), getModel(), getMobile()
        ));
    }

    public ArrayList<AcademicPerformance> getAcademicPerfomancesFor_anna_asu_20_1() {
        return new ArrayList<>(Arrays.asList(
                getWeb(), getModel(), getMobile()
        ));
    }

    public ArrayList<AcademicPerformance> getAcademicPerfomancesFor_angelina_asu_20_1() {
        return new ArrayList<>(Arrays.asList(
                getWeb(), getModel(), getMobile()
        ));
    }

    public ArrayList<AcademicPerformance> getAcademicPerfomancesFor_aleksandra_asu_20_1() {
        return new ArrayList<>(Arrays.asList(
                getWeb(), getModel(), getMobile()
        ));
    }

    public ArrayList<AcademicPerformance> getAcademicPerfomancesFor_anneta_asu_20_1() {
        return new ArrayList<>(Arrays.asList(
                getWeb(), getModel(), getMobile()
        ));
    }

    public ArrayList<AcademicPerformance> getAcademicPerfomancesFor_sofiya_istb_20_3() {
        return new ArrayList<>(Arrays.asList(
                getWeb(), getModel(), getMobile()
        ));
    }

    public ArrayList<AcademicPerformance> getAcademicPerfomancesFor_egor_istb_20_3() {
        return new ArrayList<>(Arrays.asList(
                getWeb(), getModel(), getMobile()
        ));
    }

    public ArrayList<AcademicPerformance> getAcademicPerfomancesFor_viktoriya_istb_20_3() {
        return new ArrayList<>(Arrays.asList(
                getWeb(), getModel(), getMobile()
        ));
    }

    public ArrayList<AcademicPerformance> getAcademicPerfomancesFor_mariya_istb_20_3() {
        return new ArrayList<>(Arrays.asList(
                getWeb(), getModel(), getMobile()
        ));
    }

    public ArrayList<AcademicPerformance> getAcademicPerfomancesFor_daniil_istb_20_3() {
        return new ArrayList<>(Arrays.asList(
                getWeb(), getModel(), getMobile()
        ));
    }

    public ArrayList<AcademicPerformance> getAcademicPerfomancesFor_alisa_istb_20_2() {
        return new ArrayList<>(Arrays.asList(
                getWeb(), getModel(), getMobile()
        ));
    }

    public ArrayList<AcademicPerformance> getAcademicPerfomancesFor_polina_istb_20_2() {
        return new ArrayList<>(Arrays.asList(
                getWeb(), getModel(), getMobile()
        ));
    }

    public ArrayList<AcademicPerformance> getAcademicPerfomancesFor_timur_istb_20_2() {
        return new ArrayList<>(Arrays.asList(
                getWeb(), getModel(), getMobile()
        ));
    }

    public ArrayList<AcademicPerformance> getAcademicPerfomancesFor_egor_istb_20_2() {
        return new ArrayList<>(Arrays.asList(
                getWeb(), getModel(), getMobile()
        ));
    }

    public ArrayList<AcademicPerformance> getAcademicPerfomancesFor_daniil_istb_20_2() {
        return new ArrayList<>(Arrays.asList(
                getWeb(), getModel(), getMobile()
        ));
    }

    public ArrayList<AcademicPerformance> getAcademicPerfomancesFor_pavel_istb_20_1() {
        return new ArrayList<>(Arrays.asList(
                getWeb(), getModel(), getMobile()
        ));
    }

    public ArrayList<AcademicPerformance> getAcademicPerfomancesFor_evgeniy_istb_20_1() {
        return new ArrayList<>(Arrays.asList(
                getWeb(), getModel(), getMobile()
        ));
    }

    public ArrayList<AcademicPerformance> getAcademicPerfomancesFor_miroslava_istb_20_1() {
        return new ArrayList<>(Arrays.asList(
                getWeb(), getModel(), getMobile()
        ));
    }

    public ArrayList<AcademicPerformance> getAcademicPerfomancesFor_kira_istb_20_1() {
        return new ArrayList<>(Arrays.asList(
                getWeb(), getModel(), getMobile()
        ));
    }

    public ArrayList<AcademicPerformance> getAcademicPerfomancesFor_veronika_istb_21_1() {
        return new ArrayList<>(Arrays.asList(
                getCSharp(), getDataAnalyse(), getOOP(), getBuisnesProcess(), getOperationResearch()
        ));
    }

    public ArrayList<AcademicPerformance> getAcademicPerfomancesFor_sofia_istb_21_2() {
        return new ArrayList<>(Arrays.asList(
                getCSharp(), getDataAnalyse(), getOOP(), getBuisnesProcess(), getOperationResearch()
        ));
    }

    public ArrayList<AcademicPerformance> getAcademicPerfomancesFor_arseniy_istb_21_2() {
        return new ArrayList<>(Arrays.asList(
                getCSharp(), getDataAnalyse(), getOOP(), getBuisnesProcess(), getOperationResearch()
        ));
    }

    public ArrayList<AcademicPerformance> getAcademicPerfomancesFor_artem_istb_20_1() {
        return new ArrayList<>(Arrays.asList(
                getWeb(), getModel(), getMobile()
        ));
    }
}
