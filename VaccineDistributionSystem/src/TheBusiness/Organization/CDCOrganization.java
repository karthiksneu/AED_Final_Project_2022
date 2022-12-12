/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package TheBusiness.Organization;

import TheBusiness.OrderManagement.OrderHistory;
import TheBusiness.Roles.CDCEmployeeRole;
import TheBusiness.Roles.Role;
import java.util.ArrayList;

/**
 *
 * @author DELL
 */

//INitializing our CDCOrganization that extends our Organization Entity
public class CDCOrganization extends Organization{
    
    private OrderHistory distributorOrders;
    public CDCOrganization() {
        super(OrganizationType.CDCOrg.getValue());
        distributorOrders = new OrderHistory();
    }

    public OrderHistory getDistributorOrders() {
        return distributorOrders;
    }

    public void setDistributorOrders(OrderHistory distributorOrders) {
        this.distributorOrders = distributorOrders;
    }
    
    
    
        
    @Override
    public ArrayList<Role> getSupportedRole() {
       ArrayList<Role> roles = new ArrayList<>();
        roles.add(new CDCEmployeeRole());
        return roles;
    }
    
}
