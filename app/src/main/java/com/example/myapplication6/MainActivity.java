package com.example.myapplication6;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void send_click(View view){
        Intent intent = new Intent();
        intent.setAction("FAKE_EVENT_INFO");
        sendBroadcast((intent));

    }
}