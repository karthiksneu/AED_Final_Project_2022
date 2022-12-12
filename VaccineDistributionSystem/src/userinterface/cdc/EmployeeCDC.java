/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package userinterface.CDC;

import TheBusiness.Ecosystems;
import TheBusiness.Enterprise.Enterprise;
import TheBusiness.NationalEnterprise.CenterOfDiseaseControl;
import TheBusiness.Organization.CDCOrganization;
import TheBusiness.UserAccountManagement.UserAccount;
import java.awt.CardLayout;
import javax.swing.JPanel;

/**
 *
 * @author karthik
 */
public class EmployeeCDC extends javax.swing.JPanel {

    private JPanel userProcessContainer;
    private CenterOfDiseaseControl cdc;
    private UserAccount userAccount;
    private CDCOrganization cdcOrg;
    private Ecosystems business;
    public EmployeeCDC(JPanel userProcessContainer,UserAccount userAccount, CenterOfDiseaseControl cdc,CDCOrganization cdcOrg,Ecosystems business ) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.userAccount = userAccount;
        this.cdc = cdc;
        this.business = business;
        
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jSplitPane1 = new javax.swing.JSplitPane();
        mainMenu = new javax.swing.JPanel();
        btnCreateVaccineOrder = new javax.swing.JButton();
        lblMainMenu = new javax.swing.JLabel();
        btnManageOrders = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        workContainer = new javax.swing.JPanel();

        setLayout(new java.awt.BorderLayout());

        jSplitPane1.setBackground(new java.awt.Color(255, 255, 255));
        jSplitPane1.setDividerLocation(170);

        mainMenu.setBackground(new java.awt.Color(37, 161, 142));

        btnCreateVaccineOrder.setBackground(new java.awt.Color(0, 0, 0));
        btnCreateVaccineOrder.setFont(new java.awt.Font("October Compressed Devanagari", 1, 18)); // NOI18N
        btnCreateVaccineOrder.setForeground(new java.awt.Color(255, 255, 255));
        btnCreateVaccineOrder.setText("Create Vaccine Order");
        btnCreateVaccineOrder.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnCreateVaccineOrder.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCreateVaccineOrderActionPerformed(evt);
            }
        });

        lblMainMenu.setFont(new java.awt.Font("October Compressed Devanagari", 1, 18)); // NOI18N
        lblMainMenu.setForeground(new java.awt.Color(255, 255, 255));
        lblMainMenu.setText("Main Menu");

        btnManageOrders.setBackground(new java.awt.Color(0, 0, 0));
        btnManageOrders.setFont(new java.awt.Font("October Compressed Devanagari", 1, 18)); // NOI18N
        btnManageOrders.setForeground(new java.awt.Color(255, 255, 255));
        btnManageOrders.setText("Manage Orders");
        btnManageOrders.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnManageOrders.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnManageOrdersActionPerformed(evt);
            }
        });

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/UserInterface/ICONS/11122021icons/cdc1_50x50.jpg"))); // NOI18N

        javax.swing.GroupLayout mainMenuLayout = new javax.swing.GroupLayout(mainMenu);
        mainMenu.setLayout(mainMenuLayout);
        mainMenuLayout.setHorizontalGroup(
            mainMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(mainMenuLayout.createSequentialGroup()
                .addGroup(mainMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(mainMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addGroup(mainMenuLayout.createSequentialGroup()
                            .addGap(34, 34, 34)
                            .addComponent(lblMainMenu))
                        .addComponent(btnCreateVaccineOrder, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnManageOrders, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(mainMenuLayout.createSequentialGroup()
                        .addGap(52, 52, 52)
                        .addComponent(jLabel1)))
                .addContainerGap(14, Short.MAX_VALUE))
        );
        mainMenuLayout.setVerticalGroup(
            mainMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(mainMenuLayout.createSequentialGroup()
                .addGap(49, 49, 49)
                .addComponent(lblMainMenu)
                .addGap(28, 28, 28)
                .addComponent(btnCreateVaccineOrder)
                .addGap(38, 38, 38)
                .addComponent(btnManageOrders)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel1)
                .addContainerGap(347, Short.MAX_VALUE))
        );

        mainMenuLayout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {btnCreateVaccineOrder, btnManageOrders});

        jSplitPane1.setTopComponent(mainMenu);

        workContainer.setBackground(new java.awt.Color(37, 161, 142));
        workContainer.setLayout(new java.awt.CardLayout());
        jSplitPane1.setRightComponent(workContainer);

        add(jSplitPane1, java.awt.BorderLayout.CENTER);
    }// </editor-fold>//GEN-END:initComponents

    private void btnManageOrdersActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnManageOrdersActionPerformed
        // TODO add your handling code here:
        CDCOrderManagement panel = new CDCOrderManagement(workContainer,userAccount, business, cdc, cdcOrg);
        workContainer.add("ManageOrdersJPanel", panel);
        CardLayout layout = (CardLayout)workContainer.getLayout();
        layout.next(workContainer);
    }//GEN-LAST:event_btnManageOrdersActionPerformed

    private void btnCreateVaccineOrderActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCreateVaccineOrderActionPerformed
        // TODO add your handling code here:
        CDCVaccineOrderCreation panel = new CDCVaccineOrderCreation(workContainer, cdc, business, cdcOrg,userAccount);
        workContainer.add("CreateVaccineOrderJPanel", panel);
        CardLayout layout = (CardLayout)workContainer.getLayout();
        layout.next(workContainer);

    }//GEN-LAST:event_btnCreateVaccineOrderActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCreateVaccineOrder;
    private javax.swing.JButton btnManageOrders;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JSplitPane jSplitPane1;
    private javax.swing.JLabel lblMainMenu;
    private javax.swing.JPanel mainMenu;
    private javax.swing.JPanel workContainer;
    // End of variables declaration//GEN-END:variables
}
