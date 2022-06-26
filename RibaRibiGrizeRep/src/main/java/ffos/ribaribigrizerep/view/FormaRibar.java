/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ffos.ribaribigrizerep.view;

import ffos.ribaribigrizerep.controller.ObradaRiba;
import ffos.ribaribigrizerep.controller.ObradaRibar;
import ffos.ribaribigrizerep.model.Riba;
import ffos.ribaribigrizerep.model.Ribar;
import java.util.ArrayList;
import java.util.List;
import javax.swing.DefaultListModel;
import javax.swing.JOptionPane;

/**
 *
 * @author anja0
 */
public class FormaRibar extends javax.swing.JFrame implements ViewAktivnosti{

    private ObradaRibar obradaRibar;
    private ObradaRiba obradaRiba;
     
    public FormaRibar() {
        initComponents();
        setTitle("Riba ribi grize rep");
        obradaRibar = new ObradaRibar();
        obradaRiba = new ObradaRiba();
        ucitajPodatke();
        ucitajRibe();
    }
    
         @Override
             public void ucitajPodatke(){
            DefaultListModel<Ribar> rr = new DefaultListModel<>();
            rr.addAll(obradaRibar.read());
            lstEntiteti.setModel(rr);
            lstEntiteti.repaint();
    
    }
             
