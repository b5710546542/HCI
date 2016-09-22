package com.example.administrator.hci.activities;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import com.example.administrator.hci.R;
import com.example.administrator.hci.fragments.AlarmFragment;

public class AlarmActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_alarm);

        if(savedInstanceState==null) {
            getSupportFragmentManager().beginTransaction()
                    .add(R.id.contentContainerAlarm, new AlarmFragment())
                    .commit();
        }
    }
}