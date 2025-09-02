package Com.Sample;
//Parent class
class Shape {
 String color;

 void showColor() {
     System.out.println("Shape Color: " + color);
 }
}

//Child class 1
class Circle extends Shape {
 double radius;

 void area() {
     showColor();
     System.out.println("Circle Area = " + (3.14 * radius * radius));
 }
}

//Child class 2
class Rectangle extends Shape {
 double length, width;

 void area() {
     showColor();
     System.out.println("Rectangle Area = " + (length * width));
 }
}
//Main class
public class HierarchicalInheritance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Circle c = new Circle();
        c.color = "Red";
        c.radius = 5;
        c.area();

        System.out.println();

        Rectangle r = new Rectangle();
        r.color = "Blue";
        r.length = 6;
        r.width = 4;
        r.area();
	}

}
