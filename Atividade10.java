import java.util.Scanner;

public class Atividade10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int inicial = 0;

        System.out.print("digite um número: ");
        inicial = sc.nextInt();
        System.out.print(inicial + "! = ");
        int fatorial = inicial;
        for (; inicial >= 1; inicial--) {
            System.out.print(inicial);
            if (inicial != 1) {
                System.out.print(" x ");
                fatorial *= (inicial - 1);
            }
        }
        System.out.print(" = " + fatorial);
    }
}
