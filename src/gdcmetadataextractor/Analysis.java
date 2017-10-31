package gdcmetadataextractor;

public class Analysis {
    private String analysis_id;
    private String updated_datetime;
    private String created_datetime;
    private String submitter_id;
    private String state;
    private String workflow_link;
    private String workflow_type;
    private String workflow_version;
    private InputFiles[] input_files;

    public String getAnalysis_id() {
        return analysis_id;
    }

    public void setAnalysis_id(String analysis_id) {
        this.analysis_id = analysis_id;
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

    public String getWorkflow_link() {
        return workflow_link;
    }

    public void setWorkflow_link(String workflow_link) {
        this.workflow_link = workflow_link;
    }

    public String getWorkflow_type() {
        return workflow_type;
    }

    public void setWorkflow_type(String workflow_type) {
        this.workflow_type = workflow_type;
    }

    public String getWorkflow_version() {
        return workflow_version;
    }

    public void setWorkflow_version(String workflow_version) {
        this.workflow_version = workflow_version;
    }

    public InputFiles[] getInput_files() {
        return input_files;
    }

    public void setInput_files(InputFiles[] input_files) {
        this.input_files = input_files;
    }
    
}
