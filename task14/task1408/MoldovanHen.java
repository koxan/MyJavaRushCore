package com.javarush.task.task14.task1408;

public class MoldovanHen extends Hen{
    int MoldovanEgg=0;
    @Override
    int getCountOfEggsPerMonth() {
        MoldovanEgg=20;
        return MoldovanEgg;
    }
    String getDescription(){

        return super.getDescription()+" Моя страна - "+Country.MOLDOVA +". Я несу "+getCountOfEggsPerMonth()+" яиц в месяц.";
    }
}
