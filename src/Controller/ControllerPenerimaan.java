/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import Model.Aplikasi;
import Model.TransaksiPenerimaan;
import View.ViewJurnal;
import View.ViewPenerimaan;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JOptionPane;

/**
 *
 * @author UPC
 */
public class ControllerPenerimaan extends MouseAdapter implements ActionListener{
    Aplikasi app = new Aplikasi();
    ViewPenerimaan vp;
    ViewJurnal vj;
    private int nPenerimaan=0;

    public ControllerPenerimaan(Aplikasi a) {
        vp = new ViewPenerimaan();
        vp.setVisible(true);
        vp.addListener(this);
        vp.addAdapter(this);
        app = a;
    }

    @Override
    public void actionPerformed(ActionEvent ae) {
        Object x = ae.getSource();
        
        if (x.equals(vp.getBtnAdd())){
            if (!vp.getCBtanggal().equals("tanggal") && !vp.getCBbulan().equals("bulan") && !vp.getCBtahun().equals("tahun")) {
                if (!vp.getTFaddNama().isEmpty() && !vp.getTFaddHarga().isEmpty() && !vp.getTFaddJumlah().isEmpty()){
                    int jum, hrg;
                    try {
                        jum = Integer.parseInt(vp.getTFaddJumlah());
                        hrg = Integer.parseInt(vp.getTFaddHarga());
                        int ttl = jum*hrg;
                        //nPenerimaan = nPenerimaan+1;
                        app.addPenerimaan(vp.getTFaddNama(), vp.getTanggal(), hrg, jum, ttl);
                        JOptionPane.showMessageDialog(vp, "Penerimaan Berhasil Disimpan");
                        vp.setTabEdit(app);
                        vp.clean();
                    } catch (NumberFormatException eror) {
                        JOptionPane.showMessageDialog(null, "Data Harga / Jumlah Anda Tidak Valid!");
                        vp.clean();
                    }
                } else {
                    JOptionPane.showMessageDialog(null, "Harap Data Input Dilengkapi!");
                }
            } else {
                JOptionPane.showMessageDialog(null, "Harap Pilih Tanggal!");
            }
        } else if (x.equals(vp.getBtnBack())) {
            ControllerMenuBendahara cmb = new ControllerMenuBendahara(app);
            vp.dispose();
        } /*else if (x.equals(vp.getBtnEdit())) {
            if (!vp.getTFeditNama().isEmpty() && !vp.getTFeditHarga().isEmpty() && !vp.getTFeditJumlah().isEmpty()){
                try {
                    int total = Integer.parseInt(vp.getTFeditJumlah()) * Integer.parseInt(vp.getTFeditHarga());
                    
                }
            }
        }*/
    }

    /*@Override
    public void mouseClicked(MouseEvent me) {
        Object m = me.getSource();
        
        if(m.equals(vp.getTabEdit())){
            int row = vp.getTabEdit().getSelectedRow();
            String klik = (vp.getTabEdit().getModel().getValueAt(row, 0).toString());
            
        }
    }*/    
}
