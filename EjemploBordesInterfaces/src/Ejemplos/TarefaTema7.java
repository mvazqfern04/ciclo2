/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Ejemplos;

import java.awt.CardLayout;

/**
 *
 * @author node
 */
public class TarefaTema7 extends javax.swing.JFrame {

    /**
     * Creates new form TarefaTema7
     */
    public TarefaTema7() {
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

        buttonGroup1 = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        panelcard = new javax.swing.JPanel();
        panelflow = new javax.swing.JPanel();
        jButton5 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jButton7 = new javax.swing.JButton();
        jButton8 = new javax.swing.JButton();
        panelbox = new javax.swing.JPanel();
        jButton9 = new javax.swing.JButton();
        filler1 = new javax.swing.Box.Filler(new java.awt.Dimension(10, 0), new java.awt.Dimension(10, 0), new java.awt.Dimension(10, 32767));
        jButton10 = new javax.swing.JButton();
        filler2 = new javax.swing.Box.Filler(new java.awt.Dimension(10, 0), new java.awt.Dimension(10, 0), new java.awt.Dimension(10, 32767));
        jTextField1 = new javax.swing.JTextField();
        filler3 = new javax.swing.Box.Filler(new java.awt.Dimension(10, 0), new java.awt.Dimension(10, 0), new java.awt.Dimension(10, 32767));
        jButton11 = new javax.swing.JButton();
        panelgrid = new javax.swing.JPanel();
        jButton12 = new javax.swing.JButton();
        jButton13 = new javax.swing.JButton();
        jButton14 = new javax.swing.JButton();
        jButton15 = new javax.swing.JButton();
        jButton16 = new javax.swing.JButton();
        jButton17 = new javax.swing.JButton();
        jButton18 = new javax.swing.JButton();
        jButton19 = new javax.swing.JButton();
        jButton20 = new javax.swing.JButton();
        panelnull = new javax.swing.JPanel();
        jButton21 = new javax.swing.JButton();
        jTextField2 = new javax.swing.JTextField();
        jButton22 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(100, 100));
        setPreferredSize(new java.awt.Dimension(459, 325));

        jPanel1.setBackground(new java.awt.Color(204, 255, 204));
        jPanel1.setMinimumSize(new java.awt.Dimension(100, 100));
        jPanel1.setPreferredSize(new java.awt.Dimension(150, 300));
        jPanel1.setLayout(new java.awt.BorderLayout());

        jPanel3.setBackground(new java.awt.Color(204, 255, 204));
        jPanel3.setMinimumSize(new java.awt.Dimension(100, 100));
        jPanel3.setPreferredSize(new java.awt.Dimension(80, 78));
        jPanel3.setLayout(new java.awt.GridLayout(4, 0, 10, 10));

        jButton1.setText("FlowLayout");
        jButton1.setAlignmentX(0.5F);
        jButton1.setAlignmentY(1.0F);
        jButton1.setMaximumSize(new java.awt.Dimension(1000, 1000));
        jButton1.setPreferredSize(new java.awt.Dimension(130, 50));
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel3.add(jButton1);

        jButton2.setText("BoxLayout");
        jButton2.setAlignmentX(0.5F);
        jButton2.setAlignmentY(1.0F);
        jButton2.setMaximumSize(new java.awt.Dimension(1000, 10000));
        jButton2.setPreferredSize(new java.awt.Dimension(130, 50));
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel3.add(jButton2);

        jButton3.setText("GridLayout");
        jButton3.setAlignmentX(0.5F);
        jButton3.setAlignmentY(1.0F);
        jButton3.setMaximumSize(new java.awt.Dimension(10000, 10000));
        jButton3.setPreferredSize(new java.awt.Dimension(130, 50));
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jPanel3.add(jButton3);

        jButton4.setText("NullLayout");
        jButton4.setAlignmentX(0.5F);
        jButton4.setAlignmentY(1.0F);
        jButton4.setPreferredSize(new java.awt.Dimension(130, 50));
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        jPanel3.add(jButton4);

        jPanel1.add(jPanel3, java.awt.BorderLayout.CENTER);

        getContentPane().add(jPanel1, java.awt.BorderLayout.LINE_START);

        panelcard.setBackground(new java.awt.Color(204, 255, 255));
        panelcard.setForeground(new java.awt.Color(204, 255, 255));
        panelcard.setMinimumSize(new java.awt.Dimension(100, 100));
        panelcard.setLayout(new java.awt.CardLayout());

