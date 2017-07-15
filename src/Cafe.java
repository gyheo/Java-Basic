import java.util.Scanner;

public class Cafe {
	int number;
	int menu;
	final int americano = 3000;
	static int americanoCount = 0;
	
	final int cafelatte = 4000;
	static int cafelatteCount = 0;
	
	final int icechoco = 5000;
	static int icechocoCount = 0;
	
	Scanner inputMenu = new Scanner(System.in);
	Scanner inputNumber = new Scanner(System.in);

	public void welcomeMenu(){
		System.out.println("카페에 오신 것을 환영합니다!");
		System.out.println("1. 아메리카노 3000 WON");
		System.out.println("2. 카페라뗴 4000 WON");
		System.out.println("3. 아이스초코 5000 WON");
	}
	
	public void chooseMenu(){
		System.out.print("메뉴를 선택해주세요 : ");
		this.menu = inputMenu.nextInt();
//		return inputMenu.nextInt();
	}
	
	public void chooseNumber(){
		System.out.print("수량을 입력해주세요 : ");
		this.number = inputNumber.nextInt();
//		return inputNumber.nextInt();
	}
	
	public int totalPrice(){
		int totalPrice = 0;
		switch(menu){
		case 1:
			americanoCount++;
			totalPrice = americano * number;
			break;
			
		case 2:
			cafelatteCount++;
			totalPrice = cafelatte * number;
			break;
			
		case 3:
			icechocoCount++;
			totalPrice = icechoco * number;
			break;
		}
		System.out.print("총 가격은 " + totalPrice + "입니다.");
		return totalPrice;
	}
}
