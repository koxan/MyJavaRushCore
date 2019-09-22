package com.javarush.task.task18.task1804;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.util.*;

/*
Самые редкие байты
Ввести с консоли имя файла.
Найти байт или байты с минимальным количеством повторов.
Вывести их на экран через пробел.
Закрыть поток ввода-вывода.


Требования:
1. Программа должна считывать имя файла с консоли.
2. Для чтения из файла используй поток FileInputStream.
3. В консоль через пробел должны выводиться все байты из файла с минимальным количеством повторов.
4. Данные в консоль должны выводится в одну строку.
5. Поток чтения из файла должен быть закрыт.
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        FileInputStream inputStream = new FileInputStream(reader.readLine());
        ArrayList<Integer> list = new ArrayList();
        Map<Integer,Integer> myMap = new HashMap<>();

        while (inputStream.available()>0){
            int data = inputStream.read();
            list.add(data);

        }
        reader.close();
        inputStream.close();

        int max = 0;
        int minValue =0;
        int count =0;


        for (int i = 0; i < list.size(); i++) {
            Integer freqNumber = myMap.get(list.get(i));
            myMap.put(list.get(i),freqNumber == null?1 : freqNumber+1);

        }

        minValue = Collections.min(myMap.values());
        Set<Map.Entry<Integer, Integer>> entrySet = myMap.entrySet();

        for (Map.Entry<Integer,Integer> pair: entrySet
        ) {
            if (pair.getValue().equals(minValue)){
                System.out.print(pair.getKey()+" ");
            }

        }
    }
}
