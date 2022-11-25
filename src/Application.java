public class Application {
    public static void main(String[] args) {


        Programador joao1 = new Programador();



        joao1.setImprimir("Programador que faz trabalhos com desenvolvimento de Software. \n"); // TEXTO
        joao1.setNome("João");
        joao1.setSalario(2000);
        joao1.setHomeOffice("Home Office");
        joao1.setAumento(10);


        Cabecalho cabecalho = new Cabecalho();
        cabecalho.setCabecalho("Cabeçalho");
        Rodape rodape = new Rodape();
        rodape.setRodape("Rodapé");


        joao1.imprimir(cabecalho);
        System.out.println();
        joao1.imprimir(rodape);
        System.out.println();
        joao1.imprimir(cabecalho, rodape);








    }
}
