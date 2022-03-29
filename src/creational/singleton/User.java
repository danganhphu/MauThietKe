package creational.singleton;

public class User {
    String name;

    public User(String name) {
        this.name = name;
    }

    public void vote(Candidate c){
        Election election = Election.createInstance();
        election.vote(c, this);
    }
}
