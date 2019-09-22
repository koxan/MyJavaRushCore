package com.javarush.task.task14.task1408;

public class BelarusianHen extends Hen{
    int BelarusEgg = 0;
    @Override
    int getCountOfEggsPerMonth() {
        BelarusEgg=18;
        return BelarusEgg;
    }
    String getDescription(){

        return super.getDescription()+" Моя страна - "+Country.BELARUS +". Я несу "+getCountOfEggsPerMonth()+" яиц в месяц.";
    }
}
