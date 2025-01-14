/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ffos.view;

import ffos.controller.ObradaMjesto;
import ffos.controller.ObradaOsoba;
import ffos.controller.ObradaRacunalo;
import ffos.model.Mjesto;
import ffos.model.Osoba;
import ffos.model.Racunalo;
import java.util.ArrayList;
import java.util.List;
import javax.swing.DefaultComboBoxModel;
import javax.swing.DefaultListModel;
import javax.swing.JOptionPane;

/**
 *
 * @author Korisnik
 */
public class FormaOsoba extends javax.swing.JFrame implements ViewAktivnosti{

    private ObradaOsoba obrada;
    
    /**
     * Creates new form FormaOsoba
     */
    public FormaOsoba() {
        initComponents();
        obrada = new ObradaOsoba();
        ucitajPodatke();
        DefaultComboBoxModel<Mjesto> m = new DefaultComboBoxModel<>();
        m.addAll(new ObradaMjesto().read());
        cmbMjesta.setModel(m);
        cmbMjesta.repaint();
        
        DefaultListModel<Racunalo> mr = new DefaultListModel<>();
        mr.addAll(new ObradaRacunalo().read());
        lstRacunalaUBazi.setModel(mr);
        lstRacunalaUBazi.repaint();
        
        lstRacunalaOsobe.setModel(new DefaultListModel<>());
        
   
    }

    @Override
    public void ucitajPodatke() {
        DefaultListModel<Osoba> m = new DefaultListModel<>();
        m.addAll(obrada.read());
        lstEntiteti.setModel(m);
        lstEntiteti.repaint();
    }

    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        lstEntiteti = new javax.swing.JList<>();
        jLabel1 = new javax.swing.JLabel();
        txtime = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        txtPrezime = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        cmbMjesta = new javax.swing.JComboBox<>();
        jLabel4 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        lstRacunalaOsobe = new javax.swing.JList<>();
        jLabel5 = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        lstRacunalaUBazi = new javax.swing.JList<>();
        btnDodajRacunalo = new javax.swing.JButton();
        btnObrisiRacunalo = new javax.swing.JButton();
        btnKreiraj = new javax.swing.JButton();
        btnPromjeni = new javax.swing.JButton();
        btnObrisi = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        lstEntiteti.addListSelectionListener(new javax.swing.event.ListSelectionListener() {
            public void valueChanged(javax.swing.event.ListSelectionEvent evt) {
                lstEntitetiValueChanged(evt);
            }
        });
        jScrollPane1.setViewportView(lstEntiteti);

        jLabel1.setText("Ime");

        jLabel2.setText("Prezime");

        jLabel3.setText("Mjesto");

        jLabel4.setText("Računala osobe");

        jScrollPane2.setViewportView(lstRacunalaOsobe);

        jLabel5.setText("Računala u bazi");

        jScrollPane3.setViewportView(lstRacunalaUBazi);

