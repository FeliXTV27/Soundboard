package com.example.soundboard;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    Button addFolder;
    Button btnRecordActivity;

    private View.OnClickListener awesomeOnClickListener = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            addFolderclicked();
        }
    };

    private View.OnClickListener onClickListener = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            btnRecordActivityclicked();
        }
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        addFolder = (Button) findViewById(R.id.btn_addFolder);
        addFolder.setOnClickListener(awesomeOnClickListener);

        btnRecordActivity = (Button) findViewById(R.id.btnRecordActivity);
        btnRecordActivity.setOnClickListener(onClickListener);
    }

    private void addFolderclicked() {
        Intent intent = new Intent(MainActivity.this, AddFolder.class);
        startActivity(intent);
    }

    private void btnRecordActivityclicked() {
        Intent intent = new Intent(MainActivity.this, RecordActivity.class);
        startActivity(intent);
    }

}