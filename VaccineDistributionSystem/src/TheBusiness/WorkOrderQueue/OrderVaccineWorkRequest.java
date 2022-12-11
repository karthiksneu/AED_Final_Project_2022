/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TheBusiness.WorkOrderQueue;

import TheBusiness.OrderManagement.Order;
import java.util.Date;

/**
 *
 * @author Dsouza
 */
public class OrderVaccineWorkRequest {
    
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
