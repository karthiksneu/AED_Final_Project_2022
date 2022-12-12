/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package TheBusiness.Roles;

import TheBusiness.Ecosystems;
import TheBusiness.Enterprise.Enterprise;
import TheBusiness.NationalEnterprise.Distributor;
import TheBusiness.Network.StateNetwork;
import TheBusiness.Organization.DistributorOrganization;
import TheBusiness.Organization.Organization;
import TheBusiness.UserAccountManagement.UserAccount;
import userinterface.Distributor.DistributorEmplDashboard;
import javax.swing.JPanel;

/**
 *
 * @author DELL
 */

//Initializing class DistributorRole that extends Role
public class DistributorRole extends Role{

    @Override
    public JPanel createWorkArea(JPanel userProcessContainer, UserAccount account, Enterprise enterprise, Organization organization, Ecosystems business, StateNetwork state) {
        return new DistributorEmplDashboard(userProcessContainer, account, (Distributor)enterprise, (DistributorOrganization)organization, business);
    }
    
}
