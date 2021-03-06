/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.itwins.fournisseurproduit.views;

import com.itwins.fournisseurproduit.controllers.Controller;
import com.itwins.fournisseurproduit.models.Fournisseur;
import com.itwins.fournisseurproduit.models.Produit;
import com.itwins.fournisseurproduit.services.Service;
import java.util.List;
import java.util.Vector;
import javax.swing.ComboBoxModel;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.JTableHeader;
import javax.swing.table.TableModel;

/**
 *
 * @author elmouradiamine98
 */
public class MainView extends javax.swing.JFrame {

    Controller controller;
    Service service;
    int mode = 0;

    /**
     * Creates new form view
     */
    public MainView() {
        initComponents();
        controller = new Controller();
        service = new Service();

        updateTableProduit(1, -1);
        updateCombBoxFournisseur();
    }

    public void updateTableProduit(int processRequest, int idFourn) {
        mode = 0;
        List<Produit> produits = controller.processRequest(processRequest, idFourn);
        DefaultTableModel model = (DefaultTableModel) table.getModel();
        String header[] = {"id", "label", "prix", "id_fourn"};
        model.setColumnIdentifiers(header);
        
        int rowCount = model.getRowCount();
        //Remove rows one by one from the end of the table
        for (int i = rowCount - 1; i >= 0; i--) {
            model.removeRow(i);

        }

        for (Produit produit : produits) {
            model.addRow(produit.toVector());
        }
        

    }
    
  public void updateTableFournisseur(int processRequest) {
        mode = 1;
        List<Fournisseur> fournisseurs = controller.processRequest(processRequest, -1);
        DefaultTableModel model = (DefaultTableModel) table.getModel();
        String header[] = {"id", "nom", "ville"};
        model.setColumnIdentifiers(header);
        
        int rowCount = model.getRowCount();
        
        
        //Remove rows one by one from the end of the table
        for (int i = rowCount - 1; i >= 0; i--) {
            model.removeRow(i);

        }

        for (Fournisseur fournisseur : fournisseurs) {
            model.addRow(fournisseur.toVector());
        }
        

    }

 public void updateCombBoxFournisseur(){
     List<Fournisseur> fournisseurs = service.findAllFournisseur();
     DefaultComboBoxModel model = (DefaultComboBoxModel) fournisseurCB.getModel();
     
     for(int i=model.getSize()-1;i>=0;i--){
        model.removeElementAt(i);
}
    System.out.println("dude" + fournisseurs);
     
     for (Fournisseur fournisseur : fournisseurs) {
         model.addElement(fournisseur);
     }
        
        
     
 }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        idFournisseurTextField = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        table = new javax.swing.JTable();
        produitBtn = new javax.swing.JButton();
        AllProduitsBtn = new javax.swing.JButton();
        toutLesFournisseurs = new javax.swing.JButton();
        fournisseurCB = new javax.swing.JComboBox<>();
        jLabel2 = new javax.swing.JLabel();
        labelTextField = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        prixTextField = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        ajouterProduit = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        nomFournisseurTextField = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        villeFournisseurTextField = new javax.swing.JTextField();
        ajouterFournisseurBtn = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        supprimerBtn = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("id fournisseur");

        idFournisseurTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                idFournisseurTextFieldActionPerformed(evt);
            }
        });

        table.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "id", "description", "prix", "id_fourn"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.Integer.class, java.lang.Integer.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane1.setViewportView(table);

        produitBtn.setText("Produit");
        produitBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                produitBtnActionPerformed(evt);
            }
        });

        AllProduitsBtn.setText("Tous les produits");
        AllProduitsBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AllProduitsBtnActionPerformed(evt);
            }
        });

        toutLesFournisseurs.setText("Tous les fournisseurs");
        toutLesFournisseurs.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                toutLesFournisseursActionPerformed(evt);
            }
        });

        fournisseurCB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fournisseurCBActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("sansserif", 1, 24)); // NOI18N
        jLabel2.setText("Produit");

        labelTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                labelTextFieldActionPerformed(evt);
            }
        });

        jLabel3.setText("Label");

        jLabel4.setText("Prix");

        jLabel5.setText("Fournisseur");

        ajouterProduit.setText("Ajouter produit");
        ajouterProduit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ajouterProduitActionPerformed(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("sansserif", 1, 24)); // NOI18N
        jLabel7.setText("Fournisseur");

        jLabel8.setText("Nom");

        jLabel9.setText("Ville");

        ajouterFournisseurBtn.setText("Ajouter fournisseur");
        ajouterFournisseurBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ajouterFournisseurBtnActionPerformed(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("sansserif", 1, 24)); // NOI18N
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText("Gestion de produits");
        jLabel6.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        supprimerBtn.setText("Supprimer");
        supprimerBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                supprimerBtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(produitBtn, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 85, Short.MAX_VALUE)
                                    .addComponent(jLabel1)
                                    .addComponent(idFournisseurTextField, javax.swing.GroupLayout.Alignment.LEADING))
                                .addGap(18, 18, 18)
                                .addComponent(toutLesFournisseurs)
                                .addGap(18, 18, 18)
                                .addComponent(AllProduitsBtn))
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel3)
                                            .addComponent(jLabel4)
                                            .addComponent(jLabel5))
                                        .addGap(0, 0, Short.MAX_VALUE)))
                                .addGap(103, 103, 103))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(labelTextField, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(prixTextField, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(fournisseurCB, javax.swing.GroupLayout.Alignment.LEADING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(ajouterProduit, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(jLabel8)
                                .addComponent(jLabel9)
                                .addComponent(villeFournisseurTextField)
                                .addComponent(ajouterFournisseurBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(nomFournisseurTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(75, 75, 75))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(271, 271, 271)
                        .addComponent(jLabel6)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
            .addGroup(layout.createSequentialGroup()
                .addGap(161, 161, 161)
                .addComponent(supprimerBtn)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(jLabel7))
                        .addGap(308, 308, 308))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(idFournisseurTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(toutLesFournisseurs)
                            .addComponent(AllProduitsBtn))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(produitBtn)
                        .addGap(11, 11, 11)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel3)
                                    .addComponent(jLabel8))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(labelTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(nomFournisseurTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                            .addComponent(jLabel4)
                                            .addComponent(jLabel9))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(prixTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(21, 21, 21)
                                        .addComponent(villeFournisseurTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(6, 6, 6)
                                .addComponent(jLabel5)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(fournisseurCB, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(ajouterProduit)
                                    .addComponent(ajouterFournisseurBtn)))
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 222, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(supprimerBtn)
                        .addGap(10, 10, 10))))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void produitBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_produitBtnActionPerformed
        updateTableProduit(2, Integer.parseInt(idFournisseurTextField.getText()));
    }//GEN-LAST:event_produitBtnActionPerformed

    private void AllProduitsBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AllProduitsBtnActionPerformed
        updateTableProduit(1, -1);
        
    }//GEN-LAST:event_AllProduitsBtnActionPerformed

    private void toutLesFournisseursActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_toutLesFournisseursActionPerformed
        updateTableFournisseur(3);
    }//GEN-LAST:event_toutLesFournisseursActionPerformed

    private void labelTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_labelTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_labelTextFieldActionPerformed

    private void fournisseurCBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fournisseurCBActionPerformed
        Fournisseur fournisseurSelected = (Fournisseur ) fournisseurCB.getSelectedItem();
        System.out.println(fournisseurSelected.getId());
        
    }//GEN-LAST:event_fournisseurCBActionPerformed

    private void ajouterProduitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ajouterProduitActionPerformed
        Fournisseur fournisseurSelected = (Fournisseur ) fournisseurCB.getSelectedItem();
        String description = labelTextField.getText();
        int prix = Integer.parseInt(prixTextField.getText());
        int idFourn = fournisseurSelected.getId();
        controller.processRequest(4, description,prix,idFourn);
        JOptionPane.showMessageDialog(null,"Produit a été ajouté avec succès.","Information",1);
        updateTableProduit(1, -1);
        labelTextField.setText("");
        prixTextField.setText("");
        

    }//GEN-LAST:event_ajouterProduitActionPerformed

    private void ajouterFournisseurBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ajouterFournisseurBtnActionPerformed
        String nom = nomFournisseurTextField.getText();
        String ville = villeFournisseurTextField.getText();
        controller.processRequest(5,nom,ville);
        JOptionPane.showMessageDialog(null,"Fournisseur a été ajouté avec succès.","Information",1);
        updateTableFournisseur(3);
        nomFournisseurTextField.setText("");
        villeFournisseurTextField.setText("");
        List<Fournisseur> fournisseurs = service.findAllFournisseur();
        Fournisseur fournisseur = fournisseurs.get(fournisseurs.size()-1);
        DefaultComboBoxModel model = (DefaultComboBoxModel) fournisseurCB.getModel();
        model.addElement(fournisseur);


    }//GEN-LAST:event_ajouterFournisseurBtnActionPerformed

    private void idFournisseurTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_idFournisseurTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_idFournisseurTextFieldActionPerformed

    private void supprimerBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_supprimerBtnActionPerformed
       int row = table.getSelectedRow();
       int value = Integer.parseInt(table.getModel().getValueAt(row, 0).toString());
       if (mode == 0){
           controller.processRequest(7, value);
            updateTableProduit(1, -1);
       } else {
           controller.processRequest(6,value);
                      updateTableFournisseur(3);

          
       }
       
    }//GEN-LAST:event_supprimerBtnActionPerformed

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
            java.util.logging.Logger.getLogger(MainView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainView().setVisible(true);

            }
        });

    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton AllProduitsBtn;
    private javax.swing.JButton ajouterFournisseurBtn;
    private javax.swing.JButton ajouterProduit;
    private javax.swing.JComboBox<String> fournisseurCB;
    private javax.swing.JTextField idFournisseurTextField;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField labelTextField;
    private javax.swing.JTextField nomFournisseurTextField;
    private javax.swing.JTextField prixTextField;
    private javax.swing.JButton produitBtn;
    private javax.swing.JButton supprimerBtn;
    private javax.swing.JTable table;
    private javax.swing.JButton toutLesFournisseurs;
    private javax.swing.JTextField villeFournisseurTextField;
    // End of variables declaration//GEN-END:variables

}
