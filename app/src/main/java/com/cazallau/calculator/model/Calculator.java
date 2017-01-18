package com.cazallau.calculator.model;

/**
 * Created by gemabeltran on 18/1/17.
 */

public class Calculator {

    private float num1;
    private float num2;


    public float getNum1() {
        return num1;
    }

    public void setNum1(float num1) {
        this.num1 = num1;
    }

    public float getNum2() {
        return num2;
    }

    public void setNum2(float num2) {
        this.num2 = num2;
    }

    public float calcuate(float num1, float num2, CalculatorOperation operator){
        float result = 0;

        switch (operator){
            case ADD:
                result = add(num1,num2);
                break;
            case SUBSTRAC:
                result = substrac(num1, num2);
                break;
            case MULTIPLY:
                result = multiply(num1,num2);
                break;
            case DIVIDE:
                result = divide(num1, num2);
                break;
        }

        return result;
        
    }

    private float add(float num1, float num2){

        return num1 + num2;
    }

    private float substrac(float num1, float num2){

        return num1 - num2;
    }

    private float multiply(float num1, float num2){

        return num1 * num2;
    }

    private float divide(float num1, float num2){

        return num1 / num2;
    }
}
