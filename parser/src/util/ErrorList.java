package util;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintStream;
import java.util.ArrayList;

public class ErrorList {
	private ArrayList<String> errorList = new ArrayList<String>();
	public FileOutputStream out = null;
	public PrintStream p = null;
	
	public ErrorList(){
		super();
	}
	
	public void Init(){
		File file = new File("ErrorList.txt");
		if(file.exists())
			file.delete();
		try {
			out = new FileOutputStream(file);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		p = new PrintStream(out);
	}
	
	public void addError(String error){
		this.errorList.add(error);
	}
	
	public void printError(){
		for(int i = 0; i < errorList.size(); i++){
	        p.println("error"+(i+1)+": "+errorList.get(i));
			//System.out.println("error"+(i+1)+": "+errorList.get(i));
		}
	}
	
	public void clear(){
		errorList.clear();
	}
	
	public ArrayList<String> getErrorList(){
		return this.errorList;
	}
}
