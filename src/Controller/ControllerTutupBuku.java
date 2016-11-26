/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import Model.Aplikasi;
import View.ViewTutupBuku;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 *
 * @author Gabe
 */
public class ControllerTutupBuku implements ActionListener{
    Aplikasi app = new Aplikasi();
    ViewTutupBuku vtb;

    public ControllerTutupBuku(Aplikasi aps) {
        vtb = new ViewTutupBuku();
        vtb.setVisible(true);
        vtb.addListener(this);
        app = aps;
    }    

    @Override
    public void actionPerformed(ActionEvent ae) {
        Object x = ae.getSource();
        
        
    }
    
    
}
