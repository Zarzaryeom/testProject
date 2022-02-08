package e_oop_score2;

public class Student {
	
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
	
	
//	교수님 답안	
//	점수를 랜덤으로 발생시키는 메서드
	
	void randomScore(){
		kor = (int)(Math.random() * 101);
	    eng = (int)(Math.random() * 101);
	    math = (int)(Math.random() * 101);
	}
	
//	합계
	int getSum(){
		return sum = kor + eng + math;
	}
	
//	평균
	double getAverage(){
		return avg = Math.round(getSum() / 3.0 * 100) / 100.0;
	}
	
//	석차
	int getRank(Student[] students){
		rank = 1;
	
		for(int i = 0; i < students.length; i++){
				if(getSum() < students[i].getSum()){
					rank++;
			}
		}
		return rank;
	}
	
//	출력 데이터 제공 메서드
	String getInfo(){
		return name + "\t" + kor + "\t" + eng + "\t" + math + "\t"
					+ sum + "\t"+ avg +"\t" + rank;
	}
	
	
	
	
	
	

}
