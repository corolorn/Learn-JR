
/* 
Ярлыки и числа
*/

import java.io.*;

public class Task0426.java {
    public static void main(String[] args) throws Exception {
          //Ридер с клавиатуры
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int a = Integer.parseInt(reader.readLine());
          //Boolean для проверки четности\нечетности
        boolean m = ((a % 2) == 0);

          //проверка +\- и четности нечетности
        if (a == 0) {
            System.out.println("ноль");
        } else if (a < 0 && m) {
            System.out.println("отрицательное четное число");
        } else if (a > 0 && m) {
            System.out.println("положительное четное число");
        }else if (a < 0 && !m) {
            System.out.println("отрицательное нечетное число");
        } else  if(a > 0 && !m) {
            System.out.println("положительное нечетное число");
        }

    }
}
