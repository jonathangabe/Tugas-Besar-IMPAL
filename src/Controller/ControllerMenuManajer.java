/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import Model.Aplikasi;
import View.ViewMenuManajer;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;

/**
 *
 * @author UPC
 */
public class ControllerMenuManajer extends MouseAdapter implements ActionListener{
    Aplikasi app = new Aplikasi();
    ViewMenuManajer vmm;

    public ControllerMenuManajer(Aplikasi a) {
        vmm = new ViewMenuManajer();
        vmm.setVisible(true);
        vmm.addListener(this);
        app = a;
    }
    
    @Override
    public void actionPerformed(ActionEvent e) {
        Object x = e.getSource();
        
        if (x.equals(vmm.getBtnPosting())){
            ControllerPostingManajer vpm = new ControllerPostingManajer(app);
            vmm.dispose();
        } else if (x.equals(vmm.getBtnTutupBuku())){
            ControllerTutupBuku ctb = new ControllerTutupBuku(app);
            vmm.dispose();
        } else if (x.equals(vmm.getBtnLogout())){
            ControllerLogin cl = new ControllerLogin(app);
            vmm.dispose();
        }
    }
    
}
