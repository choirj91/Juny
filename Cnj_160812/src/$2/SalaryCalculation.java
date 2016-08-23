package $2;

class Employee {
	String name; // 이름
	int id; // 사번
	int basicPay; // 본봉
	int com; // 일반수당
	int totalPay; // 총급여

	public Employee(int id, String name, int basicPay, int com) {
		this.id = id; // 사번초기화
		this.name = name; // 이름초기화
		this.basicPay = basicPay; // 본봉초기화
		this.com = com; // 일반수당초기화
	}

	void calcPay() {
		totalPay = basicPay + com;
		System.out.println("사번" + id + "인 " + name + "은 " + totalPay + "의 총급여를 받습니다.");
		
	}

}

class Manager extends Employee {
	int managerCom;			//간부수당
	public Manager(int id, String name, int basicPay, int com, int managerCom) {
		super(id, name, basicPay, com);
		this.managerCom = managerCom;
		
		
	}
	@Override
	void calcPay() {
		totalPay = basicPay + com + managerCom;
		System.out.println("사번" + id + "인 " + name + "은 " + totalPay + "의 총급여를 받습니다.");
	}

	
}

public class SalaryCalculation {
	public static void main(String[] args) {
		Employee e [] = new Employee[4];
		e[0] = new Employee ( 1000, "이사원", 10000, 5000);
		e[1] = new Manager ( 2000, "김간부", 10000, 10000, 10000);
		e[2] = new Employee (3000, "박기술", 10000, 7000);
		e[3] = new Manager(4000, "최임원", 10000, 11000, 11000);
		
		for (int i = 0; i < e.length; i++) {

			e[i].calcPay();
			
		}
	}

}
