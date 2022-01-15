
public class TestRadio {

	public static void main(String[] args) {
		
		FMRadio f1 = new FMRadio(false, 9, 102.1);
		
		f1.toString();
		
		f1.setStatus(true);
		
		f1.toString();
		
		f1.setVolume();
		f1.setVolume();
		
		System.out.println(f1.getVolume());
		
		f1.setFrequency(101.1);
		f1.setFrequency(96.9);
		f1.setFrequency(102.1);
		
		System.out.println(f1.getFrequency());
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
