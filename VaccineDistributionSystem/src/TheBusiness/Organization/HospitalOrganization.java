/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package TheBusiness.Organization;

import TheBusiness.Clinic.Clinic;
import TheBusiness.OrderManagement.OrderHistory;
import TheBusiness.Roles.ProviderRole;
import TheBusiness.Roles.Role;
import TheBusiness.VaccineManagement.ProviderVaccineInventory;
import java.util.ArrayList;

/**
 *
 * @author karthik
 */

//INitializing our HospitalOrganization that extends our Organization Entity
public class HospitalOrganization extends Organization{
    
    private ProviderVaccineInventory vaccineInventory;
    private OrderHistory oc;
    private Clinic clinic;
    
    public HospitalOrganization() {
        
        super(OrganizationType.HospitalOrg.getValue());
        vaccineInventory = new ProviderVaccineInventory();
        this.clinic = new Clinic();
        this.oc = new OrderHistory();
    }

    public OrderHistory getOc() {
        return oc;
    }

    public void setOc(OrderHistory oc) {
        this.oc = oc;
    }
    
    
    public ProviderVaccineInventory getVaccineInventory() {
        return vaccineInventory;
    }

    public Clinic getClinic() {
        return clinic;
    }

    public void setClinic(Clinic clinic) {
        this.clinic = clinic;
    }
    

    
    @Override
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> roles = new ArrayList<>();
        roles.add(new ProviderRole());
        return roles;
    }
    
}
