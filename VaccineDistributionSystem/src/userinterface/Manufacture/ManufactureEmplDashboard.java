/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package userinterface.Manufacture;

import TheBusiness.Ecosystems;
import TheBusiness.Enterprise.Enterprise;
import TheBusiness.NationalEnterprise.Manufacturer;
import TheBusiness.UserAccountManagement.UserAccount;
import java.awt.CardLayout;
import javax.swing.JPanel;

/**
 *
 * @author Dsouza
 */
public class ManufactureEmplDashboard extends javax.swing.JPanel {

    /**
     * Creates new form ManufactureEmplDashboard
     */
    private JPanel userProcessContainer;
    private UserAccount userAccount;
    private Manufacturer manufacturer;
    private Ecosystems business;
    
    public ManufactureEmplDashboard(JPanel userProcessContainer,UserAccount userAccount,Manufacturer manufacturer,Ecosystems business  ) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.userAccount = userAccount;
        this.manufacturer = manufacturer;
        this.business = business;

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jSplitPane1 = new javax.swing.JSplitPane();
        workContainer = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        mainMenu = new javax.swing.JPanel();
        btnManageVaccineProd = new javax.swing.JButton();
        btnManageOrders = new javax.swing.JButton();
        lblTitle = new javax.swing.JLabel();
        lblMainMenu = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        setLayout(new java.awt.BorderLayout());

        jSplitPane1.setDividerLocation(175);

        workContainer.setBackground(new java.awt.Color(37, 161, 142));
        workContainer.setLayout(new java.awt.CardLayout());

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/UserInterface/ICONS/11122021icons/01image_processing20200619-31262-6cj3a4.gif"))); // NOI18N
        workContainer.add(jLabel1, "card3");

        jPanel1.setBackground(new java.awt.Color(102, 153, 255));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1600, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1200, Short.MAX_VALUE)
        );

        workContainer.add(jPanel1, "card2");

        jSplitPane1.setRightComponent(workContainer);

        mainMenu.setBackground(new java.awt.Color(37, 161, 142));

        btnManageVaccineProd.setBackground(new java.awt.Color(0, 0, 0));
        btnManageVaccineProd.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnManageVaccineProd.setForeground(new java.awt.Color(255, 255, 255));
        btnManageVaccineProd.setText("Manage Vaccine Products");
        btnManageVaccineProd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnManageVaccineProdActionPerformed(evt);
            }
        });

        btnManageOrders.setBackground(new java.awt.Color(0, 0, 0));
        btnManageOrders.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnManageOrders.setForeground(new java.awt.Color(255, 255, 255));
        btnManageOrders.setText("Manage Orders");
        btnManageOrders.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnManageOrdersActionPerformed(evt);
            }
        });

        lblTitle.setFont(new java.awt.Font("October Compressed Devanagari", 1, 18)); // NOI18N
        lblTitle.setForeground(new java.awt.Color(255, 255, 255));
        lblTitle.setText("MANUFACTURER");

        lblMainMenu.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lblMainMenu.setForeground(new java.awt.Color(255, 255, 255));
        lblMainMenu.setText("Main Menu:");

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/UserInterface/ICONS/11122021icons/manumiddle_150x150.png"))); // NOI18N

        javax.swing.GroupLayout mainMenuLayout = new javax.swing.GroupLayout(mainMenu);
        mainMenu.setLayout(mainMenuLayout);
        mainMenuLayout.setHorizontalGroup(
            mainMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(mainMenuLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(mainMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnManageVaccineProd, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnManageOrders, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(mainMenuLayout.createSequentialGroup()
                        .addGroup(mainMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblMainMenu)
                            .addComponent(lblTitle))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(mainMenuLayout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 184, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        mainMenuLayout.setVerticalGroup(
            mainMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(mainMenuLayout.createSequentialGroup()
                .addGap(92, 92, 92)
                .addComponent(lblTitle)
                .addGap(41, 41, 41)
                .addComponent(lblMainMenu)
                .addGap(18, 18, 18)
                .addComponent(btnManageVaccineProd)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnManageOrders)
                .addGap(84, 84, 84)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 198, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(669, Short.MAX_VALUE))
        );

        jSplitPane1.setTopComponent(mainMenu);

        add(jSplitPane1, java.awt.BorderLayout.CENTER);
    }// </editor-fold>//GEN-END:initComponents

    private void btnManageVaccineProdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnManageVaccineProdActionPerformed
        // TODO add your handling code here:
        VaccineManagement panel = new VaccineManagement(workContainer, manufacturer, business);
        workContainer.add("ManageVaccinesJPanel", panel);
        CardLayout layout = (CardLayout)workContainer.getLayout();
        layout.next(workContainer);
        
    }//GEN-LAST:event_btnManageVaccineProdActionPerformed

    private void btnManageOrdersActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnManageOrdersActionPerformed
        // TODO add your handling code here:
         ManufacturerOrderManagement panel = new ManufacturerOrderManagement(workContainer, manufacturer, userAccount, business);
        workContainer.add("ManageOrdersJPanel", panel);
        CardLayout layout = (CardLayout)workContainer.getLayout();
        layout.next(workContainer);
    }//GEN-LAST:event_btnManageOrdersActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnManageOrders;
    private javax.swing.JButton btnManageVaccineProd;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JSplitPane jSplitPane1;
    private javax.swing.JLabel lblMainMenu;
    private javax.swing.JLabel lblTitle;
    private javax.swing.JPanel mainMenu;
    private javax.swing.JPanel workContainer;
    // End of variables declaration//GEN-END:variables
}
