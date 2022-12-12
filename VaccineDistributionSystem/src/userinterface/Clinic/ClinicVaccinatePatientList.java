/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package userinterface.Clinic;

import TheBusiness.Ecosystems;
import TheBusiness.Enterprise.HospitalEnterprise;
import TheBusiness.Network.StateNetwork;
import TheBusiness.Organization.HospitalOrganization;
import TheBusiness.Organization.Organization;
import TheBusiness.Organization.ClinicOrganization;
import TheBusiness.Personnel.Patient;
import TheBusiness.UserAccountManagement.UserAccount;
import TheBusiness.VaccineManagement.AdministeredVaccineDetails;
import TheBusiness.VaccineManagement.VaccineDetails;

import java.awt.CardLayout;
import java.util.ArrayList;
import java.util.Date;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

/**
 *
 * @author karthik
 */
public class ClinicVaccinatePatientList extends javax.swing.JPanel {

   
    private JPanel workContainer;

    private HospitalEnterprise hospital;
    private UserAccount userAccount;
    private ClinicOrganization clinicOrg;
    private Ecosystems business;
    private Patient patient;
    private StateNetwork state;
    private int flagg;
    
    public ClinicVaccinatePatientList(JPanel workContainer, HospitalEnterprise hospital, ClinicOrganization clinicOrg, UserAccount userAccount , Ecosystems business, Patient patient, StateNetwork state) {
        initComponents();
        this.workContainer = workContainer;
        this.userAccount = userAccount;
        this.hospital = hospital;
        this.business = business;
        this.clinicOrg = clinicOrg;
        this.patient = patient;
        this.state = state;
        txtGivenBy.setText(userAccount.getPerson().getFirstName()+" "+userAccount.getPerson().getLastName());
        txtPatient.setText(patient.getFirstName() + " " + patient.getLastName());
        cbvacclcodelist.removeAllItems();
        cbbrandlist.removeAllItems();
        cbnum.removeAllItems();
        
        populateVaccineCodeComboBox();
        
    }
    
    private void populateVaccineCodeComboBox()
    {
       cbvacclcodelist.removeAllItems();
       
       ArrayList<String> vprodList = new ArrayList<String>();
       
       
       for(Organization org: hospital.getOrganizationDirectory().getOrganizationList())
       {
           if(org instanceof HospitalOrganization)
           {
               HospitalOrganization hospOrg = (HospitalOrganization)org;
               for(VaccineDetails product: hospOrg.getClinic().getVaccineInventoryClinic())
               {
                   if(vprodList.contains(product.getVaccineDefinition().getVaccineCode())== false)
                   {
                       cbvacclcodelist.addItem(product);
                       vprodList.add(product.getVaccineDefinition().getVaccineCode());
                   }
                   
               }
           }
       }
        
    }
    
    private void populateBrandComboBox(VaccineDetails vaccine)
    {
        cbbrandlist.removeAllItems();
         String vaccineCode = vaccine.getVaccineDefinition().getVaccineCode();
            ArrayList<String> brandList = new ArrayList<String>();
         for(Organization org: hospital.getOrganizationDirectory().getOrganizationList())
       {
           if(org instanceof HospitalOrganization)
           {
               HospitalOrganization hospOrg = (HospitalOrganization)org;
               for(VaccineDetails product: hospOrg.getClinic().getVaccineInventoryClinic())
               {
                   if(product.getVaccineDefinition().getVaccineCode().equalsIgnoreCase(vaccineCode) && brandList.contains(product.getManufacturerName())==false )
                   {
                       cbbrandlist.addItem(product.getManufacturerName());
                       brandList.add(product.getManufacturerName());
                   }
               }
           }
       }
        
    }
    
    
    private void populateBatchComboBox(String brandName){
        
        cbnum.removeAllItems();
        VaccineDetails vp = (VaccineDetails)cbvacclcodelist.getSelectedItem();
        String vaccineCode = vp.getVaccineDefinition().getVaccineCode();
        
        for(Organization org: hospital.getOrganizationDirectory().getOrganizationList())
       {
           if(org instanceof HospitalOrganization)
           {
               HospitalOrganization hospOrg = (HospitalOrganization)org;
               for(VaccineDetails product: hospOrg.getClinic().getVaccineInventoryClinic())
               {
                   if(product.getManufacturerName().equalsIgnoreCase(brandName) && product.getVaccineDefinition().getVaccineCode().equalsIgnoreCase(vaccineCode))
                   {
                       cbnum.addItem(product.getBatchId());
                   }
               }
           }
       }
        
        
    }
    
