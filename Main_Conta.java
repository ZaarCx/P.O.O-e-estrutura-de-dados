public class Main_Conta {
    public static void main(String[] args) {
        ContaBancaria c1 = new ContaBancaria();
        c1.setAgencia("Abreu e lima");
        c1.setNomeDaConta("arnaldo");
        c1.setNumConta("294904");

        System.out.println(ContaBancaria.getNumConta() + c1.getNum());
        System.out.println(ContaBancaria.getAgenciaBancaria() + c1.getAgencia() );
        System.out.println(ContaBancaria.getContaBancaria() + c1.getNomeDaConta() );
        System.out.println("essa conta foi a conta de nº" + c1.getCont());






    }

}
