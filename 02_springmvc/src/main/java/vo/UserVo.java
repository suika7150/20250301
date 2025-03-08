package vo;

import java.util.Arrays;

public class UserVo {
<<<<<<< HEAD
	
=======

>>>>>>> 557507d453c157cbc19f54c8dc38aab2f7b64b8c
	private String username;
	
	private String password;

	private String nickname;
	
	private String phone;
	
	private String[] hobby;

	public String getNickname() {
		return nickname;
	}

	public void setNickname(String nickname) {
		this.nickname = nickname;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String[] getHobby() {
		return hobby;
	}

	public void setHobby(String[] hobby) {
		this.hobby = hobby;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	@Override
	public String toString() {
		return "UserVo [nickname=" + nickname + ", phone=" + phone + ", hobby=" + Arrays.toString(hobby) + "]";
	}
}