    private void populateTextFields()
    {
        VaccineDetails prod = (VaccineDetails)cbvacclcodelist.getSelectedItem();
        if(prod == null)
        {
            return;
        }
        String vaccineCode = prod.getVaccineDefinition().getVaccineCode();
        
        
        String brand = (String)cbbrandlist.getSelectedItem();
        
        String batchID = (String)cbnum.getSelectedItem();
        
        for(Organization org: hospital.getOrganizationDirectory().getOrganizationList())
       {
           if(org instanceof HospitalOrganization)
           {
               HospitalOrganization hospOrg = (HospitalOrganization)org;
               for(VaccineDetails product: hospOrg.getClinic().getVaccineInventoryClinic())
               {
                   if(product.getManufacturerName().equalsIgnoreCase(brand) && product.getBatchId().equalsIgnoreCase(batchID) && product.getVaccineDefinition().getVaccineCode().equalsIgnoreCase(vaccineCode))
                   {
                       txtManufactureDate.setText(String.valueOf(product.getManufactureDate()));
                       return;
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
        buttonGroup2 = new javax.swing.ButtonGroup();
        lblTitle = new javax.swing.JLabel();
        lblPatient = new javax.swing.JLabel();
        txtPatient = new javax.swing.JTextField();
        lblVaccineDetails = new javax.swing.JLabel();
        lblVaccineCode = new javax.swing.JLabel();
        cbvacclcodelist = new javax.swing.JComboBox();
        lblDoseNumber = new javax.swing.JLabel();
        txtDoseNumber = new javax.swing.JTextField();
        lblManufactureDate = new javax.swing.JLabel();
        txtManufactureDate = new javax.swing.JTextField();
        lblBatchNumber = new javax.swing.JLabel();
        cbnum = new javax.swing.JComboBox();
        lblArm = new javax.swing.JLabel();
        lblInjectionStatus = new javax.swing.JLabel();
        lblGivenBy = new javax.swing.JLabel();
        txtGivenBy = new javax.swing.JTextField();
        btnAdministerVaccine = new javax.swing.JButton();
        lblBrand = new javax.swing.JLabel();
        cbbrandlist = new javax.swing.JComboBox();
        btnBack = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator2 = new javax.swing.JSeparator();
        jLabel10 = new javax.swing.JLabel();
        cbArm = new javax.swing.JComboBox();
        cbstatus = new javax.swing.JComboBox();
        jLabel4 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(0, 204, 204));
        setForeground(new java.awt.Color(255, 255, 255));

        lblTitle.setFont(new java.awt.Font("October Compressed Devanagari", 1, 24)); // NOI18N
        lblTitle.setForeground(new java.awt.Color(255, 255, 255));
        lblTitle.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblTitle.setText("Administer Vaccine");

        lblPatient.setFont(new java.awt.Font("October Compressed Devanagari", 0, 12)); // NOI18N
        lblPatient.setForeground(new java.awt.Color(255, 255, 255));
        lblPatient.setText("Patient: ");

        txtPatient.setEnabled(false);

        lblVaccineDetails.setFont(new java.awt.Font("October Compressed Devanagari", 3, 18)); // NOI18N
        lblVaccineDetails.setForeground(new java.awt.Color(255, 255, 255));
        lblVaccineDetails.setText("Vaccine Details:");

        lblVaccineCode.setFont(new java.awt.Font("October Compressed Devanagari", 0, 12)); // NOI18N
        lblVaccineCode.setForeground(new java.awt.Color(255, 255, 255));
        lblVaccineCode.setText("Vaccine Code:");

        cbvacclcodelist.setBackground(new java.awt.Color(0, 0, 0));
        cbvacclcodelist.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        cbvacclcodelist.setForeground(new java.awt.Color(255, 255, 255));
        cbvacclcodelist.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        cbvacclcodelist.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbvacclcodelistActionPerformed(evt);
            }
        });

        lblDoseNumber.setFont(new java.awt.Font("October Compressed Devanagari", 0, 12)); // NOI18N
        lblDoseNumber.setForeground(new java.awt.Color(255, 255, 255));
        lblDoseNumber.setText("Dose Number:");

        lblManufactureDate.setFont(new java.awt.Font("October Compressed Devanagari", 0, 12)); // NOI18N
        lblManufactureDate.setForeground(new java.awt.Color(255, 255, 255));
        lblManufactureDate.setText("Manufacture Date:");

        txtManufactureDate.setEnabled(false);

        lblBatchNumber.setFont(new java.awt.Font("October Compressed Devanagari", 0, 12)); // NOI18N
        lblBatchNumber.setForeground(new java.awt.Color(255, 255, 255));
        lblBatchNumber.setText("Batch Number :");

        cbnum.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        cbnum.setForeground(new java.awt.Color(0, 0, 102));
        cbnum.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        cbnum.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbnumActionPerformed(evt);
            }
        });

        lblArm.setFont(new java.awt.Font("October Compressed Devanagari", 0, 12)); // NOI18N
        lblArm.setForeground(new java.awt.Color(255, 255, 255));
        lblArm.setText("Arm");

        lblInjectionStatus.setFont(new java.awt.Font("October Compressed Devanagari", 0, 12)); // NOI18N
        lblInjectionStatus.setForeground(new java.awt.Color(255, 255, 255));
        lblInjectionStatus.setText("Injection Status:");

        lblGivenBy.setFont(new java.awt.Font("October Compressed Devanagari", 0, 12)); // NOI18N
        lblGivenBy.setForeground(new java.awt.Color(255, 255, 255));
        lblGivenBy.setText("Given By:");

        txtGivenBy.setEnabled(false);

        btnAdministerVaccine.setBackground(new java.awt.Color(0, 0, 0));
        btnAdministerVaccine.setFont(new java.awt.Font("October Compressed Devanagari", 1, 18)); // NOI18N
        btnAdministerVaccine.setForeground(new java.awt.Color(255, 255, 255));
        btnAdministerVaccine.setText("Administer Vaccine");
        btnAdministerVaccine.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnAdministerVaccine.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAdministerVaccineActionPerformed(evt);
            }
        });

        lblBrand.setFont(new java.awt.Font("October Compressed Devanagari", 0, 12)); // NOI18N
        lblBrand.setForeground(new java.awt.Color(255, 255, 255));
        lblBrand.setText("Brand:");

        cbbrandlist.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        cbbrandlist.setForeground(new java.awt.Color(0, 0, 102));
        cbbrandlist.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        cbbrandlist.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbbrandlistActionPerformed(evt);
            }
        });

        btnBack.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnBack.setForeground(new java.awt.Color(255, 255, 255));
        btnBack.setIcon(new javax.swing.ImageIcon(getClass().getResource("/userinterface/ICONS/11122021icons/MicrosoftTeams-image (1).png"))); // NOI18N
        btnBack.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });

        jLabel10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/userinterface/ICONS/11122021icons/keepitup_70x70.png"))); // NOI18N

        cbArm.setBackground(new java.awt.Color(0, 0, 0));
        cbArm.setForeground(new java.awt.Color(255, 255, 255));
        cbArm.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Right", "Left" }));
        cbArm.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbArmActionPerformed(evt);
            }
        });

        cbstatus.setBackground(new java.awt.Color(0, 0, 0));
        cbstatus.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        cbstatus.setForeground(new java.awt.Color(255, 255, 255));
        cbstatus.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Success", "Fail" }));
        cbstatus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbstatusActionPerformed(evt);
            }
        });

        jLabel4.setForeground(new java.awt.Color(0, 204, 204));
        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/userinterface/ICONS/11122021icons/vaccine.gif"))); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnBack)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblTitle, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(jSeparator2)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lblVaccineDetails)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jSeparator1))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addGroup(layout.createSequentialGroup()
                                    .addGap(15, 15, 15)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(lblBrand)
                                        .addComponent(lblVaccineCode))
                                    .addGap(12, 12, 12)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(layout.createSequentialGroup()
                                            .addComponent(cbvacclcodelist, javax.swing.GroupLayout.PREFERRED_SIZE, 173, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(lblBatchNumber))
                                        .addGroup(layout.createSequentialGroup()
                                            .addComponent(cbbrandlist, javax.swing.GroupLayout.PREFERRED_SIZE, 173, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(lblDoseNumber)))
                                    .addGap(18, 18, 18)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(cbnum, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(txtDoseNumber, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGroup(layout.createSequentialGroup()
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(btnAdministerVaccine, javax.swing.GroupLayout.PREFERRED_SIZE, 244, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGroup(layout.createSequentialGroup()
                                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                .addComponent(lblManufactureDate)
                                                .addComponent(lblArm)
                                                .addComponent(lblGivenBy)
                                                .addComponent(lblInjectionStatus))
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                .addComponent(cbArm, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addComponent(txtManufactureDate)
                                                .addComponent(txtGivenBy)
                                                .addComponent(cbstatus, 0, 175, Short.MAX_VALUE))))
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(lblPatient)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtPatient, javax.swing.GroupLayout.PREFERRED_SIZE, 171, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 116, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(lblTitle)
                                .addGap(53, 53, 53))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btnBack)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblPatient)
                            .addComponent(txtPatient, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(lblVaccineDetails)
                            .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblVaccineCode)
                            .addComponent(cbvacclcodelist, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblBatchNumber)
                            .addComponent(cbnum, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(cbbrandlist, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblBrand)
                            .addComponent(lblDoseNumber)
                            .addComponent(txtDoseNumber, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(25, 25, 25)
                        .addComponent(lblManufactureDate))
                    .addComponent(txtManufactureDate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(cbArm, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(lblArm))
                                .addGap(19, 19, 19)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lblGivenBy)
                                    .addComponent(txtGivenBy, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(lblInjectionStatus)
                                    .addComponent(cbstatus, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 16, Short.MAX_VALUE)
                                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                        .addComponent(btnAdministerVaccine)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(1, 1, 1)))
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(105, 105, 105))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void cbvacclcodelistActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbvacclcodelistActionPerformed
        // TODO add your handling code here:
        cbbrandlist.removeAllItems();
        VaccineDetails prod = (VaccineDetails)cbvacclcodelist.getSelectedItem();
        if(prod == null)
        {
            return;
        }
        populateBrandComboBox(prod);
 
    }//GEN-LAST:event_cbvacclcodelistActionPerformed

    private void btnAdministerVaccineActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAdministerVaccineActionPerformed
        // TODO add your handling code here:
      
        try
        {
          
             VaccineDetails vp = (VaccineDetails)cbvacclcodelist.getSelectedItem();
            String vaccineCode = vp.getVaccineDefinition().getVaccineCode();
        
        String brand = (String)cbbrandlist.getSelectedItem();
        
        String batchID = (String)cbnum.getSelectedItem();
        VaccineDetails prod = null;
        for(Organization org: hospital.getOrganizationDirectory().getOrganizationList())
       {
           if(org instanceof HospitalOrganization && prod== null)
           {
               HospitalOrganization hospOrg = (HospitalOrganization)org;
               for(VaccineDetails product: hospOrg.getClinic().getVaccineInventoryClinic())
               {
                   if(product.getManufacturerName().equalsIgnoreCase(brand) && product.getBatchId().equalsIgnoreCase(batchID) && product.getVaccineDefinition().getVaccineCode().equalsIgnoreCase(vaccineCode))
                   {
                      prod=product;
                      break;
                   }
               }
           }
       }
   
        Date administeredDate = new Date();   

        String siteRoute = null;
        String status = null;
        siteRoute = (String)cbArm.getSelectedItem();
        status = (String)cbstatus.getSelectedItem();
        
        
        AdministeredVaccineDetails administeredVaccine = null;
        for(Organization org: hospital.getOrganizationDirectory().getOrganizationList())
        {
            if(org instanceof HospitalOrganization)
            {
                HospitalOrganization hospOrg = (HospitalOrganization)org;
                administeredVaccine = hospOrg.getClinic().addNewAdministeredVaccine();
            }
        }
        
        for(Organization org: hospital.getOrganizationDirectory().getOrganizationList())
        {
            if(org instanceof HospitalOrganization)
            {
                HospitalOrganization hospOrg = (HospitalOrganization)org;
                for(VaccineDetails product : hospOrg.getClinic().getVaccineInventoryClinic())
                {
                    if(product.getVaccineDefinition().getVaccineCode().equalsIgnoreCase(vaccineCode) && product.getBatchId().equalsIgnoreCase(batchID))
                    {administeredVaccine.setVaccineProduct(product);
                    break;
                    }
                        
                }
            }
        }
     
       for(Organization org: hospital.getOrganizationDirectory().getOrganizationList())
        {
            if(org instanceof HospitalOrganization)
            {
                HospitalOrganization hospOrg = (HospitalOrganization)org;
                for(VaccineDetails p: hospOrg.getClinic().getVaccineInventoryClinic())
                {
                    
                    
                    if(p.equals(administeredVaccine.getVaccineProduct()))
                    {   
                        if(p.getAvailablity()<0)
                        {
                            JOptionPane.showMessageDialog(null, "Vaccine Out of Stock!");
                             flagg=1;
                        }
                        else
                        {p.setAvailablity(p.getAvailablity()-1);
                             flagg=2;
                        }
                    }
                }
                        
                }
            }
        
        
        if (flagg==2){
        int dose = Integer.parseInt(txtDoseNumber.getText());
        administeredVaccine.setDoseNumber(dose);
        administeredVaccine.setshotstatus(status);
        administeredVaccine.setProvider(userAccount);
        administeredVaccine.setSiteRoute(siteRoute);
        administeredVaccine.setDate(administeredDate);
        administeredVaccine.setPatient(patient);
        if(status.equalsIgnoreCase("Fail"))
        {
            administeredVaccine.setfailedReason("Failed");
        }
        
       
       
        for(Organization org: hospital.getOrganizationDirectory().getOrganizationList())
        {
            if(org instanceof HospitalOrganization)
            {
                HospitalOrganization hospOrg = (HospitalOrganization)org;
                AdministeredVaccineDetails v = hospOrg.getClinic().addNewAdministeredVaccine();
                v = administeredVaccine;
            }
        }
       
        AdministeredVaccineDetails av = patient.addNewAdministeredVaccine();
        av=administeredVaccine;
       
       
        JOptionPane.showMessageDialog(null, "Vaccination Done!");
     
        }}
        catch(NumberFormatException e)
        {
            JOptionPane.showMessageDialog(null, "Please enter numeric data in dose field");
            return;
        }
  
    }//GEN-LAST:event_btnAdministerVaccineActionPerformed

    private void cbbrandlistActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbbrandlistActionPerformed
        // TODO add your handling code here:
        cbnum.removeAllItems();
        String brand = (String)cbbrandlist.getSelectedItem();
        if(brand == null)
        {
            return;
        }
        
        populateBatchComboBox(brand);
        
        
    }//GEN-LAST:event_cbbrandlistActionPerformed

    private void cbnumActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbnumActionPerformed
        // TODO add your handling code here:
        populateTextFields();
    }//GEN-LAST:event_cbnumActionPerformed

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        // TODO add your handling code here:
        workContainer.remove(this);
        CardLayout layout = (CardLayout) workContainer.getLayout();
        layout.previous(workContainer);
    }//GEN-LAST:event_btnBackActionPerformed

    private void cbArmActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbArmActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cbArmActionPerformed

    private void cbstatusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbstatusActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cbstatusActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAdministerVaccine;
    private javax.swing.JButton btnBack;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.ButtonGroup buttonGroup2;
    private javax.swing.JComboBox cbArm;
    private javax.swing.JComboBox cbbrandlist;
    private javax.swing.JComboBox cbnum;
    private javax.swing.JComboBox cbstatus;
    private javax.swing.JComboBox cbvacclcodelist;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JLabel lblArm;
    private javax.swing.JLabel lblBatchNumber;
    private javax.swing.JLabel lblBrand;
    private javax.swing.JLabel lblDoseNumber;
    private javax.swing.JLabel lblGivenBy;
    private javax.swing.JLabel lblInjectionStatus;
    private javax.swing.JLabel lblManufactureDate;
    private javax.swing.JLabel lblPatient;
    private javax.swing.JLabel lblTitle;
    private javax.swing.JLabel lblVaccineCode;
    private javax.swing.JLabel lblVaccineDetails;
    private javax.swing.JTextField txtDoseNumber;
    private javax.swing.JTextField txtGivenBy;
    private javax.swing.JTextField txtManufactureDate;
    private javax.swing.JTextField txtPatient;
    // End of variables declaration//GEN-END:variables
}
