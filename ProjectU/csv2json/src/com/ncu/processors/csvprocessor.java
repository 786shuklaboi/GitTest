package com.ncu.Processors;
import java.io.*;
import org.json.simple.*;
public class csvprocessor   
{
	public boolean processorCSV(String csvFileName,String jsonFileName)
{
         String csvfilepath= "C:\\Users\\AKASH\\Desktop\\ProjectU\\csv2json\\csvs";
      String jsonfilepath= "C:\\Users\\AKASH\\Desktop\\ProjectU\\csv2json\\jsons";
    try
    {
    	FileReader fr=new FileReader(csvfilepath+"\\"+csvFileName);
    	BufferedReader br = new BufferedReader(fr);
    	String headerLine = br.readLine();
    	String[]keynames = headerLine.split(",");
    	
        int i = 0;
    	
        String line;

    	JSONArray jsonArry = new JSONArray();
    	FileWriter fw = new FileWriter(jsonfilepath+"\\"+jsonFileName);
    	BufferedWriter bw = new BufferedWriter(fw);
    	while ((line = br.readLine())!=null)
        {
            JSONObject jObj = new JSONObject();
            String[] dataline =line.split(",");
            for(i=0;i<dataline.length;i++)
            { 
                jObj.put(keynames[i],dataline[i]);
            }
            jsonArry.add(jObj);
        }
        bw.write(jsonArry.toJSONString());
        bw.flush();
    }
    catch(Exception e)
    {
        System.out.println(e);
        return(false);
    }
    return(true);
}
}
class testprocessorcsv
{
    public static void main(String[] args) {
        csvprocessor cv = new csvprocessor();
        try
        {
            System.out.println(cv.processorCSV("example.csv","jsonfile.json"));
        }    
            catch(Exception e)
            {}
    }
}