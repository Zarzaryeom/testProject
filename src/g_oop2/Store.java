package g_oop2;

public class Store {
	public static void main(String[] args) {
		Desktop d1 = new Desktop("삼성 컴퓨터", 100000);
		Desktop d2 = new Desktop("LG 컴퓨터", 150000);
		
		AirCon ac1 = new AirCon("삼성 에어컨", 200000);
		AirCon ac2 = new AirCon("LG 에어컨",250000);
		
		TV tv1 = new TV("삼성 TV", 3000000);
		TV tv2 = new TV("LG TV", 3500000);
		
		Customer c = new Customer();
		
		c.buy(d1); //상속을 받아서 다형성을 사용할 수 있기 때문에 컴파일 에러가 나타나지 않음
		
		c.buy(ac2);
		
		c.buy(tv2);
		
		((Desktop)c.items[0]).programming();		
	}
}


class Product{
	String name; //이름
	int price; //가격
	
	Product(String name, int price){
		this.name = name;
		this.price = price;
	}
	
	//상품의 정보를 반환하는 메서드
	String getInfo() {
		return name + "(" + price + "원)";
	}
	
	
}


class Desktop extends Product{
	Desktop(String name, int price){
		super(name, price);
		}
	
	void programming() {
		System.out.println("프로그램을 만듭니다.");
	}
}


class AirCon extends Product{
	AirCon(String name, int price){
		super(name, price);
	}
	
	void setTemperature() {
		System.out.println("온도를 설정합니다.");
	}
}

class TV extends Product{
	TV(String name, int price){
		super(name, price);
	}
	
	void setChannel() {
		System.out.println("채널을 변경합니다.");
	}
}

class Customer{
	int money = 100000000;
	
	Product[] items = new Product[10];
	
	void buy(Product p) { //다형성으로 Product가 변수 타입으로서 파라미터에 들어갈 수 있다.
		if(money < p.price) {
			System.out.println("잔돈이 부족합니다.");
			return; //메소드 종료
		}
		
		money -= p.price;
		
		for(int i = 0; i < items.length; i++) {
			if(items[i] == null) {
				items[i] = p;
				break;
 			}
		}
		System.out.println(p.getInfo() + "를 구매하였습니다.");
	}
}