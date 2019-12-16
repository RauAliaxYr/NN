package com.NN;

import com.NN.model.EntityNN;
import com.NN.model.MainNetwork;

import java.util.ArrayList;

public class MainApp {
    public static void main(String[] args) {

        MainNetwork mainNetwork = new MainNetwork();

        ArrayList<Double> arrayList = new ArrayList<Double>();
        for (double i = -1; i < 0; i += 0.1) {

            arrayList.add(i);

            System.out.println(arrayList.toString());
        }


        EntityNN entityNN = new EntityNN(arrayList);

        mainNetwork.setValueOfWeight(entityNN);
        mainNetwork.run(entityNN);


    }
}
