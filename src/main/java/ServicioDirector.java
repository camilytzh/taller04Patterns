public class ServicioDirector {
    private ServicioBuilder builder;

    public ServicioDirector(ServicioBuilder builder) {
        this.builder = builder;
    }

    public void construirServicio() {
        builder.crearMensaje();
        builder.elegirServicio();
    }
}
