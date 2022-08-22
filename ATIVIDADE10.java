import java.io.PrintStream;
import java.util.Locale;
import java.util.Scanner;

public class ATIVIDADE10 {
    public static void main (String[] args) {

        Scanner input = new Scanner(System.in).useLocale(Locale.US);
        System.out.print("código da peça: ");
        input.nextInt();
        System.out.print("número de peças : ");
        double b = input.nextInt();
        System.out.print("valor unitário da peça : ");
        double c = input.nextDouble();


        System.out.print("código da peça 2: ");
        input.nextInt();
        System.out.print("número de peças 2: ");
        double e = input.nextInt();
        System.out.print("valor unitário da peça 2: ");
        double f = input.nextDouble();
        double x = (b*c);
        double z = (e*f);

       System.out.printf("Valor a pagar: R$ %.2f", (x + z));


    }
}
