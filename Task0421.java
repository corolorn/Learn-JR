import java.io.*;

public class Task0421 {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        BufferedReader br = new BufferedReader( new InputStreamReader(System.in));
        String fname = br.readLine();
        String sname = br.readLine();
        if (fname.equals(sname)){
            System.out.println("Имена идентичны");
        }else if (fname!=sname && fname.length()==sname.length()){
            System.out.println("Длины имен равны");
        }else  if(fname!=sname && fname.length()!=sname.length()){

        }



    }
}
