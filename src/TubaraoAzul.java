import java.awt.*;

public class TubaraoAzul extends OrganismoMarinho implements Consumidor{

    private int consumoPorCiclo;


    public TubaraoAzul( int populacao, float taxaReproducao, int consumoPorCiclo) {

        super("Tubarao Azul", populacao, taxaReproducao);
        this.consumoPorCiclo = consumoPorCiclo;

    }

    @Override
    public int consumir(Object alimento) {

        return 0;
    }

    @Override
    public int consumir(PeixeAgulha alimento) {
        alimento.serPredado(consumoPorCiclo);
        return alimento.getPopulacao();
    }

    public Color getCorRepresentacao(){
        return Color.blue;
    }
}
