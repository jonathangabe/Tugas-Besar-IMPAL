/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import Model.Aplikasi;
import View.View;
import View.ViewLogin;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

/**
 *
 * @author UPC
 */
public class ControllerLogin extends MouseAdapter implements ActionListener {

    private Aplikasi model;
    private JPanel mainPanel;
    private View view;
    
    Aplikasi app = new Aplikasi();
    ViewLogin log;
    
    public ControllerLogin(Aplikasi a) {
        log = new ViewLogin();
        log.setVisible(true);
        log.addListener(this);
        this.app = a;
    }
    
    @Override
    public void actionPerformed(ActionEvent e) {
        Object x = e.getSource();
        
        if (x.equals(log.getBtnLogin())){
            if(log.getTFusername().equals("bendahara") && log.getTFpassword().equals("1234")){
                    ControllerMenuBendahara vmb = new ControllerMenuBendahara(app);
                    log.dispose();
            }          
            else if (log.getTFusername().equals("manajer") && log.getTFpassword().equals("4321")){
                    ControllerMenuManajer cmm = new ControllerMenuManajer(app);
                    log.dispose();                
            } else {
                JOptionPane.showMessageDialog(log, "Username/Password Salah");
            }
        } 
    }
}