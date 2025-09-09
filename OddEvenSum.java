package Com.Sample;
import java.util.Scanner;
public class OddEvenSum {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
       Scanner sc=new Scanner(System.in);
       System.out.println("Enter how many no u want to input:");
       int n=sc.nextInt();
       int EvenSum=0,OddSum=0;
       System.out.println("enter numbers:");
       for(int i=0;i<n;i++) {
    	    int num=sc.nextInt();
       	if(num % 2==0) {
       		EvenSum+=num;
       	}else {
       		OddSum+=num;
       	}
       }
       System.out.println("Sum of Even Numbers = " + EvenSum);
       System.out.println("Sum of Odd Numbers = " + OddSum);
	}
}

