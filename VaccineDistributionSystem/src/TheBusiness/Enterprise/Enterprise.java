/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TheBusiness.Enterprise;


import TheBusiness.Organization.Organization;
import TheBusiness.Organization.OrganizationDirectory;

/**
 *
 * @author karthik
 * 
 * 
 */

//Initializing abstract class  Enterprise extends Organization
public abstract class  Enterprise extends Organization{
    
    private String entprName;
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

    //Creating getter and setter.

    public String getEnterpriseName() {
        return entprName;
    }

    public void setEnterpriseName(String entprName) {
        this.entprName = entprName;
    }
    
    
   //Defining the Enterprises 
    public enum EnterpriseType
    {
        Hospital ("Hospital"),
        Manufacturer("Manufacturer"),
        Distributor("Distributor"),
        CDC("CDC"),
        LocalHealthDepartment("Local Health Department");
        
        private String val;
        
        private EnterpriseType(String val){
            this.val = val;
        }
        
        public String getValue(){
            return val;
        }

        @Override
        public String toString() {
            return val;
        }
              
    }
 
}
