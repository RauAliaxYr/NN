package com.NN.model;

import java.util.ArrayList;

public class MainNetwork {


    private ArrayList<ArrayList<Double>> arrayWeight = new ArrayList<ArrayList<Double>>();
    private ArrayList<Double> arrayWeightOutput = new ArrayList<Double>();

    private void createNeuronesNetFirstLayout(EntityNN entityNN) {

        for (int i = 0; i < entityNN.getArguments().size() - 1; i++) {

            arrayWeight.add(new ArrayList<Double>());

        }

    }

    private void createNeuronesNetSecondLayout(ArrayList<Double> arrayWeight) {

        for (int i = 0; i < this.arrayWeight.size(); i++) {
            arrayWeightOutput.add(Math.random());
        }

    }

    public void setValueOfWeight(EntityNN entityNN) { //Установка значений весов по умолчанию

        createNeuronesNetFirstLayout(entityNN);

        for (int i = 0; i < arrayWeight.size(); i++) {
            for (int j = 0; j < entityNN.getArguments().size(); j++)
                arrayWeight.get(i).add(Math.random());
        }


        createNeuronesNetSecondLayout(arrayWeightOutput);

        System.out.println(arrayWeight.toString());
        System.out.println("Колличество элементов " + this.arrayWeight.size());
        System.out.println(arrayWeightOutput.toString());
        System.out.println("Колличество элементов " + this.arrayWeightOutput.size());

    }

    private int activation_function(double x) {//Активационная функция
        if (x > 0.5) {

            System.out.println("true");
            return 1;
        } else {
            System.out.println("false");
            return 0;
        }

    }

    public void run(EntityNN entityNN) {//Основной метод работы нейросети
        activation_function(secondSectorCalculation(firstSectorCalculation(entityNN, arrayWeight)));


    }

    private ArrayList<Double> firstSectorCalculation(EntityNN entityNN, ArrayList<ArrayList<Double>> arrayWeight) {

        ArrayList<Double> arraySumm = new ArrayList<Double>();

        double summ = 0.0;

        for (int i = 0; i < arrayWeight.size(); i++) {
            for (int j = 0; j < entityNN.getArguments().size(); j++) {

                summ += entityNN.getArguments().get(j) * arrayWeight.get(i).get(j);

            }
            System.out.println("Сумма: " + summ);

            arraySumm.add(sigmoid(summ));

        }
        System.out.println("Массив сигмойдных функций после первого слоя: " + arraySumm.toString());


        return arraySumm;
    }

    private double secondSectorCalculation(ArrayList<Double> arrayFirstCalcSumm) {

        double summ = 0.0;

        for (int i = 0; i < arrayFirstCalcSumm.size(); i++) {

            summ += arrayFirstCalcSumm.get(i) * arrayWeightOutput.get(i);

        }

        return sigmoid(summ);
    }


    private double sigmoid(double x) {//Функция сигмойда

        System.out.println("Из значения " +
                x +
                " Получим значение функции сигмойда: " +
                1 / (1 + Math.exp(-x)));
        return 1 / (1 + Math.exp(-x));
    }

}
