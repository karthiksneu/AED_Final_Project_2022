/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package TheBusiness.Organization;

import TheBusiness.Roles.PatientRole;
import TheBusiness.Roles.Role;
import java.util.ArrayList;

/**
 *
 * @author karthik
 */

//INitializing our PatientOrganization that extends our Organization Entity
public class PatientOrganization extends Organization{

    public PatientOrganization() {
        super(OrganizationType.PatientOrganization.getValue());
    }
    

    @Override
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> roles = new ArrayList<>();
        roles.add(new PatientRole());
        return roles;
    }
    
}
