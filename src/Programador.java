public class Programador extends Funcionario{
    private String homeOffice;

    @Override
    protected double getPERCENTUAL_CUSTO() {
        return 2.0;
    }
    public void setHomeOffice(String homeOffice){
            this.homeOffice = homeOffice;
    }


    public void imprimir() {
        System.out.println(

                getImprimir() + "olá, meu nome é " + getNome()
                + ", meu salário é de " + getSalario()
                + ", e meu custo é de " + getCusto()
                + ", e eu trabalho de " + this.homeOffice );
    }
    public void imprimir(String rodape, Boolean texto){
        System.out.println(rodape);
        imprimir();
        texto.toString();
        System.out.println("este é o rodapé");
    }

    public void imprimir(String cabecalho){
        System.out.println(cabecalho);
        imprimir();
    }
    public void imprimir(String cabecalho, String rodape){
        System.out.println(cabecalho);
        imprimir();
        System.out.println(rodape);
    }






}





