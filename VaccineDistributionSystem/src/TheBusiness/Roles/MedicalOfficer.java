/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TheBusiness.Roles;

import TheBusiness.Ecosystems;
import TheBusiness.Enterprise.Enterprise;
import TheBusiness.Enterprise.HospitalEnterprise;
import TheBusiness.NationalEnterprise.CenterOfDiseaseControl;
import TheBusiness.Network.StateNetwork;
import TheBusiness.Organization.CDCOrganization;
import TheBusiness.Organization.Organization;
import TheBusiness.Organization.PatientOrganization;
import TheBusiness.Organization.MedicalOrganization;
import TheBusiness.UserAccountManagement.UserAccount;
import userinterface.CDC.CDCMedicalOfficer;
import userinterface.Patient.PatientDashboard1;
import javax.swing.JPanel;

/**
 *
 * @author soham
 */


//Initializing class MedicalOfficer that extends Role
public class MedicalOfficer extends Role{
    
    @Override
    public JPanel createWorkArea(JPanel userProcessContainer, UserAccount account, Enterprise enterprise, Organization organization, Ecosystems business, StateNetwork state) {
        return new CDCMedicalOfficer(userProcessContainer, account,business, (CenterOfDiseaseControl)enterprise, (MedicalOrganization)organization);
    }
    
}
