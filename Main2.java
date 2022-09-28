public class Main2 {

        public static void main(String[] args) {
            Cachorro c1 = new Cachorro();
            c1.setNome("Rex");

            Cachorro c2 = new Cachorro();
            c2.setNome("Totó");

            Cachorro c3 = new Cachorro();
            c3.setNome("Little John");
            System.out.println(Cachorro.getNomeCientifico()+ ": " + c1.getNome() + ", Objeto N°: " + c1.getCont());
            System.out.println(Cachorro.getNomeCientifico()+ ": " + c2.getNome() + ", Objeto N°: " + c2.getCont());
            System.out.println(Cachorro.getNomeCientifico()+ ": " + c3.getNome() + ", Objeto N°: " + c3.getCont());
        }
    }


