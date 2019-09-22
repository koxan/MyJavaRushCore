package com.javarush.task.task18.task1809;

/* 
Реверс файла
Считать с консоли 2 имени файла: файл1, файл2.
Записать в файл2 все байты из файл1, но в обратном порядке.
Закрыть потоки.


Требования:
1. Программа должна два раза считать имена файлов с консоли.+
2. Для чтения из файла используй поток FileInputStream, для записи в файл - FileOutputStream+
3. Во второй файл нужно записать все байты из первого в обратном порядке.
4. Потоки FileInputStream и FileOutputStream должны быть закрыты.
*/

import java.io.*;
import java.util.ArrayList;
import java.util.Collections;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<Integer> list = new ArrayList<>();



        FileInputStream inputStream = new FileInputStream(reader.readLine());
        FileOutputStream outputStream = new FileOutputStream(reader.readLine());



        while (inputStream.available() > 0) {
            int data = inputStream.read();
            list.add(data);
        }
        Collections.reverse(list);
        byte [] myMassiv = new byte[list.size()];
        for (int i = 0; i < list.size() ; i++) {
            int a = list.get(i);
            myMassiv[i]=(byte)a;
        }
        outputStream.write(myMassiv);
        inputStream.close();
        outputStream.close();
    }



}
