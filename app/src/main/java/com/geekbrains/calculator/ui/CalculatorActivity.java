package com.geekbrains.calculator.ui;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.geekbrains.calculator.R;
import com.geekbrains.calculator.domain.CalculatorImpl;

public class CalculatorActivity extends AppCompatActivity implements CalculatorView {

    private CalculatorPresenter presenter;
    private TextView result;
    private Button button1;
    private Button button2;
    private Button button3;
    private Button button4;
    private Button button5;
    private Button button6;
    private Button button7;
    private Button button8;
    private Button button9;
    private Button button0;
    private Button buttonPlus;
    private Button buttonMinus;
    private Button buttonMultiple;
    private Button buttonDivide;
    private Button buttonDot;
    private Button buttonEqually;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        presenter = new CalculatorPresenter(this, new CalculatorImpl());

        result = (TextView) findViewById(R.id.result_text);
        button1 = (Button) findViewById(R.id.btn1);
        button2 = (Button) findViewById(R.id.btn2);
        button3 = (Button) findViewById(R.id.btn3);
        button4 = (Button) findViewById(R.id.btn4);
        button5 = (Button) findViewById(R.id.btn5);
        button6 = (Button) findViewById(R.id.btn6);
        button7 = (Button) findViewById(R.id.btn7);
        button8 = (Button) findViewById(R.id.btn8);
        button9 = (Button) findViewById(R.id.btn9);
        button0 = (Button) findViewById(R.id.btn0);
        buttonPlus = (Button) findViewById(R.id.btn_plus);
        buttonMinus = (Button) findViewById(R.id.btn_minus);
        buttonMultiple = (Button) findViewById(R.id.btn_multiple);
        buttonDivide = (Button) findViewById(R.id.btn_divide);
        buttonDot = (Button) findViewById(R.id.btn_dot);
        buttonEqually = (Button) findViewById(R.id.btn_equally);

        View.OnClickListener onClickListener = new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                switch (view.getId()) {
                    case R.id.btn1:
                        presenter.onNumberClicked();
                        presenter.printInfo();
                        break;
                    case R.id.btn2:
                        presenter.onNumberClicked();
                        presenter.printInfo();
                        break;
                    case R.id.btn3:
                        presenter.onNumberClicked();
                        presenter.printInfo();
                        break;
                    case R.id.btn4:
                        presenter.onNumberClicked();
                        presenter.printInfo();
                        break;
                    case R.id.btn5:
                        presenter.onNumberClicked();
                        presenter.printInfo();
                        break;
                    case R.id.btn6:
                        presenter.onNumberClicked();
                        presenter.printInfo();
                        break;
                    case R.id.btn7:
                        presenter.onNumberClicked();
                        presenter.printInfo();
                        break;
                    case R.id.btn8:
                        presenter.onNumberClicked();
                        presenter.printInfo();
                        break;
                    case R.id.btn9:
                        presenter.onNumberClicked();
                        presenter.printInfo();
                        break;
                    case R.id.btn0:
                        presenter.onNumberClicked();
                        presenter.printInfo();
                        break;


                        buttonPlus = (Button) findViewById(R.id.btn_plus);
                        buttonMinus = (Button) findViewById(R.id.btn_minus);
                        buttonMultiple = (Button) findViewById(R.id.btn_multiple);
                        buttonDivide = (Button) findViewById(R.id.btn_divide);
                        buttonDot = (Button) findViewById(R.id.btn_dot);
                        buttonEqually = (Button) findViewById(R.id.btn_equally);

                }
            }

        };


        @Override
        public void showResult (String result){

        }
    }