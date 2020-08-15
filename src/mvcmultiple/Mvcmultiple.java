/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mvcmultiple;

import controller.Controller1;
import controller.Controller2;

/**
 *
 * @author sam
 */
public class Mvcmultiple {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Controller1 cont1=new Controller1();
        Controller2 cont2=new Controller2(cont1);
    }
    
}
