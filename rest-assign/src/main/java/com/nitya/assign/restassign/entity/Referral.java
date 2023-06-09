package com.nitya.assign.restassign.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;

@Entity
public class Referral {
	
	@Id
	@GeneratedValue
	private Integer id;
	
	@Column(nullable = false)
	private String referredUserName;
	
	@Column(unique = true)
	private Integer referredUserId;
	
	@ManyToOne
	private User referredByUserId;
	
	protected Referral(){}

	public Referral(String referredUserName, Integer referredUserId) {
		super();
		this.referredUserName = referredUserName;
		this.referredUserId = referredUserId;
	}
	public String getReferredUserName() {
		return referredUserName;
	}

	public void setReferredUserName(String referredUserName) {
		this.referredUserName = referredUserName;
	}

	public Integer getReferredUserId() {
		return referredUserId;
	}

	public void setReferredUserId(Integer referredUserId) {
		this.referredUserId = referredUserId;
	}

	public User getUser() {
		return referredByUserId;
	}

	public void setUser(User referredByUserId) {
		this.referredByUserId = referredByUserId;
	}

	public User getReferredByUserId() {
		return referredByUserId;
	}

	public void setReferredByUserId(User referredByUserId) {
		this.referredByUserId = referredByUserId;
	}

	@Override
	public String toString() {
		return "Referral [id=" + id + ", referredUserName=" + referredUserName + ", referredUserId=" + referredUserId
				+ ", referredByUserId=" + referredByUserId + "]";
	}
	
}
