import javax.sound.sampled.Line;
import java.util.Date;

public class InformePDF implements Informe{
    private float peso;
    private int numCaracteres;
    private String nombre;
    private Date fechaCreacion;
    private Date fechaModificacion;

    public InformePDF(float peso, int numCaracteres, String nombre, Date fechaCreacion, Date fechaModificacion) {
        this.peso = peso;
        this.numCaracteres = numCaracteres;
        this.nombre = nombre;
        this.fechaCreacion = fechaCreacion;
        this.fechaModificacion = fechaModificacion;
    }
    @Override
    public void definirInforme(){
        System.out.println("Informe en PDF creado");
    }
}
