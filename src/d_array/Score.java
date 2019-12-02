package d_array;

import java.util.Arrays;

public class Score {

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
		
		int[][] scores = new int[22][6];
		int []sum = new int[scores.length];
		double[] avg = new double[scores.length];
		int [][] top = {{1},{2},{3},{4},{5},{6},{7},{8},{9},{10},{11},{12},{13},{14},{15},{16},{17},{18},{19},{20},{21},{22}};
		String[][] name = new String[22][1]; 
		int tmp = 0;
		int[][] tmps = new int[1][1];
		String rename[][] = new String[1][1];
		name[0][0] = "강현지";name[1][0] = "강현철";name[2][0] = "구한나";name[3][0] = "김경운";name[4][0] = "김령환";
		name[5][0] = "김지선";name[6][0] = "민태홍";name[7][0] = "박종민";name[8][0] = "박진영";name[9][0] = "백종빈";
		name[10][0] = "이예림";name[11][0] = "이승재";name[12][0] = "이누리";name[13][0] = "윤창훈";name[14][0] = "연은주";
		name[15][0] = "이지형";name[16][0] = "이진우";name[17][0] = "정대석";name[18][0] = "정보람";name[19][0] = "정재영";
		name[20][0] = "주향한";name[21][0] = "이병훈";
		System.out.println("석차 이름" +"\t"+"JavaOracleHTMLCSSJQueryJSP"+"\t"+"총점" + "\t"+ "평균");
		
		
		for(int i = 0; i<scores.length;i++ ){
			for(int j = 0; j<scores[i].length; j++){
				scores[i][j] = (int)(Math.random()*50 + 50);
				sum[i] += scores[i][j];
				
				}
			for(int i1 = 0; i1<scores.length-1;i1++) {
				if(sum[i1] < sum[i1+1]){
				tmp = sum[i1];
				sum[i1] = sum[i1+1];
				sum[i1+1] = tmp;
				rename[0][0] = name[i1][0];
				name[i1][0] = name[i1+1][0];
				name[i1+1][0] = rename[0][0];
				tmps[0] = scores[i1];
				scores[i1] = scores[i1+1];
				scores[i1+1] = tmps[0];
			 }			
			}
			avg[i] =(double)(sum[i])/(scores[i].length);	
			System.out.print(Arrays.toString(top[i]));
			System.out.print(Arrays.toString(name[i]));
			System.out.println(Arrays.toString(scores[i]) + "\t" + sum[i] + "\t"+avg[i]);	
			
		}
		
		
	}

}
