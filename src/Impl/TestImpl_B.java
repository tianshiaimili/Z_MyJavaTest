package Impl;

public class TestImpl_B {

	private MyTestImpl myTestImpl;

	
	public TestImpl_B(){
		System.out.println("????");
		System.out.println("myTestImpl === "+myTestImpl);

		
	}
	
	
	public MyTestImpl getMyTestImpl() {
		return myTestImpl;
	}

	public void setMyTestImpl(MyTestImpl myTestImpl) {
		System.out.println("---------"+myTestImpl);
		this.myTestImpl = myTestImpl;
		System.out.println("this.myTestImpl ="+this.myTestImpl);
	}
	
	
	public void testBImpl(){
		
		if(myTestImpl != null){
			myTestImpl.test();
		}
		
	}
	
}
