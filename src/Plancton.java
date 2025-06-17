import java.awt.*;

public class Plancton extends ElementoSimulacao implements Predavel{
    private int quantidade;
    private final int taxaCrescimento;

    public Plancton(int quantidadeInicial, int taxaCrescimento ){
        super("Plancton");
        this.quantidade = quantidadeInicial;
        this.taxaCrescimento = taxaCrescimento;
    }

    public void consumir(int quantidadeConsumida){
        quantidade -= quantidadeConsumida;
    }

    public void atualizarEstado(){
        crescer();
    }

    public int getQantidade(){
        return quantidade;
    }

    @Override
    public Color getCorRepresentacao() {
        return Color.GREEN;
    }

    public void crescer(){
        quantidade += taxaCrescimento;
    }

    @Override
    public void serPredado(int predado) {
    this.quantidade -= predado;
    }
}
