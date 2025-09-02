package Com.Sample;
class Employee {
    String name;
    double salary;

    void display() {
        System.out.println("Employee Name: " + name);
        System.out.println("Salary: " + salary);
    }
}

// Child class (inherits Employee)
class Manager extends Employee {
    String department;

    void display() {
        System.out.println("Manager Name: " + name);
        System.out.println("Salary: " + salary);
        System.out.println("Department: " + department);
    }
}

// Main class

public class SingleLevelInheritence {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Manager m1 = new Manager();
        m1.name = "Harshita";
        m1.salary = 75000;
        m1.department = "IT";
        m1.display();

        Employee e1 = new Employee();
        e1.name = "Geetha";
        e1.salary = 40000;
        e1.display();
	}

}
