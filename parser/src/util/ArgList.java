package util;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintStream;
import java.util.ArrayList;
import java.util.Iterator;

import parser.TokenMgrError;

public class ArgList {
	public ArrayList<ArgInfo> ArgList = new ArrayList<ArgInfo>();
	public FileOutputStream out = null;
	public PrintStream p = null;
	
	public ArgList(){
		super();
	}
	
	public void Init(){
		File file = new File("ArgList.txt");
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
		
	public void addArgInfo(ArgInfo info){
		ArgList.add(info);
	}
	
	public void addArgInfo(int index, ArgInfo info){
		ArgList.add(index, info);
	}
	
	public ArgInfo get(int index){
		return (ArgInfo) ArgList.get(index);
	}
	
	public ArgInfo remove(int index){
		return ArgList.remove(index - 1);
	}
	
	public void clear(){
		ArgList.clear();
		ArgInfo.size = 0;
	}
	
	public void printArgTable(){
		Iterator<ArgInfo> itr = ArgList.iterator();
		try {
			while (itr.hasNext()) {
				ArgInfo tmp = (ArgInfo) itr.next();
		        p.println(tmp.toString());
				//System.out.println(tmp.toString());
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public boolean checkRepeat(ArgInfo info){
		boolean flag = false;
		Iterator<ArgInfo> itr = ArgList.iterator();
		while (itr.hasNext()) {
			ArgInfo tmp = (ArgInfo) itr.next();
			if(tmp.getName().equals(info.getName())){
				flag = true;
				//throw new TokenMgrError("Error: Ignoring invalid lexical state : . State unchanged.", TokenMgrError.INVALID_LEXICAL_STATE);
				break;
			}
		}
		return flag;
	}
	
	public boolean checkUndefined(String name){
		boolean flag = true;
		Iterator<ArgInfo> itr = ArgList.iterator();
		while (itr.hasNext()) {
			ArgInfo tmp = (ArgInfo) itr.next();
			if(tmp.getName().equals(name)){
				flag = false;
				break;
			}
		}
		return flag;
	}
	
}
