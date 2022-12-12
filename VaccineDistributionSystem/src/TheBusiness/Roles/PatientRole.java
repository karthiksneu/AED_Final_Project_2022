/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package TheBusiness.Roles;

import TheBusiness.Ecosystems;
import TheBusiness.Enterprise.Enterprise;
import TheBusiness.Enterprise.HospitalEnterprise;
import TheBusiness.Network.StateNetwork;
import TheBusiness.Organization.Organization;
import TheBusiness.Organization.PatientOrganization;
import TheBusiness.UserAccountManagement.UserAccount;
import userinterface.Patient.PatientDashboard1;
import javax.swing.JPanel;

/**
 *
 * @author karthik
 */

//Initializing class PatientRole that extends Role
public class PatientRole extends Role{

    @Override
    public JPanel createWorkArea(JPanel userProcessContainer, UserAccount account, Enterprise enterprise, Organization organization, Ecosystems business, StateNetwork state) {
        return new PatientDashboard1(userProcessContainer, account, (HospitalEnterprise)enterprise, (PatientOrganization)organization, business);
    }
    
}
