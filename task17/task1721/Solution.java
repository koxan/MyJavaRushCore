package com.javarush.task.task17.task1721;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

/* 
Транзакционность
*/

public class Solution {


    public static List<String> allLines = new ArrayList<String>();
    public static List<String> forRemoveLines = new ArrayList<String>();

    public static void main(String[] args) throws IOException {
        Solution solution = new Solution();
        String f1;
        String f2;
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        f1= reader.readLine();
        f2 = reader.readLine();
        reader.close();

        try{
            File file = new File(f1);
            FileReader fileReader = new FileReader(file);

            String result ="";
            String s ="";

            BufferedReader bufferedReader1 = new BufferedReader(fileReader);
            while ((result = bufferedReader1.readLine())!=null){
                allLines.add(result);
            }
            result = null;
            fileReader.close();
            s="";

            File file1 = new File(f2);
            FileReader fileReader1 = new FileReader(file1);
            BufferedReader bufferedReader2 = new BufferedReader(fileReader1);
            while((result= bufferedReader2.readLine())!=null){
                forRemoveLines.add(result);
            }
        }catch (FileNotFoundException e){
            e.printStackTrace();
        }

        try{
            solution.joinData();
        }catch (CorruptedDataException e){
            e.printStackTrace();
        }



    }

    public void joinData() throws CorruptedDataException{

        if (allLines.containsAll(forRemoveLines)) {  //Если список allLines содержит все строки из forRemoveLines
            allLines.removeAll(forRemoveLines); //      //то удалить из списка allLines все строки, которые есть в forRemoveLines
        }else {
            allLines.clear();
            throw new CorruptedDataException();
        }

    }
}
/*
* Транзакционность
Сделать метод joinData транзакционным, т.е. если произошел сбой, то данные не должны быть изменены.
1. Считать с консоли 2 имени файла.
2. Считать построчно данные из файлов. Из первого файла - в allLines, из второго - в forRemoveLines.
В методе joinData:
3. Если список allLines содержит все строки из forRemoveLines, то удалить из списка allLines все
 строки, которые есть в forRemoveLines.
4. Если условие из п.3 не выполнено, то:
4.1. очистить allLines от данных
4.2. выбросить исключение CorruptedDataException
Метод joinData должен вызываться в main. Все исключения обработайте в методе main.
Не забудь закрыть потоки.


5. Программа должна считывать построчно данные из первого файла в список allLines.
6. Программа должна считывать построчно данные из второго файла в список forRemoveLines.
7. Метод joinData должен удалить в списке allLines все строки из списка forRemoveLines, если в
 allLines содержаться все строки из списка forRemoveLines.
8. Метод joinData должен очистить список allLines и выбросить исключение CorruptedDataException,
 если в allLines не содержаться все строки из списка forRemoveLines.
9. Метод joinData должен вызываться в main.**/