public class Cachorro {
    private String nome;
    private static final String NOME_CIENTIFICO = "Canis lupus familiaris";
    private static int ContadorDeObjetos = 0;
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public static String getNomeCientifico() {
        return NOME_CIENTIFICO;
    }


    public Cachorro(){
        ContadorDeObjetos = 1;
    }
    public int getCont(){
        return ContadorDeObjetos++;
    }


}

