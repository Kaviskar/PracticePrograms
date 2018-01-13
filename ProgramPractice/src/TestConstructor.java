
public class TestConstructor {
	
	int a;
	
	private TestConstructor(int a){
		this.a=a;
	}

	public static void main(String[] args) {

		TestConstructor t=new TestConstructor(5);
		
		TestConstructor m=new TestConstructor(100);
		
		System.out.println(t.a);
		
		System.out.println(m.a);

	}

}
