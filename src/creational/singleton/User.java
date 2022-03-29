package creational.singleton;

public class User {

    public User() {
    }

    public void vote(Candidate c){
        Election election = Election.createInstance();
        if(c == Candidate.DonaldTrump)
            election.donaldJump++;
        else election.joeBiden++;
    }
}
