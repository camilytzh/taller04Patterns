public class InformeConColores extends InformeDecorator{
    public InformeConColores(Informe informe) {
        super(informe);
    }

    @Override
    public void definirInforme() {
        super.definirInforme();
        System.out.println("Personalización de colores");
    }
}
