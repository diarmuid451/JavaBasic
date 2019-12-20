package i_collection;

import java.util.ArrayList;

public class ArrayListClass {

	public static void main(String[] args) {
		/*
		 *  add()	: 마지막 위치에 객체를 추가
		 *  get()	: 지정된 위치의 객체를 반환
		 *  set()	: 지정된 위치에 주어진 객체를 저장(수정)
		 *  remove(): 지정된 위치의 객체를 제거
		 *  size()	: 저장된 객체의 수 반환
		 */
		
		ArrayList<Object> list = new ArrayList<Object>();
		list.add(10);
		list.add("abc");
		list.add(true);
		list.add(new ArrayListClass());
		
		ArrayList<String> list2 = new ArrayList<>();
		
		list2.add("adc");
		list2.add("123");
		list2.add("가나다");
		list2.set(1, "456");
		
		for(int i = 0; i < list2.size(); i++){
			System.out.println(list2.get(i));
		
		}
		
		list2.remove(0);
		//리스트에 저장된 값을 삭제하면 그 뒤의 모든 값의 인덱스가 당겨진다.
		System.out.println(list2.get(0));
		System.out.println(list2.get(1));
		
		//2차원 배열
		ArrayList<ArrayList<Integer>> list3 = new ArrayList<>();
		
		ArrayList<Integer> list4 = new ArrayList<>();
		list4.add(10);
		
		list4.add(20);
		
		list3.add(list4);
		for(int i = 0; i<list3.size();i++){
			for(int j = 0; j<list4.size(); j++){
				System.out.print(list4.get(j)+ "\t");
			}
			 System.out.println();
		}
		
//		정수를 저장할 수 있는 ArrayList를 생성해 값을 5번 넣어주세요.
		ArrayList<Integer> listIn = new ArrayList<>();
		listIn.add(70);
		listIn.add(26);
		listIn.add(30);
		listIn.add(40);
		listIn.add(50);
		
		for(int i = 0; i<listIn.size(); i++){
			System.out.print(listIn.get(i) + " ");
		}
//		위에서 만든 ArrayList에 담긴 값들의 합계와 평균을 출력해주세요.
		
		int sum = 0;
		for(int i = 0; i<listIn.size(); i++){
			sum += listIn.get(i);
			
		}	
		double avg = 0;
		avg = (double)(sum) / (double)listIn.size();
		System.out.println("합계 : " + sum + " / 평균 : "+avg);
		
		//위에서 만든 ArrayList에 담긴 값들 중 최소값과 최대값을 출력해 주세요.
		
		int min = listIn.get(0);
		int max = listIn.get(0);
		for(int i = 0; i < listIn.size(); i++){
			if(listIn.get(i) < min){
				min = listIn.get(i);
			}
			if(max < listIn.get(i)){
				max = listIn.get(i);
			}
		}
		System.out.println("min : " + min + " / max : " + max);
		
		//위에서 만든 ArrayLis의 값을 내림차순으로 정렬해주세요.
		
		for(int i = 0; i <  listIn.size(); i++){
		boolean changed = false;
		for(int j = 0; j <  listIn.size()-1; j++){
			if(listIn.get(j+1) > listIn.get(j)){
				int temp = listIn.get(j);
				listIn.set(j, listIn.get(j+1));
				listIn.set(j+1, temp);
				changed = true;
				}
		}
		if(!changed){
				break;
		}
		
		} System.out.println(listIn);
	}

}
