class Parent {

	public void m1() {
		System.out.println("Parent m1");
	}
}

class Child extends Parent {
	public void m2() {
		System.out.println("Child m2");
	}
}

class Test1 {
	public static void main(String []args) {
		Parent p = new Child();
		P.m2();
	}
}