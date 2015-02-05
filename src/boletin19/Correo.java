package boletin19;

import java.util.ArrayList;

/**
 *
 * @author oquintansocampo
 */
public class Correo {

    private String contenido;
    private int leido;
    public ArrayList<Correo> correo=new ArrayList<Correo>();

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
}
