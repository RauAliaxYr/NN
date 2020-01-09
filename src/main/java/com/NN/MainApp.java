package com.NN;

import com.NN.model.EntityNN;
import com.NN.model.FirstLayoutCoef;
import com.NN.model.SecondLayoutCoef;
import com.NN.networks.MainNetwork;
import com.NN.networks.functions.Function;
import com.NN.networks.functions.ReLU;
import com.NN.service.CreatorNN;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
//import com.NN.service.ServiceNN;

import java.util.ArrayList;

@SpringBootApplication
public class MainApp {
    public static void main(String[] args) {

        SpringApplication.run(MainApp.class, args);

//        ServiceNN serviceNN = new ServiceNN(mainNetwork);
//
//        ArrayList<Double> arrayList = new ArrayList<Double>();
//        for (double i = 0; i < 1; i += 0.3) {
//
//            arrayList.add(i);
//
//        }
//        System.out.println(arrayList.toString());
//
//        EntityNN entityNN = new EntityNN(arrayList);
//        Function function = new ReLU();
//        FirstLayoutCoef firstLayoutCoef = new FirstLayoutCoef();
//        SecondLayoutCoef secondLayoutCoef = new SecondLayoutCoef();
//
//        CreatorNN creatorNN = new CreatorNN(firstLayoutCoef, secondLayoutCoef, entityNN);
//
//        MainNetwork mainNetwork = new MainNetwork(entityNN,function,firstLayoutCoef,secondLayoutCoef);
//
//        creatorNN.setValueOfWeight();
//
///       mainNetwork.setEntityNNAdnFunction(entityNN,function);
//      mainNetwork.setValueOfWeight();
//        mainNetwork.run();

    }
}
