/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import Model.Aplikasi;
import View.ViewMenuBendahara;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;

/**
 *
 * @author UPC
 */
public class ControllerMenuBendahara extends MouseAdapter implements ActionListener{

    Aplikasi app = new Aplikasi();
    ViewMenuBendahara vmb;

    public ControllerMenuBendahara(Aplikasi a) {
        vmb = new ViewMenuBendahara();
        vmb.setVisible(true);
        vmb.addListener(this);
        app = a;
    }
    
    @Override
    public void actionPerformed(ActionEvent e) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
