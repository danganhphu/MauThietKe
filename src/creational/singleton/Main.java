package creational.singleton;

public class Main {

    public static void main(String[] args) {

        User u1 = new User("Phu");
        u1.vote(Candidate.JoeBiden);

        User u2 = new User("nhi");
        u2.vote(Candidate.DonaldTrump);
        u1.vote(Candidate.JoeBiden);


        System.out.println("Joebiden: " +Election.createInstance().getJoeBiden());
        System.out.println("DonalTrump: " +Election.createInstance().getDonaldJump());
    }
}
