/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userinterface;

import TheBusiness.Ecosystems;
import TheBusiness.DB4OUtil.DB4OUtil;
import TheBusiness.Enterprise.Enterprise;
import TheBusiness.NationalEnterprise.Manufacturer;
import TheBusiness.Network.CityNetwork;
import TheBusiness.Network.StateNetwork;
import TheBusiness.Organization.Organization;
import TheBusiness.UserAccountManagement.UserAccount;
import java.awt.CardLayout;
import java.awt.Color;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

/**
 *
 * @author soham
 */
public class MainJFrame extends javax.swing.JFrame {

    private Ecosystems business;
    private DB4OUtil dB40Util = DB4OUtil.getInstance();

    public MainJFrame() {
        initComponents();
        business = dB40Util.retrieveSystem();
        //Setting the frame size
        setSize(1500, 800);
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
        jPanel1 = new javax.swing.JPanel();
        projecttitle = new javax.swing.JLabel();
        lbusername = new javax.swing.JLabel();
        txtusername = new javax.swing.JTextField();
        lbpassword = new javax.swing.JLabel();
        txtpassword = new javax.swing.JPasswordField();
        btnlogin = new javax.swing.JButton();
        btnlogout = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        container = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(102, 700));
        setResizable(false);

        jSplitPane1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jSplitPane1.setDividerLocation(50);

        jPanel1.setBackground(new java.awt.Color(70, 130, 180));
        jPanel1.setPreferredSize(new java.awt.Dimension(400, 635));

        projecttitle.setFont(new java.awt.Font("October Compressed Devanagari", 1, 36)); // NOI18N
        projecttitle.setForeground(new java.awt.Color(255, 255, 255));
        projecttitle.setText("VDS");

        lbusername.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        lbusername.setForeground(new java.awt.Color(255, 255, 255));
        lbusername.setText("Username:");

        lbpassword.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        lbpassword.setForeground(new java.awt.Color(255, 255, 255));
        lbpassword.setText("Password :");

