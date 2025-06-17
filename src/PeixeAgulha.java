import java.awt.*;

public class PeixeAgulha extends OrganismoMarinho implements Predavel {

    private int consumoPorCiclo;

    public PeixeAgulha(String nome, int populacao, float taxaReproducao, int consumoPorCiclo) {
        super(nome, populacao, taxaReproducao);
        this.consumoPorCiclo = consumoPorCiclo;
    }

    public void consumir(Plancton alimento) {
        int totalConsumir = getPopulacao() * consumoPorCiclo;
        alimento.serPredado(totalConsumir);
    }

    @Override
    public void serPredado(int quantidade) {
        setPopulacao(getPopulacao() - quantidade);
    }

    @Override
    public Color getCorRepresentacao() {
        return Color.CYAN;
    }
}
