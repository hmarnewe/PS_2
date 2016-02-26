package base;

//Create a class 
public class MyInteger {
		

	//Create an int data field
	private int iValue;
	
	//Constructor that creates MyInteger object for int value
	public MyInteger(int newValue) {
		iValue = newValue;

	}

	//get method that returns iValue
	public int getValue() {
		return iValue;
	}
	
	
	//Method that returns true if iValue is even, odd, or false respectively
	public boolean isEven() {
		return isEven(iValue);
	}
	public boolean isOdd() {
		return isOdd(iValue);
	}
	public boolean isPrime() {
		return isPrime(iValue);
	}
	

	//Static methods (int) that returns true if iValue is even, odd, or false, respectively
	public static boolean isEven(int n) {
		return (n % 2 == 0); //Anything that can be divided by two is even
	}
	public static boolean isOdd(int n) {
		return !isEven(n); //Anything not even is odd
	}
	public static boolean isPrime(int n) {
		//A prime number is greater than 1 and divisible by only itself and one
		if (n == 1) return false;
		for (int i = 2; i <= n / 2; i++) {
			if (n % i == 0) {
				return false;
			}
		}
		return true;
	}
	
	//Static methods(MyInteger) that return true if iValue is even, odd, or false, respectively
			public static boolean isEven(MyInteger n) {
				return n.isEven();
			}
			public static boolean isOdd(MyInteger n) {
				return n.isOdd();
			}
			public static boolean isPrime(MyInteger n) {
				return n.isPrime();
			}

	//Method equals(int) that return true if value in object equals specified value
	public boolean equals(int n) {
		return (iValue == n);
	}
	
	//Method equals(MyInteger) that return true if value in object equals specified value
	public boolean equals(MyInteger n) {
		return equals(n.getValue());
	}

	
} 
