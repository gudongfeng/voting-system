package com.object;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;

@Entity
@Table(name = "CANDIDATE")
@PrimaryKeyJoinColumn(name = "USER_ID")
public class Candidate extends User {

	public Candidate(String userName, String lastName, String firstName,
			String districtName, String address) {
		super(userName, lastName, firstName, districtName, address);
		// TODO Auto-generated constructor stub
	}

	@Column(name = "POLLS_NUMBER")
	private int polls;

	public int getPolls() {
		return polls;
	}

	public void setPolls(int polls) {
		this.polls = polls;
	}

}