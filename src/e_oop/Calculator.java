package e_oop;

public class Calculator {

	//계산기를 만들어라
	//5개의 산술연산자를 할 수 있는 5개의 메서드를 만들어라.
	//파라미터와 리턴 타입을 어떻게 할 것인지 결정하라
	//파라미터를 통해 계산에 필요한 값을 받아라
	//연산한 뒤 결과를 다시 돌려줘야된다.
	
	
	//덧셈
	double Sum(double num, double num2) {
		return num + num2;
	}
	
	//뺼셈
	double subtra(double num, double num2) {
		return num - num2;
	}
	
	
	//곱셉
	double time(double num, double num2) {
		return num * num2;
	}
	
	//나눗셈
	double div(double num, double num2) {
		return num / num2;
	}
	
	//나머지
	double remain(double num, double num2) {
		return num % num2;
	}
	
	
	
}
