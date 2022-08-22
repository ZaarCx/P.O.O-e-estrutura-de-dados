
import java.util.Locale;
import java.util.Scanner;



public class ATIVIDADE11 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in).useLocale(Locale.US);
        System.out.print("digite o valor do raio: ");
        int r = input.nextInt();
        double pi = 3.14159;
        double x = Math.pow(r , 3);
        double v = ((4.0/3)*pi*x);

        System.out.print("Volume = " + String.format("%.3f\n", v).replace(",", "."));






















    }


}