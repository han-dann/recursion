import java.io.*;

public class Fibonacci {
	public static void main(String[] args) throws Exception {
		//Using BufferedReader for input
		BufferedReader stdin = new BufferedReader(new InputStreamReader(System.in));
		System.out.print("Which Fibonacci Number would you like to calculate? (e.g. for the 5th number, enter 5) ");
	    int n=Integer.parseInt(stdin.readLine());
	    //Calculate the Fibonacci number and output to the user
	    System.out.println("Your Fibonacci Number is " + fbc(n));
	}
	public static long fbc(int n) {
		if(n==1) {
			return 0;
		} else if(n==2) {
			return 1;
		}else {
			return fbc(n-1)+fbc(n-2);
		}
		
	}

}
