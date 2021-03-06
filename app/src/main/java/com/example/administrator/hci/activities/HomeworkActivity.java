package com.example.administrator.hci.activities;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import com.example.administrator.hci.R;
import com.example.administrator.hci.fragments.HomeworkFragment;

public class HomeworkActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_homework);

        if(savedInstanceState==null){
            getSupportFragmentManager().beginTransaction()
                    .add(R.id.contentContainerHomework,new HomeworkFragment())
                    .commit();
        }

    }
}