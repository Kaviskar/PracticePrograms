
public class ProgString {

	public static void main(String[] args) {
	
		String str1="abc";
		  String str2="xyz";
		  char[] str1Arr=str1.toCharArray();
		  char[] str2Arr=str2.toCharArray();
		  
		   char temp=str1Arr[0];
		   str1Arr[0]=str2Arr[2];
		   str2Arr[2]=temp;
		   
		   temp=str1Arr[2];
		   str1Arr[2]=str2Arr[0];
		   str2Arr[0]=temp;
		  for(int i=0;i<str1Arr.length;i++){
		   System.out.print(str1Arr[i]);
		  }
		  
		  System.out.print(" ");
		  for(int i=0;i<str2Arr.length;i++){
		   System.out.print(str2Arr[i]);
		  }

	}

}
