package prime;

public class prime_number {
	
	// Java program to find all the
	// prime numbers from 1 to N


		// Function to print all the
		// prime numbers till N
		static void prime_N(int Num)
		{
			// Declaring the variables
			int val_x, val_y, flg;

			// Printing display message
			System.out.println(
				"All the Prime numbers within 1 and 500 are:");

			// Using for loop for traversing all
			// the numbers from 1 to N
			for (val_x = 1; val_x <= 500; val_x++) {

				// Omit 0 and 1 as they are
				// neither prime nor composite
				if (val_x == 1 || val_x == 0)
					continue;

				// Using flag variable to check
				// if x is prime or not
				flg = 1;

				for (val_y = 2; val_y <= val_x / 2; ++val_y) {
					if (val_x %val_y == 0) {
						flg = 0;
						break;
					}
				}

				// If flag is 1 then x is prime but
				// if flag is 0 then x is not prime
				if (flg == 1)
					System.out.print(val_x + " ");
			}
		}

		// The Driver code
		public static void main(String[] args)
		{
			int N = 45;

			prime_N(N);
		}
	}
