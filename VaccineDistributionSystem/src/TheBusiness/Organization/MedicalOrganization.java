/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TheBusiness.Organization;

import TheBusiness.Roles.MedicalOfficer;
import TheBusiness.Roles.PatientRole;
import TheBusiness.Roles.Role;
import java.util.ArrayList;

/**
 *
 * @author soham
 */

//INitializing our MedicalOrganization that extends our Organization Entity
public class MedicalOrganization extends Organization{
    public MedicalOrganization() {
        super(OrganizationType.MedicalOrganization.getValue());
    }
    
    
    
    
    @Override
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> roles = new ArrayList<>();
        roles.add(new MedicalOfficer());
        return roles;
    }
    
}
