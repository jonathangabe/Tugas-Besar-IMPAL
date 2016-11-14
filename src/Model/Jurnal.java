/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import java.util.ArrayList;

/**
 *
 * @author UPC
 */
public class Jurnal {
    private int idJurnal;
    private float debit,kredit;
    private String keterangan;

    public Jurnal(float debit, float kredit, String keterangan) {
        this.debit = debit;
        this.kredit = kredit;
        this.keterangan = keterangan;
    }

    public Jurnal(int idJurnal, float debit, float kredit, String keterangan) {
        this.idJurnal = idJurnal;
        this.debit = debit;
        this.kredit = kredit;
        this.keterangan = keterangan;
    }

    public int getIdJurnal() {
        return idJurnal;
    }

    public void setIdJurnal(int idJurnal) {
        this.idJurnal = idJurnal;
    }

    public float getDebit() {
        return debit;
    }

    public void setDebit(float debit) {
        this.debit = debit;
    }

    public float getKredit() {
        return kredit;
    }

    public void setKredit(float kredit) {
        this.kredit = kredit;
    }

    public String getKeterangan() {
        return keterangan;
    }

    public void setKeterangan(String keterangan) {
        this.keterangan = keterangan;
    }
}
