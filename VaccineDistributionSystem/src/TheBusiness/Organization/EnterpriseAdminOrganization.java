/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TheBusiness.Organization;

import TheBusiness.Roles.EnterpriseAdminRole;
import TheBusiness.Roles.Role;
import java.util.ArrayList;

/**
 *
 * @author Dsouza
 */
public class EnterpriseAdminOrganization extends Organization{

    public EnterpriseAdminOrganization() {
        super(Organization.OrganizationType.EnterpriseAdminOrg.getValue());
    }
    
    @Override
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> roles = new ArrayList<>();
        roles.add(new EnterpriseAdminRole());
        return roles;
    }
     
}