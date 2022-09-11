import java.util.Locale;
import java.util.Scanner;
public class Atividade02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in).useLocale(Locale.US);
        Double maior = Double.MIN_VALUE;
        Double menor = Double.MAX_VALUE;


        for (int i = 0; i < 15; i++) {
            System.out.print("digite a sua altura: ");
            Double altura = sc.nextDouble();
            if (maior < altura) {
                maior = altura;
            }
            if (menor > altura) {
                menor = altura;
            }
        }
        System.out.println("o maior integrante tem altura:" + maior);
        System.out.println("o menor integrante tem altura:" + menor);
    }
}
