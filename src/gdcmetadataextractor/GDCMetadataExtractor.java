package gdcmetadataextractor;

import com.google.gson.*;
import com.google.gson.reflect.TypeToken;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.io.Writer;
import java.lang.reflect.*;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Collection;

public class GDCMetadataExtractor {

    public static void main(String[] args) {
        String fileInputName = args[0];
        String fileOutputName = args[1];
        String delim = args[2];
        //String fileInputName = "sample_input/metadata_lihc.json";
        //String fileOutputName = "sample_input/metadata_lihc.csv";
        //String delim = ",";
        
        try {
            //Prepare for file output writer
            FileOutputStream file = new FileOutputStream(fileOutputName);
            OutputStreamWriter outputStream = new OutputStreamWriter(file, "utf-8");
            Writer writer = new BufferedWriter(outputStream);
            
            //Read input file
            String json = new String(Files.readAllBytes(Paths.get(fileInputName)));
            Type collectionType = new TypeToken<Collection<IndividualMetadata>>(){}.getType();
            Gson gson = new Gson();
            Collection<IndividualMetadata> enums = gson.fromJson(json, collectionType);
            
            //Start writing to output
            writer.write(MetadataToCSVFormatter.returnDESeqMetadataHeader(delim)+"\n");
            
            int i=1;
            for(IndividualMetadata data:enums){
                MetadataToCSVFormatter formatter;
                formatter = new MetadataToCSVFormatter(data,delim);
                
                writer.write(formatter.returnDESeqMetadata("Sample_"+i)+"\n");
                i++;
            }
            writer.close();
        } catch (FileNotFoundException ex) {
            System.out.println("Error "+ex.getMessage());
        } catch (IOException ex) {
            System.out.println("Error "+ex.getMessage());
        }
    }
}
