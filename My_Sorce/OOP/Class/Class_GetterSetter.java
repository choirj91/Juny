package Class;

public class Class_GetterSetter {	//���Ἲ�� ������ ���� ���� �Ű����� �����ؼ� ��ȿ�� ���� �����ͷ� �����ϵ��� �ϴ� Setter�޼ҵ�.
	int speed;						//�޼ҵ�� �ʵ尪�� ������ �� �ܺη� �����ϴ� Getter�޼ҵ�.
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
	public boolean isStop(){	//get�޼ҵ� Ÿ���� ���� booleanŸ���� ��� �޼ҵ� �̸��� is�� ���̴� ���� ����
		return stop;
	}
	
	public void setStop(boolean stop){	//
		this.stop = stop;
	}

}
