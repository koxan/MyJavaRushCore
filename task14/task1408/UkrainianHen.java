package com.javarush.task.task14.task1408;

public class UkrainianHen extends Hen{
    int UkrainianEgg = 0;
    @Override
    int getCountOfEggsPerMonth() {
        UkrainianEgg=24;
        return UkrainianEgg;
    }
    String getDescription(){
        return super.getDescription()+" Моя страна - "+Country.UKRAINE +". Я несу "+getCountOfEggsPerMonth()+" яиц в месяц.";
    }
}
