package util;

import parser.Token;

//定义符号表的信息
public class ArgInfo {

	public static int size = 0;
	private int innerId;
	private String type;
	private String name;
	private int column;
	private int line;
	
	public ArgInfo(String type, String name){
		super();
		this.innerId = ++size;
		this.type = type;
		this.name = name;
	}
	
	public ArgInfo(String type, Token token){
		super();
		this.innerId = ++size;
		this.type = type;
		this.name = token.image;
		this.line = token.endLine;
		this.column = token.endColumn;
	}
	
	public String getType(){
		return this.type;
	}
	
	public void setType(String type){
		this.type = type;
	}
	
	public String getName(){
		return this.name;
	}
	
	public void setName(String name){
		this.name = name;
	}
	
	public void setLine(int line){
		this.line = line;
	}
	
	public int getLine(){
		return this.line;
	}
	
	public void setColumn(int column){
		this.column = column;
	}
	
	public int getColum(){
		return this.column;
	}
	
	public int getInnerIdSeqen(){
		return size;
	}
	
	public String toString(){
		return this.innerId + ":\t(" + this.type + ",\t" + this.name + ",\t" + this.line + ",\t" + this.column + "\t)\n";
	}
}
