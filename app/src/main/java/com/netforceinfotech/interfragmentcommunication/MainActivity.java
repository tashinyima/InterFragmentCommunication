package com.netforceinfotech.interfragmentcommunication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity implements FirstFragment.OnNameSetListener{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Override
    public void setName(String name) {

        SecondFragment f2 = (SecondFragment) getSupportFragmentManager().findFragmentById(R.id.secondFrag);

        f2.updateinfo(name);
    }
}
