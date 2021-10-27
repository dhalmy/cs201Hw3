package hw3;
import java.util.*;

public class Main {


		public static void main(String[] args)
		{
			Lane l1 = new Lane("Lane 1");
			Lane l2 = new Lane("Lane 2");
			Lane l3 = new Lane("Lane 3");
			Lane l4 = new Lane("Lane 4");
			ArrayList<Lane> lanes = new ArrayList<>();
			lanes.add(l1);
			lanes.add(l2);
			lanes.add(l3);
			lanes.add(l4);
			
			Customer c1 = new Customer("Jane", 4);
			Customer c2 = new Customer("David", 1);
			Customer c3 = new Customer("Griffin", 2);
			Customer c4 = new Customer("Marko", 3);
			Customer c5 = new Customer("River", 5);
			Customer c6 = new Customer("Cole", 10);
			Customer c7 = new Customer("Rachel", 4);
			
			lanes = addCustBestLine(lanes, c1);
			lanes = addCustBestLine(lanes, c2);
			lanes = addCustBestLine(lanes, c3);
			lanes = addCustBestLine(lanes, c4);
			lanes = addCustBestLine(lanes, c5);
			lanes = addCustBestLine(lanes, c6);
			lanes = addCustBestLine(lanes, c7);
			
			for(int i = 0; i < lanes.size(); i++) {
				System.out.println("Lane " + (i+1) + ": " + lanes.get(i).toString());
			}
			
		}
		

		public static ArrayList<Lane> addCustBestLine(ArrayList<Lane> l, Customer c) {
			int smallestLine = 0;
				for(int i = 0; i < l.size() - 1; i++){
//					System.out.print("i: " + i + ": " + (l.get(i).getTotTime() < l.get(i+1).getTotTime()));
//					System.out.println("i: " + i + ": " + l.get(i).getTotTime() + " < " + l.get(i+1).getTotTime());
//					System.out.println("Smallest line: " + i);
					if(l.get(i).getTotTime() > l.get(i+1).getTotTime()) smallestLine = i+1;
//					System.out.println("Smallest line: " + i);
				}
				l.get(smallestLine).addCustomer(c);
			return l;
		}
		
		
		
}

