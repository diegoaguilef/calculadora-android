package com.example.claseapps;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class Calculator extends AppCompatActivity {
    TextView txtResult;
    Button btn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calculator);
        txtResult = (TextView) findViewById(R.id.txtResultCalc);
    }

    public void handleClick(View view){
        btn = ((Button) view);
        String btnValue = btn.getText().toString();
        txtResult.setText(txtResult.getText().toString() + (btnValue).toString());

    }
}