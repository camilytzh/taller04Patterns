import java.util.Date;
public class InformeWord implements Informe{
    private float peso;
    private String nombre;
    private int numPalabras;
    private int numCaracteres;
    private int numPaginas;
    private Date fechaCreacion;
    private Date fechaModificacion;

    public InformeWord(float peso, String nombre, int numPalabras, int numCaracteres, int numPaginas, Date fechaCreacion, Date fechaModificacion) {
        this.peso = peso;
        this.nombre = nombre;
        this.numPalabras = numPalabras;
        this.numCaracteres = numCaracteres;
        this.numPaginas = numPaginas;
        this.fechaCreacion = fechaCreacion;
        this.fechaModificacion = fechaModificacion;
    }

    @Override
    public void definirInforme() {
        System.out.println("Informe en Word creado.");
    }
}
