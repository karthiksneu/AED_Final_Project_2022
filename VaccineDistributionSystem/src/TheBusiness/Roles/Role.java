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
import javax.swing.JPanel;

/**
 *
 * @author DELL
 */

//Initializing our abstract Role class considerng the below roles in this project
public abstract class Role {
    
    public enum RoleType{
        EnterpriseAdmin("Enterprise Admin"),
        CDCEmployee("CDC Employee"),
        Distributor("Distributor"),
        Provider("Provider"),
        Manufacturer("Manufacturer"),
        Patient("Patient"),
        LocalHealthDepartment("Local Health Department"),
        MedicalOfficer("Medical Officer"),
        ClinicProvider("Clinc Provider");
        
        private String value;
        private RoleType(String value){
            this.value = value;
        }

        public String getValue() {
            return value;
        }

        @Override
        public String toString() {
            return value;
        }
    }
    
    public abstract JPanel createWorkArea(JPanel userProcessContainer, UserAccount account, Enterprise enterprise, Organization organization, Ecosystems business, StateNetwork state);

    @Override
    public String toString() {
        return this.getClass().getName();
    }
    
    
}