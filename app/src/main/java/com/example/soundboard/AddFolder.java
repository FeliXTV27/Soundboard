package com.example.soundboard;

import androidx.annotation.ContentView;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;

public class AddFolder extends AppCompatActivity {

    Button backbutton;
    Button confirmbutton;
    private Folderbutton folderbutton = null;
    EditText folderName;

    private View.OnClickListener Onclicklistener = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            backButtonClicked();
        }
    };

    private View.OnClickListener ConfirmOnclicklistenener = new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            confirmButtonClicked();
        }
    };

    class Folderbutton extends androidx.appcompat.widget.AppCompatButton {
        OnClickListener clicker = new OnClickListener() {
            public void onClick(View v) {
                finish();
            }
        };
        public Folderbutton(Context ctx) {
            super(ctx);
            setText(folderName.getText());
            setOnClickListener(clicker);
        }
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_folder);

        backbutton = (Button) findViewById(R.id.btnBack);
        backbutton.setOnClickListener(Onclicklistener);

        confirmbutton = (Button) findViewById(R.id.btnConfirmNewFolder);
        confirmbutton.setOnClickListener(ConfirmOnclicklistenener);

        folderName = findViewById(R.id.inputNewFolderName);
    }

    private void backButtonClicked() {
        finish();
    }

    private void confirmButtonClicked() {
        Intent intent = new Intent(AddFolder.this, MainActivity.class);
        intent.putExtra("name", folderName.getText().toString());
        startActivity(intent);
        //asdfmovie
    }
}