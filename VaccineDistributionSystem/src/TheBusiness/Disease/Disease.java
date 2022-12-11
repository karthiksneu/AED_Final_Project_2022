/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TheBusiness.Disease;

import java.util.Date;

/**
 *
 * @author karthik
 */
//initializing Disease class with its attributes
public class Disease {

    private String diseaseName;
    private String diseaseCode;
    private Date lastUpdatedDate;

    //initializing constructor, getters and setters for Disease class
    public Disease(String diseaseName, String diseaseCode, Date lastUpdatedDate) {
        this.diseaseName = diseaseName;
        this.diseaseCode = diseaseCode;
        this.lastUpdatedDate = lastUpdatedDate;
    }

    public String getDiseaseName() {
        return diseaseName;
    }

    public void setDiseaseName(String diseaseName) {
        this.diseaseName = diseaseName;
    }

    public String getDiseaseCode() {
        return diseaseCode;
    }

    public void setDiseaseCode(String diseaseCode) {
        this.diseaseCode = diseaseCode;
    }

    public Date getLastUpdatedDate() {
        return lastUpdatedDate;
    }

    public void setLastUpdatedDate(Date lastUpdatedDate) {
        this.lastUpdatedDate = lastUpdatedDate;
    }

    @Override
    public String toString() {
        return diseaseCode;
    }

}
