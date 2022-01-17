
public class TestRadio {

	public static void main(String[] args) {
		
		FMRadio f1 = new FMRadio(false, 9, 102.1);
		
		System.out.println(f1);
		
		
		f1.setStatus(true);
		
		System.out.println(f1);
		
		f1.setVolume();
		f1.setVolume();
		f1.setVolume();
		
		System.out.println(f1.getVolume());
		
		
		f1.setFrequency();
		f1.setFrequency();
		f1.setFrequency();
		
		System.out.println(f1.getFrequency());
		
		
		f1.setVolume(12);
		f1.setFrequency(101.1);
		System.out.println(f1);
		
		
		
		f1.setStatus(false);
		System.out.println(f1);
		
		
		
		
		
		
		
		
		
		
		

	}

}
