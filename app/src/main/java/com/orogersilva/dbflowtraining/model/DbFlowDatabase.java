package com.orogersilva.dbflowtraining.model;

import com.raizlabs.android.dbflow.annotation.Database;

/**
 * Created by orogersilva on 3/12/2016.
 */
@Database(name = DbFlowDatabase.NAME, version = DbFlowDatabase.VERSION)
public class DbFlowDatabase {

    // region FIELDS

    public static final String NAME = "DbFlow";
    public static final int VERSION = 1;

    // endregion
}
