package com.example.user.helloworld;

import android.app.Activity;
import android.app.FragmentManager;
import android.app.FragmentTransaction;
import android.content.res.Configuration;

import android.os.Bundle;

public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //setContentView(R.layout.activity_main);
        Configuration config=getResources().getConfiguration();
        FragmentManager fragmentManager = getFragmentManager();
        FragmentTransaction fragmentTransaction =
                fragmentManager.beginTransaction();

        if(config.orientation==Configuration.ORIENTATION_LANDSCAPE)
        {
            FragmentLand ob1=new FragmentLand();
           fragmentTransaction.replace(android.R.id.content,ob1);

        }
        else
        {
            FragmentPort ob2=new FragmentPort();
            fragmentTransaction.replace(android.R.id.content,ob2);

        }
        fragmentTransaction.commit();





    }
}
