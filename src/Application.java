public class Application {
    public static void main(String[] args) {


        Programador joao1 = new Programador();



        joao1.setImprimir("Programador que faz trabalhos com desenvolvimento de Software. \n"); // TEXTO
        joao1.setNome("João");
        joao1.setSalario(2000);
        joao1.setHomeOffice("Home Office");
        joao1.setAumento(10);
        joao1.imprimir("Este é o meu cabeçalho ");
        joao1.imprimir("este é o cabeçalho ainda","este é o rodapé");
        joao1.imprimir("ainda é o cabeçalho hein", true);








    }
}
