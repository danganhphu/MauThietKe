package creational.singleton;

public class User {
    private String name;
    private boolean voted = false;

    public User(String name) {
        this.name = name;
    }

    public void vote(Candidate c){
        if (!voted){
            Election e = Election.createInstance();
            e.vote(c);
            voted =!voted;
            e.showResult();
        }
    }
}
