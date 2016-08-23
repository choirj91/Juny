package Exception_User;

public class UserException extends Exception {
	private int port = 777;
	
	public UserException(String msg){
		super(msg);
	}
	
	public UserException(String msg, int port){
		super(msg);
		this.port = port;
	}

	public int getPort() {
		return port;
	}
}

