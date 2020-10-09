package id.co.bca.tomcash.api.login;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LoginController 
{
	@PostMapping("/api/login")
	public LoginStatus loginService(@RequestBody Login login)
	{
		System.out.println("Logging in... " + login.toString());
		
		String envVar = System.getenv().getOrDefault("TEST_ENV", "DEFAULT_VALUE");
		System.out.println("TEST_ENV : " + envVar);
		
		LoginStatus loginStatus = new LoginStatus();
		if ("Giorno".equals(login.getInputDomain()) && "abc123".equals(login.getInputPassword())) {
			loginStatus.setStatus("Success");
		}
		else {
			loginStatus.setStatus("Failed");
		}
		return loginStatus;
	}
}
