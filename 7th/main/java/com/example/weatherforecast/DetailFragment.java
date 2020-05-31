package com.example.weatherforecast;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.loyid.weatherforecast.R;

public class DetailFragment extends Fragment {

    public DetailFragment() {
        // Required empty public constructor
    }

    @Override
    //Let's do it 2
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        Bundle data = getArguments();
        String detailData = null;
        if (data != null){
            detailData = data.getString("data");
        }

        //Inflating data
        View rootView = inflater.inflate(R.layout.fragment_detail, container, false);
        TextView detailTextView = (TextView)rootView.findViewById(R.id.detail_textview);
        detailTextView.setText(detailData);
        return rootView;
    }
}
