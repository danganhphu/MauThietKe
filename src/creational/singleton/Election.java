package creational.singleton;

public class Election {
    int donaldJump = 0;
    int joeBiden = 0;

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
}
