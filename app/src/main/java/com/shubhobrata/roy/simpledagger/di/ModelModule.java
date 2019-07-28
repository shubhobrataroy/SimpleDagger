package com.shubhobrata.roy.simpledagger.di;

import com.shubhobrata.roy.simpledagger.model.TestModel;

import dagger.Module;
import dagger.Provides;

/**
 * Created by Shubhobrata Roy
 * on 7/28/19
 */

@Module
public class ModelModule {

    @Provides
    public TestModel provideModel(){ return new TestModel(); }
}
