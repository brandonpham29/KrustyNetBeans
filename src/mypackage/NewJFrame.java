/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mypackage;
import javax.swing.*;
import javax.swing.JOptionPane;
import java.sql.*;

/**
 *
 * @author brand
 */
public class NewJFrame extends javax.swing.JFrame {

    /**
     * Creates new form NewJFrame
     */
    DBSearch db = new DBSearch();
    DefaultListModel dm = new DefaultListModel(); //Krab patt, krustyb pizza
    DefaultListModel TotalOrder = new DefaultListModel(); //E1. E2
    DefaultListModel ItemList = new DefaultListModel();
    public void addToList(String name){
        dm.addElement(name);
        
        CartList.setModel(dm);
    }
    public NewJFrame() {
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

        jMenuItem1 = new javax.swing.JMenuItem();
        jMenuItem2 = new javax.swing.JMenuItem();
        jMenu1 = new javax.swing.JMenu();
        jButton1 = new javax.swing.JButton();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel2 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        jPanel5 = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        Combo1BTN = new javax.swing.JButton();
        Combo4BTN = new javax.swing.JButton();
        Combo2BTN = new javax.swing.JButton();
        Combo5BTN = new javax.swing.JButton();
        Combo3BTN = new javax.swing.JButton();
        Combo6BTN = new javax.swing.JButton();
        Combo7BTN = new javax.swing.JButton();
        Combo8BTN = new javax.swing.JButton();
        ComboListBTN = new javax.swing.JButton();
        jPanel6 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        CartList = new javax.swing.JList<>();
        jLabel1 = new javax.swing.JLabel();
        ClearCart = new javax.swing.JButton();
        SubmitOrder = new javax.swing.JButton();

        jMenuItem1.setText("jMenuItem1");

        jMenuItem2.setText("jMenuItem2");

        jMenu1.setText("jMenu1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jButton1.setText("Login");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 750, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 472, Short.MAX_VALUE)
        );

        jTabbedPane1.addTab("Entrees", jPanel2);

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 750, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 472, Short.MAX_VALUE)
        );

        jTabbedPane1.addTab("Sides", jPanel3);

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 750, Short.MAX_VALUE)
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 472, Short.MAX_VALUE)
        );

        jTabbedPane1.addTab("Drinks", jPanel4);

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 750, Short.MAX_VALUE)
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 472, Short.MAX_VALUE)
        );

        jTabbedPane1.addTab("Desserts", jPanel5);

        Combo1BTN.setText("Combo1");
        Combo1BTN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Combo1BTNActionPerformed(evt);
            }
        });

        Combo4BTN.setText("Combo4");
        Combo4BTN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Combo4BTNActionPerformed(evt);
            }
        });

        Combo2BTN.setText("Combo2");
        Combo2BTN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Combo2BTNActionPerformed(evt);
            }
        });

        Combo5BTN.setText("Combo5");
        Combo5BTN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Combo5BTNActionPerformed(evt);
            }
        });

        Combo3BTN.setText("Combo3");
        Combo3BTN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Combo3BTNActionPerformed(evt);
            }
        });

        Combo6BTN.setText("Combo6");
        Combo6BTN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Combo6BTNActionPerformed(evt);
            }
        });

        Combo7BTN.setText("Combo7");
        Combo7BTN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Combo7BTNActionPerformed(evt);
            }
        });

        Combo8BTN.setText("Combo8");
        Combo8BTN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Combo8BTNActionPerformed(evt);
            }
        });

        ComboListBTN.setText("Combos");
        ComboListBTN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ComboListBTNActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(ComboListBTN)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(Combo5BTN, javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(Combo1BTN)
                                .addGap(109, 109, 109)))
                        .addGap(24, 24, 24)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(Combo6BTN)
                            .addComponent(Combo2BTN))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 136, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(Combo3BTN)
                            .addComponent(Combo7BTN))
                        .addGap(105, 105, 105)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(Combo8BTN)
                            .addComponent(Combo4BTN))
                        .addGap(64, 64, 64))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(ComboListBTN)
                .addGap(107, 107, 107)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Combo4BTN)
                    .addComponent(Combo1BTN)
                    .addComponent(Combo2BTN)
                    .addComponent(Combo3BTN))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 103, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Combo5BTN)
                    .addComponent(Combo6BTN)
                    .addComponent(Combo7BTN)
                    .addComponent(Combo8BTN))
                .addGap(182, 182, 182))
        );

        jTabbedPane1.addTab("Combos", jPanel1);

        jScrollPane1.setViewportView(CartList);

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 194, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1)
                .addContainerGap())
        );

        jLabel1.setText("Cart");

        ClearCart.setText("Clear");
        ClearCart.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ClearCartActionPerformed(evt);
            }
        });

        SubmitOrder.setText("Submit Order");
        SubmitOrder.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SubmitOrderActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jButton1)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(ClearCart, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(SubmitOrder)))))
                .addGap(18, 18, 18)
                .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 755, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jButton1)
                .addGap(26, 26, 26)
                .addComponent(jLabel1)
                .addGap(3, 3, 3)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ClearCart)
                    .addComponent(SubmitOrder))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 500, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        dispose();
        FirstForm f = new FirstForm();
        f.setVisible(true);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void ClearCartActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ClearCartActionPerformed
        // TODO add your handling code here:
        dm.clear();
        CartList.setModel(dm);
    }//GEN-LAST:event_ClearCartActionPerformed

    private void SubmitOrderActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SubmitOrderActionPerformed
        
    }//GEN-LAST:event_SubmitOrderActionPerformed

    private void Combo8BTNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Combo8BTNActionPerformed
        // TODO add your handling code here:
        addToList(Combo8BTN.getText());
    }//GEN-LAST:event_Combo8BTNActionPerformed

    private void Combo7BTNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Combo7BTNActionPerformed
        // TODO add your handling code here:
        addToList(Combo7BTN.getText());
    }//GEN-LAST:event_Combo7BTNActionPerformed

    private void Combo6BTNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Combo6BTNActionPerformed
        // TODO add your handling code here:
        addToList(Combo6BTN.getText());
    }//GEN-LAST:event_Combo6BTNActionPerformed

    private void Combo3BTNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Combo3BTNActionPerformed
        // TODO add your handling code here:
        addToList(Combo3BTN.getText());
    }//GEN-LAST:event_Combo3BTNActionPerformed

    private void Combo5BTNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Combo5BTNActionPerformed
        // TODO add your handling code here:
        addToList(Combo5BTN.getText());
    }//GEN-LAST:event_Combo5BTNActionPerformed

    private void Combo2BTNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Combo2BTNActionPerformed
        // TODO add your handling code here:
        addToList(Combo2BTN.getText());
    }//GEN-LAST:event_Combo2BTNActionPerformed

    private void Combo4BTNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Combo4BTNActionPerformed
        // TODO add your handling code here:
        addToList(Combo4BTN.getText());
    }//GEN-LAST:event_Combo4BTNActionPerformed

    private void Combo1BTNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Combo1BTNActionPerformed
        // TODO add your handling code here:
        addToList(Combo1BTN.getText());
    }//GEN-LAST:event_Combo1BTNActionPerformed

    private void ComboListBTNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ComboListBTNActionPerformed
        // TODO add your handling code here:
        ResultSet result = db.query("SELECT * FROM public.\"Combos\"");
        ItemList.clear();
        try {
            while(result.next()){
                ItemList.addElement(result.getString("Name"));
            }
            //CartList.setModel(ItemList);
            for(int i = 0; i < 7; i++){
                String num = Integer.toString(i+1);
                String comboName = "Combo" + num + "BTN";
                //comboName.setText(ItemList[i]);
            }
        } catch(Exception e){
            JOptionPane.showMessageDialog(null, "Query Error");
        }
    }//GEN-LAST:event_ComboListBTNActionPerformed

    
    
    
    
    
    
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
            java.util.logging.Logger.getLogger(NewJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(NewJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(NewJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(NewJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
   
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new NewJFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JList<String> CartList;
    private javax.swing.JButton ClearCart;
    private javax.swing.JButton Combo1BTN;
    private javax.swing.JButton Combo2BTN;
    private javax.swing.JButton Combo3BTN;
    private javax.swing.JButton Combo4BTN;
    private javax.swing.JButton Combo5BTN;
    private javax.swing.JButton Combo6BTN;
    private javax.swing.JButton Combo7BTN;
    private javax.swing.JButton Combo8BTN;
    private javax.swing.JButton ComboListBTN;
    private javax.swing.JButton SubmitOrder;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTabbedPane jTabbedPane1;
    // End of variables declaration//GEN-END:variables
}
