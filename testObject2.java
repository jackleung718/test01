package testing;

import iAMSmartDTKLite.Exception.iAMSmartException;

public class testObject2 {

	
	public void runOtherClass(testObject object) {
//object.add();

		object.add();
		object.number = 1000;

	}
	

	
	public static void main(String[] args)  {
		testObject test01 = new testObject(10);
		testObject2 test02 = new testObject2();
		test02.runOtherClass(test01);
		test02.runOtherClass(test01);
		test02.runOtherClass(test01);
		test02.runOtherClass(test01);
		test02.runOtherClass(test01);
		test02.runOtherClass(test01);

//		System.out.println(test01.getNumber());
	}
}
