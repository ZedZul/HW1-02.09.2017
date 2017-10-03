package com.zedzul.github.hw1_02092017;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(final Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //some changes
        Log.d("GOOD","ALL RIGHT");
    }

    public void someFileWriter(){
        //good realisation
    }

    public void someFileReader(){
        //good realisation
    }
}
