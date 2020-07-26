package Section3;

class floatAndDouble {

	public static void main(String[] args) {
		//width of int = 32 (4 bytes)
		int myIntValue = 5/ 3; 
		//width of float = 32 (4 bytes)
		float myFloatValue = 5f / 3f;
		//width of double = 64 (8 bytes) 
		double myDoubleValue = 5d / 3d; 
		//use doubles for mathematical calculations 
		System.out.println("myintValue = " + myIntValue);
		System.out.println("myFloatValue = " + myFloatValue);
		System.out.println("myDoubleValue =" + myDoubleValue);
	}

}
