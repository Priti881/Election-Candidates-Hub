package com.service;

import java.util.ArrayList;
import java.util.List;

import com.dao.Dao;
import com.entity.Candidate;

public class Service {
	Dao dao = null;

	public List<Candidate> getAllcandidates(){
			System.out.println("We Are in Service Layer");
			dao = new Dao();
			List<Candidate> allcandidates = dao.getAllcandidates();
			return allcandidates ;
			
		}
	
	public List<Candidate> insertCandidates(){
		dao = new Dao();
		List<Candidate> insertcandidate = dao.insertCandidates();
		return insertcandidate;
	}
	
	public void updateCandidates() {
		dao = new Dao();
		dao.updateCandidates();
	}
	
	public void deleteCandidates() {
		dao = new Dao();
		dao.deleteCandidates();
	}
	
	public List<Candidate> getAllNCPcandidates(){
		dao = new Dao();
		List<Candidate> allcandidates = dao.getAllcandidates();
		List<Candidate> allncpcandidate = new ArrayList<Candidate>();
		
		for(Candidate c  : allcandidates) {
			if(c.getPartyname().equals("NCP")) {
				allncpcandidate.add(c);
			}
		}
		return allncpcandidate;
	}
	
	public List<Candidate> getAllBJPcandidates(){
		dao = new Dao();
		List<Candidate> allcandidates = dao.getAllcandidates();
		List<Candidate> allbjpcandidate = new ArrayList<Candidate>();
		
		for(Candidate c  : allcandidates) {
			if(c.getPartyname().equals("BJP")) {
				allbjpcandidate.add(c);
			}
		}
		return allbjpcandidate;
	}
	
	public List<Candidate> getAllIndcandidates(){
		dao = new Dao();
		List<Candidate> allcandidates = dao.getAllcandidates();
		List<Candidate> allindcandidate = new ArrayList<Candidate>();
		
		for(Candidate c  : allcandidates) {
			if(c.getPartyname().equals("Independent")) {
				allindcandidate.add(c);
			}
		}
		return allindcandidate;
	}
	
	public List<Candidate> getAllpunecandidates(){
		dao = new Dao();
		List<Candidate> allcandidates = dao.getAllcandidates();
		List<Candidate> candidatebypune = new ArrayList<Candidate>();
		
		for(Candidate c  : allcandidates) {
			if(c.getAssembly().equals("Pune")) {
				candidatebypune.add(c);
			}
		}
		return candidatebypune;
	}

}
