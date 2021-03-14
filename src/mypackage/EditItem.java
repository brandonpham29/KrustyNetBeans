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
 * @author braed
 */
public class EditItem extends javax.swing.JFrame {
        
    DBSearch db = new DBSearch();
    
    NewJFrame old_frame; 
    
    StringPair item_to_edit;
    Integer item_to_edit_index;
    
    StringPair leftCurrentSelectedItem = new StringPair("", "");
    StringPair rightCurrentSelectedItem = new StringPair("", "");
    
    DefaultListModel<String> AvailableIngredientsID = new DefaultListModel();
    DefaultListModel<String> YourItemID = new DefaultListModel();
    DefaultListModel<String> UnremovableIngredientsID = new DefaultListModel();
    DefaultListModel<String> AvailableIngredients = new DefaultListModel();
    DefaultListModel<String> YourItem = new DefaultListModel();
    DefaultListModel<String> UnremovableIngredients = new DefaultListModel();
    
    DefaultListModel<String> ItemsToAdd = new DefaultListModel(); 
    DefaultListModel<String> ItemsToRemove = new DefaultListModel(); 
    
    /**
     * Creates new form EditItem
     */
    
    
    public EditItem(StringPair currentItem, Integer index, NewJFrame a) {

        old_frame = a;
        
        item_to_edit = currentItem;
        item_to_edit_index = index;
        
        
//        item_to_edit.ID = item_to_edit.ID.split("+")[0];
//        item_to_edit.ID = item_to_edit.ID.split("-")[0];

        
        Integer plus_ID = item_to_edit.ID.indexOf("+");
        if (plus_ID >= 0) {
            item_to_edit.ID = item_to_edit.ID.substring(0, plus_ID);
        } else {
            Integer minus_ID = item_to_edit.ID.indexOf("-");
            if (minus_ID >= 0) {
                item_to_edit.ID = item_to_edit.ID.substring(0, minus_ID);
            }
        }

        ResultSet result = db.query("SELECT * FROM public.\"MenuItems\" WHERE \"ItemID\" = \'" + item_to_edit.ID + "\'");
        String DefaultIngredientsID = "";
        String BaseIngredientsID = "";
        String PermissibleIngredientsID = "";
        try {
            result.next();
            DefaultIngredientsID = result.getString("DefaultIngredients");
            BaseIngredientsID = result.getString("BaseIngredients");
            PermissibleIngredientsID = result.getString("PermissibleIngredients");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
        
        
//        JOptionPane.showMessageDialog(null, DefaultIngredients);
//        JOptionPane.showMessageDialog(null, BaseIngredients);
//        JOptionPane.showMessageDialog(null, PermissibleIngredients);
        
        
        DefaultIngredientsID = DefaultIngredientsID.substring(1,DefaultIngredientsID.length()-1);
        BaseIngredientsID = BaseIngredientsID.substring(1,BaseIngredientsID.length()-1);
        PermissibleIngredientsID = PermissibleIngredientsID.substring(1,PermissibleIngredientsID.length()-1);
        
        for (String i : DefaultIngredientsID.split(",")) {
            YourItemID.addElement(i);
        }
        for (String i : BaseIngredientsID.split(",")) {
            UnremovableIngredientsID.addElement(i);
        }
        for (String i : PermissibleIngredientsID.split(",")) {
            AvailableIngredientsID.addElement(i);
        }
        
        result = db.query("SELECT * FROM \"Ingredients\"");
        DefaultListModel<StringPair> IngredientNames = new DefaultListModel();
        
        String tempName;
        String tempID;
        try {
           while (result.next()) {
                tempName = result.getString("Name");
                tempID = String.valueOf(result.getInt("ID"));
                IngredientNames.addElement(new StringPair(tempID, tempName));
            } 
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
        
        
        for (int i = 0; i < YourItemID.size(); i++) {
            for (int j = 0; j < IngredientNames.size(); j++) {
                if (YourItemID.getElementAt(i).equals(IngredientNames.getElementAt(j).ID)) {
                    YourItem.addElement(IngredientNames.getElementAt(j).name);
                }
            }
        }
        for (int i = 0; i < AvailableIngredientsID.size(); i++) {
            for (int j = 0; j < IngredientNames.size(); j++) {
                if (AvailableIngredientsID.getElementAt(i).equals(IngredientNames.getElementAt(j).ID)) {
                    AvailableIngredients.addElement(IngredientNames.getElementAt(j).name);
                }
            }
        }
        for (int i = 0; i < UnremovableIngredientsID.size(); i++) {
            for (int j = 0; j < IngredientNames.size(); j++) {
                if (UnremovableIngredientsID.getElementAt(i).equals(IngredientNames.getElementAt(j).ID)) {
                    UnremovableIngredients.addElement(IngredientNames.getElementAt(j).name);
                }
            }
        }
                
        initComponents();
        
        YourItemList.setModel(YourItem);
        AvailableIngredientsList.setModel(AvailableIngredients);
        UnremovableIngredientsList.setModel(UnremovableIngredients);

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel3 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        AvailableIngredientsList = new javax.swing.JList<>();
        jScrollPane2 = new javax.swing.JScrollPane();
        YourItemList = new javax.swing.JList<>();
        AddBTN = new javax.swing.JButton();
        removeBTN = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        ConfirmBTN = new javax.swing.JButton();
        CancelBTN = new javax.swing.JButton();
        currentselecteditemLabel = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        UnremovableIngredientsList = new javax.swing.JList<>();
        jLabel4 = new javax.swing.JLabel();

        jLabel3.setText("jLabel3");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        AvailableIngredientsList.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        jScrollPane1.setViewportView(AvailableIngredientsList);

        YourItemList.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        jScrollPane2.setViewportView(YourItemList);

        AddBTN.setText("--> Add -->");
        AddBTN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AddBTNActionPerformed(evt);
            }
        });

