import java.util.Scanner;
public class AddSum {
	
	private static int[] array;
	private static int sum;
	
	private static void setUp(int[] a) {
		instantiateArray();
		setArray(array);
		getSum(array);
		}
	
	private static void instantiateArray() {
		Scanner keys = new Scanner(System.in);
		System.out.println("How many inputs?");
		int input = keys.nextInt();
		array = new int[input];
		}
	private static void setArray(int[] a) {
		Scanner keys = new Scanner(System.in);
		for (int x = 0; x < a.length; x++) {
			System.out.println("Input int.");
			a[x] = keys.nextInt();
			}
		}
	private static int getSum(int[] a) {
		for (int x = 0; x < a.length; x++) {
			sum += a[x];
			}
		return sum;	
		}	
	private static void returnInformation(int[] a) {
		System.out.println("The sum is: " + sum);
		System.out.println("The numbers are:");
		for (int x = 0; x < a.length; x++) {
			System.out.println(a[x] + ", which is " + (((double)a[x] / (double)sum) * 100) + "%.");
			}
		}		
	
	public static void main(String[] arg) {
		AddSum demo = new AddSum();
		demo.setUp(array);
		demo.returnInformation(array);
		}
	}
