/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package userInterface.Provider;

/**
 *
 * @author Dsouza
 */
public class ProviderDashboard extends javax.swing.JPanel {

    /**
     * Creates new form ProviderDashboard
     */
    public ProviderDashboard() {
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

        jPanel1 = new javax.swing.JPanel();
        jSplitPane1 = new javax.swing.JSplitPane();
        workContainer = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        mainMenu = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        btnvaccorder = new javax.swing.JButton();
        btnmanorder = new javax.swing.JButton();
        btnviewinven = new javax.swing.JButton();
        btnadminvacc = new javax.swing.JButton();
        btnviewadminvacc = new javax.swing.JButton();
        btnremoteclin = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();

        jPanel1.setBackground(new java.awt.Color(0, 204, 204));
        jPanel1.setLayout(new java.awt.BorderLayout());

        jSplitPane1.setDividerLocation(190);

        workContainer.setBackground(new java.awt.Color(0, 204, 204));
        workContainer.setLayout(new java.awt.CardLayout());

        jPanel2.setBackground(new java.awt.Color(0, 204, 204));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(118, 118, 118)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 291, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(94, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(111, 111, 111)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 256, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(201, Short.MAX_VALUE))
        );

        workContainer.add(jPanel2, "card2");

        jSplitPane1.setRightComponent(workContainer);

        mainMenu.setBackground(new java.awt.Color(0, 204, 204));

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Main Menu:");

        btnvaccorder.setBackground(new java.awt.Color(0, 0, 102));
        btnvaccorder.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnvaccorder.setForeground(new java.awt.Color(255, 255, 255));
        btnvaccorder.setText("Place Vaccine Order");
        btnvaccorder.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnvaccorderActionPerformed(evt);
            }
        });

        btnmanorder.setBackground(new java.awt.Color(0, 0, 102));
        btnmanorder.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnmanorder.setForeground(new java.awt.Color(255, 255, 255));
        btnmanorder.setText("Manage Orders");
        btnmanorder.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnmanorderActionPerformed(evt);
            }
        });

        btnviewinven.setBackground(new java.awt.Color(0, 0, 102));
        btnviewinven.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnviewinven.setForeground(new java.awt.Color(255, 255, 255));
        btnviewinven.setText("View Inventory");
        btnviewinven.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnviewinvenActionPerformed(evt);
            }
        });

        btnadminvacc.setBackground(new java.awt.Color(0, 0, 102));
        btnadminvacc.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnadminvacc.setForeground(new java.awt.Color(255, 255, 255));
        btnadminvacc.setText("Administer Vaccine");
        btnadminvacc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnadminvaccActionPerformed(evt);
            }
        });

        btnviewadminvacc.setBackground(new java.awt.Color(0, 0, 102));
        btnviewadminvacc.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnviewadminvacc.setForeground(new java.awt.Color(255, 255, 255));
        btnviewadminvacc.setText("View Administered Vaccines");
        btnviewadminvacc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnviewadminvaccActionPerformed(evt);
            }
        });

        btnremoteclin.setBackground(new java.awt.Color(0, 0, 102));
        btnremoteclin.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnremoteclin.setForeground(new java.awt.Color(255, 255, 255));
        btnremoteclin.setText("Manage Remote Clinic Orders");
        btnremoteclin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnremoteclinActionPerformed(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("PROVIDER");

        javax.swing.GroupLayout mainMenuLayout = new javax.swing.GroupLayout(mainMenu);
        mainMenu.setLayout(mainMenuLayout);
        mainMenuLayout.setHorizontalGroup(
            mainMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(mainMenuLayout.createSequentialGroup()
                .addGap(61, 61, 61)
                .addComponent(jLabel6)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(mainMenuLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(mainMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnvaccorder, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnmanorder, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnviewinven, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnadminvacc, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnviewadminvacc, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(mainMenuLayout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(btnremoteclin, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        mainMenuLayout.setVerticalGroup(
            mainMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(mainMenuLayout.createSequentialGroup()
                .addComponent(jLabel6)
                .addGap(18, 18, 18)
                .addComponent(jLabel4)
                .addGap(18, 18, 18)
                .addComponent(btnvaccorder)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnmanorder)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnviewinven)
                .addGap(45, 45, 45)
                .addComponent(btnadminvacc)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnviewadminvacc)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnremoteclin)
                .addContainerGap(258, Short.MAX_VALUE))
        );

        jSplitPane1.setTopComponent(mainMenu);

        jPanel1.add(jSplitPane1, java.awt.BorderLayout.CENTER);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 698, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 698, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 568, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 568, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnvaccorderActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnvaccorderActionPerformed
        // TODO add your handling code here:
       
    }//GEN-LAST:event_btnvaccorderActionPerformed

    private void btnmanorderActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnmanorderActionPerformed
        // TODO add your handling code here:
       
    }//GEN-LAST:event_btnmanorderActionPerformed

    private void btnviewinvenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnviewinvenActionPerformed
        // TODO add your handling code here:
       
    }//GEN-LAST:event_btnviewinvenActionPerformed

    private void btnadminvaccActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnadminvaccActionPerformed
        // TODO add your handling code here:
    
    }//GEN-LAST:event_btnadminvaccActionPerformed

    private void btnviewadminvaccActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnviewadminvaccActionPerformed
        // TODO add your handling code here:
       
    }//GEN-LAST:event_btnviewadminvaccActionPerformed

    private void btnremoteclinActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnremoteclinActionPerformed
        // TODO add your handling code here:
        
    }//GEN-LAST:event_btnremoteclinActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnadminvacc;
    private javax.swing.JButton btnmanorder;
    private javax.swing.JButton btnremoteclin;
    private javax.swing.JButton btnvaccorder;
    private javax.swing.JButton btnviewadminvacc;
    private javax.swing.JButton btnviewinven;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JSplitPane jSplitPane1;
    private javax.swing.JPanel mainMenu;
    private javax.swing.JPanel workContainer;
    // End of variables declaration//GEN-END:variables
}
