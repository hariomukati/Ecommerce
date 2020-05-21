package in.co.ecommerce.form;

import in.co.ecommerce.entity.BaseEntity;
import in.co.ecommerce.entity.UserEntity;

public class LoginForm extends BaseForm {

	
	private String login;
	private String password;


	public String getLogin() {
		return login;
	}

	public void setLogin(String login) {
		this.login = login;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	@Override
	public BaseEntity getBean() {
		UserEntity bean=new UserEntity();
		bean.setLoginId(login);
		bean.setPassword(password);
		return bean;
	}

	@Override
	public void populate(BaseEntity baseBean) {
	}

}
