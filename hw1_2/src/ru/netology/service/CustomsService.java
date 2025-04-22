package ru.netology.service;

public class CustomsService{
    public static final int RATE_OF_WEIGHT = 100;

    public static int calculateCustoms(int priceParam, int weightParam){
        int rate;
        rate = (priceParam/100) + (weightParam * RATE_OF_WEIGHT);
        return rate;
    }




}
