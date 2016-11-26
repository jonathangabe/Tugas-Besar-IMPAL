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
        Object x = e.getSource();
        
        if (x.equals(vmb.getBtnPenerimaan())){
            ControllerPenerimaan cp = new ControllerPenerimaan(app);
            vmb.dispose();
        } else if (x.equals(vmb.getBtnBelanja())){
            ControllerBelanja cb = new ControllerBelanja(app);
            vmb.dispose();
        } else if (x.equals(vmb.getBtnJurnal())){
            ControllerJurnal cj = new ControllerJurnal(app);
            vmb.dispose();
        } else if (x.equals(vmb.getBtnPosting())) {
            ControllerPostingBendahara cpb = new ControllerPostingBendahara(app);
            vmb.dispose();
        } else if (x.equals(vmb.getBtnTutupBuku())) {
            //
            vmb.dispose();
        } else if (x.equals(vmb.getBtnLogout())) {
            ControllerLogin cl = new ControllerLogin(app);
            vmb.dispose();
        }
    }
    
}
