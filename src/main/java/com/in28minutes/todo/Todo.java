package com.in28minutes.todo;

import java.util.Date;
import java.util.Objects;

public class Todo {
	private int id;
	private String user;
	private String desc;
	private Date targetDate;
	private Boolean isDone;
	
	public Todo(int id, String user, String desc, Date date, boolean isDone) {
		super();
		this.id = id;
		this.user = user;
		this.desc = desc;
		this.targetDate = date;
		this.isDone = isDone;
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getUser() {
		return user;
	}
	public void setUser(String user) {
		this.user = user;
	}
	public String getDesc() {
		return desc;
	}
	public void setDesc(String desc) {
		this.desc = desc;
	}
	public Date getTargetDate() {
		return targetDate;
	}
	public void setTargetDate(Date targetDate) {
		this.targetDate = targetDate;
	}
	public Boolean getIdDone() {
		return isDone;
	}
	public void setIdDone(Boolean idDone) {
		this.isDone = idDone;
	}
	@Override
	public String toString() {
		return String.format("ToString [id=%s, user=%s, desc=%s, targetDate=%s, idDone=%s]", id, user, desc, targetDate,
				isDone);
	}
	@Override
	public int hashCode() {
		return Objects.hash(id);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Todo other = (Todo) obj;
		return id == other.id;
	}
}
