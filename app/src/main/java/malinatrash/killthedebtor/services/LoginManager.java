package malinatrash.killthedebtor.services;

import java.util.ArrayList;
import java.util.Arrays;

import malinatrash.killthedebtor.models.Teacher;
import malinatrash.killthedebtor.models.fabrics.TeacherFabric;

public class LoginManager {
    public static LoginManager shared = new LoginManager();

    public ArrayList<Teacher> teachers = new ArrayList<>(Arrays.asList(
            TeacherFabric.shared.getTeacherArsh(),
            TeacherFabric.shared.getTeacherBuch(),
            TeacherFabric.shared.getTeacherKatash(),
            TeacherFabric.shared.getTeacherMalan(),
            TeacherFabric.shared.getTeacherPetrov()
    ));

    public Teacher getTeacher(String login, String password) {
        Teacher teacherByLog = getTeaherByLogin(login);
        Teacher getTeacherByPas = getTeaherByPassword(password);

        if (teacherByLog == getTeacherByPas) {
            return teacherByLog;
        }
        return null;
    }

    private Teacher getTeaherByLogin(String login) {
        for (Teacher teacher : teachers) {
            if (teacher.getLogin().equals(login)) {
                return teacher;
            }
        }
        return null;
    }

    private Teacher getTeaherByPassword(String password) {
        for (Teacher teacher : teachers) {
            if (teacher.getPassword().equals(password)) {
                return teacher;
            }
        }
        return null;
    }
}
