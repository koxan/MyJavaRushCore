package com.javarush.task.task11.task1115;

/* 
От школьника до квалифицированного раба
*/

public class Solution {
    public static void main(String[] args) {
    }

    public class Schoolboy {

    }

    public class Student extends Schoolboy{

    }

    public class Worker extends Student{

    }

    public class Slave extends Worker{

    }

}

/*
* От школьника до квалифицированного раба
Изменить четыре класса: Schoolboy (школьник), Student (студент), Worker (Сотрудник), Slave (Раб).
Унаследовать студента от школьника, сотрудника от студента, раба от сотрудника.

5. Класс Student должен быть унаследован от класса Schoolboy.
6. Класс Worker должен быть унаследован от класса Student.
7. Класс Slave должен быть унаследован от класса Worker.*/