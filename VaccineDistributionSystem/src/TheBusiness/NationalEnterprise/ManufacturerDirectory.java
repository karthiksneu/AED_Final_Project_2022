/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TheBusiness.NationalEnterprise;

import java.util.ArrayList;

/**
 *
 * @author karthik
 * 
 */

//Creating a class ManufacturerDirectory
public class ManufacturerDirectory {

    private ArrayList<Manufacturer> manufacturerDir;

    //Creating a constructor for ManufacturerDirectory
    public ManufacturerDirectory() {

        manufacturerDir = new ArrayList<>();

    }
    
    public Manufacturer addNewManufacturer(String name) {

        Manufacturer newManu = new Manufacturer(name);
        manufacturerDir.add(newManu);
        return newManu;
    }

    public void removeManufacturer(Manufacturer manf) {

        manufacturerDir.remove(manf);
    }

    public ArrayList<Manufacturer> getManufacturerDirectory() {
        return manufacturerDir;
    }

    public void setManufacturerDirectory(ArrayList<Manufacturer> manufacturerDir) {
        this.manufacturerDir = manufacturerDir;
    }

    

}
