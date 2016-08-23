package Class;

public class Class_GetterSetter {	//무결성의 깨짐을 막기 위해 매개값을 검증해서 유효한 값만 데이터로 저장하도록 하는 Setter메소드.
	int speed;						//메소드로 필드값을 가공한 후 외부로 전달하는 Getter메소드.
	int op;
	boolean stop;						
	
	public int getSpeed() {
		int km = (int)(speed*1.6);
		return km;
	}
	public void setSpeed(int speed) {
		if(speed < 0){
			this.speed = 0;
			return;
		}
	}
	public boolean isStop(){	//get메소드 타입이 만약 boolean타입일 경우 메소드 이름은 is를 붙이는 것이 관례
		return stop;
	}
	
	public void setStop(boolean stop){	//
		this.stop = stop;
	}

}
