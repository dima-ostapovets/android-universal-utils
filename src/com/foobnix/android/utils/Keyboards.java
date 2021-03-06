package com.foobnix.android.utils;

import android.app.Activity;
import android.content.Context;
import android.view.View;
import android.view.WindowManager;
import android.view.inputmethod.InputMethodManager;

public class Keyboards {
    public static void hideAlways(Activity context) {
        context.getWindow().setSoftInputMode(WindowManager.LayoutParams.SOFT_INPUT_STATE_ALWAYS_HIDDEN);
    }

    public static void close(Activity context) {
        InputMethodManager inputManager = (InputMethodManager) context.getSystemService(Context.INPUT_METHOD_SERVICE);
        View currentFocus = context.getCurrentFocus();
        if (currentFocus != null) {
            inputManager.hideSoftInputFromWindow(currentFocus.getWindowToken(), InputMethodManager.HIDE_NOT_ALWAYS);
        }
    }

    public static void close(View currentFocus) {
        InputMethodManager inputManager = (InputMethodManager) currentFocus.getContext().getSystemService(Context.INPUT_METHOD_SERVICE);
        inputManager.toggleSoftInput(InputMethodManager.HIDE_IMPLICIT_ONLY, 0);
        inputManager.hideSoftInputFromWindow(currentFocus.getWindowToken(), 0);
    }

}