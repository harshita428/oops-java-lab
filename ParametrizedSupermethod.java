package Com.Sample;
//Grandparent class
class Gpr {
 String familyName;
 Gpr(String familyName) {
     this.familyName = familyName;
     System.out.println("Grandparent constructor called");
 }

 void display() {
     System.out.println("Family Name: " + familyName);
 }
}

//Parent class
class Pr extends Gpr {
 String fatherName;

 Pr(String familyName, String fatherName) {
     super(familyName); // call GP constructor
     this.fatherName = fatherName;
     System.out.println("Parent constructor called");
 }

 void display() {
     super.display(); // show family name from GP
     System.out.println("Father's Name: " + fatherName);
 }
}

//Child class
class Ch extends Pr{
 String childName;

 Ch(String familyName, String fatherName, String childName) {
     super(familyName, fatherName); // call Pr constructor
     this.childName = childName;
     System.out.println("Child constructor called");
 }

 void display() {
     super.display(); // call Parent display()
     System.out.println("Child's Name: " + childName);
 }
}

//Main class
public class ParametrizedSupermethod {
 public static void main(String[] args) {
     Ch obj = new Ch("Sharma", "Rakesh", "Harshita");
     //System.out.println();
     obj.display();
 }
}

