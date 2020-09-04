package org.techtown.practice08;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    public static final int REQUEST_CODE_MENU=101;

    EditText usernameInput;
    EditText passwordInput;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button loginButton=findViewById(R.id.loginButton);
        loginButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String username = usernameInput.getText().toString();
                String password = passwordInput.getText().toString();

                Intent intent = new Intent(getApplicationContext(),MenuActivity.class);
                intent.putExtra("username",username);
                intent.putExtra("password",password);

                startActivityForResult(intent, REQUEST_CODE_MENU);
            }
        });

        usernameInput = findViewById(R.id.usernameInput);
        passwordInput=findViewById(R.id.passwordInput);


}}