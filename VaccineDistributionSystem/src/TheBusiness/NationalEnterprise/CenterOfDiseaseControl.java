/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package TheBusiness.NationalEnterprise;

import TheBusiness.Enterprise.Enterprise;
import TheBusiness.Roles.Role;
import java.util.ArrayList;

/**
 *
 * @author karthik
 */

//Initializing class CenterOfDiseaseControl extends Enterprise
public class CenterOfDiseaseControl extends Enterprise{

    public CenterOfDiseaseControl(String name) {
        super(name, EnterpriseType.CDC);
    }

    
    @Override
    public ArrayList<Role> getSupportedRole() {
        return null;
        
    }
    
}
