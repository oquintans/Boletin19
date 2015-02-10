package boletin19;
/**
 *
 * @author oquintansocampo
 */
public class Correo {

    private String contenido;
    private int leido;    

    public Correo() {
    }

    public Correo(String contenido, int leido) {
        this.contenido = contenido;
        this.leido = leido;
    }    

    public String getContenido() {
        return contenido;
    }

    public void setContenido(String contenido) {
        this.contenido = contenido;
    }

    public int getLeido() {
        return leido;
    }

    public void setLeido(int leido) {
        this.leido = leido;
    }

    @Override
    public String toString() {
        return "Correo{" + "contenido=" + contenido + ", leido=" + leido + '}';
    }
    
}
