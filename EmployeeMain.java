package Session5;

public class EmployeeMain {

	public static void main(String[] args) {

		PermanentEmp pe = new PermanentEmp();
		TemporaryEmployee te = new TemporaryEmployee();
		
		pe.printDetails();
		pe.calculate_balance_leaves();
		System.out.println("A permanent employee's salary is: ");
		pe.calculate_salary();
		
		te.printDetails();
		te.calculate_balance_leaves();
		System.out.println("A temporary employee's salary is: ");
		te.calculate_salary();

	}

}
