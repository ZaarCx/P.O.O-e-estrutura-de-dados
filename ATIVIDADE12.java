import java.util.Locale;
import java.util.Scanner;



public class ATIVIDADE12 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in).useLocale(Locale.US);
        double a = input.nextDouble();
        double b = input.nextDouble();
        double c = input.nextDouble();
        double pi = 3.14159;
        double t = a*c/2;
        double CIRCULO = pi*Math.pow(c,2);
        double TRAPEZIO = ((a+b)*c)/2;
        double QUADRADO = Math.pow(b , 2);
        double RETANGULO = a * b;
        System.out.print("triangulo = " + String.format("%.3f\n", t).replace(",", "."));
        System.out.print("CIRCULO = " + String.format("%.3f\n", CIRCULO).replace(",", "."));
        System.out.print("TRAPEZIO = " + String.format("%.3f\n", TRAPEZIO).replace(",", "."));
        System.out.print("QUADRADO = " + String.format("%.3f\n", QUADRADO).replace(",", "."));
        System.out.println("RETANGULO = " + String.format("%.3f\n", RETANGULO).replace(",", "."));
















    }
    }