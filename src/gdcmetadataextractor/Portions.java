package gdcmetadataextractor;

class Portions {
    private String creation_datetime;
    private String portion_number;
    private double weight;
    private String updated_datetime;
    private String created_datetime;
    private Analytes[] analytes;
    private String submitter_id;
    private Slides[] slides;
    private String state;
    private String portion_id;
    private boolean is_ffpe;
    
    public String getCreation_datetime() {
        return creation_datetime;
    }

    public void setCreation_datetime(String creation_datetime) {
        this.creation_datetime = creation_datetime;
    }

    public String getPortion_number() {
        return portion_number;
    }

    public void setPortion_number(String portion_number) {
        this.portion_number = portion_number;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
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

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getPortion_id() {
        return portion_id;
    }

    public void setPortion_id(String portion_id) {
        this.portion_id = portion_id;
    }

    public boolean isIs_ffpe() {
        return is_ffpe;
    }

    public void setIs_ffpe(boolean is_ffpe) {
        this.is_ffpe = is_ffpe;
    }
}
