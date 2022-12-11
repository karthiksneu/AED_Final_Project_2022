/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TheBusiness.WarehouseManagement;

import TheBusiness.VaccineManagement.VaccineDetails;
import java.util.ArrayList;

/**
 *
 * @author soham
 *
 */


//Creating class Warehouse
public class Warehouse {

    private ArrayList<VaccineDetails> vacInventoryList;
    private String location;
    private int id;
    private static int count = 1;

    public Warehouse(ArrayList<VaccineDetails> vacInventoryList, String location, int id) {
        this.vacInventoryList = vacInventoryList;
        this.location = location;
        this.id = id;
    }
    
    //Creating Constructor for WareHouse
    public Warehouse() {

        vacInventoryList = new ArrayList<>();
        id = count++;
    }

    public ArrayList<VaccineDetails> getVaccineInventoryList() {
        return vacInventoryList;
    }

    public void setVaccineInventoryList(ArrayList<VaccineDetails> vaccineProductList) {
        this.vacInventoryList = vaccineProductList;
    }

    public VaccineDetails addNewVaccineProduct() {

        VaccineDetails vaccineProduct = new VaccineDetails();
        vacInventoryList.add(vaccineProduct);
        return vaccineProduct;

    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void addVaccineProduct(VaccineDetails vd) {

        vacInventoryList.add(vd);
    }

    public void removeVaccineProduct(VaccineDetails vaccineProduct) {
        vacInventoryList.remove(vaccineProduct);
    }

    @Override
    public String toString() {
        return String.valueOf(id);
    }

}
