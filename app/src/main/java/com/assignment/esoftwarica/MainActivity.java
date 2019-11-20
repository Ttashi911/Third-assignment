package com.assignment.esoftwarica;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    private EditText etUsername, etPassword;
    Button btnLogin;
    String usernameLogin, passwordLogin;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        etUsername = findViewById(R.id.etUsername);
        etPassword = findViewById(R.id.etPassword);
        btnLogin = findViewById(R.id.btnLogin);
        btnLogin.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        usernameLogin = etUsername.getText().toString();
        passwordLogin = etPassword.getText().toString();

        if (usernameLogin.equals("shrishak") && passwordLogin.equals("shrishak")){
            etUsername.getText().clear();
            etPassword.getText().clear();
            Intent intent = new Intent(this, Dashboard.class);
            startActivity(intent);
        } else {
            etUsername.setError("Please enter valid username");
            etPassword.setError("Please enter valid password");
        }
    }
}
