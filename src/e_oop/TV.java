package e_oop;

public class TV {
	public static void main(String[] args) {
		TV tv = new TV();
		tv.power();
		tv.power();
		System.out.println(tv.power);
		tv.channelDown();
		tv.channelDown();
		System.out.println(tv.channel);
		tv.volumeUp();
		tv.volumeUp();
		System.out.println(tv.volume);
		
	}

	boolean power;
	int channel;
	int volume;
	
	TV(){
		power = false;
		channel =7;
		volume = 15;
	}
	
	void power(){
		power = !power;
	}
	
	void channelUp(){
		if(power){
			if(channel >= 99 ) {
				channel = 1;
			} else {
				channel++;
			} 
		} 
	}
	void channelDown(){
		if(power){
			if(channel <= 1){
			channel = 99;
			} else {
				channel--;
			}
		} 
	}
		void volumeUp(){
		if(power){
			if(volume >= 60) {
				volume = 60;
			} else{
			volume++;
			}
		}
	}
	void volumeDown(){
		if(power){
			if(volume <= 0 ) {
				volume = 0;
			} else {
				volume--;
			}
		} 
	} 
	
}
