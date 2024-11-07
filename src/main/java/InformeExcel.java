import java.util.Date;

public class InformeExcel implements Informe{
    private float peso;
    private String nombre;
    private int numHojas;
    private int numOperaciones;
    private int tablasCreadas;
    private Date fechaCreacion;
    private Date fechaModificacion;

    public InformeExcel(float peso, String nombre, int numHojas, int numOperaciones, int tablasCreadas, Date fechaCreacion, Date fechaModificacion) {
        this.peso = peso;
        this.nombre = nombre;
        this.numHojas = numHojas;
        this.numOperaciones = numOperaciones;
        this.tablasCreadas = tablasCreadas;
        this.fechaCreacion = fechaCreacion;
        this.fechaModificacion = fechaModificacion;
    }
    @Override
    public void definirInforme() {
        System.out.println("Informe en Excel creado.");
    }
}
