/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package TheBusiness.Organization;

import TheBusiness.Roles.EnterpriseAdminRole;
import TheBusiness.Roles.Role;
import java.util.ArrayList;

/**
 *
 * @author karthik
 */

//INitializing our EnterpriseAdminOrganization that extends our Organization Entity
public class EnterpriseAdminOrganization extends Organization{

    public EnterpriseAdminOrganization() {
        super(OrganizationType.EnterpriseAdminOrg.getValue());
    }
    
    @Override
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> roles = new ArrayList<>();
        roles.add(new EnterpriseAdminRole());
        return roles;
    }
     
}
