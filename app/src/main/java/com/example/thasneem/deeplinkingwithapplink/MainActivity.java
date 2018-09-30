package com.example.thasneem.deeplinkingwithapplink;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Intent intent = getIntent();
        Uri data = intent.getData();
        if (data != null) {
            Toast.makeText(this, data.getQueryParameter("name"), Toast.LENGTH_SHORT).show();
        }

    }
}
