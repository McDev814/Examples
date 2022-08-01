import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class Driver {
	public static void main(String[] args) {
//		MyArrayList al = new MyArrayList();
//		
//		al.addElement(2);
//		al.addElement(4);
//		al.addElement(6);
//		
//		System.out.println("Current Length: " + al.getLength());
//		int[] temp = al.getAllElements();
//		for (int i = 0; i < al.getLength(); i++) {
//			System.out.printf("Value of al %d: %d%n", i, temp[i]);
//		}
		
//		MyLinkedList<String> ll = new MyLinkedList<>();
//		
//		// Add dummy data
//		ll.addNode("One");
//		ll.addNode("Two");
//		ll.addNode("Three");
//		ll.addNode("Four");
//		ll.addNode("Five");
//		ll.addNode("Six");
//
//		ll.printList();
		
		// Test Droid
		System.out.println("Unit test starting ...");
		DroidTest droidTestObject = new DroidTest();
		int totalUnitTests = 0;
		
		// Reflection selecting every method and running it
		Class droidTestClass = DroidTest.class;
		Method[] droidTestMethods = droidTestClass.getDeclaredMethods();
		
		// loop through methods
		for (Method method : droidTestMethods) {
			
			if (method.isAnnotationPresent(Test.class)) {
				System.out.println(method.getName());
				totalUnitTests++;
				try {
					try {
						method.invoke(droidTestObject);
						System.out.println("Passed");
					} catch (InvocationTargetException e) {
						System.out.println(e.getTargetException().getMessage());
					}
					// Grab return result of that method
					boolean result = (boolean) method.invoke(droidTestObject);
					
					// Display Success / Failure depending on result
					if (result) {
						System.out.println("Success");
					} else {
						System.out.println("Failure");
					}
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		}
	}
}
