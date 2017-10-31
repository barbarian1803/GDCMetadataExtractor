package gdcmetadataextractor;

class Treatments {
    private String days_to_treatment; 
    private String updated_datetime;
    private String created_datetime;
    private String submitter_id;
    private String treatment_id;
    private String state;
    private String therapeutic_agents;
    private String treatment_intent_type;

    public String getDays_to_treatment() {
        return days_to_treatment;
    }

    public void setDays_to_treatment(String days_to_treatment) {
        this.days_to_treatment = days_to_treatment;
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

    public String getSubmitter_id() {
        return submitter_id;
    }

    public void setSubmitter_id(String submitter_id) {
        this.submitter_id = submitter_id;
    }

    public String getTreatment_id() {
        return treatment_id;
    }

    public void setTreatment_id(String treatment_id) {
        this.treatment_id = treatment_id;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getTherapeutic_agents() {
        return therapeutic_agents;
    }

    public void setTherapeutic_agents(String therapeutic_agents) {
        this.therapeutic_agents = therapeutic_agents;
    }

    public String getTreatment_intent_type() {
        return treatment_intent_type;
    }

    public void setTreatment_intent_type(String treatment_intent_type) {
        this.treatment_intent_type = treatment_intent_type;
    }

    public String getTreatment_or_therapy() {
        return treatment_or_therapy;
    }

    public void setTreatment_or_therapy(String treatment_or_therapy) {
        this.treatment_or_therapy = treatment_or_therapy;
    }
    private String treatment_or_therapy;
}
