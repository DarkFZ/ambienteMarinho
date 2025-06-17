import java.awt.Color;
public class EventoClimatico extends ElementoSimulacao{

    private int duracao;
    private int impactoTemperatura;

    public EventoClimatico(String tipo, int duracao, int impactoTemperatura ){
        super(tipo);
    }

    public void atualizarEstado(){
        duracao --;
    }

    @Override
    public Color getCorRepresentacao(){
        return Color.BLUE;
    }

    public boolean estaAtivo() {
        return duracao>0;
    }

    public int getImpactoTemperatura(){
        return impactoTemperatura;
    }

    public String getTipo(){
        return super.getNome();
    }

    public int getCiclosRestantes(){
        return duracao;
    }
}
