package com.assignment2.mahesh;


class Employee {
	 private String name;
	 private String address;
	 private double salary;
	 private String jobTitle;
	
	 public Employee(String name, String address, double salary, String jobTitle) {
	     this.name = name;
	     this.address = address;
	     this.salary = salary;
	     this.jobTitle = jobTitle;
	 }
	
	 public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String getAddress() {
		return address;
	}
	
	public void setAddress(String address) {
		this.address = address;
	}
	
	public double getSalary() {
		return salary;
	}
	
	public void setSalary(double salary) {
		this.salary = salary;
	}
	
	public String getJobTitle() {
		return jobTitle;
	}
	
	public void setJobTitle(String jobTitle) {
		this.jobTitle = jobTitle;
	}
	
	public double calculateBonus() {
	     // Default bonus calculation
	     return 0.05 * salary;
	 }

 public void generatePerformanceReport() {
     
     System.out.println("Generating performance report for  " + this.name);
     
 }


}


class Manager extends Employee {
	
 public Manager(String name, String address, double salary) {
     super(name, address, salary, "Manager");
 }

 @Override
 public double calculateBonus() {
     // Bonus calculation specific to managers
     return 0.1 * getSalary();
 }

 public void manageProjects() {
     // Logic to manage projects
     System.out.println("Managing projects as a Manager");
 }
}


class Developer extends Employee {
	 public Developer(String name, String address, double salary) {
	     super(name, address, salary, "Developer");
	 }
	
	 @Override
	 public double calculateBonus() {
	     // Bonus calculation specific to developers
	     return 0.08 * getSalary();
	 }
	
	 public void writeCode() {
	     // Logic to write code
	 System.out.println("Writing code as a Developer");
	 }
	}

//Programmer.java
class Programmer extends Developer {
	 public Programmer(String name, String address, double salary) {
	     super(name, address, salary);
	     setJobTitle("Programmer");
	 }
	
	 @Override
	 public double calculateBonus() {
	     // Bonus calculation specific to programmers
	     return 0.07 * getSalary();
	 }
	
	 public void debugCode() {
	     // Logic to debug code
	     System.out.println("Debugging code as a Programmer");
	 }
	}

//Main.java

public class Run {

		 public static void main(String[] args) {
		     Manager manager = new Manager(" MAHEsH", "123 Main St", 80000);
		     Developer developer = new Developer("MANI", "456 Elm St", 70000);
		     Programmer programmer = new Programmer("RAMU", "789 Oak St", 60000);

		     System.out.println("Manager bonus: $" + manager.calculateBonus());
		     manager.manageProjects();
		     manager.generatePerformanceReport();

		     System.out.println("Developer bonus: $" + developer.calculateBonus());
		     developer.writeCode();
		     developer.generatePerformanceReport();
		     

		     System.out.println("Programmer bonus: $" + programmer.calculateBonus());
		     programmer.debugCode();
		     programmer.generatePerformanceReport();
		     
		 }
		}


