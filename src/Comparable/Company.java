package Comparable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Company {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Employee> employee = new ArrayList<Employee>();
		
		employee.add(new Employee("maks", "Wojcik", 2000));
		employee.add(new Employee("aleks", "dzonson", 1231.31));
		employee.add(new Employee("rychu", "peja", 3244.15));
		employee.add(new Employee("hudy", "hzd", 3140.19));
		employee.add(new Employee("Rudi", "Szubert", 1500));
		
		Collections.sort(employee);
		
		// WYPISANIE ROZNE OPCJE : 
		/*
		for (Employee e: employee){
			System.out.println(e);
		} */
		
		//ALBO NP:
		
		//System.out.println(employee);
		
		//albo np z petla for :
		
		for (int i = 1; i<employee.size(); i++){
			System.out.println(employee.get(i));
		}
		
		// jzeli chceilibysmy zmienic kolejnosc wyswietlania, np od 
		// najmniejszej do najawiekszej, to musimy to pozmieniac
		// w klasie Employee w metodzie compareTo
		
	}

}
