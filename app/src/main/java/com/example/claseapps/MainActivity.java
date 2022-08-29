package com.example.claseapps;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.example.claseapps.models.User;

public class MainActivity extends AppCompatActivity {
    private TextView txtResult;
    private EditText edtUsername, edtPassword;
    public static final String CALCULATOR = "com.example.claseapps.Calculator";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        txtResult = (TextView)findViewById(R.id.txtResult);
        edtUsername = (EditText) findViewById(R.id.edtUsername);
        edtPassword = (EditText) findViewById(R.id.edtPassword);
    }

    public void clear(){
        edtPassword.setText("");
        edtUsername.setText("");
    }

    public void login(View view) {
        String username = String.valueOf(edtUsername.getText());
        String password = String.valueOf(edtPassword.getText());

        if(username.equals("admin") || password.equals("admin123")){
            Intent intent = new Intent(this, Calculator.class);
            User user = new User();
            user.setName(username);
            user.setPassword(password);
            txtResult.setText(user.toString());
            clear();
            startActivity(intent);
        }else{
            Toast.makeText(this, "Debe ingresar todos los campos", Toast.LENGTH_LONG).show();
        }

    }
}