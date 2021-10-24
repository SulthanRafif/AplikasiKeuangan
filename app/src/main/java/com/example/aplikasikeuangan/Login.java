package com.example.aplikasikeuangan;

import androidx.appcompat.app.AppCompatActivity;
import androidx.lifecycle.ViewModelProvider;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import org.w3c.dom.Text;

public class Login extends AppCompatActivity {

    private UserViewModel userViewModel;

    TextView textUsername;
    TextView textPassword;

    private String username;
    private String password;

    private String usernameMasuk;
    private String passwordMasuk;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        userViewModel = (UserViewModel) new ViewModelProvider(this).get(UserViewModel.class);

        textUsername = (TextView) findViewById(R.id.username);
        textPassword = (TextView) findViewById(R.id.password);

        username = userViewModel.getUsername();
        password = userViewModel.getPassword();

        Log.d("USERNAME", username);
        Log.d("PASSWORD", password);

        Button btnLogin = findViewById(R.id.btnLogin);

        btnLogin.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View v) {

                usernameMasuk = textUsername.getText().toString();
                passwordMasuk = textPassword.getText().toString();

                if(usernameMasuk.equals(username) && passwordMasuk.equals(password)) {
                    startActivity(new Intent(Login.this, Beranda.class));
                }

                else {
                    Toast.makeText(getBaseContext(), "Password Dan Username Yang Dimasukkan Salah", Toast.LENGTH_SHORT).show();
                }
            }
        });

    }
}