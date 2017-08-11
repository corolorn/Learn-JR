package com.javarush.task.task05.task0526;

/* 
Мужчина и женщина
*/

public class Task0526.java {

    public static void main(String[] args) {
        
// Создаем объекты 
        Man man1 = new Man("vasya",22,"mw");
        Man man2 = new Man("vova",22,"mw");
        Woman woman1 = new Woman("mira",22,"mw");
        Woman woman2 = new Woman("lena",22,"mw");
        
//Выводим на экран 
        System.out.println(man1.name+ " " + man1.age + " " + man1.address);
        System.out.println(man2.name+ " " + man2.age + " " + man2.address);
        System.out.println(woman1.name+ " " + woman1.age + " " + woman1.address);
        System.out.println(woman2.name+ " " + woman2.age + " " + woman2.address);

    }

//Класс мужчина
    public static class Man{
    
 //переменные класса Мужчина
        String name;
        int age;
        String address;

// Конструктор класса мужчина
        public   Man(String name, int age, String address){
            this.name=name;
            this.age=age;
            this.address=address;
        }

    }

 // Класс женщина
    public static class  Woman{
    
 // переменные класса Женщина
        String name;
        int age;
        String address;
        
 // Консруктор класса Женщина
        public   Woman(String name, int age, String address){
            this.name=name;
            this.age=age;
            this.address=address;
        }
    }
}
