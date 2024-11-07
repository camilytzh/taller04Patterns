public class InformeDecorator implements  Informe{
    protected Informe informe;
    public InformeDecorator(Informe informe) {
        this.informe = informe;
    }

    @Override
    public void definirInforme() {
        informe.definirInforme();
    }
}
