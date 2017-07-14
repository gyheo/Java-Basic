
public class TvExercise {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TV tv = new SmartTV();
		FutureTV fTV = new FutureTV();
		
		tv.turnOn();
		tv.changeChannel(100);
		tv.changeVolume(100);
		tv.turnOff();
	
		fTV.turnOn();
		fTV.turnOff();
	}

}
