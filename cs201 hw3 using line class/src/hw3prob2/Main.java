package hw3prob2;

import java.util.*;

public class Main {

	public static void main(String[] args) {
		Student s1 = new Student("Turner", "Maryjane");
		Student s2 = new Student("Bates", "Evelyn");
		Student s3 = new Student("Glass", "Alfonso");
		Student s4 = new Student("Frost", "Alondra");
		Student s5 = new Student("Moran", "Jett");
		Student s6 = new Student("Konnor", "Patton");
		Student s7 = new Student("Newman", "Jack");
		Student s8 = new Student("Adams", "Aaron");
		
		ArrayList<Student> classrm = new ArrayList<Student>();

		classrm.add(s1);
		classrm.add(s2);
		classrm.add(s3);
		classrm.add(s4);
		classrm.add(s5);
		classrm.add(s6);
		classrm.add(s7);
		
		classrm = sortClassRm(classrm);
		System.out.println(classrm);
		
		classrm = addStudent(classrm, s8);
		System.out.println(classrm);
		
		classrm = removeStudent(classrm, s4);
		System.out.println(classrm);
		
		classrm = removeStudent(classrm, s1);
		System.out.println(classrm);

		classrm = removeStudent(classrm, s2);
		System.out.println(classrm);
		
		classrm = removeStudent(classrm, s8);
		System.out.println(classrm);
		
		
	}
	
	public static ArrayList<Student> addStudent(ArrayList<Student> cRm, Student s){
		cRm.add(0,s);
		cRm = sortClassRm(cRm);
		return cRm;
	}
	
	public static ArrayList<Student> removeStudent(ArrayList<Student> cRm, Student s){
		cRm.remove(s);
		cRm = sortClassRm(cRm);
		return cRm;
	}
	
	public static ArrayList<Student> sortClassRm(ArrayList<Student> cRm) {
		for(int i = 0; i < cRm.size() -1; i++) {
			for(int j = i; j < cRm.size() - i - 1; j++) {
				if(cRm.get(j).getFullName().compareToIgnoreCase(cRm.get(j+1).getFullName()) > 0) Collections.swap(cRm, j, j+1);
			}
			
		}
		return cRm;
	}

}
