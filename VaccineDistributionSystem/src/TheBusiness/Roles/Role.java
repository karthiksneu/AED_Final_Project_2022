/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TheBusiness.Roles;

import TheBusiness.Ecosystems;
import TheBusiness.Enterprise.Enterprise;

import TheBusiness.Organization.Organization;

import javax.swing.JPanel;
import javax.swing.JPanel;

/**
 *
 * @author Dsouza
 */
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
    
    public abstract JPanel createWorkArea(JPanel userProcessContainer, Enterprise enterprise, Organization organization, Ecosystems business);

    @Override
    public String toString() {
        return this.getClass().getName();
    }
    
}
