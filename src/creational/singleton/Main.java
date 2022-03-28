package creational.singleton;

public class Main {

    public static void main(String[] args) {
        User user1 = new User("Huy");
        user1.vote(Candidate.JoeBiden);
        user1.vote(Candidate.DonaldTrump);//X

//        User user2 = new User("Tín");
//        user2.vote(Candidate.DonaldTrump);
//        user2.vote(Candidate.DonaldTrump);//X
    }
}
