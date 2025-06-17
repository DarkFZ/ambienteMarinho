import java.awt.*;

public class RecifeDeCoral extends ElementoSimulacao{
    private int saude;
    private final int taxaRegeneracao;
    private final int taxaDegradacao;

    public RecifeDeCoral(int saudeInicial, int taxaRegeneracao, int taxaDegradacao){
        super("RecifeDeCoral");
        this.taxaRegeneracao = taxaRegeneracao;
        this.taxaDegradacao = taxaDegradacao;
    }

    public void atualizarEstado(){
        if(saude<100){
            int novaSaude = saude * taxaRegeneracao;
            saude += novaSaude;
        }
    }

    public boolean estaDegradado(){return saude < 30;}

    public void degradar(){
        int novaSaude = saude * taxaDegradacao;
        saude -= novaSaude;
    }

    @Override
    public Color getCorRepresentacao(){
        return Color.pink;
    }

    public int getSaude(){
        return saude;
    }
}
