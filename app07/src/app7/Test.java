package app7;
class ThreadScope extends ThreadLocal<String> {
	@Override
	protected String initialValue() {
		// TODO Auto-generated method stub
		return "No data in this scope";
	}
}

class A {
	void m1() {
		System.out.println("m1()	: Thread1 Scope	: " + Thread1.threadScope.get());
		System.out.println("m1()	: Thread2 Scope	: " + Thread2.threadScope.get());
	}
	
	void m2() {
		System.out.println("m2()	: Thread2 Scope	: " + Thread2.threadScope.get());
		System.out.println("m1()	: Thread1 Scope	: " + Thread1.threadScope.get());
	}
}

class Thread1 extends Thread {
	static ThreadScope threadScope = new ThreadScope();
	A a;
	public Thread1(A a) {
		// TODO Auto-generated constructor stub
		this.a = a;
	}
	
	@Override
	public void run() {
		// TODO Auto-generated method stub
		threadScope.set("AAA");
		a.m1();
	}
}

class Thread2 extends Thread {
	static ThreadScope threadScope = new ThreadScope();
	A a;
	public Thread2(A a) {
		// TODO Auto-generated constructor stub
		this.a = a;
	}
	
	@Override
	public void run() {
		// TODO Auto-generated method stub
		threadScope.set("BBB");
		a.m2();
	}
}

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		A a = new A();
		Thread1 thread1 = new Thread1(a);
		Thread2 thread2 = new Thread2(a);
		
		thread1.start();
		thread2.start();
	}

}

/**
 O/P
 
 	m2()	: Thread2 Scope	: BBB
	m1()	: Thread1 Scope	: AAA
	m1()	: Thread2 Scope	: No data in this scope
	m1()	: Thread1 Scope	: No data in this scope

  
 */
