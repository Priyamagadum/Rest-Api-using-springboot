package com.controller;
import java.util.Map;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import com.service.CandidateService;

@RestController
public class CandidateController {

    @Autowired
    private CandidateService candidateService;

 // Endpoint for entering a new candidate
    @GetMapping("/entercandidate")
    public void enterCandidate(@RequestParam String name) {
        candidateService.enterCandidate(name);
    }
    
    // Endpoint for casting a vote for a candidate
    @GetMapping("/castvote")
    public int castVote(@RequestParam String name) {
        return candidateService.castVote(name);
    }
    
    // Endpoint for counting votes for a specific candidate
    @GetMapping("/countvote")
    public int countVote(@RequestParam String name) {
        return candidateService.countVote(name);
    }

    // Endpoint for listing all votes for each candidate
    @GetMapping("/listvote")
    public Map<String, Integer> listVote() {
        return candidateService.listVote();
    }

    // Endpoint for retrieving the winner of the election
    @GetMapping("/getwinner")
    public String getWinner() {
        return candidateService.getWinner();
    }
}
