/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ffos.ribaribigrizerep.view;

/**
 *
 * @author anja0
 */
public class Izbornik extends javax.swing.JFrame {

    /**
     * Creates new form Izbornik
     */
    public Izbornik() {
        initComponents();
        setTitle("Riba Ribi Grize Rep");
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnRiba = new javax.swing.JButton();
        btnRibar = new javax.swing.JButton();
        btnRibnjak = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        btnRiba.setText("Riba");
        btnRiba.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRibaActionPerformed(evt);
            }
        });

        btnRibar.setText("Ribar");
        btnRibar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRibarActionPerformed(evt);
            }
        });

        btnRibnjak.setText("Ribnjak");
        btnRibnjak.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRibnjakActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(57, 57, 57)
                .addComponent(btnRiba)
                .addGap(28, 28, 28)
                .addComponent(btnRibar)
                .addGap(35, 35, 35)
                .addComponent(btnRibnjak)
                .addContainerGap(85, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(88, 88, 88)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnRiba)
                    .addComponent(btnRibar)
                    .addComponent(btnRibnjak))
                .addContainerGap(187, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnRibaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRibaActionPerformed
         new FormaRiba().setVisible(true);

    }//GEN-LAST:event_btnRibaActionPerformed

    private void btnRibarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRibarActionPerformed
        new FormaRibar().setVisible(true);

    }//GEN-LAST:event_btnRibarActionPerformed

    private void btnRibnjakActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRibnjakActionPerformed
         new FormaRibnjak().setVisible(true);
    }//GEN-LAST:event_btnRibnjakActionPerformed

    /**
     * @param args the command line arguments
     */
  
   
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnRiba;
    private javax.swing.JButton btnRibar;
    private javax.swing.JButton btnRibnjak;
    // End of variables declaration//GEN-END:variables
}
