package Com.Sample;

//Grandparent class
class GP {
 GP() {
     System.out.println("Grandparent constructor called");
 }

 void display() {
     System.out.println("This is Grandparent class");
 }
}

//Parent class
class P extends GP {
 P() {
     super(); // calls GP constructor
     System.out.println("Parent constructor called");
 }

 void display() {
     super.display(); // calls GP display()
     System.out.println("This is Parent class");
 }
}

//Child class
class C extends P {
 C() {
     super(); // calls Parent constructor
     System.out.println("Child constructor called");
 }

 void display() {
     super.display(); // calls Parent display()
     System.out.println("This is Child class");
 }
}

//Main class
public class MainSuperKeyword {
 public static void main(String[] args) {
     C obj = new C();
     System.out.println();
     obj.display();
 }
}
