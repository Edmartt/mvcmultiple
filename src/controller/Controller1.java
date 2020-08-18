package controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import view.Datos;
import view.Principal;

/**
 * En esta clase controlamos los eventos o interacciones de la primera ventana
 * Implementamos una interfaz ActionListener para acceder a los métodos que nos
 * permiten asignar las acciones de los botones
 */
public class Controller1 implements ActionListener {

    Principal main;//ventana 1
    Datos dat;//segunda ventana
    Controller2 cont; //Variable de la clase Controller2, que controla las interacciones de la segunda ventana

    public Controller1() {
        main = new Principal();//Instanciamos la ventana inicial
        main.setVisible(true);//Le damos visibilidad(De lo contrario no veríamos nada al ejecutar)
        dat = new Datos();//Instanciamos la segunda ventana
        cont = new Controller2(dat);//Instanciamos el controlador de la segunda venta y como argumento le pasamos el objeto anterior
        buttons();
    }

    private void buttons() {//En este método privado se asigna la acción al botón de la primera ventana
        main.btn_inicio.addActionListener(this);
    }

    /**
     * Sobreescribimos el método abstracto ActionPerformed y le condicionamos
     * según sea la fuente de la interacción, que para este caso es la
     * interacción al presionar el botón btn_inicio, debe mostarme la segunda
     * ventana
     *
     * @param ae Este parámetro represanta el tipo de evento y por medio de él
     * accedemos al método para detectar el componente en el que se ha desatado
     * la interacción
     */
    @Override
    public void actionPerformed(ActionEvent ae) {
        if (ae.getSource() == main.btn_inicio) {
            dat.setVisible(true);
        }
    }
}
