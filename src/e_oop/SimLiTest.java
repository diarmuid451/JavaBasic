package e_oop;

import java.util.Scanner;

public class SimLiTest {

	public static void main(String[] args) {
	
		new SimLiTest().question1();
	}
	
	Scanner s = new Scanner(System.in);
	
	void question1(){
	System.out.println("나의 연애 유형 테스트를 시작하겠습니다. \t답변은 항상 YES or NO로 하세요.");
	System.out.println("START!");
	System.out.println("나는 금사빠다 - 금방 사랑에 빠진다.");
	String a1 = s.nextLine();
	if(a1.equalsIgnoreCase("YES")){
		question2();
	} else if(a1.equalsIgnoreCase("NO")){
		question4();
	} else {
		System.out.println("정확한 답변을 입력해 주세요.");
		question1();
		}
	}
	
	void question2(){
		System.out.println("연애할 떄 끌려다니는 타입니다.");
		String a1 = s.nextLine();
		if(a1.equalsIgnoreCase("YES")){
			question5();
		} else if(a1.equalsIgnoreCase("NO")){
			question3();
		} else {
			System.out.println("정확한 답변을 입력해 주세요.");
			question2();
			}	
		}
	
	void question3(){
		System.out.println("데이트 코스는 미리 짜는게 편하다");
		String a1 = s.nextLine();
		if(a1.equalsIgnoreCase("YES")){
			question6();
		} else if(a1.equalsIgnoreCase("NO")){
			question5();
		} else {
			System.out.println("정확한 답변을 입력해 주세요.");
			question3();
			}
		}
	
	void question4(){
		System.out.println("감정기복이 크지 않다.");
		String a1 = s.nextLine();
		if(a1.equalsIgnoreCase("YES")){
			question7();
		} else if(a1.equalsIgnoreCase("NO")){
			question5();
		} else {
			System.out.println("정확한 답변을 입력해 주세요.");
			question4();
			}
		}
	void question5(){
		System.out.println("감정 표현에 솔직한 편이다.");
		String a1 = s.nextLine();
		if(a1.equalsIgnoreCase("YES")){
			question8();
		} else if(a1.equalsIgnoreCase("NO")){
			question6();
		} else {
			System.out.println("정확한 답변을 입력해 주세요.");
			question5();
			}
		}
	
	void question6(){
		System.out.println("활동적인 데이트가 좋다.");
		String a1 = s.nextLine();
		if(a1.equalsIgnoreCase("YES")){
			question8();
		} else if(a1.equalsIgnoreCase("NO")){
			question9();
		} else {
			System.out.println("정확한 답변을 입력해 주세요.");
			question6();
			}
		}
	
	void question7(){
		System.out.println("연락이 없어도 믿고 기다리는 편이다.");
		String a1 = s.nextLine();
		if(a1.equalsIgnoreCase("YES")){
			System.out.println("타입 A : 서로에 대한 신뢰감이 깊고, 존중해주는 어른스러운 연애를 하는 타입!");
		} else if(a1.equalsIgnoreCase("NO")){
			question8();
		} else {
			System.out.println("정확한 답변을 입력해 주세요.");
			question7();
			}
		}
	
	void question8(){
		System.out.println("이성친구는 존재할 수 없다.");
		String a1 = s.nextLine();
		if(a1.equalsIgnoreCase("YES")){
			question9();
		} else if(a1.equalsIgnoreCase("NO")){
			System.out.println("타입 B : 구속을 하는 것도, 받는 것도 싫은 자유로운 연애를 하는 타입!");
		} else {
			System.out.println("정확한 답변을 입력해 주세요.");
			question8();
			}
		}
	
	void question9(){
		System.out.println("아무것도 아닌 일에 쉽게 섭섭함이 쌓인다.");
		String a1 = s.nextLine();
		if(a1.equalsIgnoreCase("YES")){
			System.out.println("타입 D : 무조건 잘해주고, 무조건 맞춰주는 다 퍼주는 연애를 하는 타입!");
		} else if(a1.equalsIgnoreCase("NO")){
			System.out.println("타입 C : 이것은 의리인가 사랑인가... 친구같이 편안한 연애를 하는 타입!");
		} else {
			System.out.println("정확한 답변을 입력해 주세요.");
			question9();
			}
		}
	
	}
