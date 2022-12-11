/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package TheBusiness.WarehouseManagement;

import java.util.ArrayList;

/**
 *
 * @author soham
 * 
 */

//Creating class WarehouseDirectory
public class WarehouseDirectory {
    
    private ArrayList<Warehouse> warehouseList;
    
    //Creating Constructors for WarehouseDirectory

    public WarehouseDirectory(ArrayList<Warehouse> warehouseList) {
        this.warehouseList = warehouseList;
    }

    public WarehouseDirectory() {
        warehouseList = new ArrayList<>();
    }

    public Warehouse addNewWareHouse(){
        
        Warehouse warehouse = new Warehouse();
        warehouseList.add(warehouse);
        return warehouse;
    }
    
    
    public void removeWarehouse(Warehouse warehouse){
        
        warehouseList.remove(warehouse);
    }
    
    
    public ArrayList<Warehouse> getWarehouseList() {
        return warehouseList;
    }

    public void setWarehouseList(ArrayList<Warehouse> warehouseList) {
        this.warehouseList = warehouseList;
    }

    @Override
    public String toString() {
        return super.toString(); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
    }
    
    
    
}
