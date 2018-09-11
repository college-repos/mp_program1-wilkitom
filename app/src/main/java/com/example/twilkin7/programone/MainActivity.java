package com.example.twilkin7.programone;

import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v4.app.FragmentManager;
import android.util.Log;

public class MainActivity extends AppCompatActivity implements FragmentOne.OnFragmentInteractionListener {

    FragmentManager fragmentManager;
    String TAG = "WTF";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        fragmentManager = getSupportFragmentManager();

        fragmentManager.beginTransaction().add(R.id.container, new FragmentOne()).commit();
    }

    @Override
    public void onFragmentInteraction(String data)
    {
        Log.v(TAG, data);
    }
}
