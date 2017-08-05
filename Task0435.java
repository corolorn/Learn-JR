package com.javarush.task.task04.task0435;

/* 
Четные числа
*/

public class Task0435 {
    public static void main(String[] args) throws Exception {
        


        for(int i=1;i<=100;i++){
            boolean m = ((i % 2) == 0);
            if(m){System.out.println(i);}
        }
    }
}
