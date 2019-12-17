package h_useful;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegularExpression {

	public static void main(String[] args) {
		/*
		 * 정규표현식 : 문자열의 패턴을 검사하는 표현식
		 * 
		 * ^	: 뒷 문자로 시작
		 * $	: 앞 문자로 종료
		 * .	: 임의의 문자(줄바꿈 제외)
		 * *	: 앞 문자가 0개 이상
		 * +	: 앞 문자가 1개 이상
		 * ?	: 앞 문자가 없거나 1개
		 * []	: 문자의 집합이나 범위([a-z] : a부터 z까지, [^a-z] : a부터 z가 아닌 것)
		 * {}	: 앞 문자의 개수({2} : 2개, {2,4} : 2개 이상 4개 이하)
		 * ()	: 그룹화(1개의 문자처럼 인식)
		 * |	: OR 연산
		 * \s	: 공백, 탭, 줄바꿈
		 * \S	: 공백, 탭, 줄바굼이 아닌 문자
		 * \w	: 앞파벳이나 숫자
		 * \W	: 앞파벳이나 숫자가 아닌 문자
		 * \d 	: 숫자
		 * \D 	: 숫자
		 * (?i)	: 뒷 문자의 대소문자 구분 안함
		 * \	: 정규표현식에서 사용되는 특수문자 표현
		 *  
		 */
		
		String str = "abc123";
		
//		String regex = "[a-z]{3}[0-9]{1,3}";
//		String regex = "[a-z0-9]+";
//		String regex = "\\w*";
		String regex = ".*";
		
		Pattern p = Pattern.compile(regex);
		Matcher m = p.matcher(str);
		System.out.println(m.matches());
		
		//아이디, 전화번호, 이메일주소의 유효성을 검사하는 정규표현식을 만들어주세요.
		
		String id = "soundhorizon";
		
		String regid = "[a-z0-9_-]{6,14}";
		
		Pattern p1 = Pattern.compile(regid);
		Matcher m1 = p1.matcher(id);
		System.out.println(m1.matches());
		
		
		String pn = "010-2345-6789";
		
		String regpn = "^0\\d{1,3}-\\d{3,4}-\\d{4}";
		
		Pattern p2 = Pattern.compile(regpn);
		Matcher m2 = p2.matcher(pn);
		System.out.println(m2.matches());
		
		String em = "javaking@gmail.com";
		
		String regem = "[a-z0-9_-]{6,14}@[a-zA-Z]+\\.(?i)(com|net|org|([a-z]{2}\\.kr))$";
		
		Pattern p3 = Pattern.compile(regem);
		Matcher m3 = p3.matcher(em);
		System.out.println(m3.matches());
		
		
	}

}
