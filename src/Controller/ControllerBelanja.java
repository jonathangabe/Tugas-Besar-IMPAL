/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import Model.Aplikasi;
import View.ViewBelanja;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;

/**
 *
 * @author UPC
 */
public class ControllerBelanja extends MouseAdapter implements ActionListener{
    Aplikasi app = new Aplikasi();
    ViewBelanja vb;

    public ControllerBelanja(Aplikasi aps) {
        vb = new ViewBelanja();
        vb.setVisible(true);
        vb.addListener(this);
        app = aps;
    } 

    @Override
    public void actionPerformed(ActionEvent ae) {
        Object x = ae.getSource();
        
        
    }
    
}
