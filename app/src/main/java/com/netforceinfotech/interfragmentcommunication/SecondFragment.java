package com.netforceinfotech.interfragmentcommunication;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;


/**
 * A simple {@link Fragment} subclass.
 */
public class SecondFragment extends Fragment {

    TextView seconfragTextView;

    public SecondFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
   View view = inflater.inflate(R.layout.fragment_second, container, false);

        seconfragTextView = (TextView) view.findViewById(R.id.seconfragTextView);
        seconfragTextView.setVisibility(View.GONE);

        return view;
    }

    public  void updateinfo(String name)
    {
        seconfragTextView.setText(name);
        seconfragTextView.setVisibility(View.VISIBLE);

    }

}
