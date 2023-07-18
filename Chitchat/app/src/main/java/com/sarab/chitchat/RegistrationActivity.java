package com.sarab.chitchat;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import de.hdodenhof.circleimageview.CircleImageView;

public class RegistrationActivity extends AppCompatActivity {
    EditText userName,userPass,userEmail,userNumber;
    Button userSign_in, userSign_up;
    CircleImageView image;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_registration);
        userName =findViewById(R.id.editTextNamereg);
        userPass =findViewById(R.id.editTextNamereg);
        userEmail = findViewById(R.id.editTextTextEmailAddressreg);
        userNumber =findViewById(R.id.editTextPhonereg);
        userSign_in =findViewById(R.id.btnsigninreg);
        userSign_up =findViewById(R.id.btnsignupreg);
        image =findViewById(R.id.circleImageViewreg);

    }
}