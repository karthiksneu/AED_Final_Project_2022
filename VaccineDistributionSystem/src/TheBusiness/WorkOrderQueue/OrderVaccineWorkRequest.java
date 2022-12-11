/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package TheBusiness.WorkOrderQueue;

import TheBusiness.OrderManagement.Order;
import java.util.Date;

/**
 *
 * @author DELL
 */

//Initializing class OrderVaccineWorkRequest extends WorkRequest 
public class OrderVaccineWorkRequest extends WorkRequest {
    
    private Order vaccineOrder;
    private Date shipdate;

    public OrderVaccineWorkRequest() {
        vaccineOrder = new Order();
    }

    public Date getShipdate() {
        return shipdate;
    }

    public void setShipdate(Date shipdate) {
        this.shipdate = shipdate;
    }

    public Order getVaccineOrder() {
        return vaccineOrder;
    }

    public void setVaccineOrder(Order vaccineOrder) {
        this.vaccineOrder = vaccineOrder;
    }

    @Override
    public String toString() {
        return String.valueOf(vaccineOrder.getOrderNumber());
    }
     
    
}
