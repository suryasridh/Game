package applicationGame.dto;


import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Lob;

import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import lombok.Data;

@Data
@Entity

public class player1 {
	
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
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public long getPhnumber() {
		return phnumber;
	}
	public void setPhnumber(long phnumber) {
		this.phnumber = phnumber;
	}
	public double getDepositeAmount() {
		return depositeAmount;
	}
	public void setDepositeAmount(double depositeAmount) {
		this.depositeAmount = depositeAmount;
	}
	public double getTotalearnedAmount() {
		return totalearnedAmount;
	}
	public void setTotalearnedAmount(double totalearnedAmount) {
		this.totalearnedAmount = totalearnedAmount;
	}
	public double getProfit() {
		return profit;
	}
	public void setProfit(double profit) {
		this.profit = profit;
	}
	public byte[] getImage() {
		return image;
	}
	public void setImage(byte[] image) {
		this.image = image;
	}
	public Date getPlayerTime() {
		return playerTime;
	}
	public void setPlayerTime(Date playerTime) {
		this.playerTime = playerTime;
	}
	public Date getUpdateTime() {
		return updateTime;
	}
	public void setUpdateTime(Date updateTime) {
		this.updateTime = updateTime;
	}
	private String name;
	@Id
	private String email;
	@Column(unique = true,length = 3)
	private int age;
	@Column(unique = true, nullable = false)
	private String password;
	@Column(unique = true,length = 10)
	private long phnumber;
	private double depositeAmount;
	private double totalearnedAmount;
	private double profit;
	@Lob
	private byte[] image;
	@CreationTimestamp
	private Date playerTime;
	@UpdateTimestamp
	private Date updateTime;
	

}
