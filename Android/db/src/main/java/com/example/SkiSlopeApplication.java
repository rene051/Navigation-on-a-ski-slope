package com.example;

import android.app.Application;
import android.util.Log;

import com.activeandroid.ActiveAndroid;

/**
 * Created by Marko on 02.02.2016..
 */
public class SkiSlopeApplication  extends Application {
    @Override
    public void onCreate() {
        super.onCreate();
        ActiveAndroid.initialize(this);
    }
}