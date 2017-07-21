import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;

public class TimeExercise {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LocalDateTime timePoint = LocalDateTime.now();
		System.out.println(timePoint);
		
		LocalDate ldl = LocalDate.of(2012, Month.DECEMBER, 12);
		System.out.println(ldl);

		LocalTime lt1 = LocalTime.of(17, 18);
		System.out.println(lt1);
		LocalTime lt2 = LocalTime.parse("10:15:30");
		System.out.println(lt2);
		
		LocalDate theDate = timePoint.toLocalDate();
		System.out.println(theDate);
		System.out.println(timePoint.getMonth());
		
	}

}
