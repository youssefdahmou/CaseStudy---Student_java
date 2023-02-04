package Student;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class Professor extends Person {
	private int teachingHours;
	private int objectif;
	private String speciality;
	public Professor(String firstName ,String lastName,String school ,int teachingHours , int objectif,String speciality) {
		super(firstName ,lastName,school );
		this.teachingHours = teachingHours ;
		this.objectif = objectif ;
		this.speciality = speciality ;
	}
	public int trackSituation() {
		return teachingHours;
	}
	void display() {
		System.out.println(" professor  : "+ firstName +" " + lastName + " has "+ trackSituation() +" hours .");
	}
	
	
}
