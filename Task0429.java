package com.javarush.task.task04.task0429;

/* 
Положительные и отрицательные числа
*/

import java.io.*;

public class Task0429 {
    public static void main(String[] args) throws Exception {
    
        //Считвание с клавиатуры
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        
        //Переменные массива и счетчика положительных и отрицательных чисел
        int[] arr = new int[3];
        int countP = 0;
        int countN = 0;
        
        //цикл заполнения массива
        for (int i = 0; i < 3; i++) {arr[i] = Integer.parseInt(reader.readLine());}
        
        //цикл счетчика положительных чисел
        for (int i : arr) {if (i > 0) {countP++;}}
        
        //цикл счетчика отрицатеьных чис
        for (int i : arr) {if (i < 0) {countN++;}}
        
        //вывод 
        System.out.println("количество положительных чисел: " + countP);
        System.out.println("количество отрицательных чисел: " + countN);


    }
}
