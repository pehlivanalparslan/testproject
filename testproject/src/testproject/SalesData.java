package testproject;
/**
 * 
 * Represents the given data for a given period
 *
 */
public class SalesData {
	int data[]= {0,4,42};
	int sum;
	
	public void display() {
		System.out.println("Data: ");
		for (int i=0 ; i<data.length;i++) {
			System.out.println("Next value: " + data[i]);
			sum+=i;
		}
		System.out.println("Sum is: " + sum);
	}
}
