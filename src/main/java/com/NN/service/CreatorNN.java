package com.NN.service;

import com.NN.model.EntityNN;
import com.NN.model.FirstLayoutCoef;
import com.NN.model.SecondLayoutCoef;

import java.util.ArrayList;


public class CreatorNN {

    private FirstLayoutCoef firstLayoutCoef;
    private SecondLayoutCoef secondLayoutCoef;
    private EntityNN entityNN;

    public CreatorNN(FirstLayoutCoef firstLayoutCoef, SecondLayoutCoef secondLayoutCoef, EntityNN entityNN) {
        this.firstLayoutCoef = firstLayoutCoef;
        this.secondLayoutCoef = secondLayoutCoef;
        this.entityNN = entityNN;
    }

    private void prepareNeuronesNetFirstLayout() {

        for (int i = 0; i < entityNN.getArguments().size() - 1; i++) {
            firstLayoutCoef.getFirstLayoutArr().add(new ArrayList<Double>());
        }
    }

    private void createNeuronesNetFirstLayout(){

        prepareNeuronesNetFirstLayout();

        for (int i = 0; i < firstLayoutCoef.getFirstLayoutArr().size(); i++) {
            for (int j = 0; j < entityNN.getArguments().size(); j++)
                firstLayoutCoef.getFirstLayoutArr().get(i).add(Math.random());
        }
    }

    private void createNeuronesNetSecondLayout() {

        for (int i = 0; i < firstLayoutCoef.getFirstLayoutArr().size(); i++) {
            secondLayoutCoef.getSecondLayoutArr().add(Math.random());
        }
    }

    public void setValueOfWeight() { //Установка значений весов по умолчанию

        createNeuronesNetFirstLayout();
        createNeuronesNetSecondLayout();

        System.out.println(firstLayoutCoef.toString());
        System.out.println("Колличество элементов " + this.firstLayoutCoef.getFirstLayoutArr().size());
        System.out.println(secondLayoutCoef.toString());
        System.out.println("Колличество элементов " + this.firstLayoutCoef.getFirstLayoutArr().size());

    }
}
