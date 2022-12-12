/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package TheBusiness.Roles;

import TheBusiness.Ecosystems;
import TheBusiness.Enterprise.Enterprise;
import TheBusiness.NationalEnterprise.CenterOfDiseaseControl;
import TheBusiness.Network.StateNetwork;
import TheBusiness.Organization.CDCOrganization;
import TheBusiness.Organization.Organization;
import TheBusiness.UserAccountManagement.UserAccount;
import userinterface.CDC.EmployeeCDC;
import javax.swing.JPanel;

/**
 *
 * @author DELL
 */

//Initializing class CDCEmployeeRole that extends Role

public class CDCEmployeeRole extends Role{

    @Override
    public JPanel createWorkArea(JPanel userProcessContainer, UserAccount account, Enterprise enterprise, Organization organization, Ecosystems business, StateNetwork state) {
        return new EmployeeCDC(userProcessContainer, account, (CenterOfDiseaseControl)enterprise, (CDCOrganization)organization, business);
    }
    
}
