package com.service;
import com.model.Candidate;
import java.util.HashMap;
import java.util.Map;
import org.springframework.stereotype.Service;


@Service
public class CandidateService {
    // Map to store candidates and their respective vote counts
    private Map<String, Candidate> candidates = new HashMap<>();

    // Method to add a new candidate to the election
    public void enterCandidate(String name) {
        Candidate candidate = new Candidate(name, 0);
        candidates.put(name, candidate);
    }

    // Method to cast a vote for a specific candidate
    public int castVote(String name) {
        Candidate candidate = candidates.get(name);
        if (candidate != null) {
            candidate.setVoteCount(candidate.getVoteCount() + 1);
            return candidate.getVoteCount(); // Return the updated vote count
        }
        return -1; // Candidate not found
    }

    // Method to get the vote count for a specific candidate
    public int countVote(String name) {
        Candidate candidate = candidates.get(name);
        return (candidate != null) ? candidate.getVoteCount() : -1; // Return vote count or -1 if candidate not found
    }

    // Method to list all candidates and their vote counts
    public Map<String, Integer> listVote() {
        Map<String, Integer> result = new HashMap<>();
        // Populate the result map with candidate names and their respective vote counts
        candidates.forEach((name, candidate) -> result.put(name, candidate.getVoteCount()));
        return result;
    }

    // Method to determine the winner of the election
    public String getWinner() {
        String winner = null;
        int maxVotes = -1;

        // Iterate through candidates to find the one with the highest vote count
        for (Map.Entry<String, Candidate> entry : candidates.entrySet()) {
            if (entry.getValue().getVoteCount() > maxVotes) {
                maxVotes = entry.getValue().getVoteCount();
                winner = entry.getKey();
            }
        }

        return winner; // Return the name of the winning candidate
    }
}
