
package mvc;

import controlador.Controlador;
import modelo.Modelo;
import vista.Vista;


public class MVC {

    public static void main(String[] args) {
      Modelo mod= new Modelo(); 
      Vista view= new Vista();
      Controlador control = new Controlador(view,mod);
      control.iniciar();

      
    }
    
}
