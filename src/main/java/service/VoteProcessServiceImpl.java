package service;

import model.Restaurant;
import model.User;
import model.Vote;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import repository.UserCrudRepository;
import repository.VoteCrudRepository;

import java.util.Date;

@Service
public class VoteProcessServiceImpl implements VotingProcessService {

    @Autowired
    private VoteCrudRepository voteCrudRepository;

    @Autowired
    private UserCrudRepository userCrudRepository;

    public void createVote(Vote vote) {
        voteCrudRepository.save(vote);
    }

    public void removeVote(Vote vote) {
        voteCrudRepository.delete(vote);
    }

    public Vote getVoteOnDateForUser(Date date, User user) {
        return voteCrudRepository.findByDateAndUser(date, user)
                .stream()
                .findFirst()
                .orElse(null);
    }

    //todo do for current user when functional will be create
    public void setVoteForRestaurant(Restaurant restaurant) {
        Vote vote = new Vote();
        vote.setDate(new Date());
        vote.setRestaurant(restaurant);
        voteCrudRepository.save(vote);
    }
}
