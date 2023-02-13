package zlesson40;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Main {

	public static void main(String[] args) {
		  // file = An abstract representation of file and directory pathnames

		  // file = An abstract representation of file and directory pathnames
		  
		  File file = new File("secret_message.txt");
		  
		  if(file.exists()) {
		   System.out.println("That file exists! :O!");
		   System.out.println(file.getPath());
		   System.out.println(file.getAbsolutePath());
		   System.out.println(file.isFile());
          //file.delete();
		  }
		  else {
		   System.out.println("That file doesn't exist :(");}
		  //-------------------------------------------------------
		  //FileWriter
		  try {
			FileWriter filewriter = new FileWriter("poem.txt");
			filewriter.write("Roses are red \nViolets are blue\nBooty booty booty booty\nRockin' everywhere!");
			filewriter.append("\n(A poem by bro)");
			filewriter.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
		  
		  //-------------------------------------------------------
		  //FileReader

		  // FileReader = read the contents of a file as a stream of characters. 
		  //read() returns an int value which contains the byte value
		  //when read() returns -1, there is no more data to be read
		  
		  System.out.println("-------------------------------------\n");
		try {
			FileReader reader = new FileReader("art.txt");
			int data = reader.read();
			while(data!=-1) {
				System.out.print((char)data);
				data = reader.read();

			}
		}
		
		catch (FileNotFoundException e) {
			e.printStackTrace();}
		
		catch (IOException e) {
		e.printStackTrace();}
		  
		  
		  
	}}
