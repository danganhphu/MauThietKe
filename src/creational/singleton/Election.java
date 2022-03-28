package creational.singleton;

public class Election {
    private int _trump = 0;
    private int _biden = 0;

    private static Election uniqeInstance;
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

    public void vote(Candidate c){
        if(c == Candidate.DonaldTrump)
            _trump++;
        if(c == Candidate.JoeBiden)
            _biden++;

    }

    public void showResult(){
        System.out.println("Donal Trump: " + _trump + "\nJoe Biden: " + _biden);
    }
}
