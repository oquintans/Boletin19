/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boletin19;
/**
 *
 * @author oquintansocampo
 */
public class Main {

    /**
                + "1-> Crear Correo\n"
                + "2-> Número de correos\n"
                + "3-> Mostrar(posición)\n"
                + "4-> Mostrar primero sin leer\n"
                + "5-> Quedan correos por leer\n"
                + "6-> Borrar correo\n"
                + "7-> Salir"));
     */
    public static void main(String[] args) {
        Buzon b=new Buzon();
        
       int op;
        do {
            op = b.menu();
            switch(op){
                case 1:b.add();
                    break;
                case 2:b.numCorreos();
                    break;
                case 3:b.mostrar();
                    break;
                case 4:b.primerNoLeido();
                    break;
                case 5:b.porLeer();
                    break;
                case 6:b.delete();
                    break;
                case 7:if(op == 7 && op == 0)
                    System.exit(0);
            }

        } while (op != 7 && op != 0);
    }
    
}
