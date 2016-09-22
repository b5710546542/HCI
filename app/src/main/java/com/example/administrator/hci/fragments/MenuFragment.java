package com.example.administrator.hci.fragments;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import com.example.administrator.hci.R;
import com.example.administrator.hci.activities.AlarmActivity;
import com.example.administrator.hci.activities.HomeworkActivity;
import com.example.administrator.hci.activities.StudyActivity;

/**
 * Created by Administrator on 9/17/2016.
 */
public class MenuFragment extends Fragment {

    Button alarm;
    Button study;
    Button homework;
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.fragment_menu,container,false);
        initInstance(rootView);
        return rootView;
    }

    private void initInstance(View rootView) {
        alarm = (Button) rootView.findViewById(R.id.btnalarm);
        study = (Button) rootView.findViewById(R.id.btnstudy);
        homework = (Button) rootView.findViewById(R.id.btnhomework);

        alarm.setOnClickListener(listener);
        study.setOnClickListener(listener);
        homework.setOnClickListener(listener);
    }

    View.OnClickListener listener = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            if(v == alarm){
                Intent intent = new Intent(getActivity(), AlarmActivity.class);
                startActivity(intent);
            }else if(v == study){
                Intent intent = new Intent(getActivity(), StudyActivity.class);
                startActivity(intent);
            }else if(v == homework){
                Intent intent = new Intent(getActivity(), HomeworkActivity.class);
                startActivity(intent);
            }
        }
    };

}