             // Da ti se ucitaju sve ribe iz baze na listu
           public void ucitajRibe() {
            DefaultListModel<Riba> rr = new DefaultListModel<>();
             rr.addAll(obradaRiba.read());
            lstRiba.setModel(rr);
            lstRiba.repaint();
    }
    
    

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        txtIme = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txtPrezime = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        lstEntiteti = new javax.swing.JList<>();
        jScrollPane2 = new javax.swing.JScrollPane();
        lstRibaroveRibe = new javax.swing.JList<>();
        btnDodaj = new javax.swing.JButton();
        btnObrisi = new javax.swing.JButton();
        jScrollPane3 = new javax.swing.JScrollPane();
        lstRiba = new javax.swing.JList<>();
        btnCreate = new javax.swing.JButton();
        btnUpdate = new javax.swing.JButton();
        btnDelete = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        txtIme.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtImeActionPerformed(evt);
            }
        });

        jLabel1.setText("Ime");

        jLabel2.setText("Prezime");

        lstEntiteti.addListSelectionListener(new javax.swing.event.ListSelectionListener() {
            public void valueChanged(javax.swing.event.ListSelectionEvent evt) {
                lstEntitetiValueChanged(evt);
            }
        });
        jScrollPane1.setViewportView(lstEntiteti);

        jScrollPane2.setViewportView(lstRibaroveRibe);

        btnDodaj.setText("<");
        btnDodaj.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDodajActionPerformed(evt);
            }
        });

        btnObrisi.setText(">");
        btnObrisi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnObrisiActionPerformed(evt);
            }
        });

        jScrollPane3.setViewportView(lstRiba);

        btnCreate.setText("Create");
        btnCreate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCreateActionPerformed(evt);
            }
        });

        btnUpdate.setText("Update");
        btnUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpdateActionPerformed(evt);
            }
        });

        btnDelete.setText("Delete");
        btnDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(47, 47, 47)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel2)
                    .addComponent(jLabel1)
                    .addComponent(txtIme)
                    .addComponent(txtPrezime, javax.swing.GroupLayout.DEFAULT_SIZE, 110, Short.MAX_VALUE))
                .addGap(51, 51, 51)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnDodaj)
                    .addComponent(btnObrisi))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 176, Short.MAX_VALUE)
                .addGap(24, 24, 24))
            .addGroup(layout.createSequentialGroup()
                .addGap(199, 199, 199)
                .addComponent(btnCreate)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnUpdate)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnDelete)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(98, 98, 98)
                        .addComponent(btnDodaj)
                        .addGap(49, 49, 49)
                        .addComponent(btnObrisi))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(55, 55, 55)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 235, Short.MAX_VALUE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(txtIme, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel2)
                                .addGap(18, 18, 18)
                                .addComponent(txtPrezime, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jScrollPane2)
                            .addComponent(jScrollPane3))))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnCreate)
                    .addComponent(btnUpdate)
                    .addComponent(btnDelete))
                .addContainerGap(33, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtImeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtImeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtImeActionPerformed

    private void lstEntitetiValueChanged(javax.swing.event.ListSelectionEvent evt) {//GEN-FIRST:event_lstEntitetiValueChanged
    if(evt.getValueIsAdjusting() || lstEntiteti.getSelectedValue() == null){
            return;
        }
        obradaRibar.setEntitet(lstEntiteti.getSelectedValue());
        txtIme.setText(lstEntiteti.getSelectedValue().getIme());
        
        DefaultListModel<Riba> rr = new DefaultListModel<>();
        if (lstEntiteti.getSelectedValue().getRiba()!= null) {
            rr.addAll(lstEntiteti.getSelectedValue().getRiba());
        }
        lstRibaroveRibe.setModel(rr);
        lstRibaroveRibe.repaint();
        txtPrezime.setText(lstEntiteti.getSelectedValue().getPrezime());    }//GEN-LAST:event_lstEntitetiValueChanged

    private void btnDodajActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDodajActionPerformed
        DefaultListModel<Riba> rr;
        if(lstEntiteti.getSelectedValue() == null){
            return;
        }
        if (lstEntiteti.getSelectedValue().getRiba()!= null) {
            rr = (DefaultListModel<Riba>) lstRibaroveRibe.getModel();
        } else {
            rr = new DefaultListModel<>();
            lstRibaroveRibe.setModel(rr);
        }

        if (lstEntiteti.getSelectedValue().getRiba()== null) {
            lstEntiteti.getSelectedValue().setRiba(new ArrayList<>());
        }
        for (Riba r : lstRiba.getSelectedValuesList()) {
            if (!ribaNaRibaru(rr, r)) {
                rr.addElement(r);
            }
        }
        lstRibaroveRibe.repaint();        // TODO add your handling code here:
    }//GEN-LAST:event_btnDodajActionPerformed

    private void btnObrisiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnObrisiActionPerformed
        DefaultListModel<Riba> rr = (DefaultListModel<Riba>) lstRibaroveRibe.getModel();
        for (Riba r : lstRiba.getSelectedValuesList()) {
            rr.removeElement(r);
        }

        lstRibaroveRibe.repaint();
        lstRiba.repaint();
    }//GEN-LAST:event_btnObrisiActionPerformed

    private void btnCreateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCreateActionPerformed
        obradaRibar.setNew();
        List<Riba> riba = new ArrayList<>();
        for(int i = 0; i < lstRibaroveRibe.getModel().getSize(); i++) {
            riba.add(lstRibaroveRibe.getModel().getElementAt(i));
        }
        obradaRibar.setPodaci(txtIme.getText(), txtPrezime.getText(), riba);
        try {
            obradaRibar.create();
            ucitajPodatke();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(rootPane, e.getMessage());}    }//GEN-LAST:event_btnCreateActionPerformed

    private void btnUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdateActionPerformed
    if (lstEntiteti.getSelectedValue() == null) {
            return;
        }
        obradaRibar.setEntitet(lstEntiteti.getSelectedValue());
        List<Riba> riba = new ArrayList<>();
        for(int i = 0; i < lstRibaroveRibe.getModel().getSize(); i++) {
            riba.add(lstRibaroveRibe.getModel().getElementAt(i));
        }
        obradaRibar.setPodaci(txtIme.getText(), txtPrezime.getText(), riba);
        try {
            obradaRibar.update();
            ucitajPodatke();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(rootPane, e.getMessage());
        }
    }//GEN-LAST:event_btnUpdateActionPerformed

    private void btnDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteActionPerformed
        if (lstEntiteti.getSelectedValue() == null) {
            return;
        }
        obradaRibar.setEntitet(lstEntiteti.getSelectedValue());
        try {
            obradaRibar.delete();
            ucitajPodatke();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(rootPane, e.getMessage());
        }    }//GEN-LAST:event_btnDeleteActionPerformed

    private boolean ribaNaRibaru(DefaultListModel<Riba> rr, Riba r) {
        for (int i = 0; i < rr.size(); i++) {
            if (rr.get(i).getSifra() == r.getSifra()) {
                return true;
            }
        }
        return false;
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCreate;
    private javax.swing.JButton btnDelete;
    private javax.swing.JButton btnDodaj;
    private javax.swing.JButton btnObrisi;
    private javax.swing.JButton btnUpdate;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JList<Ribar> lstEntiteti;
    private javax.swing.JList<Riba> lstRiba;
    private javax.swing.JList<Riba> lstRibaroveRibe;
    private javax.swing.JTextField txtIme;
    private javax.swing.JTextField txtPrezime;
    // End of variables declaration//GEN-END:variables

 
}
