package com.model;

public class Candidate {
    private String name;
    private int voteCount;
    
    // Constructors, getters, and setters
	public Candidate() {
		super();
	}

	public Candidate(String name, int voteCount) {
		super();
		this.name = name;
		this.voteCount = voteCount;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getVoteCount() {
		return voteCount;
	}

	public void setVoteCount(int voteCount) {
		this.voteCount = voteCount;
	}

    
    
}
