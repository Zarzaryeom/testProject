package e_oop;

public class UserDefinedDataType {

	public static void main(String[] args) {
		/*
		 * 사용자 정의 데이터 타입
		 * - 데이터의 최종 진호 형태이다.(기본형 -> 배열 -> 클래스)
		 * - 서로 다른 타입의 데이터를 묶어서 사용하는 것이다.
		 * - 변수와 메서드로 구성할 수 있다.	 
		*/		
		//변수를 넣어서 클래스를 사용하는 법
		
		System.out.println();
		
		//기본형 데이터
		int kor;
		int eng;
		int math;
		int sum;
		double avg;
		
		
		//배열
		int[] scores;
		int[] sum2;
		double[] avg2;
		
		//클래스 사용하기
		
		//클래스를 활용하여 연산
		Student student = new Student();//객체 생성(인스턴스화)
		student.kor = (int)(Math.random() * 101);
		student.eng = (int)(Math.random() * 101);
		student.math = (int)(Math.random() * 101);
		student.sum = student.kor + student.eng + student.math;
		student.avg = Math.round(student.sum/3.0 *100) / 100.0;
		
		System.out.println("합계 :  " + student.sum);
		System.out.println("평균 : " + student.avg);
	

	}

}

//클래스 생성
class Student{
	//클래스 내에서 변수 선언
	int kor;
	int eng;
	int math;
	int sum;
	double avg;
}