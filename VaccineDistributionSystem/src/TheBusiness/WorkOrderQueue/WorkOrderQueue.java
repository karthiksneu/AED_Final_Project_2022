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

import java.util.ArrayList;

/**
 *
<<<<<<< HEAD
 * @author karthik
 * 
 **/

//Initializing Class WorkOrderQueue
=======
 * @author Dsouza
 */
>>>>>>> ede3be31038cf031b10fa834bd37c779117db39a
public class WorkOrderQueue {
    
    private ArrayList<WorkRequest> workRequestList;

    public WorkOrderQueue() {
        workRequestList = new ArrayList<>();
    }

<<<<<<< HEAD
    public WorkOrderQueue(ArrayList<WorkRequest> workRequestList) {
        this.workRequestList = workRequestList;
    }

    public ArrayList<WorkRequest> getWorkRequestList() {
        return workRequestList;
    }

    public void setWorkRequestList(ArrayList<WorkRequest> workRequestList) {
        this.workRequestList = workRequestList;
    }
=======
    public ArrayList<WorkRequest> getWorkRequestList() {
        return workRequestList;
    }
>>>>>>> ede3be31038cf031b10fa834bd37c779117db39a
    
    public WorkRequest addWorkRequest(WorkRequest request){
        
        workRequestList.add(request);
        return request;
    }
    
    public void removeWorkRequest(WorkRequest request){
        workRequestList.remove(request);
    }
    
<<<<<<< HEAD
}
=======
}
>>>>>>> ede3be31038cf031b10fa834bd37c779117db39a
