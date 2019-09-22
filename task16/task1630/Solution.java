package com.javarush.task.task16.task1630;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class Solution {
    public static String firstFileName;
    public static String secondFileName;


    //add your code here - добавьте код тут
    static{
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        try {
            firstFileName= reader.readLine();
            secondFileName = reader.readLine();
        } catch (IOException e) {
            e.printStackTrace();
        }


    }

    public static void main(String[] args) throws InterruptedException {
        systemOutPrintln(firstFileName);
        systemOutPrintln(secondFileName);
    }

    public static void systemOutPrintln(String fileName) throws InterruptedException {
        ReadFileInterface f = new ReadFileThread();
        f.setFileName(fileName);
        f.start();
        f.join();
        //add your code here - добавьте код тут
        System.out.println(f.getFileContent());
    }

    public interface ReadFileInterface {

        void setFileName(String fullFileName);

        String getFileContent();

        void join() throws InterruptedException;

        void start();
    }

    //add your code here - добавьте код тут
    public static class ReadFileThread extends Thread implements ReadFileInterface{
        private String fileName = "";
        private String fileContent = "";
        List<String> list = new ArrayList<>();
        @Override
        public void setFileName(String fullFileName) {
            this.fileName = fullFileName;

        }

        @Override
        public String getFileContent() {
            return fileContent;
        }


        @Override
        public void run() {
            String string = null;
            try (BufferedReader fr = new BufferedReader(new FileReader(new File(fileName)))) {
                while ((string = fr.readLine())!= null) {
                    list.add(string);
                }
                fr.close();
            } catch (IOException e) {
                e.printStackTrace();
            } finally {
                fileContent = string;
            }

        }
    }
}
/*

5. Метод run класса ReadFileThread должен считывать строки из файла, установленного методом setFileName.
 А метод getFileContent, этого же класса, должен возвращать вычитанный контент.
  Возвращаемое значение - это одна строка, состоящая из строк файла, разделенных пробелами.
6. Метод systemOutPrintln должен вызывать метод join у созданного объекта f.
7. Вывод программы должен состоять из 2х строк. Каждая строка - содержимое одного файла.**/