package com.example.soundboard;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    Button addFolder;
    private View.OnClickListener awesomeOnClickListener = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            addFolderclicked();
        }
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        addFolder = (Button) findViewById(R.id.btn_addFolder);
        addFolder.setOnClickListener(awesomeOnClickListener);
    }
    private void addFolderclicked() {
        Intent intent = new Intent(MainActivity.this, AddFolder.class);
        startActivity(intent);
    }

}