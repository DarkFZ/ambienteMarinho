import java.awt.*;

public class PeixeAgulha extends OrganismoMarinho implements Predavel {

    private int consumoPorCiclo;

    public PeixeAgulha( int populacao, float taxaReproducao, int consumoPorCiclo) {
        super("Peixe Agulha", populacao, taxaReproducao);
        this.consumoPorCiclo = consumoPorCiclo;
    }


    public int consumir(Plancton alimento) {
        int totalConsumir = getPopulacao() * consumoPorCiclo;
        alimento.serPredado(totalConsumir);
        return 0;
    }

    @Override
    public void serPredado(int quantidade) {

        setPopulacao(getPopulacao() - quantidade);
    }

    @Override
    public Color getCorRepresentacao() {
        return Color.cyan;
    }
}
