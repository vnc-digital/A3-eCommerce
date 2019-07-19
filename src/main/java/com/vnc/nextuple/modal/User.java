package com.vnc.nextuple.modal;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

@Entity
@Table(name = "user")
public class User {

	@Id
	@Column(name = "user_id")
	private String userId;

	@Column(name = "user_name", unique = true)
	private String userName;

	@Column(name = "name")
	@NotNull
	private String name;

	@Column(name = "mobile_no", unique = true)
	private String mobileNo;

	@Column(name = "email", unique = true)
	private String email;

	@Column(name = "address")
	private String adress;

	

	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getMobileNo() {
		return mobileNo;
	}

	public void setMobileNo(String mobileNo) {
		this.mobileNo = mobileNo;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getAdress() {
		return adress;
	}

	public void setAdress(String adress) {
		this.adress = adress;
	}

	// public List<WalletTransaction> getWalletTransaction() {
	// return walletTransaction;
	// }
	//
	//
	// public void setWalletTransaction(List<WalletTransaction> walletTransaction) {
	// this.walletTransaction = walletTransaction;
	// }

}
