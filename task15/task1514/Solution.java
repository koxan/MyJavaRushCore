package com.javarush.task.task15.task1514;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/* 
Статики-1
*/

public class Solution {
    public static Map<Double, String> labels = new HashMap<Double, String>();


static {

    labels.put(11.0,"грин");
    labels.put(100.0,"parин");
    labels.put(15.0,"irin");
    labels.put(27.0,"grow");
    labels.put(59.0,"pable");

}


    public static void main(String[] args) {



        System.out.println(labels);


    }
}

/*
* Требования:
1. В классе Solution должен быть только один метод (main).
2. В классе Solution должно быть объявлено статическое поле labels типа Map.
3. Поле labels должно быть заполнено 5 различными парами ключ-значение в статическом блоке.
4. Метод main должен выводить содержимое labels на экран.**/