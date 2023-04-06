package malinatrash.killthedebtor.services;

import malinatrash.killthedebtor.models.Teacher;

public class LoginManager {
    public static LoginManager shared = new LoginManager();

    public Teacher getTeacher(String login, String password) {
        for (Teacher t: StateManager.shared.getLocalTeachers()) {
            if (t.getLogin().equals(login) && t.getPassword().equals(password)) {
                return t;
            }
        }
        return null;
    }
}
