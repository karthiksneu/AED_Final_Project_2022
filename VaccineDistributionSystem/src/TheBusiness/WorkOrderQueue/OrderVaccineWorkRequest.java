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
 * @author karthik
 * 
 */

//Initializing class OrderVaccineWorkRequest extends WorkRequest 
public class OrderVaccineWorkRequest extends WorkRequest {

    private Order vaccineOrder;
    private Date shipdate;

    public OrderVaccineWorkRequest(Order vaccineOrder, Date shipdate) {
        this.vaccineOrder = vaccineOrder;
        this.shipdate = shipdate;
    }

    public OrderVaccineWorkRequest() {
        vaccineOrder = new Order();
    }

    public Order getVaccineOrder() {
        return vaccineOrder;
    }

    public void setVaccineOrder(Order vaccineOrder) {
        this.vaccineOrder = vaccineOrder;
    }

    public Date getShipdate() {
        return shipdate;
    }

    public void setShipdate(Date shipdate) {
        this.shipdate = shipdate;
    }

    @Override
    public String toString() {
        return String.valueOf(vaccineOrder.getOrderNumber());
    }

}
