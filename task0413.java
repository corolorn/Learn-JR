import java.io.BufferedReader;
import java.io.InputStreamReader;

/* 
День недели
*/

import java.io.*;

public class Task0413 {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        BufferedReader  br = new BufferedReader(new InputStreamReader(System.in));
        int x = Integer.parseInt(br.readLine());
        String m = "";
        switch (x) {
            case 1: m = "понедельник";
            break;
            case 2: m = "вторник";
            break;
            case 3: m = "среда";
            break;
            case 4: m = "четверг";
            break;
            case 5: m = "пятница";
            break;
            case 6: m = "суббота";
            break;
            case 7: m = "воскресенье";
            break;
            default: m = "такого дня недели не существует";
            break;
        }
        System.out.println(m);
        
    }
}
