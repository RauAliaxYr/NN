package com.NN.model;

import java.util.ArrayList;

public class EntityNN {

    private ArrayList<Double> arguments;

    public EntityNN(ArrayList<Double> arguments) {
        this.arguments = arguments;
    }

    public ArrayList<Double> getArguments() {
        return arguments;
    }

    public void setArguments(ArrayList<Double> arguments) {
        this.arguments = arguments;
    }
}
