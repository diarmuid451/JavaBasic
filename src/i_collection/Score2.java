package i_collection;

import java.util.ArrayList;

public class Score2 {

	public static void main(String[] args) {
		/*
		 * 우리반 모두의 Java, Oracle, HTML, CSS, JQuery, JSP 점수를 50~ 100까지 랜덤으로 생성시켜주시고,
		 * 석차순으로 석차, 이름, 과목별 점수, 총점, 평균을 출력해주세요.
		 * 
		 * 석차	이름		Java	Oracle	HTML	CSS		JQuery	JSP 	총점		평균
		 * 1	홍길동	90		100		80		50		30		90		400		70
		 * 2	홍길동	90		100		80		50		30		90		400		70
		 * 3	홍길동	90		100		80		50		30		90		400		70
		 * 4	홍길동	90		100		80		50		30		90		400		70
		 * 5	홍길동	90		100		80		50		30		90		400		70
		 */
//		String[] students = {"강현지","강현철","구한나","김경운","김령환","김지선","민태홍","박종민","박진영","백종빈","이예림","이승재","이누리","윤창훈","연은주","이지형","이진우","정대석","정보람","정재영","주향한","이병훈"};
		ArrayList<String> students = new ArrayList<>(); //학생 이름
		students.add("강현지");students.add("강현철");students.add("구한나");students.add("김경운");students.add("김령환");
		students.add("김지선");students.add("민태홍");students.add("박종민");students.add("박진영");students.add("백종빈");
		students.add("이예림");students.add("이승재");students.add("이누리");students.add("윤창훈");students.add("연은주");
		students.add("이지형");students.add("이진우");students.add("정대석");students.add("정보람");students.add("정재영");
		students.add("주향한");students.add("이병훈");
//----------------------------------------------------------------------------------------------------------------		
//		String[] subjects = {"Java","Oracle","HTML","CSS","JQuery","JSP"};
		ArrayList<String> subjects = new ArrayList<>(); //과목 이름
		subjects.add("Java");
		subjects.add("Oracle");
		subjects.add("HTML");
		subjects.add("CSS");
		subjects.add("JQuery");
		subjects.add("JSP");
//		-------------------------
//		double[][]scores = new double[students.length][subjects.length+3];
		ArrayList<ArrayList<Integer>> scores = new ArrayList<>();
//		//점수를 입력한다.
//		for(int i = 0; i<scores.length;i++ ){
//			scores[i][0] = 1; //석차
//			for(int j = 0; j<subjects.length; j++){
//				scores[i][j+1] = (int)(Math.random()*51 + 50);
//			}
//		}
		for(int i =0; i<scores.size();i++){
			
		}
//		//총점과 평균을 구한다.
//		for(int i = 0; i < scores.length; i++){
//			for(int j = 0; j < subjects.length; j++){
//				scores[i][scores[i].length-2] += scores[i][j+1]; //총점
//			} 
//			scores[i][scores[i].length-1] = (int)(scores[i][scores[i].length-2] / subjects.length * 100 +0.5)/100.0; //평균
//		}
//		
//		//석차를 구한다.
//		for(int i = 0; i< scores.length; i++){
//			for(int j = 0; j < scores.length; j++){
//				if(scores[i][scores[i].length-1] < scores[j][scores[j].length-1]){
//					scores[i][0]++;
//				}
//			}
//		}
//		
//		//정렬한다.
//		for(int i = 0; i < scores.length-1; i++){
//			for(int j = i + 1; j < scores.length; j++){
//				if(scores[i][0] > scores[j][0]){
//					double[] temp = scores[i];
//					scores[i] = scores[j];
//					scores[j] = temp;
//					
//					String tempName = students[i];
//					students[i] = students[j];
//					students[j] = tempName;
//				}
//			}
//		}
//		
//		//출력한다.
//		System.out.print("석차\t이름");
//		for(int i = 0; i < subjects.length; i++){
//			System.out.print("\t" + subjects[i]);
//		}
//		System.out.println("\t총점\t평균");
//		
//		for(int i = 0; i < scores.length; i++){
//			System.out.print((int)scores[i][0]+ "\t" + students[i]);
//			for(int j = 1; j< scores[i].length; j++){
//				System.out.print("\t" + scores[i][j]);
//			}
//		 System.out.println();
//		}
//		
//		System.out.print("과목별 평균\t");
//		for(int i = 1; i <= subjects.length; i++){
//			double sum = 0;
//			for(int j = 0; j < scores.length; j++){
//				sum += scores[j][i];
//			}
//			double avg = (int)(sum / scores.length *100 + 0.5)	/ 100.0;
//			System.out.print("\t" + avg);
//		}
	}

}
