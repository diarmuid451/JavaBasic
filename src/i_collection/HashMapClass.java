package i_collection;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Set;

public class HashMapClass {

	public static void main(String[] args) {
		/*
		 * put()		: 지정된 키와 값을 저장
		 * get()		: 지정된 키의 값을 반환(없으면 null)
		 * remove()		: 지정된 키로 저장된 값을 제거
		 * keySet()		: 저장된 모든 키를 Set으로 반환
		 */
		
		HashMap<String, String> map = new HashMap<String, String>();
		
		map.put("title", "제목입니다.");	
		map.put("content", "내용입니다.");
		map.put("user", "콩콩이 소환");
		map.put("date", "2019-12-18 3:43");
		
		System.out.println(map.get("title"));
		System.out.println(map.get("content"));
		System.out.println(map.get("user"));
		System.out.println(map.get("date"));
		
		map.put("user", "신비로운 유성");
		System.out.println(map.get("user"));
	
		map.remove("user");
		System.out.println(map.get("user"));
		
		//map에 저장된 모든 내용 출력
		Set<String> keys = map.keySet();
		for(String key : keys){
			String value = map.get(key);
			System.out.println(key + " : "+ value);
		}
	
		ArrayList<HashMap<String, Object>> al = new ArrayList<>();
		HashMap<String, Object> hm0 = new HashMap<>();
		hm0.put("LPROD_ID", 1);
		hm0.put("LPROD_GU", "P101");
		hm0.put("LPROD_NM", "컴퓨터제품");
		al.add(hm0);
	
		HashMap<String, Object> hm1 = new HashMap<>();
		hm1.put("LPROD_ID", 2);
		hm1.put("LPROD_GU", "P102");
		hm1.put("LPROD_NM", "전자제품");
		al.add(hm1);
		
		HashMap<String, Object> hm2 = new HashMap<>();
		hm2.put("LPROD_ID", 3);
		hm2.put("LPROD_GU", "P201");
		hm2.put("LPROD_NM", "여성캐주얼");
		al.add(hm2);
		
		HashMap<String, Object> hm3 = new HashMap<>();
		hm3.put("LPROD_ID", 4);
		hm3.put("LPROD_GU", "P202");
		hm3.put("LPROD_NM", "남성캐주얼");
		al.add(hm3);
		
		HashMap<String, Object> hm4 = new HashMap<>();
		hm4.put("LPROD_ID", 5);
		hm4.put("LPROD_GU", "P301");
		hm4.put("LPROD_NM", "피혁잡화");
		al.add(hm4);
	
		HashMap<String, Object> hm5 = new HashMap<>();
		hm5.put("LPROD_ID", 6);
		hm5.put("LPROD_GU", "P302");
		hm5.put("LPROD_NM", "화장품");
		al.add(hm5);
		
		HashMap<String, Object> hm6 = new HashMap<>();
		hm6.put("LPROD_ID", 7);
		hm6.put("LPROD_GU", "P401");
		hm6.put("LPROD_NM", "음반/CD");
		al.add(hm6);
		
		HashMap<String, Object> hm7 = new HashMap<>();
		hm7.put("LPROD_ID", 8);
		hm7.put("LPROD_GU", "P402");
		hm7.put("LPROD_NM", "도서");
		al.add(hm7);
		
		HashMap<String, Object> hm8 = new HashMap<>();
		hm8.put("LPROD_ID", 9);
		hm8.put("LPROD_GU", "P403");
		hm8.put("LPROD_NM", "문구류");
		al.add(hm8);
		
		for(String key : al.get(0).keySet()){
			System.out.print(key + "\t");
		}
		System.out.println();
		
		for(int i = 0; i < al.size(); i++){
			HashMap<String,Object> hashMap = al.get(i);
			Set<String> keyset = hashMap.keySet();
			for(String key : keyset){
				System.out.print(hashMap.get(key)+ "\t\t");
			}
			System.out.println();
		} 
		
	}

}
