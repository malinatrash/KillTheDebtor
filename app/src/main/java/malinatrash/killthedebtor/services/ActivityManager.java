package malinatrash.killthedebtor.services;

import android.app.Activity;
import android.view.View;
import android.view.inputmethod.InputMethodManager;

public class ActivityManager {
    public static void hideKeyboard(Activity activity) {
        InputMethodManager imm = (InputMethodManager) activity.getSystemService(Activity.INPUT_METHOD_SERVICE);
        View view = activity.getCurrentFocus();
        if (view == null) {
            view = new View(activity);
        }
        imm.hideSoftInputFromWindow(view.getWindowToken(), 0);
    }
}
