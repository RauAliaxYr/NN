package com.NN.model;

import javax.persistence.*;
import java.util.ArrayList;

@Entity
public class SecondLayoutCoef {

    @Id
    @GeneratedValue
    private Long id;

    private ArrayList<Double> secondLayoutArr = new ArrayList<>();

    public ArrayList<Double> getSecondLayoutArr() {
        return secondLayoutArr;
    }

    @Override
    public String toString() {
        return "SecondLayoutCoef{" +
                "secondLayoutArr=" + secondLayoutArr.toString() +
                '}';
    }
}
