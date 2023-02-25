package com.demo.samples;




import java.util.*;
import java.util.function.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;
class Employee1 {
	
	String name;
	int salary;
	
	public Employee1(String name, int salary) {
		this.name = name;
		this.salary = salary;
	}
    public String getName() { 
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public int getSalary() {
		return salary;
	}


	public void setSalary(int salary) {
		this.salary = salary;
	}


	@Override
    public String toString() {
        StringBuilder sb = new StringBuilder("<");
        sb.append("name: ");
        sb.append(name);
        sb.append(" salary: ");
        sb.append("" + salary+">");
        return sb.toString();

    }
}
class EmployeeInfo{
	enum SortMethod implements Comparator<Employee1> {
        NAME(Comparator.comparing(Employee1::getName)),

        SALARY(Comparator.comparingInt(Employee1::getSalary));

        private final Comparator<Employee1> comparator;

        SortMethod(Comparator<Employee1> comparator) {
            this.comparator = comparator;
        }

        @Override
        public int compare(Employee1 o1, Employee1 o2) {
            return comparator.compare(o1, o2);
        }
    };

    public List<Employee1> sort(List<Employee1> emps,final SortMethod method){
        return emps.stream().sorted(method).collect(Collectors.toList());
    }

}
public class EmployeeVerification {
	public EmployeeVerification() {
	}
	// TODO Auto-generated constructor stub
	public static void main(String args[]) {
		List<Employee1> emps = new ArrayList<>();
		emps.add(new Employee1("Mickey", 100000));
		emps.add(new Employee1("Timmy", 50000));
		emps.add(new Employee1("Annny", 40000));
		
		EmployeeInfo ei = new EmployeeInfo();
		
 System.out.println(EmployeeInfo.SortMethod.NAME);
 
 List<Employee1> names = ei.sort(emps,EmployeeInfo.SortMethod.NAME);
 System.out.println();
 names.forEach(System.out::println);
 
 List<Employee1> salaries = ei.sort(emps,EmployeeInfo.SortMethod.SALARY);
 System.out.println();
 salaries.forEach(System.out::println);

		
		
	}
}



