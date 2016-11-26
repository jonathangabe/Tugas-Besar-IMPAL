/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import Model.Aplikasi;
import View.ViewPostingManajer;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 *
 * @author UPC
 */
public class ControllerPostingManajer implements ActionListener{
    Aplikasi app = new Aplikasi();
    ViewPostingManajer vpm;

    public ControllerPostingManajer(Aplikasi aps) {
        vpm = new ViewPostingManajer();
        vpm.setVisible(true);
        vpm.addListener(this);
        app = aps;
    } 

    @Override
    public void actionPerformed(ActionEvent ae) {
        Object x = ae.getSource();
        
        
    }
    
}