        removeBTN.setText("<-- Remove <--");
        removeBTN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                removeBTNActionPerformed(evt);
            }
        });

        jLabel1.setText("Available Ingredients");

        jLabel2.setText("Your Item");

        ConfirmBTN.setText("Confirm");
        ConfirmBTN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ConfirmBTNActionPerformed(evt);
            }
        });

        CancelBTN.setText("Cancel");
        CancelBTN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CancelBTNActionPerformed(evt);
            }
        });

        currentselecteditemLabel.setText("currentselecteditem");

        UnremovableIngredientsList.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        jScrollPane3.setViewportView(UnremovableIngredientsList);

        jLabel4.setText("Unremovable Ingredients");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel1))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                            .addComponent(CancelBTN, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(ConfirmBTN, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(removeBTN, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(AddBTN, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(currentselecteditemLabel))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                            .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4)))
                    .addGroup(javax.swing.GroupLayout.Alignment.CENTER, layout.createSequentialGroup()
                        .addGap(417, 417, 417)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.Alignment.CENTER, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.CENTER))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(jLabel2))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 255, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 174, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(9, 9, 9))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(47, 47, 47)
                                .addComponent(currentselecteditemLabel)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(AddBTN)
                                .addGap(31, 31, 31)
                                .addComponent(removeBTN)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 60, Short.MAX_VALUE)))
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(ConfirmBTN)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(CancelBTN)))))
                .addGap(15, 15, 15))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void AddBTNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AddBTNActionPerformed
        if (AvailableIngredientsList.getSelectedIndex() < 0 ) {
            return;
        }
        
        YourItem.addElement(AvailableIngredientsList.getSelectedValue());
        ItemsToAdd.addElement(AvailableIngredientsList.getSelectedValue());
        YourItemList.setModel(YourItem);
    }//GEN-LAST:event_AddBTNActionPerformed

    private void removeBTNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_removeBTNActionPerformed
        if (YourItemList.getSelectedIndex() < 0 ) {
            return;
        }
        
        ItemsToRemove.addElement(YourItemList.getSelectedValue());
        YourItem.remove(YourItemList.getSelectedIndex());
        YourItemList.setModel(YourItem);
    }//GEN-LAST:event_removeBTNActionPerformed

    private void CancelBTNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CancelBTNActionPerformed
        dispose();
        old_frame.done_editing_item(null, null);
    }//GEN-LAST:event_CancelBTNActionPerformed

    private void ConfirmBTNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ConfirmBTNActionPerformed
        
        for (int i = 0; i < ItemsToAdd.size(); i++) {
            for (int j = 0; j < ItemsToRemove.size(); j++) {
                if (ItemsToAdd.getElementAt(i).equals(ItemsToRemove.getElementAt(j))) {
                    ItemsToAdd.remove(i);
                    ItemsToRemove.remove(j);
                    i--;
                    j--;
                }
            }
        }
        
        ResultSet result = db.query("SELECT * FROM \"Ingredients\"");
        DefaultListModel<StringPair> IngredientNames = new DefaultListModel();
        
        String tempName;
        String tempID;
        try {
           while (result.next()) {
                tempName = result.getString("Name");
                tempID = String.valueOf(result.getInt("ID"));
                IngredientNames.addElement(new StringPair(tempID, tempName));
            } 
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
        
        DefaultListModel<String> ItemsToAddID = new DefaultListModel();
        DefaultListModel<String> ItemsToRemoveID = new DefaultListModel();
        
        for (int i = 0; i < ItemsToAdd.size(); i++) {
            for (int j = 0; j < IngredientNames.size(); j++) {
                if (ItemsToAdd.getElementAt(i).equals(IngredientNames.getElementAt(j).name)) {
                    ItemsToAddID.addElement(IngredientNames.getElementAt(j).ID);
                }
            }
        }
        for (int i = 0; i < ItemsToRemove.size(); i++) {
            for (int j = 0; j < IngredientNames.size(); j++) {
                
                if (ItemsToRemove.getElementAt(i).equals(IngredientNames.getElementAt(j).name)) {
                    ItemsToRemoveID.addElement(IngredientNames.getElementAt(j).ID);
                }
            }
        }
        
        String finalItem = item_to_edit.ID;
        for (int i = 0; i < ItemsToAddID.size(); i++) {
            finalItem += "+" + ItemsToAddID.getElementAt(i);
        }
        for (int i = 0; i < ItemsToRemoveID.size(); i++) {
            finalItem += "-" + ItemsToRemoveID.getElementAt(i);
        }
        
        old_frame.done_editing_item(finalItem, item_to_edit_index);
        dispose();
    }//GEN-LAST:event_ConfirmBTNActionPerformed

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
            java.util.logging.Logger.getLogger(EditItem.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(EditItem.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(EditItem.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(EditItem.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new EditItem(null, null, null).setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton AddBTN;
    private javax.swing.JList<String> AvailableIngredientsList;
    private javax.swing.JButton CancelBTN;
    private javax.swing.JButton ConfirmBTN;
    private javax.swing.JList<String> UnremovableIngredientsList;
    private javax.swing.JList<String> YourItemList;
    private javax.swing.JLabel currentselecteditemLabel;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JButton removeBTN;
    // End of variables declaration//GEN-END:variables
}
