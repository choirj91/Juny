package Exception_User;

public class UserExceptionMain {

		public void method(String[] s) throws UserException {
			System.out.println("userException test");
			
			if (s.length < 1) {
				throw new UserException("�ƹ��͵� �ȵ�����");
			}else {
				throw new UserException("��������", 703);
			}
			
			
		}
		public static void main(String[] args){
			UserExceptionMain user = new UserExceptionMain();
			try {
				user.method(args);
			} catch (Exception e) {
				e.printStackTrace();
				// TODO: handle exception
			}
		}
}
