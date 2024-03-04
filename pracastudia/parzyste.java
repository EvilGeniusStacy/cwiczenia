package pracastudia;
import java.util.Scanner;
public class parzyste {
   public static void main(String[] args) {
 Scanner a= new Scanner(System.in);
 System.out.println("podaj liczbę");

int liczba = a.nextInt();

 if(liczba % 2 ==0)
    System.out.println(liczba + " jest parzysta");
    else
    System.out.println(liczba + " jest nieparzysta");

   }

}
