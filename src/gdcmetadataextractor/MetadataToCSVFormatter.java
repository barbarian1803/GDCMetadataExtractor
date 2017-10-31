package gdcmetadataextractor;

public class MetadataToCSVFormatter {
    private IndividualMetadata data;
    private String delim;
    
    public MetadataToCSVFormatter(IndividualMetadata data,String delim) {
        this.data = data;
        this.delim = delim;
    }
       
    public String returnDESeqMetadata(String alias){
        String csv = "";
        String delim = this.delim;
        String fileName="";
        String ethnicity="";
        String sampleType="";
        String caseID="";
        
        try{
            fileName = this.data.getFile_name();
        }catch(NullPointerException ex){
            fileName = "";
        }
        
        try{
            ethnicity = this.data.getCases()[0].getDemographic().getEthnicity();
        }catch(NullPointerException ex){
            ethnicity = "";
        }
        
        try{
            sampleType = this.data.getCases()[0].getSamples()[0].getSample_type();
        }catch(NullPointerException ex){
            sampleType = "";
        }
        
        try{
            caseID = this.data.getCases()[0].getCase_id();
        }catch(NullPointerException ex){
            caseID = "";
        }
        
        csv = alias+delim+fileName+delim+ethnicity+delim+sampleType+delim+caseID;
        
        return csv;
    }
    
    
    public static String returnDESeqMetadataHeader(String delim){
        return "Alias"+delim+"File_Name"+delim+"Ethnicity"+delim+"Sample_Type"+delim+"Case_id";
    }
}
