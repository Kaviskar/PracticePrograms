import java.util.ArrayList;
import java.util.Scanner;


public class SumTo10 {

	public static void main(String[] args) {
		
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the numbers in the list");
		ArrayList<Integer> a=new ArrayList<Integer>();
		
		while(s.hasNextInt()){
			a.add(s.nextInt());
		}
		
		for(int k=0; k<5; k++){
		System.out.println(a);
		}
		for(int i=0; i<a.size()-1; i++){
			for(int j=i+1; j<a.size(); j++){
				
				if(a.get(i)+a.get(j)==10){
					System.out.println("(" + a.get(i) + "," + a.get(j) + ")");
				}
				
			}
		}

	}

}
