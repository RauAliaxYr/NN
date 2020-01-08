package com.NN.networks.functions;

public class Sigmoid implements Function{

    public double calcFunc(double x) {

        double result = 1 / (1 + Math.exp(-x));

        System.out.println("Из значения " +
                x +
                " Получим значение функции сигмойда: " +
                result);

        return result;
    }
}
