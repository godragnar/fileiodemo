package fileiodemo;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class BufferWriterDemo {

	public static void main(String[] args) 
	{
		//Writing to a file using BufferedWriter in Java
		
		   try { 
		        // Creating Writer object in Append mode -true
		        FileWriter writer = new FileWriter("d:/javatest/names.txt",true); 
		        BufferedWriter bwr = new BufferedWriter(writer);  
		        
		        
		        bwr.write("Surya"); 
		        bwr.write("\n"); // bwr.newLine();
		        bwr.write("Nandepu");
		        bwr.write("\n");
		        bwr.close(); 

		 

		        System.out.println("succesfully written to a file"); } 
		        catch (IOException ioe) { 
		        ioe.printStackTrace(); 

		 

		    }

	}

}
