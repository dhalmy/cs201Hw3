package hw3;

public class Customer {
	private String custName;
	private int itemCnt;
	private int timeCnt;
	
	public Customer(String n, int i) {
		custName = n; itemCnt = i; timeCnt = 20 + (3*itemCnt);
	}

	public String getName() {
		return custName;
	}

	public void setName(String name) {
		this.custName = name;
	}

	public int getItemCnt() {
		return itemCnt;
	}

	public void setItemCnt(int itemCnt) {
		this.itemCnt = itemCnt;
	}
	
	public int getTimeCnt() {
		return timeCnt;
	}

	public void setTimeCnt(int timeCnt) {
		this.timeCnt = timeCnt;
	}

	public String toString() {
		return custName + "(" + itemCnt + "items)\t ";
	}
	
}