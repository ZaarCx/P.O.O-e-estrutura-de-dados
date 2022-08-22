import java.text.DecimalFormat;
import java.util.Locale;
import java.util.Scanner;

public class ATIVIDADE9 {

    public static void main (String[] args) {
        Scanner input = new Scanner(System.in).useLocale(Locale.US);
        System.out.print("Nome Do Funcionário: ");
       String a = input.next();
        System.out.print("Salario fixo: ");
        double b = input.nextDouble();
        System.out.print("Total de Vendas: ");
        double c = input.nextDouble();
        double bonus = b+c *0.15;
        DecimalFormat df = new DecimalFormat("0.##");

        System.out.printf("Total: R$ %s",df.format(bonus));





    }
}
