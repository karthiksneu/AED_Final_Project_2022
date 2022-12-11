/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package TheBusiness.Organization;

import TheBusiness.Roles.LocalHealthDepartmentRole;
import TheBusiness.Roles.Role;
import java.util.ArrayList;

/**
 *
 * @author DELL
 */

//INitializing our LocalHealthDptImmuneOrganization that extends our Organization Entity
public class LocalHealthDptImmuneOrganization extends Organization{

    public LocalHealthDptImmuneOrganization() {
        super(OrganizationType.LocalHealthDepartmentOrg.getValue());
    }
    
    
    
    @Override
    public ArrayList<Role> getSupportedRole() {
          ArrayList<Role> roles = new ArrayList<>();
        roles.add(new LocalHealthDepartmentRole());
        return roles;
    }
    
}
