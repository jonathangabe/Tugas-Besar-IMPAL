/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import Model.Aplikasi;
import Model.TransaksiPenerimaan;
import View.ViewPenerimaan;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import javax.swing.JOptionPane;

/**
 *
 * @author UPC
 */
public class ControllerPenerimaan extends MouseAdapter implements ActionListener{
    Aplikasi app = new Aplikasi();
    ViewPenerimaan vp;

    public ControllerPenerimaan(Aplikasi a) {
        vp = new ViewPenerimaan();
        vp.setVisible(true);
        vp.addListener(this);
        app = a;
    }

    @Override
    public void actionPerformed(ActionEvent ae) {
        Object x = ae.getSource();
        
        if (x.equals(vp.getBtnAdd())){
            String nama = vp.getTFaddNama();
            String harga = vp.getTFaddHarga();
            String jml = vp.getTFaddJumlah();
            String ttl = vp.getTFaddTotal();
            String tgl = vp.getCBtanggal();
            String bln = vp.getCBbulan();
            String thn = vp.getCBtahun();
             if("".equals(nama)){
                JOptionPane.showMessageDialog(vp, "Nama Tidak Boleh Kosong");
                vp.clean();
            }
             else if("".equals(harga))
            {
                JOptionPane.showMessageDialog(vp, "Harga Tidak Boleh Kosong");
                vp.clean();
            }
             else if("".equals(jml))
            {
                JOptionPane.showMessageDialog(vp, "Jumlah Tidak Boleh Kosong");
                vp.clean();
            }
             else if("".equals(ttl))
            {
                JOptionPane.showMessageDialog(vp, "Total Tidak Boleh Kosong");
                vp.clean();
            }
             else if("".equals(tgl))
            {
                JOptionPane.showMessageDialog(vp, "Tanggal Tidak Boleh Kosong");
                vp.clean();
            }
             else if("".equals(bln))
            {
                JOptionPane.showMessageDialog(vp, "Bulan Tidak Boleh Kosong");
                vp.clean();
            }
             else if("".equals(thn))
            {
                JOptionPane.showMessageDialog(vp, "Tahun Tidak Boleh Kosong");
                vp.clean();
            }
             else {
                 int x1 = Integer.parseInt(harga);
                 int x2 = Integer.parseInt(ttl);
                 int x3 = Integer.parseInt(jml);
                 app.addPenerimaan(nama, tgl, x1, x3, x2);
                 
                 JOptionPane.showMessageDialog(vp, "Penerimaan Berhasil Disimpan");
                 
             }
        } else if (x.equals(vp.getBtnEdit())){
            
        }
    }
    
}
