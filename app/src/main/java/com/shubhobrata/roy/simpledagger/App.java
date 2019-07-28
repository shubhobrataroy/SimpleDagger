package com.shubhobrata.roy.simpledagger;

import android.app.Application;

import com.shubhobrata.roy.simpledagger.di.AppComponent;
import com.shubhobrata.roy.simpledagger.di.DaggerAppComponent;

/**
 * Created by Shubhobrata Roy
 * on 7/28/19
 */
public class App extends Application {

    public static AppComponent appComponent;

    @Override
    public void onCreate() {
        super.onCreate();
        appComponent= DaggerAppComponent.builder().build();
    }
}
