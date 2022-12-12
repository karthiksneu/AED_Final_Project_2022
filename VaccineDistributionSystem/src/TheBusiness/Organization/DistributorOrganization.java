/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package TheBusiness.Organization;

import TheBusiness.Roles.DistributorRole;
import TheBusiness.Roles.Role;
import TheBusiness.WarehouseManagement.WarehouseDirectory;
import java.util.ArrayList;

/**
 *
 * @author karthik
 */
//INitializing our DistributorOrganization that extends our Organization Entity
public class DistributorOrganization extends Organization{
    
    private WarehouseDirectory warehouseDir;
    
    public DistributorOrganization() {
        super(OrganizationType.DistributorOrg.getValue());
        warehouseDir = new WarehouseDirectory();
    }

    public WarehouseDirectory getWarehouseDir() {
        return warehouseDir;
    }
    
    
    
    
    
    @Override
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> roles = new ArrayList<>();
        roles.add(new DistributorRole());
        return roles;
    }
    
}
