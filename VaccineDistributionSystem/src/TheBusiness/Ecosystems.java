/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package TheBusiness;

import TheBusiness.Disease.DiseaseDirectory;
import TheBusiness.NationalEnterprise.CenterOfDiseaseControl;
import TheBusiness.NationalEnterprise.Distributor;
import TheBusiness.NationalEnterprise.ManufacturerDirectory;
import TheBusiness.Network.StateNetwork;
import TheBusiness.Organization.Organization;
import TheBusiness.Roles.Role;
import TheBusiness.Roles.SystemAdminRole;
import TheBusiness.VaccineManagement.VaccineDirectory;
import java.util.ArrayList;



/**
 *
 * @author soham
 */

//Definig Ecosystem Class
public class Ecosystems extends Organization{
    
    private static Ecosystems business;
    
    private ArrayList<StateNetwork> stateDirectory;
    private CenterOfDiseaseControl cdc;
    private ManufacturerDirectory manufacturerDirectory;
    private Distributor distributor;
    private VaccineDirectory vaccineDirectory;
    private DiseaseDirectory diseaseDirectory;
    
  
    
    public static Ecosystems getInstance(){
        if (business == null){
            business = new Ecosystems();
        }
        return business;
        
    }

    private Ecosystems() {
        super(null); 
      
      this.stateDirectory = new ArrayList<StateNetwork>();
      cdc = new CenterOfDiseaseControl("CDC");
      manufacturerDirectory = new ManufacturerDirectory();
      distributor = new Distributor("Vaccine Distributor");
      vaccineDirectory = new VaccineDirectory();
      diseaseDirectory = new DiseaseDirectory();
      
    }

    public static Ecosystems getBusiness() {
        return business;
    }

    public VaccineDirectory getVaccineDirectory() {
        return vaccineDirectory;
    }

    public DiseaseDirectory getDiseaseDirectory() {
        return diseaseDirectory;
    }

    

    public ArrayList<StateNetwork> getStateList() {
        return stateDirectory;
    }

    public CenterOfDiseaseControl getCdc() {
        return cdc;
    }

    public ManufacturerDirectory getManufacturerDirectory() {
        return manufacturerDirectory;
    }

    public Distributor getDistributor() {
        return distributor;
    }
    
    
    public StateNetwork addNewState(String name){
        
        StateNetwork state = new StateNetwork();
        state.setStateName(name);
        stateDirectory.add(state);
        return state;
    }
    
    public void removeState(StateNetwork state){
        
        stateDirectory.remove(state);
    }
 
    @Override
    public ArrayList<Role> getSupportedRole() {
       ArrayList<Role> roleList = new ArrayList<Role>();
       roleList.add(new SystemAdminRole());
       return roleList;
    }

   
}