/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package TheBusiness.Roles;

import TheBusiness.Ecosystems;
import TheBusiness.Enterprise.Enterprise;
import TheBusiness.Enterprise.LocalHealthDepartment;
import TheBusiness.Network.StateNetwork;
import TheBusiness.Organization.Organization;
import TheBusiness.Organization.LocalHealthDptImmuneOrganization;
import TheBusiness.UserAccountManagement.UserAccount;
import userinterface.LocalHealthDepartment.LHDEmplDashboard;
import javax.swing.JPanel;

/**
 *
 * @author DELL
 */

//Initializing class LocalHealthDepartmentRole that extends Role
public class LocalHealthDepartmentRole extends Role {

    @Override
    public JPanel createWorkArea(JPanel userProcessContainer, UserAccount account, Enterprise enterprise, Organization organization, Ecosystems business, StateNetwork state) {
        return new LHDEmplDashboard(userProcessContainer, account, (LocalHealthDepartment)enterprise, (LocalHealthDptImmuneOrganization)organization, business, state);
    }
    
}
