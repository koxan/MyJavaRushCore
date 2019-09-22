package com.javarush.task.task16.task1629;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Solution {
    public static volatile BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));


    public static void main(String[] args) throws InterruptedException {
        Read3Strings t1 = new Read3Strings();
        Read3Strings t2 = new Read3Strings();

        //add your code here - добавьте код тут
        t1.start();
        t1.join();
        t2.start();
        t2.join();

        t1.printResult();
        t2.printResult();
    }

    //add your code here - добавьте код тут
    public static class Read3Strings extends Thread{
        public String line1 ;
        public String line2 ;
        public String line3 ;
        @Override
        public void run() {

            try {
                line1 = reader.readLine();
                line2 = reader.readLine();
                line3 = reader.readLine();

            } catch (IOException e) {
                e.printStackTrace();
            }

        }
        public void printResult(){

            System.out.print(line1);
            System.out.print(" ");
            System.out.print(line2);
            System.out.print(" ");
            System.out.print(line3);
            System.out.print(" ");

        }
    }
}
/*
* Требования:
1. Объяви в классе Solution public static класс Read3Strings.
2. Класс Read3Strings должен быть унаследован от Thread.
3. Метод run класса Read3Strings должен считывать три строки.
4. Класс Read3Strings должен содержать публичный метод printResult.
5. Метод printResult должен выводить в консоль 3 считанные строки, разделив их пробелами.
6. Метод main должен вызывать методы start у созданных нитей.
7. Метод main должен вызывать методы join у созданных нитей.
8. Вывод программы должен отображать, что потоки считывали строки последовательно, а не параллельно.**/