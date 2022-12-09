/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package TheBusiness.Enterprise;

import TheBusiness.OrderManagement.OrderHistory;
import TheBusiness.Roles.Role;
import java.util.ArrayList;
//
/**
 *
 * @author Dsouza
 */

//Initializing  class  HospitalEnterprise extends Organization
public class HospitalEnterprise extends Enterprise {
    
    private OrderHistory orderHistory;
    
    public HospitalEnterprise(String name) {
        
        super(name, EnterpriseType.Hospital);
        this.orderHistory = new OrderHistory();
    }

    public OrderHistory getOrderHistory() {
        return orderHistory;
    }
    
   
    
}
