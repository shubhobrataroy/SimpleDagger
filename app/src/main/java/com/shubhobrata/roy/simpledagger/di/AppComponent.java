package com.shubhobrata.roy.simpledagger.di;

import com.shubhobrata.roy.simpledagger.MainActivity;
import com.shubhobrata.roy.simpledagger.controller.Controller;
import com.shubhobrata.roy.simpledagger.controller.impl.ControllerImpl;

import javax.inject.Singleton;

import dagger.Component;

/**
 * Created by Shubhobrata Roy
 * on 7/28/19
 */

@Component(modules = {ModelModule.class, ControllerModule.class})
@Singleton
public interface AppComponent {
    void inject(ControllerImpl controller);
    void inject(MainActivity mainActivity);
}
