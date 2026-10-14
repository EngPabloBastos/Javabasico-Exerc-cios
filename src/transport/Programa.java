package transport;
import java.util.Scanner;

public class Programa {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Carro carro = new Carro();
        Bike bike = new Bike();
        APe ape = new APe();
        System.out.println("Digite a distância: ");
        double distancia = sc.nextDouble();

        System.out.println("--------Calculo de tempo--------");
        System.out.println("Carro: " + carro.CalcularTempo(distancia) + "horas");
        System.out.println("Bike: " + bike.CalcularTempo(distancia) + "horas");
        System.out.println("A pé: " + ape.CalcularTempo(distancia) + "horas");

        sc.close();
    }
}
