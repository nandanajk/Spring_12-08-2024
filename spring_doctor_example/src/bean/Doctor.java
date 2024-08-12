package bean;

public class Doctor {
private int id;
private String name;
private int Salary;
private String specialization;


public int getId() {
	return id;
}


public void setId(int id) {
	this.id = id;
}


public String getName() {
	return name;
}


public void setName(String name) {
	this.name = name;
}


public int getSalary() {
	return Salary;
}


public void setSalary(int salary) {
	Salary = salary;
}


public String getSpecialization() {
	return specialization;
}


public void setSpecialization(String specialization) {
	this.specialization = specialization;
}


public Doctor(int id, String name, int salary, String specialization) {
	super();
	this.id = id;
	this.name = name;
	Salary = salary;
	this.specialization = specialization;
}


public Doctor() {
	super();
}


public void display() {
	System.out.println("Id is"+id+"name is"+name+"salary is"+Salary+"Specialisation is"+specialization);
}
}

