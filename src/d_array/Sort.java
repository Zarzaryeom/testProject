package d_array;

import java.util.Arrays;

public class Sort {

	public static void main(String[] args) {
		/*
		 * - 석차구하기 : 점수를 비교해 작은 점수의 등수를 증가시키는 방식
		 *   -> 석차를 저장할 배열
		 *   -> for문을 2개를 만들어서 전체를 다 비교한다.(더 작은 등수의 점수를 증가시키는)
		 * - 선택정렬 : 가장 작은 숫자를 찾아서 앞으로 보내는 방식
		 * - 버블정렬 : 바로 뒤의 숫자와 비교해서 큰 수를 뒤로 보내는 방식
		 * - 삽입정렬 : 두번째 숫자부터 앞의 숫자들과 비교해서 큰 수는 뒤로 밀고 중간에 삽입하는 방식
		 * 
		 * -Arrays.sor(arr); : 정렬을 구현하는 메소드
		*/	///
	
	
//		int[] arr = new int[10];
//		for(int i = 0; i < arr.length; i++) {
//			arr[i] = (int)(Math.random() * 100) + 1;
//		}
//		System.out.println(Arrays.toString(arr));
		
		//석차구하기
//		int[] rank = new int[arr.length];
//		for(int i = 0; i < rank.length; i++) {
//			rank[i] = 1;
//					
//		}
//		for(int i = 0; i < arr.length; i++) {
//			for(int j = 0; j < arr.length; j++) {
//				if(arr[i] < arr[j]) {
//					rank[i]++;
//				}
//			}
//		}
//		
//		System.out.println(Arrays.toString(rank));
		
		//선택정렬
		/*
		 * 1. 가장 작은 숫자를 찾는다. 
		 * 2. 가장 작은 숫자를 맨 앞으로 보내면서 자리를 바꾼다
		 * 3. n번 반복하면서 n-1번 인덱스로 보내며 자리를 바꾼다.
		 */		
		int[] arr = new int[10];
		for(int i = 0; i < arr.length; i++) {
			arr[i] = (int)(Math.random() * 100) + 1;
		}
		System.out.println(Arrays.toString(arr));
	
//		int[] temp = new int[arr.length];
//		int min = arr[0];
//		for(int i = 0; i < arr.length; i++) {
//			for(int j = i+1; j < arr.length; j++) {
//				if(arr[i] > arr[j]) {
//					temp[0] = arr[i];
//					arr[i] = arr[j];
//					arr[j] = temp[0];
//				}//arr[i]보다 arr[j]가 더 작으면 둘이 자리를 바꾼다.				
//			}		
//		}
//		System.out.println(Arrays.toString(arr));
		
		//최소값 위치 찾기
//		int min = 0;
//		
//		for(int i = 0; i < arr.length; i++) {
//			if(arr[min] > arr[i]) {
//				min = i;
//			}
//		}
//		
		
		//가장 작은 값을 찾고 보내는 방법?
//		for(int i = 1; i < arr.length; i++) {
//			if(arr[min] > arr[i]) {
//				min = i;
//				temp[0] = arr[min];
//				arr[min] = arr[i];
//				arr[i] = temp[0];
//				
//			}
//			//최솟값의 위치를 찾으려면?, 값은 알 수 있다. 위치는?
//		}
		
		//선택정렬
//		for(int i = 0; i < arr.length - 1; i++) {
//			//arr.length-1인 이유 : 배열의 인덱스 n-1번째에서 정렬을 하면 정렬이 끝나기 때문에
//			int min = i;
//			for(int j = i + 1; j < arr.length; j++) {
//				//j=i+1인 이유 : n번째 인덱스를 검사할 때 n+1부터 검사하면 되기 때문
//				if(arr[j] < arr[min]) {
//					min = j;
//				}
//				//최소값을 구하는 과정
//			}
//			int temp = arr[i];
//			arr[i] = arr[min];
//			arr[min] = temp;
//			//자리를 바꾸는 과정
//		}
//		System.out.println(Arrays.toString(arr));
		
		
		
		//버블 정렬
		//앞뒤 2개씩 비교 후 더 큰 숫자를 뒤로 보낸다.
		//한번 정렬이 끝났으면 다시 처음부터 다시 비교한다.
		
//		int[] arr = new int[10];
//		for(int i = 0; i < arr.length; i++) {
//			arr[i] = (int)(Math.random() * 100) + 1;
//		}
//		System.out.println(Arrays.toString(arr));
		
		
//		for(int j = 0; j < arr.length-1; j++) {
//			for(int i = 1; i < arr.length; i++) {
//				if(arr[i-1] > arr[i]) {
//					int temp = arr[i];
//					arr[i] = arr[i-1];
//					arr[i-1] = temp;
//					}
//				//for문을 돌면서 i보다 i-1이 크면 자리가 바뀐다.
//				//반복 횟수, 한번의 반복동안 한번도 움직이지 않았다면 for문을 빠져나올 수 있는 명령 
//				}
//		}
//		System.out.println(Arrays.toString(arr));
		
		//버블정렬 교수님 풀이
//		for(int i = 0; i < arr.length - 1; i++) {
//			boolean flag = false;
//			for(int j = 0; j < arr.length - i - 1; j++) {
//				//arr.length - i - 1 : 도는 횟수를 줄이기 위해서
//				if(arr[j] > arr[j + 1]) {
//					int temp = arr[j];
//					arr[j] = arr[j + 1];
//					arr[j + 1] = temp;
//					flag = true;
//					}
//			}
//			if(!flag) {
//				break;
//			}
//		}
//		System.out.println(Arrays.toString(arr));
		
		
		
		
		//삽입정렬
		//두번째 숫자가 기준이 되어 그 앞의 숫자들과 비교
		//더 큰 수는 뒤로 밀고 중간에 삽입.
		//뒤로 밀고나면 밀려난 숫자가 있던 자리는 빈 자리가 된다.
		
//		int[] arr = new int[10];
//		for(int i = 0; i < arr.length; i++) {
//			arr[i] = (int)(Math.random() * 100) + 1;
//		}
//		System.out.println(Arrays.toString(arr));
//		int temp[] = new int[arr.length];
//		int temp2 = 0;
//		
//		for(int j = 0; j < arr.length; j++) {
//			for(int i = 0; i < arr.length; i++) {
//				if(arr[i] > arr[i+1]) {
//					temp2 = arr[i+1];
//					arr[i+1] = arr[i];
//					if(arr[i-1] <= temp2) {
//						arr[i] = temp2;
//						}
//					}
//				}
//			}
//		System.out.println(Arrays.toString(arr));
//		
		//삽입정렬 교수님 풀이
//		int[] arr = new int[10];
//		for(int i = 0; i < arr.length; i++) {
//			arr[i] = (int)(Math.random() * 100) + 1;
//		}

		for(int i = 1; i < arr.length; i++) {
			int temp = arr[i]; //잠시 행렬을 벗어나는 값을 위해 변수를 새로 지정해 저장
			int j = 0; //주석1을 실행시키기 위해 j를 for문 밖에 초기화
			for(j = i - 1; j >= 0; j--) {
				if(temp < arr[j]) {//두번째 숫자를 기준으로 그 앞의 숫자와 비교
				//arr[i]가 arrp[i-1]보다 작으면 
					arr[j + 1] = arr[j];
					//arr[i]는 arr[i-1]이다.
					//뒤의 숫자가 앞의 숫자보다 작으면 앞의 숫자를 뒤로 옮긴다. 
				}else {//뒤의 숫자가 앞의 숫자보다 같거나 크면
					break;//for(j)문을 나간다.
				}
				//더 작은 값을 만나거나 
				//반복이 끝났을 경우(for문이 끝나야지만 알 수 있다) 빈칸을 채워야 한다.
			}
			arr[j + 1] = temp; 
			//j가 작은 값을 만났을 때 바로 뒤가 
			//빈 공간(temp로 임시 저장했던 인덱스가 들어가는 공간)이다. 주석1
		}
		System.out.println(Arrays.toString(arr));
		
		
		
		
	

	}

}
