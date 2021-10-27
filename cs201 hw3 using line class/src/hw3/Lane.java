package hw3;

import java.util.*;

public class Lane {
	private String lineName;
	private int totTime;
	private int custCnt;
	private ArrayList<Customer> line = new ArrayList<Customer>();
	
	public Lane(String s) {
		lineName = s;
	}

	public String getLineName() {
		return lineName;
	}

	public void setLineName(String lineName) {
		this.lineName = lineName;
	}

	public int getTotTime() {
		return totTime;
	}

	public void setTotTime(int totTime) {
		this.totTime = totTime;
	}

	public int getCustCnt() {
		return custCnt;
	}

	public void setCustCnt(int custCnt) {
		this.custCnt = custCnt;
	}

	public ArrayList<Customer> getLine() {
		return line;
	}

	public void setLine(ArrayList<Customer> line) {
		this.line = line;
	}
	
	public void addCustomer(Customer c) {
		line.add(c);
		updateWait();
	}
	
	public int updateWait() {
		int sum = 0;
		for(int i = 0; i < line.size(); i++) {
			sum += line.get(i).getTimeCnt();
		}
		totTime = sum;
		return totTime;
	}
	
	public String toString() {
		String str = "";
		for(int i = 0; i < line.size(); i++) {
			str += line.get(i).getName() + " (" + line.get(i).getItemCnt() + ") \t";
		}
		return str;
	}
	
}
