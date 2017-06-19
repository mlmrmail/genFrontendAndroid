package com.motors.genfrontendandroid;

import android.app.FragmentManager;
import android.app.FragmentTransaction;
import android.content.res.Configuration;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

public class LoginActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        Configuration config = getResources().getConfiguration();

        FragmentManager fragmentManager = getFragmentManager();
        FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();

        if (config.orientation == Configuration.ORIENTATION_LANDSCAPE) {
            NormalLogin nl_fragment = new NormalLogin();
            fragmentTransaction.replace(android.R.id.content, nl_fragment);
        }else{
            FingerprintLogin fl_fragment = new FingerprintLogin();
            fragmentTransaction.replace(android.R.id.content, fl_fragment);
        }
        fragmentTransaction.commit();



    }
}
