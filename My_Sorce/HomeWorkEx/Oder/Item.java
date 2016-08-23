package Oder;

public class Item extends Stock {
	protected int itemCod;
	protected String itemName;
	protected int price;
	
	Item(){
		
	}
	
	Item(String name, int num, double dis) throws Exception{
		Order_UI ui = new Order_UI();
		boolean q = false; int price = 0;
		do{
		System.out.println("상품명을 입력해 주세요.(자바, DB, JSP, CSS)"); String x = ui.scan(null);
		this.itemName = x;
		switch (x) {
		case "자바": this.itemCod = 1899; price = 10000;     break;
		case "DB": this.itemCod = 1739;  price = 8000;    break;
		case "JSP": this.itemCod = 1219;  price = 12000;    break;
		case "CSS": this.itemCod = 1790;  price = 15000;    break;

		default:System.out.println("잘못입력하셨습니다."); q = true;  break;
		}
		}while(q);
		
		this.price =(price*num) - (int) (price*num*dis);
		
		Storage st = new Storage(name, itemCod,itemName,num);
		
	}
}
