/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TheBusiness.Clinic;

import TheBusiness.VaccineManagement.AdministeredVaccineDetails;
import TheBusiness.VaccineManagement.VaccineDetails;
import java.util.ArrayList;

/**
 *
 * @author karthik
 */



//Initializing Clinic Class
public class Clinic {

    private String clinicName;
    private boolean isRegistered;
    
    
    private ArrayList<VaccineDetails> vaccineDetails;
    private ArrayList<AdministeredVaccineDetails> administeredVacDetails;

    public Clinic() {
        isRegistered = false;
        vaccineDetails = new ArrayList<>();
        administeredVacDetails = new ArrayList<>();

    }

    public ArrayList<VaccineDetails> getVaccineInventoryClinic() {
        return vaccineDetails;
    }

    public ArrayList<AdministeredVaccineDetails> getAdministeredVaccineList() {
        return administeredVacDetails;
    }

    public void setAdministeredVaccineList(ArrayList<AdministeredVaccineDetails> administeredVacDetails) {
        this.administeredVacDetails = administeredVacDetails;
    }

    //Creating getters and setters
    public String getClinicName() {
        return clinicName;
    }

    public void setClinicName(String clinicName) {
        this.clinicName = clinicName;
    }

    public boolean isRegistered() {
        return isRegistered;
    }

    public void setRegistered(boolean isRegistered) {
        this.isRegistered = isRegistered;
    }

    public VaccineDetails addVaccine(VaccineDetails vaccine) {
        vaccineDetails.add(vaccine);
        return vaccine;

    }

    public VaccineDetails addNewVaccineDetails() {
        VaccineDetails details = new VaccineDetails();
        vaccineDetails.add(details);
        return details;

    }

    public void removeVaccine(VaccineDetails vaccine) {

        vaccineDetails.remove(vaccine);

    }

    public AdministeredVaccineDetails addNewAdministeredVaccine() {
        AdministeredVaccineDetails vaccineDetails = new AdministeredVaccineDetails();
        administeredVacDetails.add(vaccineDetails);
        return vaccineDetails;

    }

    public int getTotalAdministeredVaccines() {
        int sum = 0;
        if (administeredVacDetails != null) {
            for (AdministeredVaccineDetails vaccine : administeredVacDetails) {
                sum = sum + 1;
            }

        }

        return sum;

    }

    
    
    public int getTotalVaccinesFailed() {
        int sum = 0;
        if (administeredVacDetails != null) {
            for (AdministeredVaccineDetails av : administeredVacDetails) {
                if (av != null) {
                    if (av.getshotstatus() != null) {
                        if (av.getshotstatus().equalsIgnoreCase("Fail")) {
                            sum = sum + 1;
                        }
                    }
                }
            }

        }

        return sum;

    }

    public int getTotalStoredVaccines() {
        int sum = 0;
        if (vaccineDetails != null) {
            for (VaccineDetails vd : vaccineDetails) {
                sum = sum + vd.getAvailablity();
            }
            sum = sum + getTotalAdministeredVaccines();
        }

        return sum;

    }

    @Override
    public String toString() {
        return clinicName;
    }

}
