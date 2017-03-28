package com.lzp.entity;

import org.hibernate.sql.Template;

public class Person {
	private String id;
	private String nickName;
	private String password;
	private String realName;
	private String email;
	private Integer qq;
	private Integer telNumber;
	private Template signData;
	private String leve;
	public Person(){
		
	}
	
	public Person(String id, String nickName, String password, String realName,
			String email, Integer qq, Integer telNumber, Template signData,
			String leve) {
		super();
		this.id = id;
		this.nickName = nickName;
		this.password = password;
		this.realName = realName;
		this.email = email;
		this.qq = qq;
		this.telNumber = telNumber;
		this.signData = signData;
		this.leve = leve;
	}
	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getNickName() {
		return nickName;
	}
	public void setNickName(String nickName) {
		this.nickName = nickName;
	}
	public String getRealName() {
		return realName;
	}
	public void setRealName(String realName) {
		this.realName = realName;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public Integer getQq() {
		return qq;
	}
	public void setQq(Integer qq) {
		this.qq = qq;
	}
	public Integer getTelNumber() {
		return telNumber;
	}
	public void setTelNumber(Integer telNumber) {
		this.telNumber = telNumber;
	}
	public Template getSignData() {
		return signData;
	}
	public void setSignData(Template signData) {
		this.signData = signData;
	}
	public String getLeve() {
		return leve;
	}
	public void setLeve(String leve) {
		this.leve = leve;
	}
	@Override
	public String toString() {
		return "Person [id=" + id + ", nickName=" + nickName + ", password="
				+ password + ", realName=" + realName + ", email=" + email
				+ ", qq=" + qq + ", telNumber=" + telNumber + ", signData="
				+ signData + ", leve=" + leve + "]";
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Person other = (Person) obj;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		return true;
	}
	
	
}
