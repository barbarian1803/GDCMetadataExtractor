/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gdcmetadataextractor;

/**
 *
 * @author barbarian
 */
public class Cases {
    private Diagnoses[] diagnoses;
    private String updated_datetime;
    private String created_datetime;
    private Demographic demographic;
    private String submitter_id;
    private Project project;
    private String state;
    private String case_id;
    private Samples[] samples;
    private Exposures[] exposures;

    public Diagnoses[] getDiagnoses() {
        return diagnoses;
    }

    public void setDiagnoses(Diagnoses[] diagnoses) {
        this.diagnoses = diagnoses;
    }

    public String getUpdated_datetime() {
        return updated_datetime;
    }

    public void setUpdated_datetime(String updated_datetime) {
        this.updated_datetime = updated_datetime;
    }

    public String getCreated_datetime() {
        return created_datetime;
    }

    public void setCreated_datetime(String created_datetime) {
        this.created_datetime = created_datetime;
    }

    public Demographic getDemographic() {
        return demographic;
    }

    public void setDemographic(Demographic demographic) {
        this.demographic = demographic;
    }

    public String getSubmitter_id() {
        return submitter_id;
    }

    public void setSubmitter_id(String submitter_id) {
        this.submitter_id = submitter_id;
    }

    public Project getProject() {
        return project;
    }

    public void setProject(Project project) {
        this.project = project;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getCase_id() {
        return case_id;
    }

    public void setCase_id(String case_id) {
        this.case_id = case_id;
    }

    public Samples[] getSamples() {
        return samples;
    }

    public void setSamples(Samples[] samples) {
        this.samples = samples;
    }

    public Exposures[] getExposures() {
        return exposures;
    }

    public void setExposures(Exposures[] exposures) {
        this.exposures = exposures;
    }
    
}
