
public class Factorial {
	public static int recursiveFactorial(int n) {
		if (n>0) { //recursive case
			System.out.println("Execution context: " + n);// base case

			return n * recursiveFactorial(n - 1); //recursive step/call-creating call stack(s) returns n and the new recursiveFactorial is 1 minus the number, thus the final solution is the multiplication of all the numbers that are greater than 0. i.e. 24
		}else{

		return 1;
	}
	}

	public static void main(String[] args) {
		int recursiveSolution =recursiveFactorial(4); //calling
		System.out.println(recursiveSolution);
	}
}
// int tempCels = (int) ((Double.parseDouble(tempTextField.getText()) - 32)/1.8);
// celsiusLabel.setText(tempCels + " Celsius");
  public class Factorial2 { //another example, output: The recursive solution to 10! is: 3628800
	                                               //The iterative solution to 10! is: 3628800
	public static int recursiveFactorial(int n) {
		if (n > 0) {
			return n * recursiveFactorial(n - 1);
		} else {
			return 1;
		}
	}

	public static int iterativeFactorial(int n) {
		int result = 1;

		while (n > 0) {
			result *= n;
			n -= 1;
		}

		return result;
	}

	public static void main(String[] args) {
		int recursiveSolution = recursiveFactorial(10);
		System.out.println("The recursive solution to 10! is: " + recursiveSolution);

		int iterativeSolution = iterativeFactorial(10);
		System.out.println("The iterative solution to 10! is: " + iterativeSolution);
	}
}


