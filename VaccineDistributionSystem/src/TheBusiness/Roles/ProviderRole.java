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
import TheBusiness.Organization.HospitalOrganization;
import TheBusiness.Organization.Organization;
import TheBusiness.UserAccountManagement.UserAccount;
import userinterface.Provider.ProviderDashboard;
import javax.swing.JPanel;

/**
 *
 * @author karthik
 */
//Initializing class ProviderRole that extends Role
public class ProviderRole extends Role{

    @Override
    public JPanel createWorkArea(JPanel userProcessContainer, UserAccount account, Enterprise enterprise, Organization organization, Ecosystems business, StateNetwork state) {
        return new ProviderDashboard(userProcessContainer, account, (HospitalEnterprise)enterprise, (HospitalOrganization)organization, business, state);
    }
    
}
