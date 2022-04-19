package fileiodemo;

import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

public class InputStreamDemo {

	//java program to read byte data using InputSTream class
	public static void main(String[] args) throws IOException {
		
		
InputStream input=new FileInputStream("d:/javatest/data.txt");
        
        /*
         * A data input stream enable an application read primitive 
         * Java data types from an underlying input stream in a 
         * machine-independent way(instead of raw bytes).

 

         */
        DataInputStream inst=new DataInputStream(input);
        
        int count=input.available();
        System.out.println("The Total Numner of Bytes Available To Read :"+count);
        byte[] ary=new byte[count];
        
        inst.read(ary);
        for(byte bt:ary)
        {
            char k=(char) bt;
            System.out.print(k+"-");
        }

	}







	}


