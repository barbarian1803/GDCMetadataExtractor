package gdcmetadataextractor;

class Analytes {
    private String updated_datetime;
    private String created_datetime;
    private double well_number;
    private String analyte_type;
    private String submitter_id;
    private String analyte_id;
    private double amount;
    private String state;
    private double a260_a280_ratio;
    private double concentration;
    private String spectrophotometer_method;
    private String analyte_type_id;
    private Aliquots[] aliquots;
    
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

    public double getWell_number() {
        return well_number;
    }

    public void setWell_number(double well_number) {
        this.well_number = well_number;
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

    public String getAnalyte_id() {
        return analyte_id;
    }

    public void setAnalyte_id(String analyte_id) {
        this.analyte_id = analyte_id;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public double getA260_a280_ratio() {
        return a260_a280_ratio;
    }

    public void setA260_a280_ratio(double a260_a280_ratio) {
        this.a260_a280_ratio = a260_a280_ratio;
    }

    public double getConcentration() {
        return concentration;
    }

    public void setConcentration(double concentration) {
        this.concentration = concentration;
    }

    public String getSpectrophotometer_method() {
        return spectrophotometer_method;
    }

    public void setSpectrophotometer_method(String spectrophotometer_method) {
        this.spectrophotometer_method = spectrophotometer_method;
    }

    public String getAnalyte_type_id() {
        return analyte_type_id;
    }

    public void setAnalyte_type_id(String analyte_type_id) {
        this.analyte_type_id = analyte_type_id;
    }
}
