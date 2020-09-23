package id.co.bca.tomcash.api.login;

public class Login {
	private String inputDomain;
	private String inputPassword;
	
	public String getInputDomain() {
		return inputDomain;
	}
	public void setInputDomain(String inputDomain) {
		this.inputDomain = inputDomain;
	}
	
	public String getInputPassword() {
		return inputPassword;
	}
	public void setInputPassword(String inputPassword) {
		this.inputPassword = inputPassword;
	}
	
	@Override
	public String toString() {
		return "Login [domain=" + inputDomain + ", password=" + inputPassword + "]";
	}
	
}
