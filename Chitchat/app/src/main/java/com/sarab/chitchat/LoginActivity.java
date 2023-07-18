package com.sarab.chitchat;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;

public class LoginActivity extends AppCompatActivity {
  EditText editPass, editEmail;
  Button btnlogin, btnsignup;
  FirebaseAuth auth;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        editEmail = findViewById(R.id.editTextEmail);
        editPass = findViewById(R.id.editPass);
        btnlogin = findViewById(R.id.login);
        btnsignup = findViewById(R.id.signup);
        auth = FirebaseAuth.getInstance();


        btnsignup.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(LoginActivity.this , RegistrationActivity.class);
                startActivity(intent);
                finish();
            }
        });

        btnlogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
             String email = editEmail.getText().toString();
             String password =editPass.getText().toString();
             if (email.equals("") || password.equals("")){
                 Toast.makeText(LoginActivity.this, "You left either email or password", Toast.LENGTH_LONG).show();
             }
             else {
                 signin(email, password);
             }
            }
        });

    }
    public void signin(String email, String password){
       auth.signInWithEmailAndPassword(email, password).addOnCompleteListener(new OnCompleteListener<AuthResult>() {
           @Override
           public void onComplete(@NonNull Task<AuthResult> task) {
               if(task.isSuccessful()){
                   Intent intent =new Intent(LoginActivity.this, MainActivity.class);
                   Toast.makeText(LoginActivity.this , "Login Sucessful!", Toast.LENGTH_LONG).show();
                   startActivity(intent);
                   finish();

               }
               else {
                   Toast.makeText(LoginActivity.this, "Wrong email or password", Toast.LENGTH_LONG).show();
               }
           }
       });
    }
}