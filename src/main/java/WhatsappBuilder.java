public class WhatsappBuilder implements  ServicioBuilder{
    @Override
    public void crearMensaje() {
        System.out.println("Notificación para WhatsApp...");
    }

    @Override
    public void elegirServicio() {
        System.out.println("Servicio de notificación configurado para WhatsApp");
    }
}
