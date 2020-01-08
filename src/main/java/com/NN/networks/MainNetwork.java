package com.NN.networks;

import com.NN.model.EntityNN;
import com.NN.networks.functions.Function;

import java.util.ArrayList;


public class MainNetwork {

    /* Двухслойная нейросеть */

    private EntityNN entityNN;
    private Function function;
    private ArrayList<ArrayList<Double>> arrayWeight = new ArrayList<ArrayList<Double>>(); //*Аргументы 1-го слоя
    private ArrayList<Double> arrayWeightOutput = new ArrayList<Double>();//*Аргументы 2-го слоя

    private double lastArgum;
    private ArrayList<Double> arraySumm = new ArrayList<Double>();


    public void setEntityNNAdnFunction(EntityNN entityNN,Function function){
        this.entityNN = entityNN;
        this.function = function;
    }

    private void prepareNeuronesNetFirstLayout() {

        for (int i = 0; i < entityNN.getArguments().size() - 1; i++) {
            arrayWeight.add(new ArrayList<Double>());
        }
    }

    private void createNeuronesNetFirstLayout(){

        prepareNeuronesNetFirstLayout();

        for (int i = 0; i < arrayWeight.size(); i++) {
            for (int j = 0; j < entityNN.getArguments().size(); j++)
                arrayWeight.get(i).add(Math.random());
        }
    }

    private void createNeuronesNetSecondLayout() {

        for (int i = 0; i < arrayWeight.size(); i++) {
            arrayWeightOutput.add(Math.random());
        }
    }

    public void setValueOfWeight() { //Установка значений весов по умолчанию

        createNeuronesNetFirstLayout();
        createNeuronesNetSecondLayout();

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

    public void run() {//Основной метод работы нейросети

        activation_function(secondSectorCalculation(firstSectorCalculation(arrayWeight)));
    }

    private ArrayList<Double> firstSectorCalculation(ArrayList<ArrayList<Double>> arrayWeight) {

        double summ = 0.0;

        for (int i = 0; i < arrayWeight.size(); i++) {
            for (int j = 0; j < entityNN.getArguments().size(); j++) {
                summ += entityNN.getArguments().get(j) * arrayWeight.get(i).get(j);
            }
            System.out.println("Сумма: " + summ);
            arraySumm.add(function.calcFunc(summ));
        }
        System.out.println("Массив весов после первого слоя: " + arraySumm.toString());

        return arraySumm;
    }

    private double secondSectorCalculation(ArrayList<Double> arrayFirstCalcSumm) {

        double summ = 0.0;

        for (int i = 0; i < arrayFirstCalcSumm.size(); i++) {
            summ += arrayFirstCalcSumm.get(i) * arrayWeightOutput.get(i);
        }
        this.lastArgum = function.calcFunc(summ);
        return lastArgum;
    }

    public ArrayList<ArrayList<Double>> getArrayWeight() {
        return arrayWeight;
    }

    public void setArrayWeight(ArrayList<ArrayList<Double>> arrayWeight) {
        this.arrayWeight = arrayWeight;
    }

    public ArrayList<Double> getArrayWeightOutput() {
        return arrayWeightOutput;
    }

    public void setArrayWeightOutput(ArrayList<Double> arrayWeightOutput) {
        this.arrayWeightOutput = arrayWeightOutput;
    }

    public double getLastArgum() {
        return lastArgum;
    }

    public void setLastArgum(double lastArgum) {
        this.lastArgum = lastArgum;
    }

    public ArrayList<Double> getArraySumm() {
        return arraySumm;
    }

    public void setArraySumm(ArrayList<Double> arraySumm) {
        this.arraySumm = arraySumm;
    }
}

