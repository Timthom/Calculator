package com.example.iths.calculator;

import android.os.Bundle;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;

public class Home extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);


        Thread th = new Thread() {
            public void run() {
                try {
                    sleep(3000);
                } catch (Exception e) {
                    e.printStackTrace();
                } finally {
                    onPause();
                    startActivity(new Intent(getString(R.string.Calc)));
                }
            }
        };
        th.start();

    }


@Override
public void onPause() {
        super.onPause();
        finish();
        }
}




