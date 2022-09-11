import java.util.Scanner;

public class Atividade07 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n1 = 0;



            System.out.print("Digite um número: ");
           int n = sc.nextInt();
            System.out.println("\nTabuada do: " + n);
            for (int i = 1; i < 11; i++) {
                System.out.println(n + "x" + i +" = " + i * n + "N");
            }

        }
    }
