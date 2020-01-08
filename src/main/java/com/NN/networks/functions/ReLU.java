package com.NN.networks.functions;

public class ReLU implements Function {//Функция ReLU

    public double calcFunc(double x) {

        double result = Math.max(0, x);

        System.out.println("Из значения " +
                x +
                " Получим значение функции ReLU: " +
                result);

        return result;
    }
}
