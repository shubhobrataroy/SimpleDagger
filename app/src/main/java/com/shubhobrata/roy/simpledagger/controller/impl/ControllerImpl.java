package com.shubhobrata.roy.simpledagger.controller.impl;

import com.shubhobrata.roy.simpledagger.App;
import com.shubhobrata.roy.simpledagger.controller.Controller;
import com.shubhobrata.roy.simpledagger.model.TestModel;

import javax.inject.Inject;

/**
 * Created by Shubhobrata Roy
 * on 7/28/19
 */
public class ControllerImpl implements Controller {

    @Inject
    TestModel testModel;

    public ControllerImpl() {
        App.appComponent.inject(this);
    }

    @Override
    public String fetchTestData() {
        return testModel.getTestData();
    }
}
