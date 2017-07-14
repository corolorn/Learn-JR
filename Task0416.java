import java.io.BufferedReader;
import java.io.InputStreamReader;

/* 
Переходим дорогу вслепую
*/

import java.io.*;

public class Task0416 {
     public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        double t = Double.parseDouble(br.readLine());
        double timecount=t%5.0;
        if (timecount<3.0){
            System.out.println("зелёный");
        } else if((timecount<4.0)){
            System.out.println("желтый");
        } else System.out.println("красный");

    }
}
