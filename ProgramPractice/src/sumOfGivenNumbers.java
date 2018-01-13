import java.util.ArrayList;
import java.util.Scanner;


public class sumOfGivenNumbers {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the numbers in the list");
		ArrayList<Integer> a=new ArrayList<Integer>();
		
		while(s.hasNextInt()){
			a.add(s.nextInt());
		}
		
		System.out.println(a);
		 int sum=0;
		for(int i=0; i<a.size(); i++){
			
			sum=sum+a.get(i);
		}
		 
		 System.out.println("Sum of given numbers are  :" + sum);
		}


	}


