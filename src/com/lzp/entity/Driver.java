package com.lzp.entity;


import javax.persistence.Column;
import javax.persistence.Entity;
import org.hibernate.annotations.Table;
import org.hibernate.sql.Template;

@Entity
@Table(appliesTo = "driver_info")
public class Driver {
	@Column(name="id")
	private String id;
	@Column(name="nameId")
	private String nameId;
	@Column(name="password")
	private String password;
	@Column(name="age")
	private String age;
	@Column(name="CardId")
	private String CardId;
	@Column(name="address")
	private String address;
	@Column(name="tel")
	private Integer tel;
	@Column(name="createTime")
	private Template createTime;
	@Column(name="CarInfo")
	private String carInfo;
	public Driver(){
		
	}
	public Driver(String id, String nameId, String password, String age,
			String cardId, String address, Integer tel, Template createTime,
			String carInfo) {
		super();
		this.id = id;
		this.nameId = nameId;
		this.password = password;
		this.age = age;
		CardId = cardId;
		this.address = address;
		this.tel = tel;
		this.createTime = createTime;
		this.carInfo = carInfo;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getNameId() {
		return nameId;
	}
	public void setNameId(String nameId) {
		this.nameId = nameId;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getAge() {
		return age;
	}
	public void setAge(String age) {
		this.age = age;
	}
	public String getCardId() {
		return CardId;
	}
	public void setCardId(String cardId) {
		CardId = cardId;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public Integer getTel() {
		return tel;
	}
	public void setTel(Integer tel) {
		this.tel = tel;
	}
	public Template getCreateTime() {
		return createTime;
	}
	public void setCreateTime(Template createTime) {
		this.createTime = createTime;
	}
	public String getCarInfo() {
		return carInfo;
	}
	public void setCarInfo(String carInfo) {
		this.carInfo = carInfo;
	}
	@Override
	public String toString() {
		return "Driver [id=" + id + ", nameId=" + nameId + ", password="
				+ password + ", age=" + age + ", CardId=" + CardId
				+ ", address=" + address + ", tel=" + tel + ", createTime="
				+ createTime + ", carInfo=" + carInfo + "]";
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((CardId == null) ? 0 : CardId.hashCode());
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
		Driver other = (Driver) obj;
		if (CardId == null) {
			if (other.CardId != null)
				return false;
		} else if (!CardId.equals(other.CardId))
			return false;
		return true;
	}
	
}
