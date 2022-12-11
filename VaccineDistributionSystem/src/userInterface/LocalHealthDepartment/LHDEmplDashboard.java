/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package userinterface.LocalHealthDepartment;

import TheBusiness.Ecosystems;
import TheBusiness.Enterprise.LocalHealthDepartment;
import TheBusiness.Network.StateNetwork;
import TheBusiness.Organization.LocalHealthDptImmuneOrganization;
import TheBusiness.UserAccountManagement.UserAccount;
import java.awt.CardLayout;
import javax.swing.JPanel;

/**
 *
 * @author Dsouza
 */
public class LHDEmplDashboard extends javax.swing.JPanel {

   
    private JPanel userProcessContainer;
    private UserAccount userAccount;
    private LocalHealthDepartment enterprise;
    private LocalHealthDptImmuneOrganization lhdOrg;
    private Ecosystems business;
    private StateNetwork state;
    
    public LHDEmplDashboard(JPanel userProcessContainer,UserAccount userAccount, LocalHealthDepartment enterprise, LocalHealthDptImmuneOrganization lhdOrg,Ecosystems business, StateNetwork state  ) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.userAccount = userAccount;
        this.enterprise = enterprise;
        this.lhdOrg = lhdOrg;
        this.business = business;
        this.state = state;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jSplitPane1 = new javax.swing.JSplitPane();
        jPanel1 = new javax.swing.JPanel();
        lblMainMenu = new javax.swing.JLabel();
        btnEnterStatePopulation = new javax.swing.JButton();
        btnOrderApproval = new javax.swing.JButton();
        lblTitle = new javax.swing.JLabel();
        workContainer = new javax.swing.JPanel();

        setLayout(new java.awt.BorderLayout());

        jSplitPane1.setDividerLocation(200);

        jPanel1.setBackground(new java.awt.Color(0, 204, 204));

        lblMainMenu.setFont(new java.awt.Font("October Compressed Devanagari", 1, 18)); // NOI18N
        lblMainMenu.setForeground(new java.awt.Color(255, 255, 255));
        lblMainMenu.setText("Main Menu");

        btnEnterStatePopulation.setBackground(new java.awt.Color(0, 0, 0));
        btnEnterStatePopulation.setFont(new java.awt.Font("October Compressed Devanagari", 1, 18)); // NOI18N
        btnEnterStatePopulation.setForeground(new java.awt.Color(255, 255, 255));
        btnEnterStatePopulation.setText("Enter State Population");
        btnEnterStatePopulation.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEnterStatePopulationActionPerformed(evt);
            }
        });

        btnOrderApproval.setBackground(new java.awt.Color(0, 0, 0));
        btnOrderApproval.setFont(new java.awt.Font("October Compressed Devanagari", 1, 18)); // NOI18N
        btnOrderApproval.setForeground(new java.awt.Color(255, 255, 255));
        btnOrderApproval.setText("Order Approvals");
        btnOrderApproval.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnOrderApprovalActionPerformed(evt);
            }
        });

        lblTitle.setFont(new java.awt.Font("October Compressed Devanagari", 1, 18)); // NOI18N
        lblTitle.setForeground(new java.awt.Color(255, 255, 255));
        lblTitle.setText("Local Health Department");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnEnterStatePopulation, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnOrderApproval, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(lblMainMenu)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addComponent(lblTitle)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblTitle)
                .addGap(62, 62, 62)
                .addComponent(lblMainMenu)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnEnterStatePopulation)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnOrderApproval)
                .addContainerGap(401, Short.MAX_VALUE))
        );

        jSplitPane1.setTopComponent(jPanel1);

        workContainer.setBackground(new java.awt.Color(0, 204, 204));
        workContainer.setLayout(new java.awt.CardLayout());
        jSplitPane1.setRightComponent(workContainer);

        add(jSplitPane1, java.awt.BorderLayout.CENTER);
    }// </editor-fold>//GEN-END:initComponents

    private void btnOrderApprovalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnOrderApprovalActionPerformed
        // TODO add your handling code here:
         OrderApprovals panel = new OrderApprovals(workContainer, userAccount, enterprise,lhdOrg, state, business);
        workContainer.add("OrderApprovalsJPanel", panel);
        CardLayout layout = (CardLayout)workContainer.getLayout();
        layout.next(workContainer);
        
    }//GEN-LAST:event_btnOrderApprovalActionPerformed

    private void btnEnterStatePopulationActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEnterStatePopulationActionPerformed
        // TODO add your handling code here:
        StatePopulation panel = new StatePopulation(workContainer, state);
        workContainer.add("EnterStatePopulationJPanel", panel);
        CardLayout layout = (CardLayout)workContainer.getLayout();
        layout.next(workContainer);
        
    }//GEN-LAST:event_btnEnterStatePopulationActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnEnterStatePopulation;
    private javax.swing.JButton btnOrderApproval;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JSplitPane jSplitPane1;
    private javax.swing.JLabel lblMainMenu;
    private javax.swing.JLabel lblTitle;
    private javax.swing.JPanel workContainer;
    // End of variables declaration//GEN-END:variables
}
