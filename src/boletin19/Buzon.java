package boletin19;

/**
 *
 * @author oquintansocampo
 */
public class Buzon {

    Correo co = new Correo();

    public Buzon() {
    }

    public int numCorreos() {
        int tam = co.correo.size();
        return tam;
    }

    public void add(Correo c) {
        co.correo.add(new Correo());
    }

    public boolean porLeer() {
        if (co.getLeido() == 0) {
            return false;//No leido
        } else {
            return true;//leido
        }
    }

    public String primerNoLeido() {
        String c = "Todos leidos";
        for (Correo ex : co.correo) {
            if (ex.getLeido() == 0) {
                c = co.getContenido();
            }
        }
        return c;
    }

    public String mostrar(int p) {
        String m = "";
        for (Correo ex : co.correo) {
            m = ex.correo.get(p).getContenido();
        }
        return m;
    }

    public void delete(int p) {
        for (Correo ex : co.correo) {
            ex.correo.remove(p);
        }
    }
}
