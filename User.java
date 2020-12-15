package lib;

import java.io.Serializable;

public class User implements Serializable{
	
	private String nickName;
	// private String password;

	public User(String nickName) {
		super();
		this.nickName = nickName;
	}

	public String getNickName() {
		return nickName;
	}

	public void setNickName(String nickName) {
		this.nickName = nickName;
	}

	@Override
	public String toString() {
		return "User [nickName=" + nickName + "]";
	}
	
	

}
