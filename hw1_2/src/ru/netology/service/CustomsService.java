package ru.netology.service;

public class CustomsService{
    public static int rate;

    public static int calculateCustoms(int priceParam, int weightParam){

        rate = (priceParam/100) + (weightParam * 100);
        return rate;
    }




}
