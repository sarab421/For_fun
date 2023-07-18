package com.sarab.chitchat;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;

public class PasswordResetActivity extends AppCompatActivity {
    EditText userEmail;
    Button btnrest;
    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_password_reset);
        userEmail =findViewById(R.id.editTextEmailreset);
        btnrest = findViewById(R.id.btnreset);
    }
}