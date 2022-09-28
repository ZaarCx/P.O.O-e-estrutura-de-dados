public class ContaBancaria {
    private String nome;
    private String conta;
    private String Num;

    private static final String CONTA_BANCARIA = "O usuário da conta é: ";
    private static final String AGENCIA_BANCARIA = ("A agência está localizada em: ");
    private static final String NUM_CONTA = "O número da conta é: ";
    private static int NumeroDeContas = 0;

    public String getAgencia(){
        return conta;
    }
    public void setAgencia(String conta) {
        this.conta = conta;
    }
    public static String getAgenciaBancaria(){
        return AGENCIA_BANCARIA;
    }

    public String getNomeDaConta() {
        return nome;
    }
    public void setNomeDaConta(String nome) {
        this.nome = nome;
    }
    public static String getContaBancaria() {
        return CONTA_BANCARIA;
    }
    public ContaBancaria(){
        NumeroDeContas = 1;
    }
    public int getCont(){
        return NumeroDeContas++;
    }
    public String getNum(){
        return Num;
    }
    public void setNumConta(String NumConta){
        this.Num = NumConta;
    }

    public static String getNumConta(){
        return NUM_CONTA;
    }


}
