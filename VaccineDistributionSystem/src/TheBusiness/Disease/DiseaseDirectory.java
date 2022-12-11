/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package TheBusiness.Disease;

import java.util.ArrayList;

/**
 *
 * @author karthik
 */


public class DiseaseDirectory {
    
    private ArrayList<Disease> diseaseDir;

    //Creating constructor for DiseaseDirectory which initializes the arraylist
    public DiseaseDirectory() {
        
        diseaseDir = new ArrayList<>();
    }

    public ArrayList<Disease> getdiseaseDir() {
        return diseaseDir;
    }

    public void setdiseaseDir(ArrayList<Disease> diseaseDir) {
        this.diseaseDir = diseaseDir;
    }
    
    
    public Disease addNewDisease(){
        
        Disease newDir = new Disease();
        diseaseDir.add(newDir);
        return newDir;        
        
    }
    
    
    public void removeDisease(Disease disease){
        
        diseaseDir.remove(disease);
    }
    
    
}
