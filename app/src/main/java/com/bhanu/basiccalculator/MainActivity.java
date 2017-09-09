package com.bhanu.basiccalculator;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    private Button btnadd, btnsubtract, btndivide, btnmultiply;
    private TextView result;
    private EditText editTextA, editTextB;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initialise();
    }

    private void initialise() {
        btnadd = (Button) findViewById(R.id.btnAdd);
        btnsubtract = (Button) findViewById(R.id.btnSubtract);
        btnmultiply = (Button) findViewById(R.id.btnMultiply);
        btndivide = (Button) findViewById(R.id.btnDivide);
        editTextA = (EditText) findViewById(R.id.editTextA);
        editTextB = (EditText) findViewById(R.id.editTextB);
        result = (TextView) findViewById(R.id.textViewR);

        btnadd.setOnClickListener(this);
        btnsubtract.setOnClickListener(this);
        btnmultiply.setOnClickListener(this);
        btndivide.setOnClickListener(this);

    }

    @Override
    public void onClick(View view) {
        String num1 = editTextA.getText().toString();
        String num2 = editTextB.getText().toString();
        switch (view.getId()) {
            case R.id.btnAdd:
                float addition = Float.parseFloat(num1) + Float.parseFloat(num2);
                result.setText(String.valueOf(addition));
                break;
            case R.id.btnSubtract:
                float subtraction = Float.parseFloat(num1) - Float.parseFloat(num2);
                result.setText(String.valueOf(subtraction));
                break;
            case R.id.btnMultiply:
                float multiply = Float.parseFloat(num1) * Float.parseFloat(num2);
                result.setText(String.valueOf(multiply));
                break;
            case R.id.btnDivide:
                try {
                    float division = Float.parseFloat(num1) / Float.parseFloat(num2);
                    result.setText(String.valueOf(division));
                } catch (Exception e) {
                    result.setText("ERROR!");
                }
                break;

        }

    }
}
