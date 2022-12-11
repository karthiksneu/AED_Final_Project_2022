/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package TheBusiness.UserAccountManagement;

import TheBusiness.Personnel.Person;
import TheBusiness.Roles.Role;
import TheBusiness.WorkOrderQueue.WorkOrderQueue;

/**
 *
 * @author soham
 */
//Initializing Useraccount class with specific variables and Workqueue request
public class UserAccount {
    
    private String uname;
    private String password;
    private Person person;
    private Role role;
    private WorkOrderQueue workQueue;

    public UserAccount() {
        workQueue = new WorkOrderQueue();
    }
    
    
    //getters ans setters for the above variables
    
    public String getUsername() {
        return uname;
    }

    public void setUsername(String username) {
        this.uname = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Role getRole() {
        return role;
    }

    public void setPerson(Person employee) {
        this.person = employee;
    }

    public void setRole(Role role) {
        this.role = role;
    }

    public Person getPerson() {
        return person;
    }

    public WorkOrderQueue getWorkQueue() {
        return workQueue;
    }

    
    
    @Override
    public String toString() {
        return uname;
    }
    
    
    
}