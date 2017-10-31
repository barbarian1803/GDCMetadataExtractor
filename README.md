# GDCMetadataExtractor
Java program to extract metadata in json format from GDC Portal (https://portal.gdc.cancer.gov/) into csv format.
The CSV file will contain several columns:
- Alias : sample name alias that is given automatically by this program
- File_Name : corresponds to the real file name from GDC website when downloaded. Notice that this is the file name not the directory name. Each file from GDC is stored in their own folder.
- Ethnicity : metadata from the ethnicity, useful if you want to compare different ethnicity gene expression data
- Sample_Type : this indicate the sample type. You need to see which type name is corresponds to tumor sample or normal.
- Case_id : this can be useful if you want to find normal-tumor pair sample. Find the same case id to see this pair.
