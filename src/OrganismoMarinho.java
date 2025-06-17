import java.awt.*;

public class OrganismoMarinho extends ElementoSimulacao{

    private int populacao;
    private final float taxaReproducao;

    public OrganismoMarinho(String nome,int populacao, float taxaReproducao){
        super(nome);
        this.populacao =populacao;
        this.taxaReproducao = taxaReproducao;
    }

    public void reproduzir(){
        int reproducao = (int) (populacao * taxaReproducao);
        populacao += reproducao;
    }

    public void atualizarEstado(){
        reproduzir();
    }; //atualiza o estado do elemeto reproduzindo

    public int getPopulacao(){
    return populacao;
    }

    public void setPopulacao(int populacao){
        this.populacao = Math.max(0,populacao); // para garantir que a populacao seja nao negativa
    }
}
