package com.zedzul.github.hw1_02092017;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

public class MainActivity extends AppCompatActivity {

    public static final String TAG_GOOD = "GOOD";
    public static final String MSG_ALL_RIGHT = "ALL RIGHT";

    @Override
    protected void onCreate(final Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //some changes
        Log.d(TAG_GOOD, MSG_ALL_RIGHT);
        //update master
        //some feature added
        //update master 2
    }

    public void someFileWriter(){
        //good realisation
    }

    public void someFileReader(){
        //good realisation
    }
}
