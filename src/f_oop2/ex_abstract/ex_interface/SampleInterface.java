package f_oop2.ex_abstract.ex_interface;

public interface SampleInterface {
	
	/*
	 * << 인터페이스 >>
	 * - 상수와 추상메서드만 멤버로 가질 수 있는 데이터 구조이다.
	 * - interface 인터페이스명{}
	 * - 모든 멤버변수의 제어자는 public static final이며, 생략 할 수 있다.
	 * - 모든 메서드의 제어자는 public abstract 이며, 생략 할 수 있다.
	 * - JKD 8 버전 이상부터는 static메서드 와 default 메서드 = 내용이 있는 메서드 를 사용할 수 있다.
	 */
	
	public static final int NUM1 = 1;
	int NUM2 = 2;
	
	public abstract void method1();
	
	void method2();
	
}

//인터페이스는 메서드에 내용이 없기 때문에 메서드명이 중복되어도 구분할 필요가 없다. 그러므로 다중상속이 가능하다.

class SampleImplement implements SampleInterface, SampleInterface2{
	
	@Override
	public void method1(){
		System.out.println(NUM1);
	}
	@Override
	public void method2(){
		System.out.println(SampleImplement.NUM2);
		}
	@Override
	public void method3(){
		
	}
	
}

interface SampleInterface2{
		void method1();
		void method3();
	
}