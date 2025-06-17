import java.awt.*;

public class AveMarinha extends OrganismoMarinho implements Consumidor{
    private int consumoPorCiclo;

    public AveMarinha(int populacao, float taxaReproducao,int consumoPorCiclo) {

        super("AveMarinha", populacao, taxaReproducao);
        this.consumoPorCiclo = consumoPorCiclo;
    }



    @Override
    public int consumir(Object alimento) {
        return 0;
    }

    @Override
    public int consumir(PeixeAgulha alimento) {
        alimento.serPredado(consumoPorCiclo);
        return 0;
    }

    public Color getCorRepresentacao(){
        return Color.white;
    }
}
