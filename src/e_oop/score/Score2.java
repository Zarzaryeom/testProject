package e_oop.score;

public class Score2 {

	public static void main(String[] args) {
		
		String[] studentNames = {"김기웅", "박태정", "이정규", "오지현"};		
		Student[] students = new Student[studentNames.length];
		String[] subjectNames = {"Kor", "eng", "math"};
		Student[] subject = new Student[subjectNames.length];
		//프로그램을 완성해주세요.
	
		//매서드
		Student st = new Student();
		
		//합계, 평균
		for(int i = 0; i < students.length; i++) {
			students[i] = new Student();			
			students[i].name = studentNames[i];	
			students[i].kor = st.sub();
			students[i].eng = st.sub();
			students[i].math = st.sub();
			students[i].rank = 1;		
			
			int result = st.Add(students[i].kor, students[i].eng, students[i].math);
			students[i].sum = result;
			students[i].avg = st.Avg(result, subject.length);
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

			}			
			students[i].avg2 = st.Avg(students[i].sum2, students.length);
		}

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
				System.out.println("\t" + students[i].kor 
						+ "\t" + students[i].eng 
						+ "\t" + students[i].math
						+ "\t" + students[i].sum 
						+ "\t" + students[i].avg 
						+ "\t" + students[i].rank);				
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
	
//	 	교수님 답안
//		for(int i =0;i<students.length; i++){
//			students[i] = new Student();
//			students[i].name= studentNames[i];
//			students[i].randomScore;
//			students[i].getSum();
//		    students[i].getAverage();
//		}
//	
//			석차
//			for(int i = 0; i <students.length; i++)(){
//				students[i].getRank(students);
//			}
//			석차 순으로 정렬
//			for(int i = 0; i <students.length; i++)(){
//				int min = i;
//			    for(int j = i+1; j <students.length; j++)(){
//						if(students[j].rank < students[min]){
//						min = j;
//						}
//					}
//				Student temp = students[i];
//				students[i] = students[min];
//				students[min] = temp;
//			}
//	
//		
//			과목 합계
//			int[] sumSum = new int[3];
//			for(int i = 0; i < students.lenght; i++){
//				subSum[0] += students[i]i.kor;
//				subSum[1] += students[i]i.eng;
//				subSum[2] += students[i]i.math;
//			}
//	
//	
//			과목 평균
//			double[] subAvg = new double[3];
//			for(int i= 0; i < subAvg.length; i++) {
//				subAvg[i] = Math.round((double)subSum[i])
//						/ students.length * 100) / 100.0
//			}
//	
//	
//			출력
//			System.out.println("이름\t국어\t영어\t수학\t합계\t평균\t석차);
//			for(int i = 0; i < students.length; i++) {
//				System.out.println(students[i].getInfo());
//			}
//			System.out.print("과목합계");
//			for(int i = 0; i < subSum.length'i++) {
//					System.out.print("\t" + subSum[i]);
//			}
//			System.out.print("\n과목평균");
//			for(int i = 0; i < subAvg.length'i++) {
//					System.out.print("\t" + subAvg[i]);
//			}
//	
//	
//	
//	
//	
//	
//	
//	
//	
//	
//	
//	
//	
//	
//	
//	
//	
//	
//	
//	
//	
	}
	

}
