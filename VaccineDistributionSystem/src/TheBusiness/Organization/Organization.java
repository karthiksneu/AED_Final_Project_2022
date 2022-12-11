/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TheBusiness.Organization;

/**
 *
 * @author Dsouza
 */
public class Organization {
    
    private String name;
    
    
     private int organizationID;
       public enum OrganizationType{
        EnterpriseAdminOrg("Enterprise Admin Organization") ,
        CDCOrg ("CDC Organization"),
           ManufactureOrg("Manufacture Organization"),
           DistributorOrg("Distributor Organization"),
           LocalHealthDepartmentOrg("Local Health Department"),
           HospitalOrg("Hospital Organization"),
           PatientOrganization("Patient Organization"),
           MedicalOrganization("Medical Organization"),
           ClinicOrganization("Clinic Organization");
        private String value;
        private OrganizationType(String value) {
            this.value = value;
        }
        public String getValue() {
            return value;
        }

    }

    public Organization(String name) {
        this.name = name;
       
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getOrganizationID() {
        return organizationID;
    }

    public void setOrganizationID(int organizationID) {
        this.organizationID = organizationID;
    }
}
