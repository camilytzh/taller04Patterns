public class InformeConEstilo extends InformeDecorator{
    public InformeConEstilo(Informe informe) {
        super(informe);
    }

    @Override
    public void definirInforme() {
        super.definirInforme();
        System.out.println("Personalización con estilo.");
    }
}
