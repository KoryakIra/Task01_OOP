package task01_5_OOP;

/**
 * Created by koryak on 12.05.2016.
 */
public class Jazz extends Music {
    private static final String styleName="Джаз";
    public Jazz(String trackName,String performer,String time,int min,int sec) {
        super(styleName, trackName, performer, time, min, sec);
    }
}
