package task01_5_OOP;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by koryak on 12.05.2016.
 */
public class Disc {
    private int min;
    private int sec;
    int o=0;
    int c=0;
    private List<Music> musics=new ArrayList<Music>();

    public int getMin() {
        return min;
    }

    public int getSec() {
        return sec;
    }

    public void addMusic(Music mc){
        musics.add(mc);
        min+=mc.getMin();
        sec+=mc.getSec();
        if (sec>59){
            o=sec/60;
            min=min+o;
            c=sec%60;
            sec=c;
        }

    }
}
