package creational.singleton;

import java.util.ArrayList;
import java.util.List;

public class Election {

    private int donaldJump = 0;

    public int getDonaldJump() {
        return donaldJump;
    }

    public int getJoeBiden() {
        return joeBiden;
    }

    private int joeBiden = 0;

    private static Election uniqeInstance;
    List<String> User = new ArrayList();
    private Election(){}

    public static Election createInstance(){
        if (uniqeInstance == null) {
            synchronized (Election.class) {
                if (uniqeInstance == null)
                    uniqeInstance = new Election();
            }
        }
        return uniqeInstance;
    }

    public void vote(Candidate c, User u) {
        if (User.contains(u.name))
            return;
        if (c == Candidate.DonaldTrump) {
            donaldJump++;
            User.add(u.name);
        }
        else if (c == Candidate.JoeBiden) {
            joeBiden++;
            User.add(u.name);
        }
    }
}
