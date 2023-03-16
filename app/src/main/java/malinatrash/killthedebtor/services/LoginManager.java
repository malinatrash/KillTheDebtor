package malinatrash.killthedebtor.services;

import malinatrash.killthedebtor.models.Teacher;

public class LoginManager {
    public static LoginManager shared = new LoginManager();
    public Teacher getTeacher(String login, String password) {
        Teacher teacherByLog = getTeaherByLogin(login);
        Teacher getTeacherByPas = getTeaherByPassword(password);

        if (teacherByLog == getTeacherByPas) {
            return teacherByLog;
        }
        return null;
    }
    private Teacher getTeaherByLogin(String login) {
        for (Teacher teacher : Teacher.teachers) {
            if (teacher.getLogin().equals(login)) {
                return teacher;
            }
        }
        return null;
    }
    private Teacher getTeaherByPassword(String password) {
        for (Teacher teacher : Teacher.teachers) {
            if (teacher.getPassword().equals(password)) {
                return teacher;
            }
        }
        return null;
    }
}
