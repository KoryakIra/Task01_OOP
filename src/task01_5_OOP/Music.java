package task01_5_OOP;


/**
 * Created by koryak on 12.05.2016.
 */
public class Music {
    private final String styleName;
    private final String trackName;
    private final String performer;
    private final String time;
    private final int min;
    private final int sec;




    public Music(String styleName, String trackName, String performer, String time, int min, int sec) {
        this.styleName = styleName;
        this.trackName = trackName;
        this.performer = performer;
        this.time = time;
        this.min = min;
        this.sec = sec;
    }

    public String getStyleName() {
        return styleName;
    }

    public String getTrackName() {
        return trackName;
    }

    public String getPerformer() {
        return performer;
    }

    public String getTime() {
        return time;
    }

    public int getMin() {
        return min;
    }

    public int getSec() {
        return sec;
    }
    public void timeTrack(int m1,int m2){
        if(this.getMin()==m1&&this.getSec()<m2){
            System.out.println(getTrackName()+" "+getTime());

        }
    }
}
