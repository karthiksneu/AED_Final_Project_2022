<<<<<<< HEAD
package TheBusiness.WorkOrderQueue;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import TheBusiness.OrderManagement.Order;
import TheBusiness.UserAccountManagement.UserAccount;
=======
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TheBusiness.WorkOrderQueue;

import TheBusiness.OrderManagement.Order;
>>>>>>> ede3be31038cf031b10fa834bd37c779117db39a
import java.util.Date;

/**
 *
<<<<<<< HEAD
 * @author karthik
 * 
 */
//Initializing class ShippingOrderWorkRequest extends WorkRequest
public class ShippingOrderWorkRequest extends WorkRequest {

    private Order vaccineOrder;
    private Date shippingDate;
    
    private Order shipOrder;
=======
 * @author Dsouza
 */



public class ShippingOrderWorkRequest extends WorkRequest {
    
    private Order vaccineOrder;
    private Order shipOrder;
   
    private Date shippingDate;
>>>>>>> ede3be31038cf031b10fa834bd37c779117db39a

    public ShippingOrderWorkRequest() {
        shipOrder = new Order();
    }
<<<<<<< HEAD
=======
 

    public Order getVaccineOrder() {
        return vaccineOrder;
    }

    public void setVaccineOrder(Order vaccineOrder) {
        this.vaccineOrder = vaccineOrder;
    }
>>>>>>> ede3be31038cf031b10fa834bd37c779117db39a

    public Order getShipOrder() {
        return shipOrder;
    }

    public void setShipOrder(Order shipOrder) {
        this.shipOrder = shipOrder;
    }

    public Date getShippingDate() {
        return shippingDate;
    }

    public void setShippingDate(Date shippingDate) {
        this.shippingDate = shippingDate;
    }

<<<<<<< HEAD
    public Order getVaccineOrder() {
        return vaccineOrder;
    }

    public void setVaccineOrder(Order vaccineOrder) {
        this.vaccineOrder = vaccineOrder;
    }

=======
>>>>>>> ede3be31038cf031b10fa834bd37c779117db39a
    @Override
    public String toString() {
        return String.valueOf(vaccineOrder.getOrderNumber());
    }
<<<<<<< HEAD

}
=======
   
    
}

>>>>>>> ede3be31038cf031b10fa834bd37c779117db39a
