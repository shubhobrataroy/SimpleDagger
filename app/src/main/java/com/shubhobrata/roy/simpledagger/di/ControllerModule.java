package com.shubhobrata.roy.simpledagger.di;

import com.shubhobrata.roy.simpledagger.controller.Controller;
import com.shubhobrata.roy.simpledagger.controller.impl.ControllerImpl;

import dagger.Module;
import dagger.Provides;

/**
 * Created by Shubhobrata Roy
 * on 7/28/19
 */

@Module
public class ControllerModule {

    @Provides
    public Controller provideController()
    {
        return new ControllerImpl();
    }
}
