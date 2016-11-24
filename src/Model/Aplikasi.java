/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import Database.Database;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;
import javax.swing.JOptionPane;
/**
 *
 * @author UPC
 */
public class Aplikasi {
    private ArrayList<Bendahara> listBendahara;
    private ArrayList<ManajerKeuangan> listManajer;
    private ArrayList<TransaksiBelanja> listTransaksiBelanja;
    private ArrayList<TransaksiPenerimaan> listTransaksiPenerimaan;
    private ArrayList<Jurnal> listJurnal;
    private ArrayList<TutupBuku> listTutupBuku;
    private Database database;
    
    Scanner in = new Scanner(System.in);

    /*public Aplikasi(ArrayList<Bendahara> listBendahara, ArrayList<ManajerKeuangan> listManajer, ArrayList<TransaksiBelanja> listTransaksiBelanja, ArrayList<TransaksiPenerimaan> listTransaksiPenerimaan, ArrayList<Jurnal> listJurnal, ArrayList<TutupBuku> listTutupBuku, Database database) {
        this.listBendahara = listBendahara;
        this.listManajer = listManajer;
        this.listTransaksiBelanja = listTransaksiBelanja;
        this.listTransaksiPenerimaan = listTransaksiPenerimaan;
        this.listJurnal = listJurnal;
        this.listTutupBuku = listTutupBuku;
        this.database = database;
    }*/
    
    public void createBendahara(String nip, String nama, String username, String password, String jabatan){
        listBendahara.add(new Bendahara(nip,nama,username,password,jabatan) {});
    }
    
    public void createManajer(String nip, String nama, String username, String password, String jabatan){
        listManajer.add(new ManajerKeuangan(nip,nama,username,password,jabatan) {});
    }
    
    public void addBelanja(String nama, String tanggal, int harga, int jumlah, int total){
        listTransaksiBelanja.add(new TransaksiBelanja(nama, tanggal, harga, jumlah, total));
    }
    
    public void addPenerimaan(String nama, String tanggal, int harga, int jumlah, int total, int idPenerimaan){
        listTransaksiPenerimaan.add(new TransaksiPenerimaan(nama, tanggal, harga, jumlah, total, idPenerimaan));
    }
    
    public void addJurnal(int idJurnal, float debit, float kredit, String keterangan){
        listJurnal.add(new Jurnal(idJurnal, debit, kredit, keterangan));
    }
    
    public void addTutupBuku(int no, Date tanggal, long pengeluaranPerBulan, long pengeluaranPerTahun, long SaldoAwalTahun, long SaldoAkhirTahun){
        listTutupBuku.add(new TutupBuku(no, tanggal, pengeluaranPerBulan, pengeluaranPerTahun, SaldoAwalTahun, SaldoAkhirTahun));    
    }
    
    public void loadBelanja(){
        Object data;
        try {
            data = database.getObject("Belanja.dat");
            listTransaksiBelanja = (ArrayList<TransaksiBelanja>) data;
        }catch (FileNotFoundException e){
            JOptionPane.showMessageDialog(null, "error");
        }catch (IOException f){
            f. printStackTrace();
        }catch (ClassNotFoundException g){
            JOptionPane.showMessageDialog(null, "error");
            g.printStackTrace();
        }
        }
    
    public void loadPenerimaan(){
        Object data;
        try {
            data = database.getObject("Penerimaan.dat");
            listTransaksiPenerimaan = (ArrayList<TransaksiPenerimaan>) data;
        } catch (Exception e){
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
    }
    
    public void saveBelanja(){
        try{
            database.saveObject(listTransaksiBelanja, "Belanja.dat");
        } catch (Exception e){
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
    }
    
    public void savePenerimaan(){
        try {
            database.saveObject(listTransaksiPenerimaan, "Penerimaan.dat");
        } catch (Exception e){
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
    }
    
    public void loadJurnal(){
        Object data;
        try {
            data = database.getObject("Jurnal.dat");
            listJurnal = (ArrayList<Jurnal>) data;
        } catch (Exception e){
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
    }
    
    public void saveJurnal(){
        try{
            database.saveObject(listJurnal, "Jurnal.dat");
        } catch (Exception e){
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
    }
    
    public void loadTutupBuku(){
        Object data;
        try {
            data = database.getObject("TutupBuku.dat");
            listTutupBuku = (ArrayList<TutupBuku>) data;
        } catch (Exception e){
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
    }
    
    public void saveTutupBuku(){
        try{
            database.saveObject(listTutupBuku, "TutupBuku.dat");
        } catch (Exception e){
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
    }
    
    public boolean cekLoginBendahara (String username, String password){
        Boolean benar = false;
        for (Bendahara b :listBendahara){
            if(b.getUsername().equals(username)){
                if(b.getPassword().equals(password))
                    benar = true;
            }
        }
        return benar;
    }
    
    public boolean cekLoginManajer (String username, String password){
        Boolean benar = false;
        for (ManajerKeuangan m :listManajer){
            if(m.getUsername().equals(username)){
                if(m.getPassword().equals(password))
                    benar = true;
            }
        }
        return benar;
    }
    
    public Bendahara getBendahara(String username){
        for(Bendahara b :listBendahara){
            if(b.getUsername().equals(username)){
                return b;
            }
        }
        return null;
    }
    
    public ManajerKeuangan getManajer(String username){
        for(ManajerKeuangan m :listManajer){
            if(m.getUsername().equals(username)){
                return m;
            }
        }
        return null;
    }
    
    public ArrayList<Bendahara> getListBendahara(){
        return listBendahara;
    }
    
    public ArrayList<ManajerKeuangan> getListManajer(){
        return listManajer;
    }
    
    public ArrayList<TransaksiBelanja> getListBelanja(){
        return listTransaksiBelanja;
    }
    
    public ArrayList<TransaksiPenerimaan> getListPenerimaan(){
        return listTransaksiPenerimaan;
    }
    
    public ArrayList<Jurnal> getListJurnal(){
        return listJurnal;
    }
    
    public ArrayList<TutupBuku> getListTutupBuku(){
        return listTutupBuku;
    }
}
