/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;


import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JOptionPane;
/**
 *
 * @author UPC
 */
public class ViewMenuManajer extends javax.swing.JFrame implements View {

    /**
     * Creates new form MenuManajer
     */
    public ViewMenuManajer() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        BtnPosting = new javax.swing.JButton();
        BtnTutupBuku = new javax.swing.JButton();
        BtnLogout = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        BtnPosting.setText("Posting");

        BtnTutupBuku.setText("Tutup Buku");

        BtnLogout.setText("Log out");

        jLabel1.setText("Menu Manajer");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(150, 150, 150)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(BtnLogout)
                        .addComponent(BtnTutupBuku)
                        .addComponent(BtnPosting))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(20, 20, 20)))
                .addGap(0, 162, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(55, 55, 55)
                .addComponent(BtnPosting)
                .addGap(50, 50, 50)
                .addComponent(BtnTutupBuku)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 66, Short.MAX_VALUE)
                .addComponent(BtnLogout)
                .addGap(35, 35, 35))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    /**
     * @param args the command line arguments
     */

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BtnLogout;
    private javax.swing.JButton BtnPosting;
    private javax.swing.JButton BtnTutupBuku;
    private javax.swing.JLabel jLabel1;
    // End of variables declaration//GEN-END:variables

    @Override
    public void addListener(ActionListener e) {
        BtnLogout.addActionListener(e);
        BtnPosting.addActionListener(e);
        BtnTutupBuku.addActionListener(e);
    }

    @Override
    public void viewErrorMsg(String errorMsg) {
        JOptionPane.showMessageDialog(this, errorMsg);
    }

    public Object getBtnLogout() {
        return BtnLogout;
    }

    public Object getBtnPosting() {
        return BtnPosting;
    }

    public Object getBtnTutupBuku() {
        return BtnTutupBuku;
    }
}
