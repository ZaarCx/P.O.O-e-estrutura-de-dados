public class Objetos {
    String nome;
     String autor;
     String categoria;
     int LivID;

    public Objetos(String nomeLivro, int livQuant, String autorLivro, String categoriaLivro) {

    }


    public int getLivID() {
        return LivID;
    }

    public void setLivID(int livID) {
        LivID = livID;
    }

    public String nome(){
        return nome;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public String toString(){
        return " ------------------\nID do livro: " + LivID + "\nnome do livro: " + nome + "\nautor: " + autor + "\ncategoria: " + categoria + "\n ---------";
    }
}
