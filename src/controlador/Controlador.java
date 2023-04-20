
package controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import modelo.Modelo;
import vista.Vista;

public class Controlador implements ActionListener  {
    
    private Vista view;
    private Modelo model;

    public Controlador(Vista view, Modelo model) {
        this.view=view;
        this.model=model;
        this.view.buttonMultiplicar.addActionListener(this);

    }
    public void iniciar(){
        view.setTitle("MVC Multiplicar");
        view.setLocationRelativeTo(null);
        view.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        model.setNumeroUno(Integer.parseInt(view.txtNumeroUno.getText()));
        model.setNumeroDos(Integer.parseInt(view.txtNumeroDos.getText()));
        model.Multiplicar();
        view.txtResultado.setText(String.valueOf(model.getResultado()));
       
    }

   
}
