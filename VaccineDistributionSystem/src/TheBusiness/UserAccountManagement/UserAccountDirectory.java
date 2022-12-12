/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package TheBusiness.UserAccountManagement;

import TheBusiness.Personnel.Person;
import TheBusiness.Roles.Role;
import java.util.ArrayList;

/**
 *
 * @author Dsouza
 */

//INitializing Useraccount DIrectory class
public class UserAccountDirectory {
    
    private ArrayList<UserAccount> userAccountList;

    public UserAccountDirectory() {
        userAccountList = new ArrayList<>();
    }

    
    public ArrayList<UserAccount> getUserAccountList() {
        return userAccountList;
    }
    
    
    
    public UserAccount authenticateUser(String username, String password){
        for (UserAccount uacc : userAccountList)
            if (uacc.getUsername().equals(username) && uacc.getPassword().equals(password)){
                return uacc;
            }
        return null;
    }
    
    public UserAccount createUserAccount(String username, String password, Person employee, Role role){
        UserAccount uAcc = new UserAccount();
        uAcc.setUsername(username);
        uAcc.setPassword(password);
        uAcc.setPerson(employee);
        uAcc.setRole(role);
        userAccountList.add(uAcc);
        return uAcc;
    }
    
    
     public boolean checkIfUserAccountExists(String uname){
        
        for(UserAccount ua: userAccountList){
            if(ua.getUsername().equals(uname))
            return true;
        }
        return false;
    }
    
    public void removeUserAccount(UserAccount userAcc){
        
        userAccountList.remove(userAcc);
    }
    
   
    
    
}
