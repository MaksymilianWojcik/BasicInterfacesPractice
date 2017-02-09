package Comparable;

public class Employee extends Person implements Comparable<Employee> {
	
	// interfejs Comparable<t>, gdzie t to obiekt jaki bedzie porownywany
	// info z javadoc
	
	private double salary;
	
	public Employee(String name, String surname){
		super(name, surname);
		
		// to pochodzi z Person
		// to to samo co this.setName(name);
	}
	
	public Employee(String name, String surname, double salary){
		this(name, surname);
		this.salary = salary;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}
	
	
	@Override
	public int compareTo(Employee o) {
		// TODO Auto-generated method stub
		
		if(this.salary == o.salary){
			return 0;
		}
		if (this.salary > o.salary){
			return 1;
		} else {
			return -1;
		}
	} 
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return getName() + " " + getSurname() + " " + salary;
	}
	
	
}
