package gdcmetadataextractor;

public class IndividualMetadata {
    private String data_type;
    private String file_name;
    private String md5sum;
    private String data_format;
    private Analysis analysis;
    private String submitter_id;
    private String access;
    private String state;
    private double file_size;
    private String file_id;
    private String data_category;
    private AssociatedEntities[] associated_entities;
    private Cases[] cases;
    private String experimental_strategy;
    
    public String getData_type() {
        return data_type;
    }

    public void setData_type(String data_type) {
        this.data_type = data_type;
    }

    public String getFile_name() {
        return file_name;
    }

    public void setFile_name(String file_name) {
        this.file_name = file_name;
    }

    public String getMd5sum() {
        return md5sum;
    }

    public void setMd5sum(String md5sum) {
        this.md5sum = md5sum;
    }

    public String getData_format() {
        return data_format;
    }

    public void setData_format(String data_format) {
        this.data_format = data_format;
    }

    public Analysis getAnalysis() {
        return analysis;
    }

    public void setAnalysis(Analysis analysis) {
        this.analysis = analysis;
    }

    public String getSubmitter_id() {
        return submitter_id;
    }

    public void setSubmitter_id(String submitter_id) {
        this.submitter_id = submitter_id;
    }

    public String getAccess() {
        return access;
    }

    public void setAccess(String access) {
        this.access = access;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public double getFile_size() {
        return file_size;
    }

    public void setFile_size(double file_size) {
        this.file_size = file_size;
    }

    public String getFile_id() {
        return file_id;
    }

    public void setFile_id(String file_id) {
        this.file_id = file_id;
    }

    public String getData_category() {
        return data_category;
    }

    public void setData_category(String data_category) {
        this.data_category = data_category;
    }

    public String getExperimental_strategy() {
        return experimental_strategy;
    }

    public void setExperimental_strategy(String experimental_strategy) {
        this.experimental_strategy = experimental_strategy;
    }

    public AssociatedEntities[] getAssociated_entities() {
        return associated_entities;
    }

    public void setAssociated_entities(AssociatedEntities[] associated_entities) {
        this.associated_entities = associated_entities;
    }

    public Cases[] getCases() {
        return cases;
    }

    public void setCases(Cases[] cases) {
        this.cases = cases;
    }
}
