package HongDoGyung.dto;

import java.sql.Date;

public class postDTO {
	private String title;
	private String content;
	private Date joindate;
	
	public postDTO() {
		
	}
	public postDTO(String title, String content,Date joindate) {
		super();
		
		this.title = title;
		this.content =content;
		this.joindate = joindate;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	public Date getJoindate() {
		return joindate;
	}
	public void setJoindate(Date joindate) {
		this.joindate = joindate;
	}
	
}
