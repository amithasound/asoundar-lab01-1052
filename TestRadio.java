
public class TestRadio {

	public static void main(String[] args) {
		
		FMRadio f1 = new FMRadio(false, 9, 102.1); //Create the radio using one of your constructors
		
		System.out.println(f1); //Print out its information (toString)
		f1.setStatus(true); //Turn on the radio
		System.out.println(f1); //Print out its information (toString)
		
		f1.increaseVolume(); //Increase volume a numbers of times
		f1.increaseVolume();
		f1.increaseVolume();
		
		System.out.println("Volume is : " + f1.getVolume() +  '\n'); //Get the current volume and print it out
		
		
		f1.increaseFrequency();//Change the frequency a number of times
		f1.increaseFrequency();
		f1.increaseFrequency();
		
		System.out.println("Frequency is: " + f1.getFrequency() +  '\n'); //Get the current frequency and print it out
		
		
		f1.setVolume(12); //Set the volume and frequency to specific values
		f1.setFrequency(101.1); // ^^
		System.out.println(f1); // //Print out its information (toString)
		
		
		
		f1.setStatus(false); //Turn off the radio
		System.out.println(f1); //Print out its information (toString)
		
		
		
		
		
		
		
		
		
		
		

	}

}
