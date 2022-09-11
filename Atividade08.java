import java.util.Scanner;

public class Atividade08 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int inicial = 0;
        int razao = 0;

        System.out.print("digite um número: ");
        inicial = sc.nextInt();

        System.out.print("digite um número: ");
        razao = sc.nextInt();


        for (int i = 0; i < 10; i++) {
            System.out.println("PA = " + (inicial + razao * i ));
        }
    }

}

