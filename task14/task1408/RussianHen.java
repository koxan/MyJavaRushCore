package com.javarush.task.task14.task1408;

public  class RussianHen extends Hen{
    int RussianEgg =0;

    @Override
    int getCountOfEggsPerMonth() {
        RussianEgg=17;
        return RussianEgg;
    }
    String getDescription(){
        return super.getDescription()+" Моя страна - "+Country.RUSSIA +". Я несу "+getCountOfEggsPerMonth()+" яиц в месяц.";
    }
}