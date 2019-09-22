package com.javarush.task.task18.task1805;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.util.*;

/* 
Сортировка байт
Ввести с консоли имя файла.
Считать все байты из файла.
Не учитывая повторений - отсортировать их по байт-коду в возрастающем порядке.
Вывести на экран.
Закрыть поток ввода-вывода.

Пример байт входного файла:
44 83 44

Пример вывода:
44 83


Требования:
1. Программа должна считывать имя файла с консоли.
2. Для чтения из файла используй поток FileInputStream.
3. В консоль через пробел должны выводиться все уникальные байты из файла в порядке возрастания.
4. Данные в консоль должны выводится в одну строку.
5. Поток чтения из файла должен быть закрыт.
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        FileInputStream inputStream = new FileInputStream(reader.readLine());
        ArrayList<Integer> list = new ArrayList<>();


        Map<Integer,Integer> myMap = new LinkedHashMap<>();


        while (inputStream.available()>0){
            int data = inputStream.read();
            list.add(data);

        }
        Collections.sort(list);
        reader.close();
        inputStream.close();

        for (int i = 0; i < list.size(); i++) {


            myMap.put(list.get(i), Collections.frequency(list,list.get(i)));

        }

        Set<Map.Entry<Integer, Integer>> entrySet = myMap.entrySet();

        for (Map.Entry<Integer,Integer> pair: entrySet
        ) {
            System.out.print(pair.getKey()+" ");

        }

    }
}
