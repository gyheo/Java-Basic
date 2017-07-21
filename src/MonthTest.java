import java.util.Scanner;

public class MonthTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// static final int TOTAL = 12;
		int[] Month = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
		int index = 0;
		Scanner sc = new Scanner(System.in);
		
		while(true){
			System.out.print("원하시는 달을 입력해주세요 : ");
			index = sc.nextInt();
			if(index < 0 || index > 12){
				System.out.print("다시 입력해주세요 : ");
				continue;
			}
			
			System.out.println(Month[index-1]);
		}
	}

}
