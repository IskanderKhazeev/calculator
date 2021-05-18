package com.geekbrains.calculator.ui;

import com.geekbrains.calculator.domain.Calculator;

public class CalculatorPresenter {
    private CalculatorView view;
    private Calculator calculator;

    public CalculatorPresenter(CalculatorView view, Calculator calculator) {
        this.view = view;
        this.calculator = calculator;
    }

    public void onNumberClicked() {
    }

    public void printInfo() {
    }
}
