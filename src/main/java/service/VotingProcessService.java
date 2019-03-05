package service;

import model.Restaurant;
import model.User;
import model.Vote;

import java.util.Date;
import java.util.List;

public interface VotingProcessService {

    void createVote(Vote vote);

    void removeVote(Vote vote);

    Vote getVoteOnDateForUser(Date date, User user);

    void setVoteForRestaurant(Restaurant restaurant);
}
