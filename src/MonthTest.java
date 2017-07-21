import java.util.Scanner;

public class MonthTest {
	private final int[] MAX_DAYS = { 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };

	public int getDaysOfMonth(int month) {
		return MAX_DAYS[month - 1];
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// static final int TOTAL = 12;

		int month = 0, i = 0, repeat = 0;
		MonthTest mt = new MonthTest();
		String PROMPT = "cal> ";
		Scanner sc = new Scanner(System.in);

		while (true) {
			System.out.println("원하시는 달을 입력해주세요 : ");
			System.out.print(PROMPT);
			month = sc.nextInt();
			if (month == -1) {
				System.out.println("Have a nice day!");
				break;
			}
			
			if (month <= 0 || month > 12) {
				System.out.print("다시 입력해주세요 : ");
				continue;
			}

			System.out.println(month + "월은 " + mt.getDaysOfMonth(month) + "일까지 있습니다.");

		}

	}

}
