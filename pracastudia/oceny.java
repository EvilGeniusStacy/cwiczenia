package pracastudia;

public class oceny {
 public static void main(String[] args) {
   int [] oceny = {2, 3, 3, 5, 6};
   double srednia = 0;
   for(int x= 0; x< oceny.length; x++)
   srednia += oceny[x];
   srednia/= oceny.length;
   String wynik;
   if(srednia >=5.75)
   wynik = "6";
   else if(srednia >=4.75)
   wynik = "5";
   else if(srednia >=3.75)
   wynik = "4";
   else if(srednia >=2.75)
   wynik = "3";
   else if(srednia >=1.75)
   wynik = "2";
   else wynik = "1";

   System.out.println("średnia to " + srednia);
   System.out.println("wynik to " + wynik);
 }   
}
