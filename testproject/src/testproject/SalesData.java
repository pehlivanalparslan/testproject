package testproject;
/**
 * 
 * Represents the given data for a given period
 *
 */
public class SalesData {

	int sum;
	int data[]= {-1,0,4,42,84};

	
	public void display() {
		System.out.println("Data: ");
		for (int i:data) {
			System.out.println("Next value: " + data[i]);
			sum+=i;
		}
		System.out.println("Sum is: " + sum);
	}
}
