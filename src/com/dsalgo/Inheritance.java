package com.dsalgo;

class A{
	int i = 5;
	int getI() {
		return i;
	}
}

class B extends A {
	int i = 10;
	int getI() {
		return i;
	}
}

class C {
	{
		System.out.println("In C");
	}
}
class D extends C {
	{
		System.out.println("In D");
	}
}
class E extends D {
	{
		System.out.println("In E");
	}
}
public class Inheritance {

	public static void main(String args[]) {
	A a = new B();
	System.out.println(a.i + " " + a.getI());
	
	E e = new E();
	}
	
}
