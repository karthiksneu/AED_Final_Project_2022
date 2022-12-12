/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package TheBusiness.Roles;

import TheBusiness.Ecosystems;
import TheBusiness.Enterprise.Enterprise;
import TheBusiness.Network.StateNetwork;
import TheBusiness.Organization.Organization;
import TheBusiness.UserAccountManagement.UserAccount;
import userinterface.EnterpriseAdmin.EnterpriseAdminDashboard;
import javax.swing.JPanel;

/**
 *
 * @author karthik
 */
//Initializing class EnterpriseAdminRole that extends Role
public class EnterpriseAdminRole extends Role{

    @Override
    public JPanel createWorkArea(JPanel userProcessContainer, UserAccount account,Enterprise enterprise, Organization organization, Ecosystems business, StateNetwork state) {
        return new EnterpriseAdminDashboard(userProcessContainer, enterprise, account, business);
    }

    
    
}
