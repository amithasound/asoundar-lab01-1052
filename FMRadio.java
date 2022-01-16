
public class FMRadio {
		// TODO Auto-generated method stub
	boolean status;
	int volume;
	double frequency; 
	
	
	public FMRadio(boolean status, int volume, double frequency){
		this.status = status;
		this.volume = volume;
		this.frequency = frequency; 
	}
	 	
	public FMRadio() {
	}
	
	
	public void setStatus(boolean onOff) {
		status = onOff;
		
	
//		if(status = true) {
//			status = false;
//		}else {
//			status = true;
//		}
	}
	
	
	public void setVolume(){ //is this supposed to take parameters 
	  volume++;
	}
	public void setVolume(int newVol){ 
      volume = newVol;
	}	

	
	public int getVolume(){
	 return volume;
	}
	
	public void setFrequency(double value) {
		frequency = value; 
	}
	
	public void setFrequency() {
		frequency++; 
	}
	
	public double getFrequency(){
		 return frequency;
	}
	
	
	
	public String toString() {
		String onOff;
		if(status==true) {
			onOff = "On";
		}else {
			onOff = "Off";
		}
		return  "Status: " + onOff + '\n' + "Volume: " + volume +  " Frequency: " + frequency; 

	}
	
	
	
	
	}


