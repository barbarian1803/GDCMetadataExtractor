package gdcmetadataextractor;

class Aliquots {
    private String state;
    private String updated_datetime;
    private String created_datetime;
    private String source_center;
    private String analyte_type;
    private String submitter_id;
    private double amount;
    private String aliquot_id;
    private double concentration;
    private String analyte_type_id;
    
    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
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

    public String getSource_center() {
        return source_center;
    }

    public void setSource_center(String source_center) {
        this.source_center = source_center;
    }

    public String getAnalyte_type() {
        return analyte_type;
    }

    public void setAnalyte_type(String analyte_type) {
        this.analyte_type = analyte_type;
    }

    public String getSubmitter_id() {
        return submitter_id;
    }

    public void setSubmitter_id(String submitter_id) {
        this.submitter_id = submitter_id;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public String getAliquot_id() {
        return aliquot_id;
    }

    public void setAliquot_id(String aliquot_id) {
        this.aliquot_id = aliquot_id;
    }

    public double getConcentration() {
        return concentration;
    }

    public void setConcentration(double concentration) {
        this.concentration = concentration;
    }

    public String getAnalyte_type_id() {
        return analyte_type_id;
    }

    public void setAnalyte_type_id(String analyte_type_id) {
        this.analyte_type_id = analyte_type_id;
    }
}
