public class Funcionario {
    private String nome;
    private Double salario;
    private Double custo;
    private static final double PERCENTUAL_CUSTO = 1.8;



    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }

    public Double getSalario() {
        return salario;

    }

    public void setSalario(Double salario) {
        this.salario = salario;
        this.custo = salario * PERCENTUAL_CUSTO;
    }


    public Double getCusto() {
        return custo;
    }
    public void imprimir(){
        System.out.println(this.getNome() +
                " ganha " + this.getSalario() +
                " e tem um custo de: " + this.getCusto()    );
    }

}
