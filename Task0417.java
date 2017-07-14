import java.io

/**
 * Created by User on 014 14.07.17.
 */
public class Task0417 {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int a  = Integer.parseInt(br.readLine());
        int b  = Integer.parseInt(br.readLine());
        int c  = Integer.parseInt(br.readLine());
        if(a==b && b==c){
            System.out.println(a+" "+b + " " +c);}
        else if (a==b){
            System.out.println(a+" "+b );
        }else if (b==c){
            System.out.println(b+" "+c );
        }else if (a==c){
            System.out.println(a+" "+c );}
        else ;



    }
}
