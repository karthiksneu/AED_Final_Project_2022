/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package TheBusiness;

import TheBusiness.Disease.DiseaseDirectory;
import TheBusiness.NationalEnterprise.CenterOfDiseaseControl;
import TheBusiness.NationalEnterprise.Distributor;
import TheBusiness.NationalEnterprise.ManufacturerDirectory;
import TheBusiness.Network.StateNetwork;
import TheBusiness.Organization.Organization;
import TheBusiness.Roles.Role;
import TheBusiness.Roles.SystemAdminRole;
import TheBusiness.VaccineManagement.VaccineDirectory;
import java.util.ArrayList;

/**
 *
 * @author karthik
 */
//Definig Ecosystem Class
public class Ecosystems extends Organization {

    private static Ecosystems business;

    private CenterOfDiseaseControl cdc;
    private DiseaseDirectory diseaseDir;
    private ManufacturerDirectory manufacturerDir;
    private Distributor dist;
    private VaccineDirectory vaccineDir;
    private ArrayList<StateNetwork> stateDir;

    public static Ecosystems getInstance() {
        if (business == null) {
            business = new Ecosystems();
        }
        return business;

    }

    private Ecosystems() {
        super(null);

        this.stateDir = new ArrayList<StateNetwork>();
        cdc = new CenterOfDiseaseControl("CDC");
        manufacturerDir = new ManufacturerDirectory();
        dist = new Distributor("Vaccine Distributor");
        vaccineDir = new VaccineDirectory();
        diseaseDir = new DiseaseDirectory();

    }

    public static Ecosystems getBusiness() {
        return business;
    }

    public VaccineDirectory getVaccineDirectory() {
        return vaccineDir;
    }

    public DiseaseDirectory getDiseaseDirectory() {
        return diseaseDir;
    }

    public ArrayList<StateNetwork> getStateList() {
        return stateDir;
    }

    public CenterOfDiseaseControl getCdc() {
        return cdc;
    }

    public ManufacturerDirectory getManufacturerDirectory() {
        return manufacturerDir;
    }

    public Distributor getDistributor() {
        return dist;
    }

    public StateNetwork addNewState(String name) {

        StateNetwork state = new StateNetwork();
        state.setStateName(name);
        stateDir.add(state);
        return state;
    }

    public void removeState(StateNetwork state) {

        stateDir.remove(state);
    }

    @Override
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> roleList = new ArrayList<Role>();
        roleList.add(new SystemAdminRole());
        return roleList;
    }

}
