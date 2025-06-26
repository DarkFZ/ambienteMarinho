public class Main {
    public static void main(String[] args) {
        AveMarinha ave = new AveMarinha(13, 1.3F,2);
        Plancton plancton = new Plancton(15,5);
        RecifeDeCoral recife = new RecifeDeCoral(60,4,5);
        EventoClimatico evento = new EventoClimatico("Tempestade",4,10);
        TubaraoAzul tubarao = new TubaraoAzul(8,1,2);
        PeixeAgulha peixe = new PeixeAgulha(10,2.1F,2);

        AmbienteMarinho ambiente = new AmbienteMarinho(ave,plancton,tubarao,peixe,recife);
        ambiente.simularCiclo();
        ambiente.simularCiclo();

    }
}