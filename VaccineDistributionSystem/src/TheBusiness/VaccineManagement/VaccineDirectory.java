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

//Crating class VaccineDirectory
public class VaccineDirectory {
    
    private ArrayList<Vaccine> vaccineCatalog;

    
    
    public VaccineDirectory() {
        
        vaccineCatalog = new ArrayList<>();
    }

    
    public ArrayList<Vaccine> getVaccineCatalog() {
        return vaccineCatalog;
    }

    public void setVaccineCatalog(ArrayList<Vaccine> vaccineCatalog) {
        this.vaccineCatalog = vaccineCatalog;
    }
    
    //remove
    
    public void removeVaccineDefinition(Vaccine vaccine){
        
        vaccineCatalog.remove(vaccine);
    }
    
    
    //addvacc method
    public Vaccine addNewVaccineDefinition(){
        
        Vaccine newestVaccine = new Vaccine();
        vaccineCatalog.add(newestVaccine);
        return newestVaccine;
        
    }
    
    
    
    
    
}
