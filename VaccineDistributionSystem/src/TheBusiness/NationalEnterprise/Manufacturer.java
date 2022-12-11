/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package TheBusiness.NationalEnterprise;

import TheBusiness.Enterprise.Enterprise;
import TheBusiness.Roles.Role;
import java.util.ArrayList;

/**
 *
 * @author karthik
 */

//Creating a class Manufacturer 
public class Manufacturer extends Enterprise {
    
    //Constructor for Manufacturer
    public Manufacturer(String name) {
        super(name , EnterpriseType.Manufacturer);
    }

    
    @Override
    public ArrayList<Role> getSupportedRole() {
        return null;
    }

    
    
    
}
