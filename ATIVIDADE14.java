import java.util.Locale;
import java.util.Scanner;


public class ATIVIDADE14 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in).useLocale(Locale.US);
        int distancia = input.nextInt();
        double combustiv = input.nextDouble();

        double media = distancia / combustiv;

        System.out.printf("%.3f km/1\n", media);






    }
}
