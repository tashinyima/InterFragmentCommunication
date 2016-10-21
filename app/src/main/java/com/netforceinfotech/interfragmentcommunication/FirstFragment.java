package com.netforceinfotech.interfragmentcommunication;

import android.app.Activity;
import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;



public class FirstFragment extends Fragment {

    EditText nameEditText;
    Button firstButton ;
    OnNameSetListener onNameSetListener;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment

        View view =  inflater.inflate(R.layout.fragment_first, container, false);
        nameEditText = (EditText) view.findViewById(R.id.nameEditText);
        firstButton = (Button) view.findViewById(R.id.firstButton);

        firstButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String name=nameEditText.getText().toString();
                onNameSetListener.setName(name);  // pass name value to Main Activity with value

            }
        });

        return view;

    }

    public  interface OnNameSetListener
    {

        public void setName(String name);
    }

    @Override
    public void onAttach(Context context) {
        super.onAttach(context);
     try{
         onNameSetListener = (OnNameSetListener) context;
     }catch (Exception e){}

    }
}
