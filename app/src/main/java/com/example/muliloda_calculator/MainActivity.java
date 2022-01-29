package com.example.muliloda_calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{

    EditText var1txt,var2txt;
    Button btnAdd,btnSubtract,btnMultiply,btnDivide,btnModulo;
    TextView answerTxt;
    double variable1,variable2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnAdd = findViewById(R.id.btnAdd);
        btnSubtract = findViewById(R.id.btnSubtract);
        btnMultiply = findViewById(R.id.btnMultiply);
        btnDivide = findViewById(R.id.btnDivide);
        btnModulo = findViewById(R.id.btnModulo);

        answerTxt = findViewById(R.id.answerTxt);



        btnAdd.setOnClickListener(this);
        btnSubtract.setOnClickListener(this);
        btnMultiply.setOnClickListener(this);
        btnDivide.setOnClickListener(this);
        btnModulo.setOnClickListener(this);


    }

    @Override
    public void onClick (View v) {


        var1txt = findViewById(R.id.editTxt1stVar);
        var2txt = findViewById(R.id.editTxt2ndVar);

        variable1 = Double.parseDouble(var1txt.getText().toString());
        variable2 = Double.parseDouble(var2txt.getText().toString());

        switch(v.getId()) {
            case R.id.btnAdd:
                answerTxt.setText(Double.toString(variable1 + variable2));

                break;
            case R.id.btnSubtract:
                answerTxt.setText(Double.toString(variable1 - variable2));

                break;
            case R.id.btnMultiply:
                answerTxt.setText(Double.toString(variable1 * variable2));

                break;
            case R.id.btnDivide:
                answerTxt.setText(Double.toString(variable1 / variable2));

                break;
            case R.id.btnModulo:
                answerTxt.setText(Double.toString(variable1 % variable2));

                break;
        }

    }




}
