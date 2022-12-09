/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TheBusiness.Enterprise;

import TheBusiness.Organization.Organization;
import TheBusiness.Organization.OrganizationDirectory;

/**
 *
 * @author Dsouza
 */
public abstract class  Enterprise extends Organization{
    
    private String enterpriseName;
    private EnterpriseType enterpriseType;
    private OrganizationDirectory organizationDirectory;
  
    
    
    public Enterprise (String name, EnterpriseType type){
        super(name);
        this.organizationDirectory = new OrganizationDirectory();
        this.enterpriseType = type;
        
    }

    public EnterpriseType getEnterpriseType() {
        return enterpriseType;
    }

    public OrganizationDirectory getOrganizationDirectory() {
        return organizationDirectory;
    }



    public String getEnterpriseName() {
        return enterpriseName;
    }

    public void setEnterpriseName(String enterpriseName) {
        this.enterpriseName = enterpriseName;
    }
    
    
   //Defining the Enterprises 
    public enum EnterpriseType
    {
        Hospital ("Hospital"),
        CDC("CDC"),
        Manufacturer("Manufacturer"),
        Distributor("Distributor"),
        LocalHealthDepartment("Local Health Department");
        private String value;
        
        private EnterpriseType(String value){
            this.value = value;
        }
        
        public String getValue(){
            return value;
        }

        @Override
        public String toString() {
            return value;
        }
              
    }
    
}