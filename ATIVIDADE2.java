




import java.util.Locale;
import java.util.Scanner;


            public class ATIVIDADE2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in).useLocale(Locale.US);
        // Calculo da área de circulo
        System.out.print("digite um número:");
        double pi = 3.14159;
        double raio = input.nextDouble();
        double area = Math.pow(raio,2) * pi;

        System.out.printf("A=%.4f\n", area);
    }

}
