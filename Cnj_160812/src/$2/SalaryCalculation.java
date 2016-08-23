package $2;

class Employee {
	String name; // �̸�
	int id; // ���
	int basicPay; // ����
	int com; // �Ϲݼ���
	int totalPay; // �ѱ޿�

	public Employee(int id, String name, int basicPay, int com) {
		this.id = id; // ����ʱ�ȭ
		this.name = name; // �̸��ʱ�ȭ
		this.basicPay = basicPay; // �����ʱ�ȭ
		this.com = com; // �Ϲݼ����ʱ�ȭ
	}

	void calcPay() {
		totalPay = basicPay + com;
		System.out.println("���" + id + "�� " + name + "�� " + totalPay + "�� �ѱ޿��� �޽��ϴ�.");
		
	}

}

class Manager extends Employee {
	int managerCom;			//���μ���
	public Manager(int id, String name, int basicPay, int com, int managerCom) {
		super(id, name, basicPay, com);
		this.managerCom = managerCom;
		
		
	}
	@Override
	void calcPay() {
		totalPay = basicPay + com + managerCom;
		System.out.println("���" + id + "�� " + name + "�� " + totalPay + "�� �ѱ޿��� �޽��ϴ�.");
	}

	
}

public class SalaryCalculation {
	public static void main(String[] args) {
		Employee e [] = new Employee[4];
		e[0] = new Employee ( 1000, "�̻��", 10000, 5000);
		e[1] = new Manager ( 2000, "�谣��", 10000, 10000, 10000);
		e[2] = new Employee (3000, "�ڱ��", 10000, 7000);
		e[3] = new Manager(4000, "���ӿ�", 10000, 11000, 11000);
		
		for (int i = 0; i < e.length; i++) {

			e[i].calcPay();
			
		}
	}

}
