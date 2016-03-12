package com.orogersilva.dbflowtraining;

import android.app.Application;

import com.raizlabs.android.dbflow.config.FlowManager;

/**
 * Created by orogersilva on 3/12/2016.
 */
public class DbFlowApp extends Application {

    // region LIFECYCLE METHODS

    @Override
    public void onCreate() {

        super.onCreate();

        // Initializing DbFlow...
        FlowManager.init(this);
    }

    // endregion
}
