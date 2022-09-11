public class Atividade01{
    public static void main(String[] args) {

        double result = 0;
        for (int i = 0; i < 500; i++) {
            if (i % 3 == 0 && i % 2 != 0) {
                // "i" O RESTO DA DIVISÃO DE UMA VÁRIAVEL DE MULTIPLO 3 SE FOR IGUAL A ZERO E(&&) "i" SENDO O RESTO
                // DE UMA DIVISÃO PAR SE FOR DIFERENTE DE ZERO
                result = result + i;

            }
        }
        System.out.println(result);
    }
}
