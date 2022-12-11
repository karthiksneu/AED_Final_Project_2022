/*
<<<<<<< HEAD
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
=======
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
>>>>>>> ede3be31038cf031b10fa834bd37c779117db39a
 */
package TheBusiness.WorkOrderQueue;

import TheBusiness.UserAccountManagement.UserAccount;
import java.util.Date;

/**
 *
<<<<<<< HEAD
 * @author karthik
 * 
 */

//Initializing abstract class WorkRequest
=======
 * @author Dsouza
 */
>>>>>>> ede3be31038cf031b10fa834bd37c779117db39a
public abstract class WorkRequest {

    private String message;
    private UserAccount sender;
    private UserAccount receiver;
    private String status;
    private Date requestDate;
    private Date resolveDate;
    
    public WorkRequest(){
        requestDate = new Date();
    }

<<<<<<< HEAD
    public WorkRequest(String message, UserAccount sender, UserAccount receiver, String status, Date requestDate, Date resolveDate) {
        this.message = message;
        this.sender = sender;
        this.receiver = receiver;
        this.status = status;
        this.requestDate = requestDate;
        this.resolveDate = resolveDate;
    }

=======
>>>>>>> ede3be31038cf031b10fa834bd37c779117db39a
    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public UserAccount getSender() {
        return sender;
    }

    public void setSender(UserAccount sender) {
        this.sender = sender;
    }

    public UserAccount getReceiver() {
        return receiver;
    }

    public void setReceiver(UserAccount receiver) {
        this.receiver = receiver;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

<<<<<<< HEAD
    public Date getResolveDate() {
        return resolveDate;
    }

    public void setResolveDate(Date resolveDate) {
        this.resolveDate = resolveDate;
    }
    
=======
>>>>>>> ede3be31038cf031b10fa834bd37c779117db39a
    public Date getRequestDate() {
        return requestDate;
    }

    public void setRequestDate(Date requestDate) {
        this.requestDate = requestDate;
    }

<<<<<<< HEAD
    @Override
    public String toString() {
        return "WorkRequest{" + '}';
    }

=======
    public Date getResolveDate() {
        return resolveDate;
    }

    public void setResolveDate(Date resolveDate) {
        this.resolveDate = resolveDate;
    }
>>>>>>> ede3be31038cf031b10fa834bd37c779117db39a
}
