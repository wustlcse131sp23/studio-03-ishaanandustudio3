package studio3;

import java.util.Scanner;

public class Sieve {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("What n do you want");
		int n = in.nextInt();

		int [] Sieve = new int[n];

		for(int i = 0; i<=n-1;i++) {

			Sieve[i] = i;
			
		}
		

		for(int factor = 2; factor < n; factor++) {
			for(int multiple = 2*factor; multiple < n; multiple += factor) {
				Sieve[multiple] = -1;
			}
		}
		
		
		for(int i = 2; i<n;i++) {
			if(Sieve[i] != -1) {
				System.out.println(Sieve[i]);
			}
		}

	}

}
