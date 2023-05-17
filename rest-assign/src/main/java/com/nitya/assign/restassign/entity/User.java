package com.nitya.assign.restassign.entity;

import java.util.List;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

@Entity
@Table(name = "User_details")
public class User {

	@Id
	@GeneratedValue
	private Integer id;
	
	@Column(nullable = false)
	private String name;
	
	private String address;
	private Integer referralPoints;
	
	@OneToMany(mappedBy = "referredByUserId", fetch = FetchType.LAZY)
	private List<Referral> usersReferred;
	
	protected User() {
		
	}

	public User(String name, String address, Integer referralPoints) {
		super();
		this.name = name;
		this.address = address;
		this.referralPoints = referralPoints;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public Integer getReferralPoints() {
		return referralPoints;
	}

	public void setReferralPoints(Integer referralPoints) {
		this.referralPoints = referralPoints;
	}
	
	public void addReferralPoints() {
		this.referralPoints += 1000;
	}

	public List<Referral> getReferral() {
		return usersReferred;
	}

	public void addReferral(Referral usersReferred) {
		this.usersReferred.add(usersReferred);
	}
	
	public void deleteReferral(Referral referral) {
		this.usersReferred.remove(referral);
	}
	
	public Integer getId() {
		return id;
	}

	public List<Referral> getUsersReferred() {
		return usersReferred;
	}

	public void setUsersReferred(List<Referral> usersReferred) {
		this.usersReferred = usersReferred;
	}

	@Override
	public String toString() {
		return "User [id=" + id + ", name=" + name + ", address=" + address + ", referralPoints=" + referralPoints
				+ ", usersReferred=" + usersReferred + "]";
	}
	
}
