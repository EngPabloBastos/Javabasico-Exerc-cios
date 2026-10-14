package transport;

public class MeioTransporte {
    double VelocidadeMedia;

    public double CalcularTempo(double distancia){
        double tempo;
        tempo = distancia/VelocidadeMedia;
        return tempo;
    }
}
