package malinatrash.killthedebtor.models.fabrics;

import malinatrash.killthedebtor.models.Teacher;

public class TeacherFabric {
    public static TeacherFabric shared = new TeacherFabric();

    Teacher arsh = new Teacher(
            "arsh",
            "pas",
            "Вадим",
            "Аршинский",
            "Леонидович",
            DisciplineFabric.shared.getDisciplinesArsh()
    );
    Teacher katash = new Teacher(
            "katash",
            "pas",
            "Михаил",
            "Каташевцев",
            "Дмитриевич",
            DisciplineFabric.shared.getDisciplinesKatash()
    );
    Teacher buch = new Teacher(
            "buch",
            "pas",
            "Олег",
            "Бучнев",
            "Сергеевич",
            DisciplineFabric.shared.getDisciplinesBuch()
    );

    Teacher malan = new Teacher(
            "malan",
            "pas",
            "Татьяна",
            "Маланова",
            "Валерьевна",
            DisciplineFabric.shared.getDisciplinesMalan()
    );

    Teacher petrov = new Teacher(
            "petrov",
            "pas",
            "Павел",
            "Петров",
            "Александрович",
            DisciplineFabric.shared.getDisciplinesPetrov()
    );

    TeacherFabric() {
    }

    public Teacher getTeacherArsh() {
        return arsh;
    }

    public Teacher getTeacherBuch() {
        return buch;
    }

    public Teacher getTeacherMalan() {
        return malan;
    }

    public Teacher getTeacherPetrov() {
        return petrov;
    }

    public Teacher getTeacherKatash() {
        return katash;
    }
}
