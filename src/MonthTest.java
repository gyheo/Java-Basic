import java.util.Scanner;

public class MonthTest {
	private final int[] MAX_DAYS = { 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };

	public int getDaysOfMonth(int month) {
		return MAX_DAYS[month - 1];
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// static final int TOTAL = 12;

		int index = 0, i = 0, repeat = 0;
		MonthTest mt = new MonthTest();
		Scanner sc = new Scanner(System.in);

		System.out.print("반복 횟수를 입력하세요 : ");
		repeat = sc.nextInt();
		while (i < repeat) {
			System.out.print("원하시는 달을 입력해주세요 : ");
			index = sc.nextInt();
			if (index < 0 || index > 12) {
				System.out.print("다시 입력해주세요 : ");
				continue;
			}

			System.out.println(mt.getDaysOfMonth(index));
			i++;
		}
		
		System.out.println("FINISH!");
	}

}
