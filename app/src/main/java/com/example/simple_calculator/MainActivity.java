package com.example.simple_calculator;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
    }
    public void Add(View v){
        EditText et1=(EditText) findViewById(R.id.editTextNumberDecimal);
        EditText et2=(EditText) findViewById(R.id.editTextNumberDecimal2);
        EditText et3=(EditText) findViewById(R.id.editTextNumberDecimal3);

        String num1Str=et1.getText().toString();
        String num2Str=et2.getText().toString();
        if(num1Str.isEmpty() || num2Str.isEmpty()){
            et3.setText("Please enter both numbers...");
            return;
        }
        try {
            float num1 = Float.parseFloat(num1Str);
            float num2 = Float.parseFloat(num2Str);
            float result = num1 + num2;
            et3.setText("Result: "+result);
        }
        catch(NumberFormatException e){
            et3.setText("Invalid Input!");
        }

    }
    public void Subtract(View v) {
        EditText et1 = (EditText) findViewById(R.id.editTextNumberDecimal);
        EditText et2 = (EditText) findViewById(R.id.editTextNumberDecimal2);
        EditText et3 = (EditText) findViewById(R.id.editTextNumberDecimal3);

        String num1Str = et1.getText().toString();
        String num2Str = et2.getText().toString();
        if (num1Str.isEmpty() || num2Str.isEmpty()) {
            et3.setText("Please enter both numbers...");
            return;
        }
        try {
            float num1 = Float.parseFloat(num1Str);
            float num2 = Float.parseFloat(num2Str);
            float result = num1 - num2;
            et3.setText("Result: " + result);
        } catch (NumberFormatException e) {
            et3.setText("Invalid Input!");
        }
    }
        public void Multiply(View v) {
            EditText et1 = (EditText) findViewById(R.id.editTextNumberDecimal);
            EditText et2 = (EditText) findViewById(R.id.editTextNumberDecimal2);
            EditText et3 = (EditText) findViewById(R.id.editTextNumberDecimal3);

            String num1Str = et1.getText().toString();
            String num2Str = et2.getText().toString();
            if (num1Str.isEmpty() || num2Str.isEmpty()) {
                et3.setText("Please enter both numbers...");
                return;
            }
            try {
                float num1 = Float.parseFloat(num1Str);
                float num2 = Float.parseFloat(num2Str);
                float result = num1 * num2;
                et3.setText("Result: " + result);
            } catch (NumberFormatException e) {
                et3.setText("Invalid Input!");
            }
        }
    public void Divide(View v) {
        EditText et1 = (EditText) findViewById(R.id.editTextNumberDecimal);
        EditText et2 = (EditText) findViewById(R.id.editTextNumberDecimal2);
        EditText et3 = (EditText) findViewById(R.id.editTextNumberDecimal3);

        String num1Str = et1.getText().toString();
        String num2Str = et2.getText().toString();
        if (num1Str.isEmpty() || num2Str.isEmpty()) {
            et3.setText("Please enter both numbers...");
            return;
        }
        try {
            float num1 = Float.parseFloat(num1Str);
            float num2 = Float.parseFloat(num2Str);
            float result = num1 / num2;
            et3.setText("Result: " + result);
        } catch (NumberFormatException e) {
            et3.setText("Invalid Input!");
        }
    }
}