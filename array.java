package array;

// Java program to check whether
// an element is present in array or not

import java.util.Arrays;
import java.util.Scanner;
import java.util.stream.IntStream;

 public class array15 {

	// Function return true if given element
	// found in array
	private static void check(int[] arr, int toCheckValue)
	{
		// check if the specified element
		// is present in the array or not
		// using Linear Search method
		boolean test = false;
		for (int check : arr) {
			if (check == toCheckValue) {
				test = true;
				break;
				
			}
		}
		if(test=true) {
			System.out.print("the array is found");
			
		}
		else {
			System.out.println("the array is not found");
		}
		// Print the result
		/*System.out.println("array" + toCheckValue
						+ "is  present in the array: " + test);
	*/
	}

	public static void main(String[] args)
	{

		// Get the array
		int arr[] = { 5, 1, 1, 9, 7, 2, 6, 10 };

		Object sc;
		// Get the value to be checked
		//arr[toche]=sc.nextInt();
		int val;
		Scanner input =new Scanner(System.in);
		val=input.nextInt();//allows input from the user
		int toCheckValue =val;

		// Print the array
		System.out.println("Array: "
						+ Arrays.toString(arr));

		// Check if this value is
		// present in the array or not
		check(arr, toCheckValue);
		
	}
}
