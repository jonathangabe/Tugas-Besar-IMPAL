/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import Model.Aplikasi;
import View.ViewBelanja;
import View.ViewJurnal;
import View.ViewLogin;
import View.ViewMenuBendahara;
import View.ViewMenuManajer;
import View.ViewPenerimaan;
import View.ViewPostingBendahara;
import View.ViewPostingManajer;
import View.ViewTutupBuku;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.io.IOException;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.*;
import view.*;
import model.*;
/**
 *
 * @author UPC
 */
public class Controller extends MouseAdapter implements ActionListener {
    private Aplikasi model;
    private String menusekarang;
    private JPanel mainPanel;
    private View view;
    
    private ViewMenuBendahara mb;
    private ViewMenuManajer mm;
    private ViewBelanja b;
    private ViewJurnal j;
    private ViewLogin l;
    private ViewPenerimaan p;
    private ViewPostingBendahara pb;
    private ViewPostingManajer pm;
    private ViewTutupBuku tb;
    
    public void Controller(Aplikasi model){
        this.model = model;
        
        mb = new ViewMenuBendahara();
        mm = new ViewMenuManajer();
        b = new ViewBelanja();
        j = new ViewJurnal();
        l = new ViewLogin();
        p = new ViewPenerimaan();
        pb = new ViewPostingBendahara();
        pm = new ViewPostingManajer();
        tb = new ViewTutupBuku();
        
        mb.addListener(this);
        mm.addListener(this);
        b.addListener(this);
        j.addListener(this);
        l.addListener(this);
        p.addListener(this);
        pb.addListener(this);
        pm.addListener(this);
        tb.addListener(this);
        
        mainPanel = view.getMainPanel();
        mainPanel.add(mb,"0");
        mainPanel.add(mm,"1");
        mainPanel.add(b,"2");
        mainPanel.add(j,"3");
        mainPanel.add(l,"4");
        mainPanel.add(p,"5");
        mainPanel.add(pb,"6");
        mainPanel.add(pm,"7");
        mainPanel.add(tb,"8");
    }

    @Override
    public void actionPerformed(ActionEvent ae) {
        
    }
}
