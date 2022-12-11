/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package TheBusiness.WorkOrderQueue;

import java.util.ArrayList;

/**
 *
 * @author karthik
 * 
 **/

//Initializing Class WorkOrderQueue
public class WorkOrderQueue {
    
    private ArrayList<WorkRequest> workRequestList;

    public WorkOrderQueue() {
        workRequestList = new ArrayList<>();
    }

    public WorkOrderQueue(ArrayList<WorkRequest> workRequestList) {
        this.workRequestList = workRequestList;
    }

    public ArrayList<WorkRequest> getWorkRequestList() {
        return workRequestList;
    }

    public void setWorkRequestList(ArrayList<WorkRequest> workRequestList) {
        this.workRequestList = workRequestList;
    }
    
    public WorkRequest addWorkRequest(WorkRequest request){
        
        workRequestList.add(request);
        return request;
    }
    
    public void removeWorkRequest(WorkRequest request){
        workRequestList.remove(request);
    }
    
}