package com.NN;

import com.NN.model.EntityNN;
import com.NN.networks.MainNetwork;
import com.NN.networks.functions.Function;
import com.NN.networks.functions.ReLU;
import com.NN.service.ServiceNN;

import java.util.ArrayList;

public class MainApp {
    public static void main(String[] args) {

        MainNetwork mainNetwork = new MainNetwork();
        //ServiceNN serviceNN = new ServiceNN(mainNetwork);

        ArrayList<Double> arrayList = new ArrayList<Double>();
        for (double i = 0; i < 1; i += 0.3) {

            arrayList.add(i);


        }
        System.out.println(arrayList.toString());

        EntityNN entityNN = new EntityNN(arrayList);
        Function function = new ReLU();

        mainNetwork.setEntityNNAdnFunction(entityNN,function);
        mainNetwork.setValueOfWeight();
        mainNetwork.run();



    }
}
