package e_oop.score;

public class Score {

	public static void main(String[] args) {
		
		String[] studentNames = {"김기웅", "박태정", "이정규", "오지현"};		
		Student[] students = new Student[studentNames.length];
		String[] subjectNames = {"Kor", "eng", "math"};
		Student[] subject = new Student[subjectNames.length];
		//프로그램을 완성해주세요.
	
		//합계, 평균
		for(int i = 0; i < students.length; i++) {
			students[i] = new Student();
			
			students[i].name = studentNames[i];	
			students[i].kor = (int)(Math.random() * 101);
			students[i].eng = (int)(Math.random() * 101);
			students[i].math = (int)(Math.random() * 101);
			students[i].rank = 1;		
			students[i].sum = students[i].kor + students[i].eng + students[i].math;
			students[i].avg = Math.round((double)students[i].sum / subject.length * 100)/100.0;
			}
				
		//석차
		for(int i = 0; i < students.length; i++) {
			for(int j = 0; j < students.length; j++) {
				if(students[i].sum < students[j].sum) {
					students[i].rank++;
					}
				}
			}
		
		//석차 정렬
		for(int i = 0; i < students.length; i++) {
			int min = i;
			for(int j = i+1; j < students.length; j++) {
				if(students[j].rank < students[min].rank) {
					min = j;					
				}
			}
			Student temp = students[i];
			students[i] = students[min];
			students[min] = temp;
		}
		//객체 자체를 바꾸면 안에 있는 모든 변수도 변한다.
		
		
		//과목 합계, 평균
		for(int i = 0; i < subject.length; i++) {			
			students[i].subject = subjectNames[i];
			for(int j = 0; j < students.length; j++) {
				if(i == 0) {
					students[i].sum2 += students[j].kor;					
				}
				if(i == 1) {
					students[i].sum2 += students[j].eng;
				}
				if(i == 2) {
					students[i].sum2 += students[j].math;;
				}
//				students[0].sum2 += students[j].kor;
//				students[1].sum2 += students[j].eng;
//				students[2].sum2 += students[j].math;
			}			
			students[i].avg2 = Math.round((double)students[i].sum2 / students.length * 100)/100.0;			
//			students[0].avg2 = Math.round((double)students[0].sum2 / students.length * 100)/100.0;
//			students[1].avg2 = Math.round((double)students[1].sum2 / students.length * 100)/100.0;
//			students[2].avg2 = Math.round((double)students[2].sum2 / students.length * 100)/100.0;
		}
		
		//과목합계
//		int[] sums = new int[3];
//		for(int i = 0; i < students.length; i++) {
//			sums[0] += students[i].kor;
//			sums[1] += students[i].eng;
//			sums[2] += students[i].math;
//		}
//		
//		//과목평균
//		double[] avgs = new double[3];
//		for(int i = 0; i < students.length; i++) {
//			avgs[i] += Math.round((double)sums[i] / students.length*100)/100.0;
			
		
//		for(int i = 0; i < subject.length; i++) {			
//			students[i].subject = subjectNames[i];
//			for(int j = 0; j < students.length; j++) {
//				students[0].sum2 += students[j].kor;
//				students[1].sum3 += students[j].eng;
//				students[2].sum4 += students[j].math;
//			}
//			students[i].avg2 = Math.round((double)students[i].sum2 / subject.length * 100)/100.0;
//			students[i].avg3 = Math.round((double)students[i].sum3 / subject.length * 100)/100.0;
//			students[i].avg4 = Math.round((double)students[i].sum4 / subject.length * 100)/100.0;
//		}
			
			//출력
			//이름 및 구분
			System.out.print("이름\t");
			for(int i = 0; i < subjectNames.length; i++) {
				System.out.print(subjectNames[i] + "\t");
			}			
			System.out.println("합계\t" + "평균\t" + "석차");
			
			//각 과목별 점수 및 합계, 평균, 석차 
			for(int i = 0; i < students.length; i++) {
				System.out.print(students[i].name);
				System.out.print("\t" + students[i].kor + "\t" + students[i].eng + "\t" + students[i].math);
				System.out.println("\t" + students[i].sum + "\t" + students[i].avg + "\t" + students[i].rank);
			}
			//과목합계
			System.out.print("과목합계");
			for(int i = 0; i < subject.length; i++) {
				System.out.print("\t" + students[i].sum2);
			}
						
			System.out.println();
			//과목평균
			System.out.print("과목평균");
			for(int i = 0; i < subject.length; i++) {
				System.out.print("\t" + students[i].avg2);
			}
			
			
			
		//출력
			
		
		
		
		
	}

}
