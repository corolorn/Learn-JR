package com.javarush.task.task04.task0437;


/* 
Треугольник из восьмерок
*/

public class Task0437 {
    public static void main(String[] args) throws Exception {

        
        int a = 8;
        //цикл строк
        for (int i = 0; i < 10; i++) {

            //цикл столбцов
            for (int k = 0; k <= i; k++) {
                System.out.print(a);
            }

            //перенос строки
            System.out.println();
        }
    }
}
