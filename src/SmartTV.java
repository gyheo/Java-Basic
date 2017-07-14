
public class SmartTV implements TV {

	@Override
	public void turnOn() {
		// TODO Auto-generated method stub
		System.out.println("ON");
		
	}

	@Override
	public void turnOff() {
		// TODO Auto-generated method stub
		System.out.println("OFF");
	}

	@Override
	public void changeVolume(int volume) {
		// TODO Auto-generated method stub
		System.out.println("Volume Change");
	}

	@Override
	public void changeChannel(int channel) {
		// TODO Auto-generated method stub
		System.out.println("Channel Change");
	}
	
}
