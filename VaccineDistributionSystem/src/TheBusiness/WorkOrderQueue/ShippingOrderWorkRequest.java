package TheBusiness.WorkOrderQueue;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import TheBusiness.OrderManagement.Order;
import TheBusiness.UserAccountManagement.UserAccount;
import java.util.Date;

/**
 *
 * @author karthik
 * 
 */
//Initializing class ShippingOrderWorkRequest extends WorkRequest
public class ShippingOrderWorkRequest extends WorkRequest {

    private Order vaccineOrder;
    private Date shippingDate;
    
    private Order shipOrder;

    public ShippingOrderWorkRequest() {
        shipOrder = new Order();
    }

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
