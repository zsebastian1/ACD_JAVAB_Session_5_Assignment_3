package Session5;

public class TemporaryEmployee extends Employee{

	//int paidLeave, sickLeave, casualLeave;
	int paidLeave = 5;
	int sickLeave = 3;
	int casualLeave = 3;
	//double basic, hra, pfa;
	double basic = 25000;
	double hra = 5;
	double pfa = 2.5;
	
	void printDetails() {
System.out.println("The following is information for a temporary employee:");
		
		System.out.println("As a temporary employee you have " + paidLeave + " paid leave days, " + sickLeave + " sick leave days, and " + casualLeave + " casual leave days.");
		
	}
	@Override
	void calculate_balance_leaves() {
		int paidLeave, sickLeave, casualLeave;
		paidLeave = 5;
		sickLeave = 5;
		casualLeave = 3;
		
		int totalLeave = 13;
		System.out.println("You have a total of " + totalLeave + " days of leave.");
	}
	@Override
	boolean avail_leaves(int no_of_leaves) {
		
		int paidLeave, sickLeave, casualLeave;
		paidLeave = 10;
		sickLeave = 10;
		casualLeave = 10;
		boolean availableLeaves;
		if (paidLeave == 10) {
			availableLeaves = true;
		} else if (sickLeave == 10) {
			availableLeaves = true;
		}
		else if (casualLeave == 10) {
			availableLeaves = true;
		} else {
			availableLeaves = false;
		}
	return availableLeaves;
	}
	
	@Override
	void calculate_salary() {
		
		hra = basic * .5;
		pfa = basic * .12;
		double total_salary = basic  + hra - pfa;
		
		System.out.println(total_salary);
	}
}
