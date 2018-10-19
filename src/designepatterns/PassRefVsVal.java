package designepatterns;

public class PassRefVsVal {

	public static void main(String[] args) {

		int number = 25;

		Number myNum = new Number();
		myNum.setVal(50);

		System.out.println("Before calling primitiveCall() method with value :" + number);
		primitiveCall(number);
		System.out.println("after calling primitiveCall() method with value :" + number);

		System.out.println("Before calling nonPrimitiveCall() method with value :" + myNum.getVal());
		nonPrimitiveCall(myNum);
		System.out.println("after calling nonPrimitiveCall() method with value :" + myNum.getVal());

	}

	private static void primitiveCall(int number) {

		System.out.println("Changing the value of primitiveCall() method  ");

		number = 30;

	}

	private static void nonPrimitiveCall(Number myNum) {

		System.out.println("Changing the value of nonPrimitiveCall() method  ");

		myNum.setVal(100);

	}
	
	/*Result
	*******************
	Before calling primitiveCall() method with value :25
	Changing the value of primitiveCall() method  
	after calling primitiveCall() method with value :25
	Before calling nonPrimitiveCall() method with value :50
	Changing the value of nonPrimitiveCall() method  
	after calling nonPrimitiveCall() method with value :100*/

}
