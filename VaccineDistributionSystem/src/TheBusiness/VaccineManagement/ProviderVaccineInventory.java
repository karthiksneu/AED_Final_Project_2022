/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package TheBusiness.VaccineManagement;

import java.util.ArrayList;

/**
 *
 * @author Dsouza
 */

//Initializing ProviderVacineInventory
public class ProviderVaccineInventory {
    private ArrayList<VaccineDetails> vaccineDetailsList;

    public ProviderVaccineInventory() {
        
        vaccineDetailsList = new ArrayList<>();
    }

    public ArrayList<VaccineDetails> getVaccineDetailsList() {
        return vaccineDetailsList;
    }

    public void setVaccineDetailsList(ArrayList<VaccineDetails> vdl) {
        this.vaccineDetailsList = vdl;
    }
    
    //add vac method
    
    
    public VaccineDetails addNewVaccineDetail(){
        
        VaccineDetails vdlist = new VaccineDetails();
        vaccineDetailsList.add(vdlist);
        return vdlist;
  
    }
    
    
    // remove vac method
    
    
    public void removeVaccineDetail(VaccineDetails vds){
        
        vaccineDetailsList.remove(vds);
    }
}
