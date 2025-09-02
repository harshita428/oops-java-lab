package Com.Sample;

//Parent class
class Person1 {
 String name;
 int age;

 void showPerson() {
     System.out.println("Name: " + name);
     System.out.println("Age: " + age);
 }
}

//Child class
class Employee1 extends Person1 {
 int empId;
 double salary;

 void showEmployee() {
     showPerson();
     System.out.println("Employee ID: " + empId);
     System.out.println("Salary: " + salary);
 }
}

class Manager1 extends Employee1 {
 String department;

 void showManager() {
     showEmployee();
     System.out.println("Department: " + department);
 }
}

//Main class
public class MultiLevelInheritence {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
     Manager1 m = new Manager1();

     m.name = "Harshita";
     m.age = 22;
     m.empId = 101;
     m.salary = 85000.50;
     m.department = "IT";

     m.showManager();
 }
}
