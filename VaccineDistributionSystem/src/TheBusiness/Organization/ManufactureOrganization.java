/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TheBusiness.Organization;

import TheBusiness.Enterprise.HospitalEnterprise;
import TheBusiness.Personnel.Patient;
import TheBusiness.UserAccountManagement.UserAccount;
import TheBusiness.VaccineManagement.AdministeredVaccineDetails;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Dsouza
 */
public class VaccinatedPatients extends javax.swing.JPanel {

    /**
     * Creates new form AdministeredVaccineListJPanel
     */
    private JPanel workContainer;
    private HospitalEnterprise enterprise;
    private UserAccount userAccount;
    
    
    public VaccinatedPatients(JPanel workContainer,HospitalEnterprise enterprise, UserAccount userAccount ) {
        initComponents();
        this.workContainer = workContainer;
        this.enterprise = enterprise;
        this.userAccount = userAccount;
        populateTable();
    }
    
    private void populateTable()
    {
        
         int rowCount = tblvaccl.getRowCount();
        DefaultTableModel defaulttabelmodel = (DefaultTableModel)tblvaccl.getModel();
        
        for(int i=rowCount-1 ; i>=0; i--){
            defaulttabelmodel.removeRow(i);
        }
        Patient patient =(Patient)userAccount.getPerson();
        
        
             for(Organization org: enterprise.getOrganizationDirectory().getOrganizationList())
        {
            if(org instanceof HospitalOrganization)
            {
                HospitalOrganization hospOrg = (HospitalOrganization)org;
                for(AdministeredVaccineDetails vaccine: hospOrg.getClinic().getAdministeredVaccineList())
                {     
                    if(!(vaccine.getVaccineProduct()== null) && !(vaccine.getPatient()==null) && vaccine.getPatient().equals(patient))
                    {Object[] row = new Object[9];
                    row[0]=vaccine.getVaccineProduct();
                    row[1]=vaccine;
                    row[2]=vaccine.getVaccineProduct().getManufacturerName();
                    row[3]=vaccine.getVaccineProduct().getBatchId();
                    row[4]=vaccine.getVaccineProduct().getVaccineId();
                    row[5]=vaccine.getDate();
                    row[6]=vaccine.getSiteRoute();
                    row[7]=vaccine.getDoseNumber();
                    row[8]=vaccine.getshotstatus();
                    defaulttabelmodel.addRow(row);
                    
                    }
                }
            }
        }

    }
}
