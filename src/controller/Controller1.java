package controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import model.Persona;
import view.Datos;
import view.Principal;

public class Controller1 implements ActionListener {

    Principal main;
    Datos dat;
    Controller2 cont;
    Persona p;

    public Controller1() {
        p=new Persona();
        main = new Principal();
        main.setVisible(true);
        dat = new Datos();
        
        
        buttons();
    }

    private void buttons() {
        main.btn_inicio.addActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent ae) {
        if (ae.getSource() == main.btn_inicio) {
            dat.setVisible(true);
            //cont.dattab.crearTabla(dat, p);
        }
    }
}
