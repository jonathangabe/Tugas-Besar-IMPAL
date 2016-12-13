/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import Model.Aplikasi;
import View.ViewPostingBendahara;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;

/**
 *
 * @author UPC
 */
public class ControllerPostingBendahara extends MouseAdapter implements ActionListener{
    Aplikasi app = new Aplikasi();
    ViewPostingBendahara vpb;

    public ControllerPostingBendahara(Aplikasi ap) {
        vpb = new ViewPostingBendahara();
        vpb.setVisible(true);
        vpb.addListener(this);
        app = ap;
    }    

    @Override
    public void actionPerformed(ActionEvent ae) {
        Object x = ae.getSource();
        
        if (x.equals(vpb.getBtnBack())){
            ControllerMenuBendahara cmb = new ControllerMenuBendahara(app);
            vpb.dispose();
        }
    }
    
}
