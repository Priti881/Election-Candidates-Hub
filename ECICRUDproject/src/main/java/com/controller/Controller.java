package com.controller;

import java.util.List;

import com.entity.Candidate;
import com.service.Service;

public class Controller {
	Service service = null;

	public List<Candidate> getAllcandidates(){
			System.out.println("We Are in Controller Layer");
			service = new Service();
			List<Candidate> allcandidates = service.getAllcandidates();
			return allcandidates;
			
		}
	
	public List<Candidate> insertCandidates(){
		service = new Service();
		List<Candidate> insertcandidate =service.insertCandidates();
		return insertcandidate;
	}
	
	public void updateCandidates() {
		service = new Service();
		service.updateCandidates();
	}
	
	public void deleteCandidates() {
		service = new Service();
		service.deleteCandidates();
	}

	public List<Candidate> getAllNCPcandidates() {
		service = new Service();
		List<Candidate> allNCPcandidates = service.getAllNCPcandidates();
		return allNCPcandidates;
	}
	
	public List<Candidate> getAllBJPcandidates() {
		service = new Service();
		List<Candidate> allbjpcandidates = service.getAllBJPcandidates();
		return allbjpcandidates;
	}
	
	public List<Candidate> getAllIndcandidates() {
		service = new Service();
		List<Candidate> allindcandidates = service.getAllIndcandidates();
		return allindcandidates;
	}

	
	public List<Candidate> getAllpunecandidates() {
		service = new Service();
		List<Candidate> candidatesbypune = service.getAllpunecandidates();
		return  candidatesbypune;
	}

}
