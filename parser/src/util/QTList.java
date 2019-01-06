package util;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintStream;
import java.util.ArrayList;
import java.util.Iterator;

public class QTList {
	public ArrayList<QTInfo> QTList = new ArrayList<QTInfo>();
	public FileOutputStream out = null;
	public PrintStream p = null;
	public static boolean flag = true;
	
	public QTList(){
		super();
	}
	public void Init(){		
		File file = new File("QTList.txt");		
		try {
			out = new FileOutputStream(file);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		p = new PrintStream(out);
	}

	public void addQTInfo(QTInfo info) {
		QTList.add(info);
	}

	public void addQTInfo(int index, QTInfo info) {
		QTList.add(index, info);
	}

	public QTInfo get(int index) {
		return (QTInfo) QTList.get(index);
	}

	public QTInfo remove(int index) {
		return QTList.remove(index - 1);
	}
	
	public void changeIndex(int index, int n){
		Iterator<QTInfo> itr = QTList.iterator();
		while (itr.hasNext()) {
			QTInfo tmp = (QTInfo) itr.next();
			int thisID = tmp.getInnerID();
			if(thisID >= index){
				tmp.setInnerId(thisID - n);
			}
		}
	}

	public void clear() {
		QTList.clear();
		QTInfo.size = 0;
	}

	public void printQTTable() {
		// System.out.println(toString());
		Iterator<QTInfo> itr = QTList.iterator();
		try {
			while (itr.hasNext()) {
				QTInfo tmp = (QTInfo) itr.next();
		        p.println(tmp.toString());
				//System.out.println(tmp.toString());
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