        btnDodajRacunalo.setText("<");
        btnDodajRacunalo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDodajRacunaloActionPerformed(evt);
            }
        });

        btnObrisiRacunalo.setText(">");
        btnObrisiRacunalo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnObrisiRacunaloActionPerformed(evt);
            }
        });

        btnKreiraj.setText("Kreiraj");
        btnKreiraj.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnKreirajActionPerformed(evt);
            }
        });

        btnPromjeni.setText("Promjeni");
        btnPromjeni.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPromjeniActionPerformed(evt);
            }
        });

        btnObrisi.setText("Obriši");
        btnObrisi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnObrisiActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtime)
                            .addComponent(txtPrezime, javax.swing.GroupLayout.DEFAULT_SIZE, 164, Short.MAX_VALUE)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cmbMjesta, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(31, 31, 31)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(btnObrisi, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 14, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(btnDodajRacunalo, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(btnObrisiRacunalo, javax.swing.GroupLayout.Alignment.TRAILING))))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(28, 28, 28))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(26, 26, 26)
                        .addComponent(btnKreiraj, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(34, 34, 34)
                        .addComponent(btnPromjeni, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane1)
                        .addContainerGap())
                    .addGroup(layout.createSequentialGroup()
                        .addGap(11, 11, 11)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel5)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(38, 38, 38)
                                        .addComponent(btnDodajRacunalo)
                                        .addGap(37, 37, 37)
                                        .addComponent(btnObrisiRacunalo))))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel1)
                                    .addComponent(jLabel4))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(txtime, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(jLabel2)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(txtPrezime, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(jLabel3)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(cmbMjesta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(jScrollPane2))))
                        .addGap(46, 46, 46)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnKreiraj)
                            .addComponent(btnPromjeni)
                            .addComponent(btnObrisi))
                        .addContainerGap(46, Short.MAX_VALUE))))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnDodajRacunaloActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDodajRacunaloActionPerformed
        if(lstRacunalaUBazi.getSelectedValue()==null){
        return;
        }
            
       
        
        ((DefaultListModel<Racunalo>)
                    lstRacunalaUBazi
                .getModel()
                ).addElement(
                lstRacunalaUBazi.getSelectedValue()
                );
                lstRacunalaOsobe.repaint();
    }//GEN-LAST:event_btnDodajRacunaloActionPerformed

    private void btnObrisiRacunaloActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnObrisiRacunaloActionPerformed
        if(lstRacunalaOsobe.getSelectedValue()==null){
        return;
    }//GEN-LAST:event_btnObrisiRacunaloActionPerformed

        ((DefaultListModel<Racunalo>)lstRacunalaOsobe.getModel()).removeElement(lstRacunalaOsobe.getSelectedValue());
    lstRacunalaOsobe.repaint();
    
    }
    
    private void btnKreirajActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnKreirajActionPerformed
        obrada.setNew();
        List<Racunalo> racunala = new ArrayList<>();
        DefaultListModel<Racunalo> m = (DefaultListModel<Racunalo>) lstRacunalaOsobe.getModel();
        for(int i=0;i<m.size();i++){
        racunala.add(m.get(i));
        }
        obrada.setPodaci(txtime.getText(),
                txtPrezime.getText(),
                (Mjesto)cmbMjesta.getSelectedItem(), racunala);
        try {
            obrada.create();
            ucitajPodatke();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(rootPane, e.getMessage());
        }
    }//GEN-LAST:event_btnKreirajActionPerformed

    private void lstEntitetiValueChanged(javax.swing.event.ListSelectionEvent evt) {//GEN-FIRST:event_lstEntitetiValueChanged
       if(evt.getValueIsAdjusting() || lstEntiteti.getSelectedValue()==null){
       return;
       }
       
       var e = lstEntiteti.getSelectedValue();
       txtime.setText(e.getIme());
       txtPrezime.setText(e.getPrezime());
       cmbMjesta.setSelectedItem(e.getMjesto());
       DefaultListModel<Racunalo> m = new DefaultListModel<>();
       m.addAll(e.getRacunala());
       lstRacunalaOsobe.setModel(m);
       lstRacunalaOsobe.repaint();
    }//GEN-LAST:event_lstEntitetiValueChanged

    private void btnPromjeniActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPromjeniActionPerformed
        if(lstEntiteti.getSelectedValue()==null){
        return;
        }
        var e = lstEntiteti.getSelectedValue();
        obrada.setEntitet(e);
        List<Racunalo> racunala = new ArrayList<>();
        DefaultListModel<Racunalo> m = (DefaultListModel<Racunalo>) lstRacunalaOsobe.getModel();
        for(int i=0;i<m.size();i++){
        racunala.add(m.get(i));
        }
        obrada.setPodaci(txtime.getText(),
                txtPrezime.getText(),
                (Mjesto)cmbMjesta.getSelectedItem(), racunala);
        try {
            obrada.update();
            ucitajPodatke();
        } catch (Exception ex) {
        JOptionPane.showMessageDialog(rootPane, ex.getMessage());
        }
    }//GEN-LAST:event_btnPromjeniActionPerformed

    private void btnObrisiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnObrisiActionPerformed
        if(lstEntiteti.getSelectedValue()==null){
        return;
        }
        var e = lstEntiteti.getSelectedValue();
        obrada.setEntitet(e);
        try {
            obrada.delete();
            ucitajPodatke();
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(rootPane, ex.getMessage());
        }
    }//GEN-LAST:event_btnObrisiActionPerformed
    
    
   

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnDodajRacunalo;
    private javax.swing.JButton btnKreiraj;
    private javax.swing.JButton btnObrisi;
    private javax.swing.JButton btnObrisiRacunalo;
    private javax.swing.JButton btnPromjeni;
    private javax.swing.JComboBox<Mjesto> cmbMjesta;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JList<Osoba> lstEntiteti;
    private javax.swing.JList<Racunalo> lstRacunalaOsobe;
    private javax.swing.JList<Racunalo> lstRacunalaUBazi;
    private javax.swing.JTextField txtPrezime;
    private javax.swing.JTextField txtime;
    // End of variables declaration//GEN-END:variables
}
