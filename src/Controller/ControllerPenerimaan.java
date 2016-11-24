/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import Model.Aplikasi;
import View.ViewPenerimaan;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;

/**
 *
 * @author UPC
 */
public class ControllerPenerimaan extends MouseAdapter implements ActionListener{
    Aplikasi app = new Aplikasi();
    ViewPenerimaan vp;

    public ControllerPenerimaan(Aplikasi a) {
        vp = new ViewPenerimaan();
        vp.setVisible(true);
        vp.addListener(this);
        app = a;
    }

    @Override
    public void actionPerformed(ActionEvent ae) {
        Object x = ae.getSource();
        
        
    }
    
}
