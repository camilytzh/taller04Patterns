public class EmailBuilder implements  ServicioBuilder{
    @Override
    public void crearMensaje() {
        System.out.println("Notificación para Email...");
    }

    @Override
    public void elegirServicio() {
        System.out.println("Servicio de notificación configurado para Email");
    }
}
