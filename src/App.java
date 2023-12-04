import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {

        Scanner meow = new Scanner(System.in);
        String miau = meow.nextLine();
        char[] meowarray = new char[miau.length()];
        int i;
        int k=0;
        meow.close();
        for(i = miau.length()-1; i >= 0; i--){
            meowarray[k]= miau.charAt(i);
            k++;    
    }
    String woof = new String(meowarray);
    System.out.println(woof);
}
}