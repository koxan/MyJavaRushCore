package com.javarush.task.task13.task1326;

/* 
Сортировка четных чисел из файла
*/

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Collections;
import java.util.LinkedList;

public class Solution {
    public static void main(String[] args) throws IOException {
        // write your code here
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String filename = reader.readLine();
        reader.close();

        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(new FileInputStream(filename)));
        LinkedList<Integer> digits = new LinkedList<Integer>();

        while(bufferedReader.ready()){
            String input = bufferedReader.readLine();
            if(!input.isEmpty()){
                try{
                    Integer digit = Integer.parseInt(input);
                    if(digit % 2 == 0){
                        digits.add(digit);
                    }
                }catch (NumberFormatException e){

                }
            }
        }
        Collections.sort(digits);
        bufferedReader.close();

        for (Integer boom: digits
                ) {
            System.out.println(boom);
        }


    }
}
