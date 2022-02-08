package g_oop2;

public class Time {
	
	private int hour;
	private int minute;
	private int second;
	private int day;	
	
	//get, set : 변수에 간접적으로 접근하게 할 수 있는 방법
	//메서드에서는 코드를 만들어 변수에 들어오는 값을 제한할 수 있다.
	//get : 변수의 값을 읽어오기 위한 메서드
	public int getHour() {
		return hour;
	}
	//set : 변수의 값을 저장하기 위한 메서드
	public void setHour(int hour) {
		if(0 <= hour && hour <24) {
			this.hour = hour;
		}else if(hour > 23) {
			this.hour = 23;
		}else {
			this.hour = 0;
		}
	}
	
	public int getMinute() {
		return minute;
	}
	public void setMinute(int minute) {
		if(0 <= minute && minute < 60) {
			this.minute = minute;
		}else if(minute > 59) {
			this.minute = 59;
		}else {
			this.minute = 0;
		}
	}
	public int getSecond() {
		return second;
	}
	public void setSecond(int second) {
		if(0 <= second && second < 60) {
			this.second = second;
		}else if(second > 59) {
			this.second = 59;
		}else {
			this.second = 0;
		}
	}
	
	void clock() {
		while(true) {
			System.out.println(toString());
			stop();
			setSecond(second + 1);
		}
	}
	
	//다른 클래스에서는 사용할 일이 없기 때문에, private를 이용하여 접근 제어
	private void stop() {
		//프로그램을 잠깐동안 멈출 수 있는 메서드, 1/1000초 단위
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}	
		//Thread.sleep(1000) 입력 후 ctrl + 1을 눌러 'surround with try' 클릭
	}
	
	

	@Override
	public String toString() {
		return hour + ":" + minute + ":" + second;
	}
	
	
	
	
	
	
	
}
