public class TelegramBuilder implements ServicioBuilder{
    @Override
    public void crearMensaje() {
        System.out.println("Notificación para Telegram...");
    }

    @Override
    public void elegirServicio() {
        System.out.println("Servicio de notificación configurado para Telegram");
    }
}
