package pracastudia;

public class tablica {
    public static void main(String[] args) {
   int [] liczby = {1, 3, 5};
   double a = 0;
   for(int x = 0; x < liczby.length; x++)
   a += liczby[x];

   
   a/= liczby.length;
   System.out.println(a);
    }


}