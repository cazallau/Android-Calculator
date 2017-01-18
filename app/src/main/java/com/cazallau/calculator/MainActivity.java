package com.cazallau.calculator;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.cazallau.calculator.model.Calculator;
import com.cazallau.calculator.model.CalculatorOperation;

import butterknife.BindView;
import butterknife.ButterKnife;

public class MainActivity extends AppCompatActivity{

    @BindView(R.id.activity_main_text) TextView text;
    @BindView(R.id.activity_main_number0) Button number0;
    @BindView(R.id.activity_main_number1) Button number1;
    @BindView(R.id.activity_main_number2) Button number2;
    @BindView(R.id.activity_main_number3) Button number3;
    @BindView(R.id.activity_main_number4) Button number4;
    @BindView(R.id.activity_main_number5) Button number5;
    @BindView(R.id.activity_main_number6) Button number6;
    @BindView(R.id.activity_main_number7) Button number7;
    @BindView(R.id.activity_main_number8) Button number8;
    @BindView(R.id.activity_main_number9) Button number9;
    @BindView(R.id.activity_main_button_add) Button addButton;
    @BindView(R.id.activity_main_button_substrac) Button substracButton;
    @BindView(R.id.activity_main_button_multiply) Button multiplyButton;
    @BindView(R.id.activity_main_button_divide) Button divideButton;
    @BindView(R.id.activity_main_button_equal) Button equalButton;
    @BindView(R.id.activity_main_buttonce) Button cleanButton;
    @BindView(R.id.activity_main_comma) Button commaButton;
    @BindView(R.id.activity_main_button_add_memomry) Button saveButton;
    @BindView(R.id.activity_main_button_extract_memory) Button extractButton;





    float n1;
    float n2;
    String mem;

    CalculatorOperation operation;
    Calculator calculator;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);

        clean();

        number0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (text.getText().toString() != "0"){

                    text.setText(text.getText() + "0");
                }
                else {
                    text.setText("0");

                }
            }
        });

        number1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (text.getText().toString() != "0"){

                    text.setText(text.getText() + "1");
                }
                else {
                    text.setText("1");

                }
            }
        });

        number2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (text.getText().toString() != "0"){

                    text.setText(text.getText() + "2");
                }
                else {
                    text.setText("2");

                }            }
        });

        number3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (text.getText().toString() != "0"){

                    text.setText(text.getText() + "3");
                }
                else {
                    text.setText("3");

                }
            }
        });

        number4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (text.getText().toString() != "0"){

                    text.setText(text.getText() + "4");
                }
                else {
                    text.setText("4");

                }
            }
        });

        number5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (text.getText().toString() != "0"){

                    text.setText(text.getText() + "5");
                }
                else {
                    text.setText("5");

                }
            }
        });

        number6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (text.getText().toString() != "0"){

                    text.setText(text.getText() + "6");
                }
                else {
                    text.setText("6");

                }
            }
        });

        number7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (text.getText().toString() != "0"){

                    text.setText(text.getText() + "7");
                }
                else {
                    text.setText("7");

                }
            }
        });

        number8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (text.getText().toString() != "0"){

                    text.setText(text.getText() + "8");
                }
                else {
                    text.setText("8");

                }
            }
        });

        number9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (text.getText().toString() != "0"){

                    text.setText(text.getText() + "9");
                }
                else {
                    text.setText("9");

                }
            }
        });

        commaButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(text.getText().toString() != "0") {

                    text.setText(text.getText() + ".");
                }
            }
        });



        addButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(text.getText().toString() != "0") {
                    n1 = Float.parseFloat(text.getText().toString());
                    text.setText("");
                    operation = CalculatorOperation.ADD;
                }


            }
        });

        substracButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(text.getText().toString() != "0") {
                    n1 = Float.parseFloat(text.getText().toString());
                    text.setText("");
                    operation = CalculatorOperation.SUBSTRAC;
                }
            }
        });

        multiplyButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(text.getText().toString() != "0") {
                    n1 = Float.parseFloat(text.getText().toString());
                    text.setText("");
                    operation = CalculatorOperation.MULTIPLY;
                }
            }
        });

        divideButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(text.getText().toString() != "0") {
                    n1 = Float.parseFloat(text.getText().toString());
                    text.setText("");
                    operation = CalculatorOperation.DIVIDE;
                }
            }
        });

        equalButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(text.getText().toString() != "0") {
                    n2 = Float.parseFloat(text.getText().toString());
                    text.setText("" + calculator.calcuate(n1, n2, operation));
                }

            }
        });

        saveButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                saveAllDataToDisk();
            }
        });

        extractButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                loadAllDataToDisk();
            }
        });

        cleanButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                clean();
            }
        });

    }

    private void clean(){

        n1 = 0.0f;
        n2 = 0.0f;
        operation = CalculatorOperation.NONE;
        text.setText("0");
        calculator = new Calculator();
    }
    private void saveAllDataToDisk() {

        mem = text.getText().toString();
        text.setText("");


    }

    private void loadAllDataToDisk() {
        text.setText(mem);





    }
}
