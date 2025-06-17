public class AveMarinha extends OrganismoMarinho implements Consumidor{
    private int consumoPorCiclo;
    public AveMarinha(int populacao, float taxaReproducao,int consumoPorCiclo) {

        super("AveMarinha", populacao, taxaReproducao);
        this.consumoPorCiclo = consumoPorCiclo;
    }

    public int consumir(Plancton alimento){

        return 0;
    }

    @Override
    public void consumir(Object alimento) {

    }
}
