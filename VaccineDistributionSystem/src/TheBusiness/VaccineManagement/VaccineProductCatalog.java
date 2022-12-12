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

//Creating CLass VaccineProductCatalog
public class VaccineProductCatalog {
    
    private ArrayList<VaccineDetails> vaccineDetailList;

    public VaccineProductCatalog() {
        
        vaccineDetailList = new ArrayList<>();
    }

    public ArrayList<VaccineDetails> getVaccineProductList() {
        return vaccineDetailList;
    }

    public void setVaccineProductList(ArrayList<VaccineDetails> vdl) {
        this.vaccineDetailList = vdl;
    }
    
    public VaccineDetails addNewVaccineProduct(){
        
        VaccineDetails vds = new VaccineDetails();
        vaccineDetailList.add(vds);
        return vds;

    }
    
    
    //remove method
    public void removeVaccineProduct(VaccineDetails vaccineProducts){  
        vaccineDetailList.remove(vaccineProducts);
    }

    
}
