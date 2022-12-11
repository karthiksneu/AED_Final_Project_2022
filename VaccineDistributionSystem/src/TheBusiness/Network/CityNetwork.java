/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TheBusiness.Network;

import TheBusiness.Enterprise.Enterprise;
import TheBusiness.Enterprise.EnterpriseDirectory;
import TheBusiness.Enterprise.HospitalEnterprise;
import TheBusiness.Organization.HospitalOrganization;
import TheBusiness.Organization.Organization;

/**
 *
 * @author karthik
 * 
 */


//Initializing class CityNetwork for fetching City Name
public class CityNetwork {

    private EnterpriseDirectory enterpriseDir;
    private String cityName;

    public CityNetwork() {
        this.enterpriseDir = new EnterpriseDirectory();

    }

    public String getName() {
        return cityName;
    }

    public void setName(String name) {
        this.cityName = name;
    }

    public EnterpriseDirectory getEnterpriseDirectory() {
        return enterpriseDir;
    }

    public void setEnterpriseDirectory(EnterpriseDirectory enterpriseDir) {
        this.enterpriseDir = enterpriseDir;
    }

    @Override
    public String toString() {
        return cityName;
    }



    //displays number of failed vaccines in city
    public int getTotalFailedVaccinesInCity() {
        int sum = 0;
        if (enterpriseDir != null) {
            for (Enterprise enterprise : enterpriseDir.getEnterpriseDirectory()) {
                if (enterprise instanceof HospitalEnterprise) {
                    HospitalEnterprise he = (HospitalEnterprise) enterprise;
                    for (Organization org : he.getOrganizationDirectory().getOrganizationList()) {
                        if (org instanceof HospitalOrganization) {
                            HospitalOrganization ho = (HospitalOrganization) org;
                            sum = sum + ho.getClinic().getTotalVaccinesFailed();
                        }
                    }
                }
            }
        }

        return sum;

    }
    
        //displays number of vaccinesadministerdin city
    public int getTotalVaccinesAdministeredInCity() {
        int sum = 0;
        if (enterpriseDir != null) {
            for (Enterprise enterprise : enterpriseDir.getEnterpriseDirectory()) {
                if (enterprise instanceof HospitalEnterprise) {
                    HospitalEnterprise he = (HospitalEnterprise) enterprise;
                    for (Organization org : he.getOrganizationDirectory().getOrganizationList()) {
                        if (org instanceof HospitalOrganization) {
                            HospitalOrganization ho = (HospitalOrganization) org;
                            sum = sum + ho.getClinic().getTotalAdministeredVaccines();
                        }
                    }
                }
            }
        }

        return sum;

    }

    //displays number of distributed vaccines in city
    public int getTotalVaccinesDistributedInCity() {
        int sum = 0;
        if (enterpriseDir != null) {
            for (Enterprise enterprise : enterpriseDir.getEnterpriseDirectory()) {
                if (enterprise instanceof HospitalEnterprise) {
                    HospitalEnterprise he = (HospitalEnterprise) enterprise;
                    for (Organization org : he.getOrganizationDirectory().getOrganizationList()) {
                        if (org instanceof HospitalOrganization) {
                            HospitalOrganization ho = (HospitalOrganization) org;
                            sum = sum + ho.getClinic().getTotalStoredVaccines();
                        }
                    }
                }
            }
        }

        return sum;

    }

}
