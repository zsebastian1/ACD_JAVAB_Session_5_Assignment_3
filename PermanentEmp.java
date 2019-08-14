package Session5;

public class PermanentEmp extends Employee {

//	int paidLeave, sickLeave, casualLeave;
	int paidLeave = 10;
	int sickLeave = 10;
	int casualLeave = 10;
	//double basic, hra, pfa;
	double basic = 50000;
	double hra = 10;
	double pfa = 5;
	
	void printDetails() {
		System.out.println("The following is information for a permanent employee:");
		
		System.out.println("As a permanent employee you have " + paidLeave + " paid leave days, " + sickLeave + " sick leave days, and " + casualLeave + " casual leave days.");
		
	}
	@Override
	void calculate_balance_leaves() {
		int paidLeave, sickLeave, casualLeave;
		paidLeave = 10;
		sickLeave = 10;
		casualLeave = 10;
		
		int totalLeave = 30;
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