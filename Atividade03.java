import java.util.Scanner;

public class Atividade03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int valorPositivo = 0;
        int valorNegativo = 0;
        int QtNumero = 0;
        int soma = 0;
        int numero;
        int Media1;
        while (true) {
            numero = sc.nextInt();
            if (numero == 0) break;
            // CONDIÇÃO DE PARADA É O NÚMERO "0", CASO CONTRÁRIO, NÃO IRÁ PARAR!
            else if (numero > 0) {
                valorPositivo++;
            } else {
                valorNegativo++;
            }
            QtNumero++;
            soma = soma + numero;
        }
        Media1 = soma / QtNumero;
        double porcentagemPositivo = (double) valorPositivo / QtNumero * 100;
        double porcentagemNegativo = (double) valorNegativo / QtNumero * 100;
        System.out.println("a média geral é: " + Media1);
        System.out.println("Quantidade total de números: " + QtNumero);
        System.out.println("Números positivos: " + valorPositivo);
        System.out.println("Números negativos: " + valorNegativo);
        System.out.println("a porcentagem dos números é: " + porcentagemPositivo);
        System.out.println("a porcentagem dos números é: " + porcentagemNegativo);
    }
}









