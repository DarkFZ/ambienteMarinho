public class AmbienteMarinho {
    private AveMarinha avemarinha;
    private Plancton plancton;
    private TubaraoAzul tubarao;
    private RecifeDeCoral recifeDeCoral;
    private PeixeAgulha peixeagulha;


    public AmbienteMarinho(AveMarinha avemarinha, Plancton plancton, TubaraoAzul tubarao, PeixeAgulha peixeAgulha, RecifeDeCoral recifeDeCoral){
    this.avemarinha = avemarinha;
    this.plancton = plancton;
    this.tubarao = tubarao;
    this.peixeagulha = peixeAgulha;
    this.recifeDeCoral = recifeDeCoral;
    }

    private void exibirEstado(){

        System.out.println("\nO ambiente marinho tem :");
        System.out.println("Aves Marinha = " + getAveMarinha().getPopulacao());
        System.out.println("Plancton = " + getPlancton().getQantidade());
        System.out.println("Tubarao Azul = " + getTubarao().getPopulacao());
        System.out.println("Peixe Agulha = " + getPeixeAgulha().getPopulacao());

        if(getRecife().estaDegradado()){
            System.out.println("Recife de Coral esta degradado!");
        }else{
            System.out.println("Recife esta BOM!\n");
        }

    }

    public AveMarinha getAveMarinha(){
        return avemarinha;
    }

    public Plancton getPlancton(){
        return plancton;
    }

    public TubaraoAzul getTubarao(){
        return tubarao;
    }

    public PeixeAgulha getPeixeAgulha(){
        return peixeagulha;
    }

    public RecifeDeCoral getRecife(){
        return recifeDeCoral;
    }

}
