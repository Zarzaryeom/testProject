package j_collection;

import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListClass {

	public static void main(String[] args) {
		
		/*
		 * Collection Framework
		 * - List : 인덱스 순서대로 데이터 저장(배열과 비슷하게 생김)
		 * - Map : 데이터를 key에 저장을 한다.
		 * - Set : 배열과 비슷하게 값을 저장하지만 중복된 값이 저장되지 않는다.(잘 사용하지 않는다.)
		 * 
		 * ArrayList의 주요 메서드(저장된 데이터를 읽는 속도가 비교적 빠름, 삭제,수정은 비교적 느림)
		 * - boolean add(Object obj) : 마지막 위치에 객체를 추가 후 성공여부를 반환한다.
		 * - void add(int index, Object obj) : 지정된 위치에 객체를 추가한다.(인덱스로 저장 위치를 추가함)
		 * - Object set(int index, Object obj) : 지정된 위치에 객체를 저장 후 기존 객체를 반환한다.
		 * - Object get(int index) : 지정된 위치의 객체를 반환한다.
		 * - int size() : 저장된 객체의 수를 반환한다.(length와 같은 의미)
		 * - Object remove(in index) : 지정된 위치의 객체를 제거한다.(삭제된 값을 리턴한다.)
		*/
		
		ArrayList sample = new ArrayList();
		
		sample.add("abc");
		sample.add(100);
		sample.add(new Scanner(System.in));
		
		
		ArrayList<Integer> list = new ArrayList<Integer>();
		// <제네릭> : 제네릭에 타입을 지정해서 저장되는 타입을 지정할 수 있다.
		// 제네릭에는 객체만 저장할 수 있다.
		
//		list.add(10);
//		list.add("abc"); // 다른 타입을 저장하면 컴파일 오류 발생
//		list.add(new Integer(20)); //인티저를 저장하려면 이렇게 상용해야 한다(원래는)
		//자바에 밑줄이 그어져 있으면 '사장' 되었다고하며 더 이상 사용하지 말라는 의미
		
		/*
		 * Wrapper 클래스
		 * - 기본형 타입 8가지를 대신 하기 위한 클래스
		 * - 객체의 형태로 활용해야 할 때 필요하기에
		 * -  자동으로 형변환(언박싱)이 된다.
		 * - byte : Byte
		 * - short : Short
		 * - int : Integer
		 * - long : Long
		 * - float : Float
		 * - double : Double
		 * - char : Character
		 * - boolean : Boolean		
		*/
		
//		System.out.println(list.add(30));
//		//저장의 성공 여부가 반환된다.
//		System.out.println(list);
//		//내용이 바로 출력된다.
//		
//		list.add(1, 40);
//		System.out.println(list);
//		//현재 저장된 인덱스 내에서만 인덱스 지정이 가능하다.
//		
//		
//		
//		
//		//수정 메서드 set
//		int before = list.set(2, 50);
//		System.out.println("before : "+ before);
//		System.out.println(list);
//		
//		
//		//값을 얻기위한 메서드 get
//		int get = list.get(2);
//		System.out.println(get);
		
		
//		for(int i = 0; i < list.size(); i++) {
//			System.out.println(i + " : " + list.remove(0));
//		}
////		//지움과 동시에 데이터가 앞으로 이동하기에 4개의 인덱스를 갖고 있지만 for문이 2번만 진행된다.	
////		
//		System.out.println(list);
		
		
//		for(int i = list.size() - 1; i >= 0; i--) {
//			System.out.println(i + " + " + list.remove(i));
//		}
//		System.out.println(list);
		
		
		
		
		//list에 1~100사이의 랜덤값을 10개 저장해주세요
		for(int i = 0; i < 10; i++) {
			int random = (int)(Math.random() * 100) + 1;
			list.add(random);
		}		
		System.out.println(list);
		
		//list에 저장된 값의 합계와 평균을 구해주세요
		
		int sum = 0;
		double avg = 0;
		for(int i =0; i < list.size(); i++) {
			int num = list.get(i);
			sum += num;
		}
		avg = Math.round((double)sum/list.size() * 10)/10.0;
		
		System.out.println("합계 : " + sum);
		System.out.println("평균 : " + avg);
	
		//list에서 최소값과 최대값을 구해주세요.
		int min = list.get(0);
		int max = list.get(0);
		
		for(int i = 0; i < list.size(); i++) {
			if(list.get(i) < min) {
				min = list.get(i);
			}
			if(max < list.get(i)) {
				max = list.get(i);
			}
		}
		System.out.println("min : " + min + "  max : " + max);
		
		
		//list를 오름차순으로 정렬해주세요.(선택정렬/ 교수님 방법)
		for(int i = 0; i < list.size(); i++) {
			min = i;
			for(int j = i + 1; j < list.size(); j++) {
				if(list.get(j) < list.get(min)){
					min = j;
				}
			}
//			int temp1 = list.get(i);
//			list.set(i, list.get(min));
//			list.set(min, temp1);
			list.set(i, list.set(min, list.get(i)));
		}
		System.out.println(list);
		
		//list를 오름차순으로 정렬해주세요.(선택정렬 2)
				
		for(int i = 0; i < list.size(); i++) {
			for(int j = i; j < list.size(); j++) {
				if(list.get(i) > list.get(j)) {
					int temp = list.get(i);
					list.set(i, list.get(j));
					list.set(j, temp);
				}
			}
		}
		System.out.println(list);
		
		

		
		//2차원
		ArrayList<ArrayList<Integer>> list2 = new ArrayList<ArrayList<Integer>>();
		
		list = new ArrayList<Integer>();
		list.add(10);
		list.add(20);
		list.add(30);
		
		
		list2.add(list);
		
		list = new ArrayList<Integer>();
		list.add(40);
		list.add(50);
		
		list2.add(list);
		
		
		System.out.println(list2);
		
		
		for(int i = 0; i < list2.size(); i++) {
			ArrayList<Integer> list3 = list2.get(i);
			for(int j = 0; j < list3.size(); j++) {
				System.out.println(list3.get(j));
				}
			}
		
		//특정한 값만 얻고 싶을 때
		Integer integer = list2.get(0).get(1);
		System.out.println(integer);
		
		
		//학생 3명의 5과목에 대한 0~100점의 랜덤한 점수를 2차원 ArrayList에 저장해주세요.
		list2 = new ArrayList<ArrayList<Integer>>();
		
		for(int i = 0; i < 3; i++) {
			list2.add(new ArrayList<Integer>()); // 3명의 학생 저장, 학생마다 ArrayList 생성
			for(int j = 0; j < 5; j++) {
				list2.get(i).add((int)(Math.random() * 101));
			}
		}
		System.out.println(list2);
		
		//각 학생별 합계와 평균을 구해주세요
		
		ArrayList<Integer> sum1 = new ArrayList<Integer>();
		ArrayList<Double> avg1 = new ArrayList<Double>();
		for(int i = 0; i < list2.size(); i++){
			sum = 0;
			for(int j = 0; j < list2.get(i).size(); j ++) {
				sum += list2.get(i).get(j);				
			}
			sum1.add(sum);
			avg1.add((double)sum/list2.get(i).size());
		}				
		System.out.println(sum1);
		System.out.println(avg1);
		
		
		
		
		
	}

}
