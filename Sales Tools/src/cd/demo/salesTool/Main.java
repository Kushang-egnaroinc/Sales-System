package cd.demo.salesTool;

public class Main {

	public static void main(String[] arg){
		SalesData obj = new SalesData(); 
		
		displayGreeting();
		obj.display();
	}
	
	private static void displayGreeting(){
		System.out.println("Hello wishing U Happy day");
		System.out.println("THIS APP shows the SALE data");
	}
}
