package com.example.administrator.hci.activities;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.example.administrator.hci.R;
import com.example.administrator.hci.fragments.BodyFragment;
import com.example.administrator.hci.fragments.MenuFragment;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        if(savedInstanceState==null){
            getSupportFragmentManager().beginTransaction()
                    .add(R.id.contentContainerMenu,new MenuFragment())
                    .add(R.id.contentContainerBody,new BodyFragment())
                    .commit();
        }

    }
}