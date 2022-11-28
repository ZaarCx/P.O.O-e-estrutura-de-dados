import java.util.ArrayList;
import java.util.Scanner;
import java.lang.String;


public class Livros {

    static ArrayList<Objetos> list = new ArrayList<>();
    static int livQuant;
    static Scanner sc = new Scanner(System.in);


    static void addingLiv() {
        System.out.println("Então você deseja adicionar um livro ao sistema!\nPor favor, digite o nome do livro: ");
        String nomeLivro = sc.next();
        System.out.println("Agora, por favor, digite o nome do autor!");
        String autorLivro = sc.next();
        System.out.println("Agora digite a categoria!");
        String categoriaLivro = sc.next();
        livQuant = list.size() + 1;
        Objetos obj = new Objetos(nomeLivro, livQuant , autorLivro, categoriaLivro);
        list.add(obj);
    }
        static void deleteLiv(){
            System.out.println("Então você deseja deletar um livro!\n Caso tenha errado, digite cancelar\nPor favor, digite o número do livro: ");
            String input = sc.next();
            if (input.equalsIgnoreCase("cancelar")){
            }else {
                int inputInt = Integer.parseInt(input);
                list.remove(inputInt - 1);
                for (Objetos object: list) {
                    list.get(list.indexOf(object)).setLivID(list.indexOf(object) + 1);
                }

            }
    }
    static void updateLiv() {
        System.out.println("Então você deseja alterar o dado de um livro\nPor favor, digite o número do livro: ");
        int i = sc.nextInt();
        System.out.println("Selecione a opção que deseja alterar do livro: \n1.Nome do livro;\n2. autor do livro;\n3.Categoria do livro\n4. Não alterar nada.");
        int i2 = sc.nextInt();
        switch (i2) {
            case 1:
                System.out.println("Ok, vamos mudar o nome do livro.\n Por favor, digite o novo nome do livro: ");
                String nome = sc.next();
                list.get(i - 1).setNome(nome);
                break;
            case 2:
                System.out.println("Ok, vamos mudar o nome do autor.\nPor favor, digite o novo autor: ");
                String autor = sc.next();
                list.get(i - 1).setAutor(autor);
                break;
            case 3:
                System.out.println("Ok, vamos mudar o nome da categoria.\nPor favor, digite o novo autor: ");
                String categoria = sc.next();
                list.get(i - 1).setAutor(categoria);
                break;
            case 4:
                System.out.println("Não haverá alteração em nada, você retornará ao menu inicial!\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n");
                break;
        }
    }
    static void readLiv(){
        for (Objetos object : list){
            System.out.println(object);


        }
    }
}