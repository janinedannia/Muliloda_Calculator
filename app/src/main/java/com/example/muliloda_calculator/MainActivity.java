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

        btnAdd.setOnClickListener(this);
        btnSubtract.setOnClickListener(this);
        btnMultiply.setOnClickListener(this);
        btnDivide.setOnClickListener(this);
        btnModulo.setOnClickListener(this);

        var1txt = findViewById(R.id.editTxt1stVar);
        var2txt = findViewById(R.id.editTxt2ndVar);

        btnAdd = findViewById(R.id.btnAdd);
        btnSubtract = findViewById(R.id.btnSubtract);
        btnMultiply = findViewById(R.id.btnMultiply);
        btnDivide = findViewById(R.id.btnDivide);
        btnModulo = findViewById(R.id.btnModulo);

        answerTxt = findViewById(R.id.answerTxt);

        variable1 = Double.parseDouble(String.valueOf(var1txt.getText()));
        variable2 = Double.parseDouble(String.valueOf(var2txt.getText()));
    }

    @Override
    public void onClick (View v) {
        
        switch(v.getId()) {
            case R.id.btnAdd:
                answerTxt.setText(String.valueOf( variable1 + variable2 ));
                break;
            case R.id.btnSubtract:
                answerTxt.setText(String.valueOf( variable1 - variable2 ));
                break;
            case R.id.btnMultiply:
                answerTxt.setText(String.valueOf( variable1 * variable2 ));
                break;
            case R.id.btnDivide:
                answerTxt.setText(String.valueOf( variable1 / variable2 ));
                break;
            case R.id.btnModulo:
                answerTxt.setText(String.valueOf( variable1 % variable2 ));
                break;
        }

    }




}
