package testproject;

public class Main {
		public static void main (String[] args) {
			SalesData data = new SalesData();
			data.display();
			
			displayGreeting();
		
		}
		
		private static void displayGreeting() {
			System.out.println("Hello Happy Sales People!");
			System.out.println("This App Shows Sales Data");
			System.out.println("**********************************");
			
			System.out.println("Test 1");
			System.out.println("Test 2");
		}
}
