class Test3 {
	public static void main(String[] args) {
	
		P p = new C();
		p.m1();
		
	}
}

class P {
	public void m1() {
	}
}

class C extends P {
	public void m1() {
	
		System.out.println("child");
	}
	
	public void m1(int i) {
	
		System.out.println("int");
	}
	
}