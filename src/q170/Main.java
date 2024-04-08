package q170;


public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String a; 
		a = "@@@@@@@@@@"; 
		
		
		//print
//		System.out.println(a);
		
		Re r1 = new Re(a);
		
		System.out.println("first");
		r1.print();
		System.out.println("second");
		r1.print();
		System.out.println("third");
		r1.print();
		
		
		
		
	}

}
class Re{
	private String a;
	
	
	//생성(get,set없이 하기위해 파라미터를 넣어)
	public Re(String a) {
		this.a = a;
	}
	
	



	public void print() {
	System.out.println(a);	
	}

	
	//생성자로만 처리
//	public String getA() {
//		return a;
//	}
//	
//	public String setA() {
//		return a;
//	}
}

