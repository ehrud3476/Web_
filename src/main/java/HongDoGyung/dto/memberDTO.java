package HongDoGyung.dto;

import java.sql.Date;

public class memberDTO {
	private String id;
	private String name;
	private String pwd;
	private String email;
	private Date joindate;
	
	public memberDTO() {
	}
	
	public memberDTO(String id, String name,String pwd, String email, Date joindate) {
		super();
		
		this.id = id;
		this.name = name;
		this.pwd = pwd;
		this.email = email;
		this.joindate = joindate;
	}
	
	

	public String getPwd() {
		return pwd;
	}

	public void setPwd(String pwd) {
		this.pwd = pwd;
	}

	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public Date getJoindate() {
		return joindate;
	}
	public void setJoindate(Date joindate) {
		this.joindate = joindate;
	}
	
}
