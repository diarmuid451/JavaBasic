package 정대석;

public class Homework {

	public static void main(String[] args) {
		//자바의 정석 3판 1권 p469 ~ p471까지 과제
		
//		String(String s) : 주어진 문자열(s)을 갖는 String 인스턴스를 생성한다.
		String s = new String("Hello");
		
//		String(char[] value) : 주어진 문자열(value)을 갖는 String 인스터스를 생성한다.
		char[] c = {'H','e','l','l','o'};
		String s1 = new String (c);
		
//		String(StringBuffer buf) : StringBuffer인스턴스가 갖는 문자열과 같은 내용의 String인스턴스를 생성한다.
		StringBuffer sb = new StringBuffer("Hello");
		String s2 = new String(sb);
		
//		char charAt(int index) :  지정된 위치(index)에 있는 문자를 알려준다.(index는 0부터 시작)
		String s3 = "Hello";
		String n = "0123456";
		char c1 = s3.charAt(1);
		char c2 = n.charAt(1);
		
//		int compareTo(String str) : 문자열(str)과 사전순서로 비교한다.
//		같으면 0을, 사전순으로 이전이면 음수를, 이후면 양수를 반환한다.
		int i1 = "aaa".compareTo("aaa");
		int i2 = "aaa".compareTo("bbb");
		int i3 = "bbb".compareTo("aaa");

//		String concat(String str) : 문자열(str)을 뒤에 덧붙인다.		
		String s4 = "Hello";
		String s5 = s4.concat("World");
		
//		boolean contains(CharSequence s) : 지정된 문자열(s)이 포함되었는지 검사한다.
		String s6 = "abcdefg";
		boolean b = s6.contains("bc");
		
//		boolean endsWith(String suffix) : 지정된 문자열(suffix)로 끝나는지 검사한다.
		String file = "Hello.txt";
		boolean b1 = file.endsWith("txt");
		
//		boolean equals (Object obj) : 매개변수로 받은 문자열(obj)과 String인스턴스의 문자열을 비교한다.
//		obj가 String이 아니거나 문자열이 다르면 false를 반환한다.
		String s7 = "Hello";
		boolean b2 = s.equals("Hello");
		boolean b3 = s.equals("hello");
		
//		boolean equalsIgnoreCase(String str) : 문자열과 String인스턴스의 문자열을 대소문자 구분없이 비교한다.
		String s8 = "Hello";
		boolean b4 = s.equalsIgnoreCase("HELLO");
		boolean b5 = s.equalsIgnoreCase("hello");
		
//		int indexOf(int ch) : 주어진 문자(ch)가 문자열에 존재하는지 확인하여 위치(index)를 알려준다.
//		못 찾으면 -1을 반환한다. index는 0부터 시작
		String s9 = "Hello";
		int idx1 = s9.indexOf('o');
		int idx2 = s9.indexOf('k');
		
//		int indexOf(int ch, int pos) : 주어진 문자(ch)가 문자열에 존재하는지 지정된 위치(pos)로 부터 확인하여
//		위치(index)를 알려준다.못 찾으면 -1을 반환한다. 
		String s10 = "Hello";
		int idx3 = s10.indexOf('e', 0);
		int idx4 = s10.indexOf('e', 2);
		
//		int indexOf(String str) : 주어진 문자열이 존재하는 확인하여 그 위치(index)를 알려준다. 
//		없으면 -1을 반환한다. 
		String s11 = "ABCDEFG";
		int idx5 = s11.indexOf("CD");
		
//		String intern() : 문자열을 상수풀(constant pool)에 등록한다. 이미 상수풀에 같은 내용의 문자열이 있을 경우
//		그 문자열의 주소값을 반환한다.
		String s12 = new String("abc");
		String s13 = new String("abc");
		boolean b6 = (s12==s13);
		boolean b7 = s12.equals(s13);
		boolean b8 = (s12.intern() == s13.intern());
		
//		int lastIndexOf(int ch) : 지정된 문자 또는 문자코드를 문자열의 오른쪽 끝에서부터 찾아서 위치(index)를 알려준다.
//		없으면 -1을 반환한다. 
		String s14 = "java.lang.Objsec";
		int idx6 = s14.lastIndexOf('.');
		int idx7 = s14.indexOf('.');
		
//		int length() : 문자열의 길이를 알려준다.
		String s15 = "java.lang.java";
		int length = s15.length();
		
//		String replace(char old, char new) : 문자열 중의 문자열(old)을 새로운 문자열(new)로 바꾼 문자열을 반환환다.
		String s16 = "Hello";
		String sr = s16.replace('H', 'C');
		
//		String replace(CharSequence old, CharSequence new) : 문자열 중의 문자열(old)을 새로운 문자열(new)로 모두 바꾼 문자열을 반환환다.
		String s17 = "Hellollo";
		String sr1 = s17.replace("ll", "LL");
		
//		String repalceAll(String regex, String replacement) : 문자열 중에서 지정된 문자열(regex)과 일치하는 것을 
//		새로운 문자열(replacement)로 모두 변경한다.
		String ab = "AABBAABB";
		String re = ab.replaceAll("BB", "bb");
		
//		String replaceFirst(String regex, String replacement) : 문자열 중에서 지정된 문자열(regex)과 일치 하는 것 중,
//		첫 번째 것만 새로운 문자열(replacement)로 변경한다.
		String ab1 = "AABBAABB";
		String re1 = ab.replaceFirst("BB", "bb");
		
//		String[] split(String regex) : 문자열을 지정된 분리자(regex)로 나누어 문자열 배열에 담아 반환한다.
		String animals = "dog,cat,bear";
		String [] arr = animals.split(",");

//		String[] split(String regex, int limit) : 문자열을 지정된 분리자(regex)로 나누어 문자열 배열에 담아 반환한다.
//		단, 문자열 전체를 지정된 수(limit)로 자른다.
		String animals1 = "dog,cat,bear";
		String [] arr1 = animals.split(",",2);
		
//		boolean startsWith(String prefix) : 주어진 문자열(prefix)로 시작하는지 검사한다.
		String s18 = "java.lang.Object";
		boolean b9 = s18.startsWith("java");
		boolean b10 = s18.startsWith("lang");
		
//		String substring(int begin)			 : 주어진 시작위치(begin)부터 끝 위치(end) 범위에 포함된 문자열을 얻는다.
//		String substring(int begin, int end) : 이 떄, 시작위치의 문자는 범위에 포함되지만, 끝 위치의 문자는 포함되지 않는다.(begin <= x < end)
		String str = "java.lang.Object";
		String su = str.substring(10);
		String sue = str.substring(5,9);
		
//		String toLowerCase() : String인스턴스에 저장되어 있는 모든 문자열을 소문자로 변환하여 반환한다.
		String s19 = "Hello";
		String sm = s19.toLowerCase();
		
//		String toString() : String인스턴스에 저장되어 있는 문자열을 반환한다.
		String s20 = "Hello";
		String tostr = s20.toString();
		
//		String toUpperCase() : String인스턴에 저장되어 있는 모든 문자열을 대문자로 변환하여 반환한다.
		String s21 = "Hello";
		String bg = s21.toUpperCase();
		
//		String trim() : 문자열의 왼쪽 끝과 오른쪽 끝에 있는 공백을 없앤 결과를 반환한다. 이 대 문자열 중간에 있는 공백은 제거되지 않는다.
		String s22 = "Hello";
		String tr = s22.trim();
		
//		static String valueOf(boolean b) : 
//		static String valueOf(char c) : 
//		static String valueOf(int i) : 
//		static String valueOf(long l) : 
//		static String valueOf(float f) : 
//		static String valueOf(double d) : 
//		static String valueOf(Object o) : 지정된 값을 문자열로 변환하여 반환한다. 참조변수의 경우 toString()을 호출한 결과를 반환한다.
		String ssvb = String.valueOf(true);
		String ssvc = String.valueOf('a');
		String ssvi = String.valueOf(100);
		String ssvl = String.valueOf(100L);
		String ssvf = String.valueOf(10f);
		String ssvd = String.valueOf(10.0);
		java.util.Date dd = new java.util.Date();
		String ssvo = String.valueOf(dd);
		
		
		
	}

}
