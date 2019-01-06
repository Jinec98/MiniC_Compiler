package util;

import java.util.ArrayList;
import java.util.Iterator;

public class ConditionValue {
	private ArrayList<QTInfo> trueChain = new ArrayList<QTInfo>();
	private ArrayList<QTInfo> falseChain = new ArrayList<QTInfo>();
	
	public void mergeTrue(QTInfo qtTrue){
		trueChain.add(qtTrue);
	}
	public void mergeTrue(ConditionValue cv) {
		Iterator<QTInfo> itr = cv.trueChain.iterator();
		while(itr.hasNext()){
			trueChain.add(itr.next());
		}
	}
	public void mergeFalse(QTInfo qtFalse){
		falseChain.add(qtFalse);
	}
	public void mergeFalse(ConditionValue cv) {
		Iterator<QTInfo> itr = cv.falseChain.iterator();
		while(itr.hasNext()){
			falseChain.add(itr.next());
		}
	}
	
	public void backpatchTrueChain(int result){
		Iterator<QTInfo> itr = trueChain.iterator();
		while(itr.hasNext()){
			itr.next().setResult(result);
		}
	}
	public void backpatchFalseChain(int result){
		Iterator<QTInfo> itr = falseChain.iterator();
		while(itr.hasNext()){
			itr.next().setResult(result);
		}
	}
}
