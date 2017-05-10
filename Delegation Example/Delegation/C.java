package Package1;

public class C implements I {
	
	// Delegation
	
	I i = new A();	

	// Delegation based on methods
	
	@Override
	public void f() {
		// TODO Auto-generated method stub
		i.f();
	}

	@Override
	public void g() {
		// TODO Auto-generated method stub
		i.g();
	}
	
	void toA() { i = new A();  }
	void toB() { i = new B();  }
	
}
