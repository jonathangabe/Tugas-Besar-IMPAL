/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import Model.Aplikasi;
import View.ViewBelanja;
import View.ViewJurnal;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import javax.swing.JOptionPane;

/**
 *
 * @author UPC
 */
public class ControllerBelanja extends MouseAdapter implements ActionListener{
    Aplikasi app = new Aplikasi();
    ViewBelanja vb;
    ViewJurnal vj;

    public ControllerBelanja(Aplikasi aps) {
        vb = new ViewBelanja();
        vb.setVisible(true);
        vb.addListener(this);
        app = aps;
    } 

    @Override
    public void actionPerformed(ActionEvent ae) {
        Object x = ae.getSource();
        
        if (x.equals(vb.getBtnBack())){
            ControllerMenuBendahara cmb = new ControllerMenuBendahara(app);
            vb.dispose();
        } else if (x.equals(vb.getBtnAdd())){
            if (!vb.getCBtanggal().equals("tanggal") && !vb.getCBbulan().equals("bulan") && !vb.getCBtahun().equals("tahun")) {
                if (!vb.getTFaddNama().isEmpty() && !vb.getTFaddHarga().isEmpty() && !vb.getTFaddJumlah().isEmpty()){
                    int jum, hrg;
                    try {
                        jum = Integer.parseInt(vb.getTFaddJumlah());
                        hrg = Integer.parseInt(vb.getTFaddHarga());
                        int ttl = jum*hrg;
                        //nPenerimaan = nPenerimaan+1;
                        app.addBelanja(vb.getTFaddNama(), vb.getTanggal(), hrg, jum, ttl);
                        JOptionPane.showMessageDialog(vb, "Belanja Berhasil Disimpan");
                        vb.setTabEdit(app);
                        vb.clean();
                    } catch (NumberFormatException eror) {
                        JOptionPane.showMessageDialog(null, "Data Harga / Jumlah Anda Tidak Valid!");
                        vb.clean();
                    }
                } else {
                    JOptionPane.showMessageDialog(null, "Harap Data Input Dilengkapi!");
                }
            } else {
                JOptionPane.showMessageDialog(null, "Harap Pilih Tanggal!");
            }
        }
    }
    
}
