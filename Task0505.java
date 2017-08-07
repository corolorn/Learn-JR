package com.javarush.task.task05.task0505;

/* 
Кошачья бойня
*/

public class Task0505 {
    public static void main(String[] args) {
        Cat Rofos = new Cat("Rofos",25,55,55);
        Cat Barsik = new Cat("Barsik",3,25,35);
        Cat Leo = new Cat("Leo",5,15,55);
        System.out.println(Rofos.fight(Barsik));
        System.out.println(Barsik.fight(Leo));
        System.out.println(Leo.fight(Rofos));
    }

    public static class Cat {
        protected String name;
        protected int age;
        protected int weight;
        protected int strength;

        public Cat(String name, int age, int weight, int strength) {
            this.name = name;
            this.age = age;
            this.weight = weight;
            this.strength = strength;
        }

        public boolean fight(Cat anotherCat) {
            int agePlus = this.age > anotherCat.age ? 1 : 0;
            int weightPlus = this.weight > anotherCat.weight ? 1 : 0;
            int strengthPlus = this.strength > anotherCat.strength ? 1 : 0;

            int score = agePlus + weightPlus + strengthPlus;
            return score > 2; // return score > 2 ? true : false;
        }
    }
}
