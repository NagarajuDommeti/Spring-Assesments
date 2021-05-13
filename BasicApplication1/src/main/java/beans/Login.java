package beans;

//backing bean
public class Login {

	// member variables
	String userName;
	String password;

	public Login() {
		super();
	}

	// setters and getters
	public String getUserName() {
		return userName;
	}

	public void setUsername(String username) {
		this.userName = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

}
