/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import Model.Aplikasi;
import View.ViewJurnal;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;

/**
 *
 * @author UPC
 */
public class ControllerJurnal extends MouseAdapter implements ActionListener{
    Aplikasi app = new Aplikasi();
    ViewJurnal vj;

    public ControllerJurnal(Aplikasi ap) {
        vj = new ViewJurnal();
        vj.setVisible(true);
        vj.addListener(this);
        app = ap;
    }   

    @Override
    public void actionPerformed(ActionEvent ae) {
        Object x = ae.getSource();
        
        
    }
    
}
