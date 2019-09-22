package com.javarush.task.task18.task1808;

/* 
Разделение файла
Считать с консоли три имени файла: файл1, файл2, файл3.
Разделить файл1 по следующему критерию:
Первую половину байт записать в файл2, вторую половину байт записать в файл3.
Если в файл1 количество байт нечетное, то файл2 должен содержать большую часть.
Закрыть потоки.


Требования:
1. Программа должна три раза считать имена файлов с консоли.+
2. Для чтения из файла используй поток FileInputStream, для записи в файлы - FileOutputStream+
3. Первую половину байт из первого файла нужно записать во второй файл.
4. Вторую половину байт из первого файла нужно записать в третий файл.
5. Потоки FileInput*Stream и FileOutputStream должны быть закрыты.
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        FileInputStream inputStream1 = new FileInputStream(reader.readLine());
        FileOutputStream outputStream2 = new FileOutputStream(reader.readLine());
        FileOutputStream outputStream3 = new FileOutputStream(reader.readLine());


        int count=0;
        while (inputStream1.available()>0){
            byte[] buffer = new byte[inputStream1.available()];
            count = inputStream1.read(buffer);

            if (count%2!=0){
                outputStream2.write(buffer,0,((count/2)+1));
                outputStream3.write(buffer,(count/2)+1,(count/2));
            }else {
                outputStream2.write(buffer,0,(count/2));
                outputStream3.write(buffer,(count/2),(count/2));
            }


        }
        inputStream1.close();
        outputStream2.close();
        outputStream3.close();



    }
}