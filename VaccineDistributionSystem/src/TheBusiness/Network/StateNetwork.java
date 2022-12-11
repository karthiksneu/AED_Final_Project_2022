/*
 * @author karthik
 *
 */


//Initializing Class StateNetwork
public class StateNetwork {

    private LocalHealthDepartment localHealthDept;
    private int statePopulation;
    private int vaccinesLeftForState;
    private String stateName;
    private ArrayList<CityNetwork> cityList;

    public StateNetwork(ArrayList<CityNetwork> cityList, LocalHealthDepartment localHealthDept, String stateName, int statePopulation, int vaccinesLeftForState) {
        this.cityList = cityList;
        this.localHealthDept = localHealthDept;
        this.stateName = stateName;
        this.statePopulation = statePopulation;
        this.vaccinesLeftForState = vaccinesLeftForState;

    }

    public StateNetwork() {

        this.cityList = new ArrayList<>();
        localHealthDept = new LocalHealthDepartment(stateName);
        statePopulation = 0;
        vaccinesLeftForState = statePopulation;


    }

    public int getStatePopulation() {
        return statePopulation;
    }

    public void setStatePopulation(int statePopulation) {
        this.statePopulation = statePopulation;
    }


    public ArrayList<CityNetwork> getCityList() {
        return cityList;
    }

    public void setCityList(ArrayList<CityNetwork> cityList) {
        this.cityList = cityList;
    }


    public int getVaccinesLeftForState() {
        return vaccinesLeftForState;
    }

    public void setVaccinesLeftForState(int vaccinesLeftForState) {
        this.vaccinesLeftForState = vaccinesLeftForState;
    }


    public LocalHealthDepartment getLocalHealthDepartment() {
        return localHealthDept;
    }

    public void setLocalHealthDepartment(LocalHealthDepartment localHealthDept) {
        this.localHealthDept = localHealthDept;
    }


    public String getStateName() {
        return stateName;
    }

    public void setStateName(String stateName) {
        this.stateName = stateName;
    }


    public CityNetwork addNewCity(String name) {

        CityNetwork cn = new CityNetwork();
        cn.setName(name);
        cityList.add(cn);
        return cn;

    }

    public void removeCity(CityNetwork city) {

        cityList.remove(city);
    }

    //Dispalys number of vaccines administered in State
    public int getTotalVaccinesAdministeredInState() {
        int sum = 0;
        if (cityList != null) {
            for (CityNetwork city : cityList) {
                sum = sum + city.getTotalVaccinesAdministeredInCity();
            }

        }
        return sum;

    }


    //Dispalys number of failed vaccines distributed in State
    public int getTotalVaccinesDistributedInState() {
        int sum = 0;
        if (cityList != null) {
            for (CityNetwork c : cityList) {
                sum = sum + c.getTotalVaccinesDistributedInCity();
            }

        }
        return sum;

    }


    //Dispalys number of failed vaccines administered in State
    public int getTotalFailedVaccinesInState() {
        int sum = 0;
        if (cityList != null) {
            for (CityNetwork c : cityList) {
                sum = sum + c.getTotalFailedVaccinesInCity();
            }
        }
        return sum;

    }


    @Override
    public String toString() {
        return stateName;
    }


}