        panelflow.setBackground(new java.awt.Color(255, 204, 51));
        panelflow.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.CENTER, 50, 5));

        jButton5.setText("jButton5");
        panelflow.add(jButton5);

        jButton6.setText("jButton6");
        panelflow.add(jButton6);

        jButton7.setText("jButton7");
        panelflow.add(jButton7);

        jButton8.setText("jButton8");
        jButton8.setPreferredSize(new java.awt.Dimension(200, 20));
        panelflow.add(jButton8);

        panelcard.add(panelflow, "PANELFLOW");

        panelbox.setBackground(new java.awt.Color(255, 51, 102));
        panelbox.setLayout(new javax.swing.BoxLayout(panelbox, javax.swing.BoxLayout.LINE_AXIS));

        jButton9.setText("jButton9");
        panelbox.add(jButton9);
        panelbox.add(filler1);

        jButton10.setText("jButton10");
        panelbox.add(jButton10);
        panelbox.add(filler2);

        jTextField1.setText("jTextField1");
        jTextField1.setMaximumSize(new java.awt.Dimension(120, 22));
        jTextField1.setMinimumSize(new java.awt.Dimension(120, 22));
        panelbox.add(jTextField1);
        panelbox.add(filler3);

        jButton11.setText("jButton11");
        panelbox.add(jButton11);

        panelcard.add(panelbox, "PANELBOX");

        panelgrid.setBackground(new java.awt.Color(0, 204, 102));
        panelgrid.setLayout(new java.awt.GridLayout(3, 3, 10, 10));

        jButton12.setText("jButton12");
        panelgrid.add(jButton12);

        jButton13.setText("jButton13");
        panelgrid.add(jButton13);

        jButton14.setText("jButton14");
        panelgrid.add(jButton14);

        jButton15.setText("jButton15");
        panelgrid.add(jButton15);

        jButton16.setText("jButton16");
        panelgrid.add(jButton16);

        jButton17.setText("jButton17");
        panelgrid.add(jButton17);

        jButton18.setText("jButton18");
        panelgrid.add(jButton18);

        jButton19.setText("jButton19");
        panelgrid.add(jButton19);

        jButton20.setText("jButton20");
        panelgrid.add(jButton20);

        panelcard.add(panelgrid, "PANELGRID");

        panelnull.setBackground(new java.awt.Color(204, 204, 255));

        jButton21.setText("jButton21");

        jTextField2.setText("jTextField2");

        jButton22.setText("jButton22");

        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jScrollPane1.setViewportView(jTextArea1);

        javax.swing.GroupLayout panelnullLayout = new javax.swing.GroupLayout(panelnull);
        panelnull.setLayout(panelnullLayout);
        panelnullLayout.setHorizontalGroup(
            panelnullLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelnullLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelnullLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jScrollPane1)
                    .addGroup(panelnullLayout.createSequentialGroup()
                        .addComponent(jButton21)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, 174, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jButton22)))
                .addContainerGap(20, Short.MAX_VALUE))
        );
        panelnullLayout.setVerticalGroup(
            panelnullLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelnullLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelnullLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton21)
                    .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton22))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(62, Short.MAX_VALUE))
        );

        panelcard.add(panelnull, "PANELNULL");

        getContentPane().add(panelcard, java.awt.BorderLayout.CENTER);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
        CardLayout paneis = (CardLayout) this.panelcard.getLayout();
        paneis.show(this.panelcard, "PANELGRID");
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        CardLayout paneis = (CardLayout) this.panelcard.getLayout();
        paneis.show(this.panelcard, "PANELBOX");
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        CardLayout paneis = (CardLayout) this.panelcard.getLayout();
        paneis.show(this.panelcard, "PANELFLOW");
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // TODO add your handling code here:
        CardLayout paneis = (CardLayout) this.panelcard.getLayout();
        paneis.show(this.panelcard, "PANELNULL");
    }//GEN-LAST:event_jButton4ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(TarefaTema7.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TarefaTema7.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TarefaTema7.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TarefaTema7.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TarefaTema7().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.Box.Filler filler1;
    private javax.swing.Box.Filler filler2;
    private javax.swing.Box.Filler filler3;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton10;
    private javax.swing.JButton jButton11;
    private javax.swing.JButton jButton12;
    private javax.swing.JButton jButton13;
    private javax.swing.JButton jButton14;
    private javax.swing.JButton jButton15;
    private javax.swing.JButton jButton16;
    private javax.swing.JButton jButton17;
    private javax.swing.JButton jButton18;
    private javax.swing.JButton jButton19;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton20;
    private javax.swing.JButton jButton21;
    private javax.swing.JButton jButton22;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton8;
    private javax.swing.JButton jButton9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JPanel panelbox;
    private javax.swing.JPanel panelcard;
    private javax.swing.JPanel panelflow;
    private javax.swing.JPanel panelgrid;
    private javax.swing.JPanel panelnull;
    // End of variables declaration//GEN-END:variables
}