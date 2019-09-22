package com.javarush.task.task16.task1603;

import java.util.ArrayList;
import java.util.List;

/* 
Список и нити
*/

public class Solution {
    public static volatile List<Thread> list = new ArrayList<Thread>(5);

    public static void main(String[] args) {
        //Add your code here - добавьте свой код тут

        Thread th1= new Thread(new SpecialThread());
        Thread th2= new Thread(new SpecialThread());
        Thread th3= new Thread(new SpecialThread());
        Thread th4= new Thread(new SpecialThread());
        Thread th5= new Thread(new SpecialThread());


        list.add(th1);
        list.add(th2);
        list.add(th3);
        list.add(th4);
        list.add(th5);






    }

    public static class SpecialThread extends Thread {
        public void run() {
            System.out.println("it's a run method inside SpecialThread");
        }
    }
}
/*
* Список и нити
В методе main добавить в статический объект list 5 нитей.
 Каждая нить должна быть новым объектом класса Thread, работающим со своим объектом класса SpecialThread.


Требования:
1. В методе main создай 5 объектов типа SpecialThread.
2. В методе main создай 5 объектов типа Thread.
3. Добавь 5 разных нитей в список list.
4. Каждая нить из списка list должна работать со своим объектом класса SpecialThread.
5. Метод run класса SpecialThread должен выводить "it's a run method inside SpecialThread".**/