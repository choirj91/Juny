package $6;

public class Prob3 {
	public static void main(String[] args) {
		String url = "http://localhost:8080/order.do?prdId=PROD-0001&prdName=iPhone5&price=850000&maker=Apple";
		System.out.println("��ǰ ��ȣ : " + getParameter(url, "prdId"));
		System.out.println("��ǰ �̸� : " + getParameter(url, "prdName"));
		System.out.println("��ǰ ���� : " + getParameter(url, "price"));
		System.out.println("���� ȸ�� : " + getParameter(url, "maker"));
	}

	private static String getParameter(String url, String paramName) {
		String []str=url.split("\\?")[1].split("&");
		for (int i=0; i<str.length; i++)
		{
			if(str[i].split("=")[0].equals(paramName))
			{
				return str[i].split("=")[1];
			}
		}
	return null;
	}	
}
