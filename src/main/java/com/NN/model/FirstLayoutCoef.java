package com.NN.model;

import javax.persistence.*;
import java.util.ArrayList;

@Entity
public class FirstLayoutCoef {

    @Id
    @GeneratedValue
    private Long id;

    private ArrayList<ArrayList<Double>> firstLayoutArr = new ArrayList<>();

    public ArrayList<ArrayList<Double>> getFirstLayoutArr() {
        return firstLayoutArr;
    }

    @Override
    public String toString() {
        return "FirstLayoutCoef{" +
                "firstLayoutArr=" + firstLayoutArr.toString() +
                '}';
    }
}
