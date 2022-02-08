package practice;

public class Array5 {

	public static void main(String[] args) {
		//5-9
		//주어진 배열을 시계발향으로 90도 회전시켜서 출력하는 프로그램을 완성하시오.
//		
//		char[][] star = {
//				{'*', '*', ' ', ' ', ' '},
//				{'*', '*', ' ', ' ', ' '},
//				{'*', '*', '*', '*', '*'},
//				{'*', '*', '*', '*', '*'}
//		};
//		//char[4][5]
//		char[][] result = new char[star[0].length][star.length];
//		
//		for(int i = 0; i < star.length; i++) {
//			for(int j = 0; j < star[i].length; j++) {
//				System.out.print(star[i][j]);
//			}
//			System.out.println();
//		}
//		
//		System.out.println();
//		
//		
//		for(int i = 0; i < star.length; i++) {
//			for(int j = 0; j <star[i].length; j++) {
//					if(j == 4) {
//						break;
//					}else if(i == 2) {
//						System.out.print(star[1][j]);
//					}else if(i == 3) {
//						System.out.print(star[1][j]);
//						System.out.println(star[1][j]);
//					}else System.out.print(star[j][i]);
//			}	
//			System.out.println();	
//			}
//			
//		
//		
//		
//		
//		for(int i = 0; i < result.length; i++) {
//			for(int j=0; j < result[i].length;j++) {
//			System.out.print(result[i][j]);
//			}
//			System.out.println();
//		}
		
		
		
		//5-11
	
		int[][] score = {
				{100, 100, 100}
				, {20, 20, 20}
				, {30, 30, 30}
				, {40, 40, 40}
				, {50, 50, 50}
				};
		//int[5][3]
		int[][] result = new int[score.length+1][score[0].length+1];
		for(int i=0; i < score.length;i++) {
			for(int j=0; j < score[i].length;j++) {
				result[i][j] = score[i][j];
				
				
				
				/*
				(1) . 알맞은 코드를 넣어 완성하시오
				*/
			
			}
			
			}
		for(int i=0; i < result.length;i++) {
			for(int j=0; j < result[i].length;j++) {
				System.out.printf("%4d",result[i][j]);
				}
				System.out.println();
				}

		
	
		
	}

}
