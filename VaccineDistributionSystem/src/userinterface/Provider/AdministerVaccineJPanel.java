/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package UserInterface.Provider;

import Business.EcoSystem;
import Business.Enterprise.HospitalEnterprise;

import Business.Network.StateNetwork;
import Business.Organization.HospitalOrganization;
import Business.Organization.Organization;
import Business.Organization.PatientOrganization;
import Business.Person.Patient;
import Business.Person.Person;
import Business.UserAccount.UserAccount;
import java.awt.CardLayout;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

/**
 *
 * @author soham
 */
public class AdministerVaccineJPanel extends javax.swing.JPanel {

    /**
     * Creates new form AdministerVaccineJPanel
     */
    
    private JPanel workContainer;

    private HospitalEnterprise hospital;
    private UserAccount userAccount;
    private HospitalOrganization hospitalOrg;
    private EcoSystem business;
    private StateNetwork state;
    
    public AdministerVaccineJPanel(JPanel workContainer, HospitalEnterprise hospital,HospitalOrganization hospitalOrg,UserAccount userAccount , EcoSystem business, StateNetwork state) {
        initComponents();
        this.workContainer = workContainer;
        this.userAccount = userAccount;
        this.hospital = hospital;
        this.business = business;
        this.hospitalOrg = hospitalOrg;
        this.state = state;
        populatepatientJComboBox();

        
    }
    
    private void populateInsurerJCombo(){

    }
    
    
    private void populatepatientJComboBox(){
        
        cbpatient.removeAllItems();
      
        for(Organization org: hospital.getOrganizationDirectory().getOrganizationList())
        {
            if(org instanceof PatientOrganization)
            {
                PatientOrganization patientOrg = (PatientOrganization)org;
                for(Person p : patientOrg.getPersonDirectory().getPeopleList())
                {
                    if(p instanceof Patient)
                    {
                        Patient patient = (Patient) p;
                        cbpatient.addItem(patient);
                    }
                    
                }
            }
            
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

        buttonGroup1 = new javax.swing.ButtonGroup();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        cbpatient = new javax.swing.JComboBox();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        txtfname = new javax.swing.JTextField();
        txtlname = new javax.swing.JTextField();
        txtemail = new javax.swing.JTextField();
        txtphone = new javax.swing.JTextField();
        txtdob = new javax.swing.JTextField();
        jSeparator1 = new javax.swing.JSeparator();
        btnadd = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(70, 130, 180));
        setForeground(new java.awt.Color(255, 255, 255));

        jLabel1.setFont(new java.awt.Font("October Compressed Devanagari", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Administer Vaccine");

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Patient : ");

        cbpatient.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        cbpatient.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbpatientActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("First Name:");

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Last Name:");

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("email:");

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Phone:");

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Date of Birth:");

        txtfname.setEnabled(false);

        txtlname.setEnabled(false);

        txtemail.setEnabled(false);

        txtphone.setEnabled(false);

        txtdob.setEnabled(false);

        btnadd.setBackground(new java.awt.Color(0, 0, 0));
        btnadd.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnadd.setForeground(new java.awt.Color(255, 255, 255));
        btnadd.setText("Next");
        btnadd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnaddActionPerformed(evt);
            }
        });

        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/UserInterface/ICONS/11122021icons/main.png"))); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(104, 104, 104)
                        .addComponent(jLabel8)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnadd)
                        .addGap(32, 32, 32))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 627, Short.MAX_VALUE)
                            .addComponent(jSeparator1)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel2)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(cbpatient, javax.swing.GroupLayout.PREFERRED_SIZE, 213, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                                .addComponent(jLabel7)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(txtdob, javax.swing.GroupLayout.DEFAULT_SIZE, 152, Short.MAX_VALUE))
                                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addComponent(jLabel3)
                                                    .addComponent(jLabel5))
                                                .addGap(14, 14, 14)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                    .addComponent(txtemail, javax.swing.GroupLayout.DEFAULT_SIZE, 151, Short.MAX_VALUE)
                                                    .addComponent(txtfname))))
                                        .addGap(18, 18, 18)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel4)
                                            .addComponent(jLabel6))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(txtlname)
                                            .addComponent(txtphone, javax.swing.GroupLayout.DEFAULT_SIZE, 179, Short.MAX_VALUE))))
                                .addGap(0, 133, Short.MAX_VALUE)))
                        .addContainerGap())))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(cbpatient, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jLabel4)
                    .addComponent(txtfname, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtlname, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(jLabel6)
                    .addComponent(txtemail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtphone, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(txtdob, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 227, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnadd))
                .addContainerGap(28, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void cbpatientActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbpatientActionPerformed
        // TODO add your handling code here:
        Patient patient = (Patient)cbpatient.getSelectedItem();
        if(patient == null)
        {
            return;
        }
        
        txtfname.setText(patient.getFirstName());
        txtlname.setText(patient.getLastName());
        txtemail.setText(patient.getEmail());
        txtphone.setText(String.valueOf(patient.getPhone()));
        txtdob.setText(String.valueOf(patient.getDateOfBirth()));
        
        
    }//GEN-LAST:event_cbpatientActionPerformed

    private void btnaddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnaddActionPerformed
        // TODO add your handling code here:
        
        try{
        Patient patient = (Patient)cbpatient.getSelectedItem();
        if(patient == null)
        {
            return;
        }

        
        AdministerVaccineToPatientJPanel panel = new AdministerVaccineToPatientJPanel(workContainer, hospital, hospitalOrg, userAccount, business, patient, state);
        workContainer.add("AdministerVaccineToPatientJPanel", panel);
        CardLayout layout = (CardLayout)workContainer.getLayout();
        layout.next(workContainer);

        
        }
     
        catch(NumberFormatException e)
        {
            JOptionPane.showMessageDialog(null, "Please enter numeric value for Amount");
            return;
        }
    
        
    }//GEN-LAST:event_btnaddActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnadd;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JComboBox cbpatient;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTextField txtdob;
    private javax.swing.JTextField txtemail;
    private javax.swing.JTextField txtfname;
    private javax.swing.JTextField txtlname;
    private javax.swing.JTextField txtphone;
    // End of variables declaration//GEN-END:variables
}
