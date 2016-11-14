/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import java.util.Date;

/**
 *
 * @author UPC
 */
public class TutupBuku {
    private int no;
    private Date tanggal;
    private long pengeluaranPerBulan,pengeluaranPerTahun,saldoAwalTahun,saldoAkhirTahun;

    public TutupBuku(int no, Date tanggal, long pengeluaranPerBulan, long pengeluaranPerTahun, long saldoAwalTahun, long saldoAkhirTahun) {
        this.no = no;
        this.tanggal = tanggal;
        this.pengeluaranPerBulan = pengeluaranPerBulan;
        this.pengeluaranPerTahun = pengeluaranPerTahun;
        this.saldoAwalTahun = saldoAwalTahun;
        this.saldoAkhirTahun = saldoAkhirTahun;
    }

    public int getNo() {
        return no;
    }

    public void setNo(int no) {
        this.no = no;
    }

    public Date getTanggal() {
        return tanggal;
    }

    public void setTanggal(Date tanggal) {
        this.tanggal = tanggal;
    }

    public long getPengeluaranPerBulan() {
        return pengeluaranPerBulan;
    }

    public void setPengeluaranPerBulan(long pengeluaranPerBulan) {
        this.pengeluaranPerBulan = pengeluaranPerBulan;
    }

    public long getPengeluaranPerTahun() {
        return pengeluaranPerTahun;
    }

    public void setPengeluaranPerTahun(long pengeluaranPerTahun) {
        this.pengeluaranPerTahun = pengeluaranPerTahun;
    }

    public long getSaldoAwalTahun() {
        return saldoAwalTahun;
    }

    public void setSaldoAwalTahun(long saldoAwalTahun) {
        this.saldoAwalTahun = saldoAwalTahun;
    }

    public long getSaldoAkhirTahun() {
        return saldoAkhirTahun;
    }

    public void setSaldoAkhirTahun(long saldoAkhirTahun) {
        this.saldoAkhirTahun = saldoAkhirTahun;
    }
    
    
}
