package com.orogersilva.dbflowtraining.view.activity;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.orogersilva.dbflowtraining.R;
import com.orogersilva.dbflowtraining.vo.Friend;

public class MainActivity extends AppCompatActivity {

    // region LIFECYCLE METHODS

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    // endregion
}
