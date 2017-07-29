package com.javarush.task.task04.task0427;

/* 
Описываем числа
*/

import java.io.*;

public class Task0427 {
    public static void main(String[] args) throws Exception {
    //Считывание данных с клавиатуры
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int a = Integer.parseInt(reader.readLine());
    // Получение длины полученного числа
        String nl = Integer.toString(a);        
        int numl = nl.length();
    // Определение четности\нечетности
        boolean m = ((a % 2) == 0);

    // Условия вывода ответа
        if (a < 1 || a>999) {   

        } else if ( numl == 1 && m) {
            System.out.println("четное однозначное число");
        } else if (numl == 2 && m) {
            System.out.println("четное двузначное число");
        }else if (numl == 1 && !m) {
            System.out.println("нечетное однозначное число");
        } else  if(numl == 2 && !m) {
            System.out.println("нечетное двузначное число");
        }else if (numl == 3 && m) {
            System.out.println("четное трехзначное число");
        } else  if(numl == 3 && !m) {
            System.out.println("нечетное трехзначное число");
        }

    }
}
