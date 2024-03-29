package com.javarush.task.task13.task1316;

/* 
Некорректные строки
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        System.out.println(SimpleObject.NAME);
        System.out.println(Button.NAME);
    }

    interface SimpleObject {
        String NAME = "SimpleObject";

        void onPress();
    }

    interface Button extends SimpleObject {

        final String NAME = "Submit";



        String onPress(Object o);



    }
}
/*
* Некорректные строки
4. В интерфейсе Button должно остаться объявление константы NAME.
5. В интерфейсе Button должно остаться корректное объявление метода onPress.**/