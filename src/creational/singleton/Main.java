package creational.singleton;

public class Main {

    public static void main(String[] args) {
        User user = new User();
        user.vote(Candidate.JoeBiden);
        User user2 = new User();
        user2.vote(Candidate.JoeBiden);
        User user3 = new User();
        user3.vote(Candidate.DonaldTrump);
        Election e = Election.createInstance();
        System.out.println(e.joeBiden);
        System.out.println(e.donaldJump);
    }
}
