/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JDialog.java to edit this template
 */
package irrgarten.UI;

import irrgarten.Directions;
import javax.swing.JDialog;
import javax.swing.JFrame;
        

/**
 *
 * @author egalv
 */
public class Cursors extends JDialog {
    private Directions dir;
    /**
     * Creates new form Cursors
     */
    public Cursors(JFrame parent, boolean modal) {
        super(parent, modal);
        initComponents();
    }
    
    
    public Directions getDirection(){
        setVisible(true);
        return dir;
        
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        Arriba = new javax.swing.JButton();
        Derecha = new javax.swing.JButton();
        Abajo = new javax.swing.JButton();
        Izquierda = new javax.swing.JButton();

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 388, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 189, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        Arriba.setText("Arriba");
        Arriba.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ArribaActionPerformed(evt);
            }
        });

        Derecha.setText("Derecha");
        Derecha.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DerechaActionPerformed(evt);
            }
        });

        Abajo.setText("Abajo");
        Abajo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AbajoActionPerformed(evt);
            }
        });

        Izquierda.setText("Izquierda");
        Izquierda.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                IzquierdaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addComponent(Izquierda, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 80, Short.MAX_VALUE)
                .addComponent(Derecha, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(21, 21, 21))
            .addGroup(layout.createSequentialGroup()
                .addGap(113, 113, 113)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Abajo, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Arriba, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(Arriba, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Derecha, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Izquierda, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(33, 33, 33)
                .addComponent(Abajo, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(45, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void ArribaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ArribaActionPerformed
        // TODO add your handling code here:
        dir = Directions.UP;
        dispose();
    }//GEN-LAST:event_ArribaActionPerformed

    private void DerechaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DerechaActionPerformed
        // TODO add your handling code here:
        dir = Directions.RIGHT;
        dispose();
    }//GEN-LAST:event_DerechaActionPerformed

    private void AbajoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AbajoActionPerformed
        // TODO add your handling code here:
        dir = Directions.DOWN;
        dispose();
    }//GEN-LAST:event_AbajoActionPerformed

    private void IzquierdaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_IzquierdaActionPerformed
        // TODO add your handling code here:
        dir = Directions.LEFT;
        dispose();
    }//GEN-LAST:event_IzquierdaActionPerformed


    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Abajo;
    private javax.swing.JButton Arriba;
    private javax.swing.JButton Derecha;
    private javax.swing.JButton Izquierda;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
