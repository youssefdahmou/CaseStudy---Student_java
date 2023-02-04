package Student;

import java.util.ArrayList;

public class Student extends Person {
	private char groupe;
	private ArrayList<Absence> allAbsences ;
	public Student(String firstName ,String lastName,String school ,char groupe ,ArrayList<Absence> allAbsences) {
		super(firstName ,lastName,school );
		this.groupe =groupe;
		this.allAbsences =allAbsences;
	}
	public int trackSituation() {
		int j =0;
		for ( Absence abs :allAbsences) {
			if (abs.isJustification()== false ) {
				j++;
			}
		}
		return j;
	}
	void display() {
		System.out.println(" etidiant : "+ firstName +" " + lastName + " a "+ trackSituation() +" d'absence non justifier .");
	}
	boolean justify(Absence a , String reason) throws AbsenceException {
		if (reason.length()==0) {
			throw new AbsenceException();
		}
		else {
			a.setJustification(true);
		}
		return true ;
	}
	void addAbsence(Absence a) {
		allAbsences.add(a);
	}

	
	
}
