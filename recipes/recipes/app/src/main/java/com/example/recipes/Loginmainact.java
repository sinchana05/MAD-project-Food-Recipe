package com.example.recipes;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class Loginmainact extends AppCompatActivity {

    EditText username,password;
    Button login;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_loginmainact);

        username=findViewById(R.id.username);
        password=findViewById(R.id.password);
        login=findViewById(R.id.loginbut);

        Bundle bundle=getIntent().getExtras();
        String uname = bundle.getString("username");
        String pwd = bundle.getString("password");

        login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String user=username.getText().toString();
                String pass=password.getText().toString();

                if(user.equals(uname)&& pass.equals(pwd)){
                    Toast.makeText(Loginmainact.this, "Successful", Toast.LENGTH_SHORT).show();

                    Intent intent=new Intent(Loginmainact.this,Recipeactmain.class);
                    startActivity(intent);
                }
                else {
                    Toast.makeText(Loginmainact.this, "Failed", Toast.LENGTH_SHORT).show();
                }
            }
        });
    }
}