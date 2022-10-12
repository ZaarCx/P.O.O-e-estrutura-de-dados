public class CarroCorrida {
    private int numCar;

    private String piloto;

    private Double VelMax = 0.0;

    private Double VelMin = 0.0;

    private Boolean ligado = false;

    public CarroCorrida(){

    }

    public CarroCorrida(int numCar, String piloto, Double velocidadeMax, Double velocidadeMin) {
        this.numCar = numCar;
        this.piloto = piloto;
        this.VelMax = velocidadeMax;
        this.VelMin = velocidadeMin;
    }

    public int getNumCar() {
        return numCar;
    }

    public void setNumCar(int numCar) {
        this.numCar = numCar;
    }

    public String getPiloto() {
        return piloto;
    }

    public void setPiloto(String piloto) {
        this.piloto = piloto;
    }

    public Double getVelMax() {
        return VelMax;
    }

    public void setVelMax(Double velocidadeMax) {
        this.VelMax = velocidadeMax;
    }

    public Double getVelMin() {
        return VelMin;
    }

    public void setVelMin(Double velocidadeMin) {
        this.VelMin = velocidadeMin;
    }

    public Boolean getLigado() {
        return ligado;
    }

    public void setLigado(Boolean valor){
        this.ligado = valor;
    }


    public void acelerar(Double velocidade){
        if(ligado == false){
            System.out.println("O carro está desligado");
        }
        else if(VelMax < velocidade ){
            System.out.println("Não pode ultrapassar a velocidade max");
        }
        else{
            System.out.println(String.format("Acelerando o carro, velocidade atual %.2fkm/h", velocidade));
        }
    }

    public void frear(Double velocidade){
        if(ligado == false){
            System.out.println("O carro está desligado!");
        }
        else{
            System.out.println(String.format("carro freando, velocidade atual %.2fkm/h ", velocidade));
        }
    }

    public void ligar(){
        if(ligado == true){
            System.out.println("O carro já está ligado!");
        }
        else{
            System.out.println("Ligando o carro");
            this.ligado = true;
        }
    }

    public void desligar(){
        if(ligado == false){
            System.out.println("O carro já está desligado!");
        }else{
            System.out.println("Desligando o carro");
            this.ligado = false;
        }
    }
    public void parar(){
        if (ligado == true){
            System.out.println("o carro está parado.");
        }else{
            System.out.println("o carro está desligado");
        }
    }




    
}