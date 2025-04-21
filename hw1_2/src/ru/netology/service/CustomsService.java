package ru.netology.service;

public class CustomsService{
    public static final int RATE = 0;

    public static int calculateCustoms(int priceParam, int weightParam){
        int result;
        result = (priceParam/100) + (weightParam * 100);
        return result;
    }




}
