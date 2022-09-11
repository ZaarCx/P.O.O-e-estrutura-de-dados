import java.util.Scanner;


public class Atividade05 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int mediaGeral;
        int qtdValoresPares = 0;
        int qtdValoresImpares = 0;
        int soma = 0;
        int cont = 0;
        int somaPar = 0;

        int valorA = 0;
        while (valorA != (-1)) {
            System.out.print("informe um número: ");
            valorA = sc.nextInt();

            if (valorA <= 0) break;
                soma = soma + valorA;
                cont = cont + 1;

               if (valorA % 2 == 0) {
                   somaPar = somaPar + valorA;
                    qtdValoresPares = qtdValoresPares + 1;
                } else {
                    qtdValoresImpares = qtdValoresImpares + 1;
                }
            }

        mediaGeral = soma / cont;

        System.out.println("A média Geral é: " + mediaGeral);
        System.out.println("A quantidade de valores impares é: " + qtdValoresImpares);
        System.out.println("A quantidade de valores pares é: " + qtdValoresPares);
        System.out.println("A média de valores pares é: " + ((double)somaPar/qtdValoresPares));

    }
}


