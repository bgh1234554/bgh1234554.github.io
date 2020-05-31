package com.example.weatherforecast;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.loyid.weatherforecast.R;

public class DetailActivity extends AppCompatActivity {

    @Override
    //Let's do it 2
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);

        if (savedInstanceState == null) {
            DetailFragment fragment = new DetailFragment();

            if (getIntent().hasExtra("data")) {
                Bundle arguments = new Bundle();
                arguments.putString("data", getIntent().getStringExtra("data"));

                fragment.setArguments(arguments);
            }

            getSupportFragmentManager().beginTransaction()
                    .add(R.id.detail_container, fragment)
                    .commit();
        }
    }
}
