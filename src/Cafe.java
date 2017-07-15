import java.util.Scanner;

public class Cafe {
	int number;
	int menu;
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
			totalPrice = 3000 * number;
			break;
		case 2:
			totalPrice = 4000 * number;
			break;
		case 3:
			totalPrice = 5000 * number;
			break;
		}
		System.out.print("총 가격은 " + totalPrice + "입니다.");
		return totalPrice;
	}
}
