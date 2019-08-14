package Session5;

public abstract class Employee {

	int employeeID;
	String employeeName;
	int total_Leaves;
	double total_salary;
	
	abstract void calculate_balance_leaves();
		
	abstract boolean avail_leaves(int no_of_leaves);
	
	abstract void calculate_salary();

}