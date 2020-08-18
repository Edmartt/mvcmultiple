/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;
import model.DatosTabla;
import model.Persona;
import view.Datos;

/**
 *
 * @author sam
 */
public class Controller2 implements ActionListener {

    Datos dat;
    DatosTabla dattab;
    Persona p;

    /**
     * En este controlador, pedimos que al instanciar un objeto de esta clase,
     * su argumento debe ser un objeto de la clase Datos, que represanta la
     * segunda ventana
     *
     * @param dat
     */
    public Controller2(Datos dat) {
        this.dat = dat;//Creamos la referencia del valor pasado como argumento sea igual a la variable de la clase
        dattab = new DatosTabla();//Instanciamos un objeto de la clase donde está nuestra tabla
        dattab.crearTabla(dat);//cramos el modelo de la tabla al instanciar e iniciar la segunda ventana
        p = new Persona();//Instanciamos un objeto de tipo persona, que es donde están los métodos getters para mostrar en nuestra tabla
        buttons();
    }

    private void buttons() {
        dat.btn_insertar.addActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent ae) {
        if (ae.getSource() == dat.btn_insertar) {
            JOptionPane.showMessageDialog(null, "Boton de segunda ventana presionado");//Cada click mostraría un mensaje emergente
            p.setNombre(dat.txt_nombre.getText());/*Los setters los usamos para obtener lo escrito en las cajas de textos y pasarlos 
            a nuestra clase Persona y desde sus getters pasarlos al array que llenará la fila de la tabla*/
            p.setApellido(dat.txt_apellido.getText());
            p.setCedula(dat.txt_cedula.getText());
            p.setEdad(dat.txt_edad.getText());
            dattab.llenarTablar(dat, p);//Se llena la tabla que se accede mediante el objeto dat y se accede a los getters por medio del objeto p
            dattab.limpiarCajas(dat);//limpiamos las cajas de texto
        }
    }
}
