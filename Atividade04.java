import java.util.Scanner;

public class Atividade04 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Integer ate25 = 0;
        Integer ate50 = 0;
        Integer ate75 = 0;
        Integer ate100 = 0;
        Integer ateM = 0;
        int numero1 = 0;

        while (numero1 >= 0) {
            System.out.print("informe um número: ");
            int numero = Integer.parseInt(sc.nextLine());

            if (numero < 0) break;
            else {
                if (numero <= 25) ate25++;
                else if (numero <= 50) ate50++;
                else if (numero <= 75) ate75++;
                else if (numero <= 100) ate100++;
                else if (numero >= 100) ateM++;
            }
        }
        System.out.println("quantidade de números no intervalo de 0 a 25 é: " + ate25);
        System.out.println("quantidade de números no intervalo de 25 a 50 é: " + ate50);
        System.out.println("quantidade de números no intervalo de 50 a 75 é: " + ate75);
        System.out.println("quantidade de números no intervalo de 75 a 100 é: " + ate100);
        System.out.println("quantidade de números fora do intervalo é: " + ateM);

    }
}