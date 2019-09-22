package com.javarush.task.task13.task1309;

/* 
Всё, что движется
*/

public class Solution {
    public static void main(String[] args) throws Exception {
    }
    interface CanMove{
        Double speed();
    }
    interface CanFly extends CanMove{
        Double speed(CanFly canfly);
    }

}
/*
* Всё, что движется
1. Создай интерфейс CanMove с методом speed.
2. Метод speed должен возвращать значение типа Double и не должен ничего принимать в качестве аргументов.
3. Создай и унаследуй интерфейс CanFly от интерфейса CanMove.
4. Добавь в интерфейс CanFly метод speed.
5. Метод speed должен возвращать значение типа Double и принимать один параметр типа CanFly.


Требования:
1. В классе Solution должен быть объявлен интерфейс CanMove.
2. В классе Solution должен быть объявлен интерфейс CanFly.
3. Интерфейс CanFly должен наследоваться от интерфейса CanMove.
4. В интерфейсе CanMove должен быть объявлен метод speed без параметров и с типом возвращаемого значения Double.
5. В интерфейсе CanFly должен быть объявлен метод speed c одним аргументом типа CanFly и с типом возвращаемого значения Double.**/