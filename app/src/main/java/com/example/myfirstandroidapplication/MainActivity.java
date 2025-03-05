package com.example.myfirstandroidapplication;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import java.text.DecimalFormat;

public class MainActivity extends AppCompatActivity {

    private EditText numberInputOne, numberInputTwo;
    private TextView output;

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
        numberInputOne = findViewById(R.id.inputFirstNumber);
        numberInputTwo = findViewById((R.id.inputSecondNumber));
        output = findViewById(R.id.textResult);
    }

    public void plus(View view){
        String firstNumText = numberInputOne.getText().toString();
        String secondNumText = numberInputTwo.getText().toString();

        if (firstNumText.isEmpty() || secondNumText.isEmpty()) {
            Toast.makeText(this, "Please enter both numbers", Toast.LENGTH_SHORT).show();
            return;
        }

        try {
            double firstNum = Double.parseDouble(firstNumText);
            double secondNum = Double.parseDouble((secondNumText));

            double result = (double) firstNum + secondNum;
            DecimalFormat df = new DecimalFormat("#.##"); // 2 decimal places
            output.setText(df.format(result));
        } catch (NumberFormatException e) {
            Toast.makeText(this, "Invalid input: " + e.getMessage(), Toast.LENGTH_SHORT).show();
        }
    }

    public void minus(View view){
        String firstNumText = numberInputOne.getText().toString();
        String secondNumText = numberInputTwo.getText().toString();

        if (firstNumText.isEmpty() || secondNumText.isEmpty()) {
            Toast.makeText(this, "Please enter both numbers", Toast.LENGTH_SHORT).show();
            return;
        }

        try {
            double firstNum = Double.parseDouble(firstNumText);
            double secondNum = Double.parseDouble((secondNumText));

            double result = (double) firstNum - secondNum;
            DecimalFormat df = new DecimalFormat("#.##"); // 2 decimal places
            output.setText(df.format(result));
        } catch (NumberFormatException e) {
            Toast.makeText(this, "Invalid input: " + e.getMessage(), Toast.LENGTH_SHORT).show();
        }
    }

    public void multiply(View view){
        String firstNumText = numberInputOne.getText().toString();
        String secondNumText = numberInputTwo.getText().toString();

        if (firstNumText.isEmpty() || secondNumText.isEmpty()) {
            Toast.makeText(this, "Please enter both numbers", Toast.LENGTH_SHORT).show();
            return;
        }

        try {
            double firstNum = Double.parseDouble(firstNumText);
            double secondNum = Double.parseDouble((secondNumText));

            double result = (double) firstNum * secondNum;
            DecimalFormat df = new DecimalFormat("#.##"); // 2 decimal places
            output.setText(df.format(result));
        } catch (NumberFormatException e) {
            Toast.makeText(this, "Invalid input: " + e.getMessage(), Toast.LENGTH_SHORT).show();
        }
    }

    public void divide(View view){
        String firstNumText = numberInputOne.getText().toString();
        String secondNumText = numberInputTwo.getText().toString();

        if (firstNumText.isEmpty() || secondNumText.isEmpty()) {
            Toast.makeText(this, "Please enter both numbers", Toast.LENGTH_SHORT).show();
            return;
        }

        try {
            double firstNum = Double.parseDouble(firstNumText);
            double secondNum = Double.parseDouble((secondNumText));


            if (secondNum == 0) {
                Toast.makeText(this, "Cannot divide by zero!", Toast.LENGTH_SHORT).show();
                return; // Exit the method early
            }

            double result = (double) firstNum / secondNum;
            DecimalFormat df = new DecimalFormat("#.##"); // 2 decimal places
            output.setText(df.format(result));

        } catch (NumberFormatException e) {
            Toast.makeText(this, "Invalid input: " + e.getMessage(), Toast.LENGTH_SHORT).show();
        }
    }

    public void reset(View view) {
        // Clear the input fields
        numberInputOne.setText("");
        numberInputTwo.setText("");

        // Reset the output field to a default message or empty
        output.setText("");

    }
}