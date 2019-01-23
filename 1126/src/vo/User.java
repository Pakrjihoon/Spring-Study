package vo;

import java.sql.Date;
import java.sql.Timestamp;

public class User {
	private int no;
	private String id,password,nickname;
	private Timestamp regDate;
	private Date birthDate;
	
	public User() {
		
	}
	
	public User(String id, String password, String nickname) {
		super();
		this.id = id;
		this.password = password;
		this.nickname = nickname;
	}

	public int getNo() {
		return no;
	}
	public void setNo(int no) {
		this.no = no;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getNickname() {
		return nickname;
	}
	public void setNickname(String nickname) {
		this.nickname = nickname;
	}
	public Timestamp getRegDate() {
		return regDate;
	}
	public void setRegDate(Timestamp regDate) {
		this.regDate = regDate;
	}
	public Date getBirthDate() {
		return birthDate;
	}
	public void setBirthDate(Date birthDate) {
		this.birthDate = birthDate;
	}
	
}
