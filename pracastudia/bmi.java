package pracastudia;
import java.util.Scanner;
public class bmi {
    public static void main(String[] args) {
        Scanner masa = new Scanner(System.in);
        Scanner wzrost =  new Scanner(System.in);
System.out.println("podaj masę");
int kg = masa.nextInt();
System.out.println("podaj wzrost w metrach");
float m = wzrost.nextFloat();
double pod = m*m;
double bmi=kg/pod;
System.out.println("bmi to: " + bmi );
    }
}
