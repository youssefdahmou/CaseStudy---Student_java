package Student;

import java.lang.reflect.Array;
import java.time.LocalDate;
import java.time.Month;
import java.util.ArrayList;

public abstract class Person implements Trackable{
	protected String firstName ;
	protected String lastName ;
	protected String school ;
	protected final int authorizedAbsence = 10;
	
	public Person(String firstName ,String lastName,String school ) {
		this.firstName=firstName;
		this.lastName =lastName ;
		this.school =school ;
		//.authorizedAbsence =authorizedAbsence ;
	}
	public abstract int trackSituation();
	abstract void display();
	
	public Student absenceKing(ArrayList<Student> students ) {
		Student king = (Student)Array.get(students,0);
		for (Student std : students ) {
			if (king.trackSituation()<std.trackSituation()) {
				king = std ;
			}
		}
		return king ;
	}
	
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	public static void main(String[] args) throws AbsenceException {
		ArrayList<Absence> xxx = new ArrayList<Absence>();
		ArrayList<Student> students = new ArrayList<Student>();
		Student youssef = new Student("youssef" ,"dahmou","esi", 'A' ,xxx);
		Student mohammed = new Student("mohammed" ,"dahmou","esi", 'B' ,xxx);
		Student mouna = new Student("mouna" ,"dahmou","esi", 'A' ,xxx);
		
		students.add(mohammed);
		students.add(youssef);
		students.add(mouna);
		
		Professor ahmed= new Professor("ahmed","B","esi" ,12 ,60 ,"computer science");
		Person imane = new Professor("imane","A","esi" ,32 ,80 ,"communication");
		
		youssef.addAbsence(new Absence(LocalDate.of(2018,12,03) ,false));
		youssef.addAbsence(new Absence(LocalDate.of(2018,11,28) ,false));
		Absence absence_non_justify =new Absence(LocalDate.of(2018,11,26) ,false) ;
		mouna.addAbsence(absence_non_justify);
		
		System.out.println(absence_non_justify.isJustification());
		
		mouna.justify(absence_non_justify ," < participation a une journeesportive > ");
		System.out.println(absence_non_justify.isJustification() );
		
		System.out.println(imane.absenceKing(students ).getFirstName());
		/*Student king = (Student)Array.get(students,0);
		System.out.println(king.getFirstName());
		*/
	}
	

}
