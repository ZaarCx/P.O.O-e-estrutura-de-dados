import java.util.Locale;

public class ExecCar {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        CarroCorrida ferrari = new CarroCorrida(25, "ChewBacca",
                                                450.0, 0.0);
        // inicio // ferrari.setLigado(true);
        ferrari.ligar();
        ferrari.ligar();
        ferrari.acelerar(440.0);
        ferrari.frear(400.0);
        ferrari.frear(300.0);
        ferrari.frear(200.0);
        ferrari.frear(100.0);
        ferrari.frear(50.0);
        ferrari.frear(25.0);
        ferrari.parar();
        ferrari.desligar();
        ferrari.parar();












    }
}
