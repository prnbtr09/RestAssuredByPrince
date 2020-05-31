package test;

public class genericClassPractice<T> {
	
	private T a;

	public T getA() {
		return a;
	}

	public void setA(T a) {
		this.a = a;
	}
	
	
	public static void main(String args[]) {
		//raw type i.e. we are not declaring type
		genericClassPractice genericType=new genericClassPractice<>();
		genericType.setA("Test");
		genericType.setA(3);
		genericType.setA('c');
		
		System.out.println(genericType.getA());
		
		
		//generic in real use
		genericClassPractice<String> gc=new genericClassPractice<String>();
		gc.setA("Prince");
		System.out.println(gc.getA());
		
		
		try {
		Class.forName("test.mainclass");
			
		//mainclass.test();
		
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	

}
