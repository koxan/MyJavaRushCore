package com.javarush.task.task18.task1803;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.util.*;

/*
Самые частые байты
Ввести с консоли имя файла.
Найти байт или байты с максимальным количеством повторов.
Вывести их на экран через пробел.
Закрыть поток ввода-вывода.


Требования:
1. Программа должна считывать имя файла с консоли. +
2. Для чтения из файла используй поток FileInputStream. +
3. В консоль через пробел должны выводиться все байты из файла с максимальным количеством повторов. +
4. Данные в консоль должны выводится в одну строку. +
5. Поток чтения из файла должен быть закрыт. +
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        FileInputStream inputStream = new FileInputStream(reader.readLine());
        ArrayList<Integer> list = new ArrayList();
        Map<Integer,Integer> myMap = new HashMap<>();

        int max = 0;
        int maxValue =0;
        int count =0;

        while (inputStream.available()>0){
            int data = inputStream.read();
            list.add(data);
        }
        reader.close();
        inputStream.close();

        for (int i = 0; i < list.size(); i++) {

            Integer freqNumber = myMap.get(list.get(i));
            myMap.put(list.get(i),freqNumber == null?1 : freqNumber+1);


        }

        maxValue = Collections.max(myMap.values());
        Set<Map.Entry<Integer, Integer>> entrySet = myMap.entrySet();

        for (Map.Entry<Integer,Integer> pair: entrySet
        ) {
            if (pair.getValue().equals(maxValue)){
                System.out.print(pair.getKey()+" ");
            }
        }
    }
}