        btnlogin.setBackground(new java.awt.Color(0, 0, 0));
        btnlogin.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btnlogin.setForeground(new java.awt.Color(255, 255, 255));
        btnlogin.setText("LOGIN");
        btnlogin.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnlogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnloginActionPerformed(evt);
            }
        });

        btnlogout.setBackground(new java.awt.Color(0, 0, 0));
        btnlogout.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btnlogout.setForeground(new java.awt.Color(255, 255, 255));
        btnlogout.setText("LOGOUT");
        btnlogout.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnlogout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnlogoutActionPerformed(evt);
            }
        });

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/userinterface/ICONS/11122021icons/vg.gif"))); // NOI18N

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(projecttitle, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnlogout, javax.swing.GroupLayout.PREFERRED_SIZE, 225, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1)
                    .addComponent(btnlogin, javax.swing.GroupLayout.PREFERRED_SIZE, 225, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtpassword, javax.swing.GroupLayout.PREFERRED_SIZE, 225, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbpassword)
                    .addComponent(txtusername, javax.swing.GroupLayout.PREFERRED_SIZE, 225, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbusername))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(projecttitle, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(13, 13, 13)
                .addComponent(lbusername)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(txtusername, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lbpassword, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtpassword, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnlogin, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(25, 25, 25)
                .addComponent(btnlogout, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(37, 37, 37)
                .addComponent(jLabel1)
                .addContainerGap())
        );

        jPanel1Layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {btnlogin, btnlogout});

        jSplitPane1.setTopComponent(jPanel1);

        container.setBackground(new java.awt.Color(102, 153, 255));
        container.setLayout(new java.awt.CardLayout());

        jPanel2.setBackground(new java.awt.Color(70, 130, 180));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/userinterface/ICONS/11122021icons/were-all-in-this-together-together.gif"))); // NOI18N
        jPanel2.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 84, -1, -1));

        jLabel3.setBackground(new java.awt.Color(102, 153, 255));
        jLabel3.setFont(new java.awt.Font("Monotype Corsiva", 1, 48)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Vaccine Management System");
        jPanel2.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 600, 570, 70));

        jLabel4.setBackground(new java.awt.Color(102, 153, 255));
        jLabel4.setFont(new java.awt.Font("Calibri", 1, 24)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Karthik Sunil - 002910070");
        jPanel2.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 110, 300, 70));

        jLabel5.setBackground(new java.awt.Color(102, 153, 255));
        jLabel5.setFont(new java.awt.Font("Calibri", 1, 24)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Freya Dsouza - 002756302");
        jPanel2.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 200, 310, 70));

        jLabel6.setBackground(new java.awt.Color(102, 153, 255));
        jLabel6.setFont(new java.awt.Font("Calibri", 1, 24)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Soham Shah - 002703848");
        jPanel2.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 290, 300, 70));

        container.add(jPanel2, "card2");

        jSplitPane1.setRightComponent(container);

        getContentPane().add(jSplitPane1, java.awt.BorderLayout.CENTER);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnlogoutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnlogoutActionPerformed
        // TODO add your handling code here:
        container.removeAll();
        txtusername.setText(null);
        txtpassword.setText(null);
        
        JPanel blankJP = new JPanel();
        blankJP.setBackground(new java.awt.Color(102, 153, 255));
        container.add("blank", blankJP);
        CardLayout crdLyt = (CardLayout) container.getLayout();
        crdLyt.next(container);
        
        dB40Util.storeSystem(business);
    }//GEN-LAST:event_btnlogoutActionPerformed

    private void btnloginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnloginActionPerformed
        // TODO add your handling code here:

        String username = txtusername.getText();
        if(username.trim().equalsIgnoreCase(""))
        {
            JOptionPane.showMessageDialog(null, "Hello, Please enter your Username!");
            return;
            
        }
        char[] passwordCharArray = txtpassword.getPassword();
        String password = String.valueOf(passwordCharArray);
        if(password.trim().equalsIgnoreCase(""))
        {
            JOptionPane.showMessageDialog(null, "Hello, Please enter your Password!");
            return;
            
        }

        Enterprise isEnterprise = null;
        Organization organization = null;
        StateNetwork stateNetwork = null;

        UserAccount userAccount = business.getUserAccountDirectory().authenticateUser(username, password);
        
        if (userAccount == null) {
           
            userAccount = business.getCdc().getUserAccountDirectory().authenticateUser(username, password);
            if(userAccount == null)
            { for(Organization org: business.getCdc().getOrganizationDirectory().getOrganizationList())
            {
                userAccount = org.getUserAccountDirectory().authenticateUser(username, password);
            if(userAccount != null)
            {organization = org;
            break;
            }
            }
            }
            if(userAccount != null)
            {isEnterprise = business.getCdc();
                
            }
        }
        if (userAccount == null) {
            for(Manufacturer manufacturer : business.getManufacturerDirectory().getManufacturerDirectory())
            { 
                userAccount = manufacturer.getUserAccountDirectory().authenticateUser(username, password);
                
                if(userAccount == null)
                {
                    for(Organization org: manufacturer.getOrganizationDirectory().getOrganizationList())
                {
                    userAccount = org.getUserAccountDirectory().authenticateUser(username, password);
                    if(userAccount != null)
                        break;
                }
                }
                if(userAccount != null)
                { isEnterprise = manufacturer;
                    break;
                }
            }
 
        }if (userAccount == null) {
              
            userAccount = business.getDistributor().getUserAccountDirectory().authenticateUser(username, password);
            if(userAccount == null)
            { for(Organization org: business.getDistributor().getOrganizationDirectory().getOrganizationList())
            { userAccount = org.getUserAccountDirectory().authenticateUser(username, password);
                if(userAccount != null)
                {
                    organization = org;
                    break;
                }
            }
            }
            if(userAccount != null)
                isEnterprise = business.getDistributor();

        }if (userAccount == null) {
            for (StateNetwork state : business.getStateList()) {
                if(userAccount==null)
                { userAccount = state.getLocalHealthDepartment().getUserAccountDirectory().authenticateUser(username, password);
                if(userAccount == null)
                {for(Organization org: state.getLocalHealthDepartment().getOrganizationDirectory().getOrganizationList())
                {userAccount = org.getUserAccountDirectory().authenticateUser(username, password);
                    if(userAccount != null)
                    {   stateNetwork = state;
                        organization =org;
                        break;
                    }
                }
                }
                if(userAccount != null)
                {
                    isEnterprise = state.getLocalHealthDepartment();
                    
                }
                if (userAccount == null) {
                    
                  for (CityNetwork city : state.getCityList()) {
                        for (Enterprise hospital : city.getEnterpriseDirectory().getEnterpriseDirectory()) {
                            userAccount = hospital.getUserAccountDirectory().authenticateUser(username, password);
                            if (userAccount == null) {
                                for (Organization o : hospital.getOrganizationDirectory().getOrganizationList()) {
                                    userAccount = o.getUserAccountDirectory().authenticateUser(username, password);

                                    if (userAccount != null) {
                                        stateNetwork = state;
                                        isEnterprise = hospital;
                                        organization = o;
                                        break;

                                    }
                                }
                            }
                            else
                            {  
                               
                                isEnterprise = hospital;
                                break;
                            }
                           
                    if(organization != null)
                    {
                        break;
                    }
                            

                        }
                        if(isEnterprise != null)
                {
                    break;
                }
                    }

                } 
                else {
                    isEnterprise = state.getLocalHealthDepartment();
                    break;
                }

            }
        }
        }
       
        if(userAccount == null)
        {
            JOptionPane.showMessageDialog(null, "Sorry, Please Enter Correct Credentials !");
            
        }
        
        else
        {
           
            CardLayout layout = (CardLayout)container.getLayout();
            container.add("WorkArea", userAccount.getRole().createWorkArea(container, userAccount,isEnterprise, organization, business, stateNetwork));
            layout.next(container);
       
                    
                    }
        
    }//GEN-LAST:event_btnloginActionPerformed

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
            java.util.logging.Logger.getLogger(MainJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainJFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnlogin;
    private javax.swing.JButton btnlogout;
    private javax.swing.JPanel container;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JSplitPane jSplitPane1;
    private javax.swing.JLabel lbpassword;
    private javax.swing.JLabel lbusername;
    private javax.swing.JLabel projecttitle;
    private javax.swing.JPasswordField txtpassword;
    private javax.swing.JTextField txtusername;
    // End of variables declaration//GEN-END:variables
}
