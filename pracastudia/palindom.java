package pracastudia;
import java.util.Scanner;
public class palindom {
    public static void main(String[] args) {
     Scanner skaner = new Scanner(System.in);
     System.out.println("podaj wyraz");
     String slowo = skaner.nextLine();

     boolean palindrom= true;
     for(int x= 0; x< slowo.length() /2; x++){
        if(slowo.charAt(x) != slowo.charAt(slowo.length()-1 - x)){
            palindrom= false;
            break;
        }
     }
     if(palindrom){
        System.out.println(slowo+" jest palindromem" );
     }
     else{
        System.out.println(slowo+ " nie jest palindromem");
     }
    }
}
