import java.awt.*;

public abstract class ElementoSimulacao {
    protected String nome;
    public ElementoSimulacao(String nome){
        this.nome = nome;
    }

    public String getNome(){return nome;};
    public Color getCorRepresentacao(){return null;}; //retorna a cor do elemeto
    public abstract void atualizarEstado(); //atualiza o estado do elemeto na simulacao
}
