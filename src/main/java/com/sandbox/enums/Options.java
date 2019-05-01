package com.sandbox.enums;

public enum Options {
	
	A1_(A.A1, null, null, null, null),
	A1_B1(A.A1, B.B1, null, null, null),
	A1_B1_C1(A.A1, B.B1, C.C1, null, null),
	A1_B1_C1_D1(A.A1, B.B1, C.C1, D.D1, null),
	A1_B1_C1_D1_E1(A.A1, B.B1, C.C1, D.D1, E.E1),
	
	A2_D2(A.A2, null, null, D.D2, null);
	
	private A a;
	private B b;
	private C c;
	private D d;
	private E e;
	
	Options(A a, B b, C c, D d, E e) {
		this.a = a;
		this.b = b;
		this.c = c;
		this.d = d;
		this.e = e;
	}

	public A getA() {
		return a;
	}

	public B getB() {
		return b;
	}

	public C getC() {
		return c;
	}

	public D getD() {
		return d;
	}

	public E getE() {
		return e;
	}

}
