package com.client;

import java.util.List;

import com.controller.Controller;
import com.entity.Candidate;


public class ECIClient {
	public static void main(String[] args) {
		System.out.println("We Are in Client");
		Controller controller = null;
		controller = new Controller();
		List<Candidate> allcandidates = controller.getAllcandidates();
		System.out.println(allcandidates);
		
//		List<Candidate> insertcandidates = controller.insertCandidates();
//		System.out.println(insertcandidates);
//		
//		controller.updateCandidates();
//		
//		controller.deleteCandidates();
		
//		List<Candidate> allNCPcandidates = controller.getAllNCPcandidates();
//		System.out.println( allNCPcandidates);
		
//		List<Candidate> allbjpcandidates = controller.getAllBJPcandidates();
//		System.out.println( allbjpcandidates);
		
//		List<Candidate> allindcandidates = controller.getAllIndcandidates();
//		System.out.println( allindcandidates);
		
//		List<Candidate> candidatesbypune = controller.getAllpunecandidates();
//		System.out.println( candidatesbypune);
	}

}
