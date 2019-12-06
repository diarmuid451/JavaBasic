package e_oop;

public class AirConditioner {
	public static void main(String[] args) {
		AirConditioner aircon = new AirConditioner();
		aircon.power();
		System.out.println(aircon.power);
		aircon.temperatureDown();
		aircon.temperatureDown();
		aircon.temperatureDown();
		System.out.println(aircon.temperature);
		aircon.airVolume();
		aircon.airVolume();
		aircon.airVolume();
		aircon.airVolume();
		System.out.println(aircon.airVolume);
	
		
	}
	boolean power; //전원
	int temperature; //온도
	int airVolume; //풍량
	
	AirConditioner(){
		power = false;
		temperature = 24;
		airVolume = 1;
	}
	
	//전원 버튼
	void power(){
		power = !power;
	}
	
	//온도 + 버튼
	void temperatureUp(){
		if(power && temperature >= 30){
				temperature = 30;
			}else{
				temperature++;
			}
		}
	
		
	//온도 - 버튼
	void temperatureDown(){
		if(power && temperature <= 18){
				temperature = 18;
			}else{
				temperature--;
			}	
		}
	
	
	//풍량버튼
	void airVolume(){
		if(power){
			if(3< ++airVolume){
				airVolume = 1;
			}
		}
	}
	
	//온도가 18 ~ 30도 까지만 변경할 수 있게 하고 전원을 켰을때만 버튼들이 작동되도록 메서드들을 변경해주세요.
}
