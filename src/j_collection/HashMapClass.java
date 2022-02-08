package j_collection;

import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.Set;

public class HashMapClass {

	public static void main(String[] args) {

		/* Object put(Object key, Object value) : 저장된 키와 값을 저장한다.
		 * Object remove(Object key) : 저장된 키로 저장된 값을 제거한다.(key도 같이 제거)
		 * Object get(Object key) : 저장된 키의 값(없으면 null)을 반환한다.
		 * Set keySet() : 저장된 모든 키를 Set으로 반환한다.
		*/
		
		HashMap<String, Object> map = new HashMap<String, Object>();
		
		map.put("age", 10);
		map.put("name", "홍길동");
		map.put("date", new Date());
		
		System.out.println(map);
		
		
		map.put("name", "이순신");
		
		System.out.println(map);
		
		
		map.remove("date");
		System.out.println(map);
		
		Object value = map.get("name"); // 리턴되는 값은 처음 입력되었던 타입의 타입으로 반환
		System.out.println(((String)value).substring(0,2));
		//Object 타입으로 저장되었기 때문에 string 타입으로 형 변환해야 string 메서드를 사용할 수 있다.
		
		
		String value2 = (String)map.get("name");
		//처음부터 String 타입으로 변환하면서 가져오는 예
		
		
		Set<String> keys = map.keySet(); // Set 형태의 key들을 돌려 받은 수 있다.
		//Set은 값을 하나씩 꺼낼 수 있는 메서드가 존재하지 않는다.
		
		for(String key : keys) {
			System.out.println(key + " + " + map.get(key));
			//향상된 for 문 이라고 불린다.
		}
		
		
		ArrayList<HashMap<String, Object>> lprodTable = new ArrayList<HashMap<String, Object>>();
		
		HashMap<String, Object> lprod = new HashMap<String, Object>();
		lprod.put("LPROD_ID", 1);
		lprod.put("LPROD_GU", "P101");
		lprod.put("LPROD_NM", "컴퓨터제품");
		
		lprodTable.add(lprod);
					
		lprod = new HashMap<String, Object>();
		lprod.put("LPROD_ID", 2);
		lprod.put("LPROD_GU", "P102");
		lprod.put("LPROD_NM", "전자제품");
		
		lprodTable.add(lprod);
				
		lprod = new HashMap<String, Object>();
		lprod.put("LPROD_ID", 3);
		lprod.put("LPROD_GU", "P201");
		lprod.put("LPROD_NM", "여성캐주얼");
		
		lprodTable.add(lprod);
				
		for(int i = 0; i < lprodTable.size(); i++) {
			lprod = lprodTable.get(i);
			for(String key : lprod.keySet()) {
				System.out.print(lprod.get(key) + "\t");
			}
			System.out.println();
		}
		
	}

}
