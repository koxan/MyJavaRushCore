package com.javarush.task.task17.task1714;

/* 
Comparable
Реализуйте интерфейс Comparable<Beach> в классе Beach. Пляжи(Beach)
 будут использоваться нитями, поэтому позаботьтесь, чтобы все методы были синхронизированы.
Реализовать метод compareTo так, чтобы он при сравнении двух пляжей выдавал число,
 которое показывает что первый пляж лучше (положительное число)
или второй пляж лучше (отрицательное число), и насколько он лучше.


Требования:
1. Класс Beach должен содержать три поля: String name, float distance, int quality.
2. Класс Beach должен реализовывать интерфейс Comparable<Beach>.
3. Метод compareTo класса Beach как минимум должен учитывать качество пляжа и дистанцию.
4. Все методы класса Beach, кроме метода main, должны быть синхронизированы.
*/

public class Beach implements Comparable<Beach>{
    private String name;      //название
    private float distance;   //расстояние
    private int quality;    //качество

    public Beach(String name, float distance, int quality) {
        this.name = name;
        this.distance = distance;
        this.quality = quality;
    }

    synchronized public String getName() {
        return name;
    }

    synchronized public void setName(String name) {
        this.name = name;
    }

    synchronized public float getDistance() {
        return distance;
    }

    synchronized public void setDistance(float distance) {
        this.distance = distance;
    }

    synchronized public int getQuality() {
        return quality;
    }

    synchronized public void setQuality(int quality) {
        this.quality = quality;
    }

    public static void main(String[] args) {
        Beach a = new Beach("Крыло",100,23);
        Beach b = new Beach("Акация",30,50);
        a.compareTo(b);
        b.compareTo(a);
    }


    synchronized public int compareTo(Beach o) {
        float result = this.quality - this.distance - o.quality + o.distance;
        return (int)result;
    }



    }
