package Student;

import java.time.LocalDate;

public class Absence {
	private LocalDate dateAbsence ;
	private boolean justification;
	public Absence(LocalDate dateAbsence ,boolean justification) {
		this.dateAbsence=dateAbsence ;
		this.justification =justification;
	}
	public boolean isJustification() {
		return justification;
	}
	public void setJustification(boolean justification) {
		this.justification = justification;
	}
	
	

}
