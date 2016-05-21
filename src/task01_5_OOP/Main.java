package task01_5_OOP;

/**
 * Created by koryak on 12.05.2016.
 */
public class Main {
    public static void main(String args[]){
        Music music[]=new Music[7];
        music[0]=new Jazz("Приветствую Долли","Армстрон Л.","03:14",03,14);
        music[1]=new Jazz("Отпусти мой народ","Армстрон Л.","03:35",03,35);
        music[2]=new Rock("Moscow Calling","Gorky Park","04:12",04,12);
        music[3]=new Rock("It's My Life","Bon Jovi","03:42",03,42);
        music[4]=new Rock("Wind Of Change","Scorpions","05:07",05,07);
        music[5]=new Pop("Сумасшедшая","Алексей Воробьев","03:16",03,16);
        music[6]=new Pop("Я Счастливый","Григорий Лепс","03:12",03,12);
        Disc disc=new Disc();
        int m1=4;
        int m2=59;
        int n=0;

        System.out.println("Диск \"Сборник\" состоит из следующих композиций:");
        System.out.println("--------------------------------------------------");
        for (int i=0;i<music.length;i++){
            System.out.println((i+1)+". \""+music[i].getTrackName()+"\", "+music[i].getPerformer()+", "+music[i].getTime());
            disc.addMusic(music[i]);}
        System.out.println("--------------------------------------------------");
        System.out.println("Длительность диска: "+disc.getMin()+":"+disc.getSec());
        System.out.println("--------------------------------------------------");
        System.out.println("Композиция, длительность которой более "+m1+" и менее 5 минут:");

        for (int i=0;i<music.length;i++){
            music[i].timeTrack(m1,m2);
        }
        System.out.println("-------------------------------------------------");
        System.out.println("Композиции в  порядке Рok, Джаз, Поп:");
        System.out.println("-------------------------------------------------");
        for (int i=0;i<music.length;i++){
            if (music[i].getStyleName().equals("Рок")){
                System.out.println((n+1)+". \""+music[i].getTrackName()+"\", "+music[i].getPerformer()+", "+music[i].getTime());
                n++;
            }}
            for (int i=0;i<music.length;i++){
            if (music[i].getStyleName().equals("Джаз")){
                System.out.println((n+1)+". \""+music[i].getTrackName()+"\", "+music[i].getPerformer()+", "+music[i].getTime());
                n++;
            }}
        for (int i=0;i<music.length;i++){
            if (music[i].getStyleName().equals("Поп")){
                System.out.println((n+1)+". \""+music[i].getTrackName()+"\", "+music[i].getPerformer()+", "+music[i].getTime());
                n++;
            }
            }


    }
}
