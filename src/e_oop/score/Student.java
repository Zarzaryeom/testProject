package e_oop.score;

//학생 한명의 데이터를 표현(25명을 맞추려면 25개의 객체를 만들어야 한다.)
public class Student {


	//학생 클래스에 매서드가 생긴다는 것은 학생이 하는 일
	//학생이 할 수 없는 일은 이곳에 넣으면 안된다.	
	//이 클래스는 한명의 학생이라고 생각해라.
	
	String name;
	String subject;
	int kor;
	int eng;
	int math;
	int sum;
	double avg;
	int rank;
	int sum2;
	double avg2;
	
	//과목 점수 내기
	int sub() {
		return (int)(Math.random() * 101);
	}
		
	//합계 메서드(리턴 : 합계, 파라미터 : 각 과목들)
	int Add(int a, int b, int c) {
		return a + b + c;
	}
	
	//평균 메서드(리턴 : 평균, 파라미터 : 총합, 과목 숫자)
	double Avg(int a, int b) {
		return Math.round((double)a / b * 100)/ 100.0;
	}
	
//	교수님 답안	
//	점수를 랜덤으로 발생시키는 메서드
//	void randomScore(){
//		kor = (int)(Math.random() * 101);
//	    eng = (int)(Math.random() * 101);
//	    math = (int)(Math.random() * 101);
//	}
//	
//	합계
//	int getSum(){
//		return sum = kor + eng + math;
//	}
//	
//	평균
//	double getAverage(){
//		return avg = Math.round(getSum() / 3.0 * 100) / 100.0;
//	}
//	
//	석차
//	int getRank(Student[] students){
//		rank = 1;
//	
//		for(int i = 0; i < students.length; i++){
//				if(getSum() < students[i].getSum()){
//					rank++;
//			}
//		}
//		return rank;
//	}
//	
//	출력 데이터 제공 메서드
//	String getInfo(){
//		return name + "\t" + kor + "\t" + eng + "\t" + math "\t"
//					+ "sum" + "\t"+ avg +"\t" + rank;
//	}
//	
//	
//	
//	
//	
//	

	
	

}
