package d_array;

import java.util.Arrays;
import java.util.Scanner;

public class Array {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		/*
		 * 배열
		 * - 여러개의 값을 하나의 변수에 저장해서 사용하는 것이다.
		 * - 참조형 타입니다.
		 * - 인덱스로 값을 구분한다.
		 * - 길이를 변경 할 수 없다.
		*/
		
		int[] array;  //배열의 주소를 저장할 공간이 만들어진다.(배열 만들기 1)
		array = new int[5]; // 배열이 생성되고 그 주소가 저장된다.
		//기본값이 저장된다.(int 타입의 기본값 0 다섯개가 저장된 상태)
		
		/*		
		 * 메모리의 모습
		 * 변수 = 100번지(주소)  // 첫번째 값(0)의 주소
		 * {0, 0, 0, 0, 0}    //100번지 주소에 있는 값
		 * 
		*/		
		
		
		//배열 만들기 2
		array = new int[] {1, 2, 3, 4, 5};
		//배열의 내용과 길이를 모두 지정할 수 있다.
		//대괄호에는 숫자가 들어가선 안된다.
		
		
		
		//배열 만들기 3
		//array = {1, 2, 3, 4, 5};는 변수 선언이 빠져 있어 컴파일이 안된다.
		int[] array2 = {1, 2, 3 ,4, 5};
		//변수의 선언과 초기화를 해주어야 한다.
		
		
		array[0] = 10; //대괄호 안에 들어간 숫자가 인덱스, 
		//0 을 넣으면 배열에 들어간 첫번째 저장 위치를 의미
		array[1] = 20;
		array[2] = 30;
		array[3] = 40;
		array[4] = 50;
		
		System.out.println(array[0]);
		System.out.println(array[1]);
		System.out.println(array[2]);
		System.out.println(array[3]);
		System.out.println(array[4]);
		//배열의 인덱스를 설정하지 않고 그대로 출력하면 배열이 주소값이 나온다.
		
		//for문을 이용하여 배열 만들기
		//for(int i =; i < 5; i++)와 같은 의미를 갖는 코드
		for(int i = 0; i < array.length; i++) {
			array[i] = ++i * 10;
		}
		
		for(int i = 0; i < array.length; i++) {
			System.out.println(array[i]);
		}
		
		//10개의 정수를 저장할 수 있는 배열을 선언 및 초기화 해주세요.
		int[] array3;
		array3 = new int[10];
		
		//배열의 모든 인덱스에 1~100사이의 랜덤한 값을 저장해주세요
		for(int i = 0; i < array3.length; i++) {
			array3[i] = (int)(Math.random() * 100) + 1;
		}
		
		for(int i = 0; i < array3.length; i++) {
			System.out.println(array3[i]);
		}

		System.out.println(Arrays.toString(array3));
		//for문 없이 배열의 모든 값을 문자열로 출력하는 방법
		
				
		//배열에 저장된 모든 값의 합계와 평균을 출력해주세요.
		int x = 0;
		
		for(int i = 0; i < array3.length; i++) {
			x += array3[i];
		}		
		System.out.println(x);
		double avg = (double)x / array3.length; //array3.length : int 타입
		System.out.println(avg);
		
		
		//배열에 저장된 값들 중 최소값과 최대값을 출력해주세요.
		int max = 0;
		for(int i = 1; i < array3.length; i++) {
			if(array3[i-1] > array3[i]) {
				max = array3[i-1];				
			}else {max = array3[i];}
			System.out.print(max + " ");
		}
		
		System.out.println("\n" + max);
		
		for(int i = 1; i < array3.length; i++) {
			if(array3[i] >= array3[i-1]) {
				array3[i] = array3[i-1];
			}
		}

		//어떻게 숫자를 비교할 것인가?
		//1.숫자 하나씩 다 비교한다.
		//2.비교해서 나온 숫자들 중 큰 값을 앞으로 보내고 작은 값을 뒤로 보낸다.
		//가장 큰 값 찾기?
		
		//최소값을 저장할 변수를 만들고 배열의 첫번째 값을 저장한다.
		int min = array3[0];
		//최대값을 저장할 변수를 만들고 배열의 첫번째 값을 저장한다.
		int max1 = array3[0];
		//변수에 저장된 값과 배열의 모든 인덱스의 값을 비교하기 위한 for문을 만든다.
		for(int i = 0; i < array3.length; i++) {
			//최소값이 저장된 변수와 배열의 값을 비교해서 더 작은 값을 찾으면 변수에 저장한다.
			if(min > array3[i]) {
				min = array3[i];
			}
				//최대값이 저장된 변수와 배열의 값을 비교해서 더 큰 닶을 찾아면 변수에 저장한다.
			if(max > array3[i]) { //"<" 아닌가?
				max1 = array3[i];
			}
		}
		System.out.println(max + "  " + min);
		
		
		
		

	int[] shuffle = new int[10];
	for(int i =0; i < shuffle.length; i++) {
		shuffle[i] = i + 1;
	}
	System.out.println(Arrays.toString(shuffle));
	//0에서부터 9사이에 랜덤한 인덱스랑 0번 인덱스에 있는 값을 교환
	//배열의 값을 섞어 주세요.
	//랜덤 인덱스와 0번 인덱스의 자리를 여러번 바꾼다.
//	int num = 0;
//	do{
//		int random = (int)(Math.random() * 10);
//		num = shuffle[0];   
//		shuffle[0] = shuffle[random];
//		shuffle[random] = num;
//	} while(num == );
//	//조건만큼 반복해라
//	System.out.println(Arrays.toString(shuffle));
	
	//답안) 0에서부터 9사이에 랜덤한 인덱스랑 0번 인덱스에 있는 값을 교환
	for(int i = 0; i < shuffle.length * 10; i ++) {
		int random = (int)(Math.random() * shuffle.length);
		int temp = shuffle[random];
		shuffle[random] = shuffle[0];
		shuffle[0] = temp;
	}
	System.out.println(Arrays.toString(shuffle));
	
	
	
	
	//1~10 사이의 랜덤값을 500번 생성하고, 각 숫자가 생성된 횟수를 출력해주세요.
	int[] num;
	num = new int[10];
	
	for(int i = 0; i < 500; i++) {
		int random = (int)(Math.random() * 10) + 1;
//		int j = random;
//			if(random == j) num[j-1]++;
			
		num[random-1]++;
		
//		
//		if(random == 1) num[0]++;
//		if(random == 2) num[1]++;
//		if(random == 3) num[2]++;
//		if(random == 4) num[3]++;
//		if(random == 5) num[4]++;
//		if(random == 6) num[5]++;
//		if(random == 7) num[6]++;
//		if(random == 8) num[7]++;
//		if(random == 9) num[8]++;
//		if(random == 10) num[9]++;
		}
	System.out.println(Arrays.toString(num));
	
	
	
			
	
	
	
	
	}
}
	





