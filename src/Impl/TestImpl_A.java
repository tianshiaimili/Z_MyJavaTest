package Impl;

public class TestImpl_A implements MyTestImpl{

	public static void main(String[] args) {

//		testImpl();
		
		TestImpl_A a = new TestImpl_A();
		a.testImpl();
		
	}

	public  void testImpl(){
		System.out.println("say hello to B");
		TestImpl_B b = new TestImpl_B();
//		System.out.println("this =="+this);
		b.setMyTestImpl(this);
		b.testBImpl();
	}
	
	@Override
	public void test() {
		System.out.println("sya hello AA");
	}
	
	
}
