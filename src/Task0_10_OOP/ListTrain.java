package Task0_10_OOP;

/**
 * Created by koryak on 28.04.2016.
 */
public class ListTrain {
    public static void main(String args[]){
        Train train[]=new Train[6];
        train[0]=new Train("Киев","063",22.35f,0,0,125,60);
        train[1]=new Train("Одесса","059",17.47f,0,198,100,18);
        train[2]=new Train("Одесса","269",16.13f,0,120,98,36);
        train[3]=new Train("Одесса","271",20.55f,52,184,68,18);
        train[4]=new Train("Киев","725",07.23f,28,125,100,24);
        train[5]=new Train("Киев","729",18.04f,0,200,60,12);
        String s1 = "Одесса";
        String s2 = "Киев";
        float t1=17.44f;

        /* System.out.println("Список поездов:");
        System.out.println();
        for (int i=0;i<train.length;i++){
            System.out.println(train[i].toString());
        }*/
        System.out.println("---------------------------------------------------------");
        System.out.println("Cписок поездов, следующих до пункта назначения \""+s1+"\":");
        System.out.println("---------------------------------------------------------");
        for (int i=0;i<train.length;i++){
            train[i].toCity(s1);
        }
        System.out.println("---------------------------------------------------------");
        System.out.println("Cписок поездов, следующих до пункта назначения \""+s2+"\",\nотправляющихся после "+t1+" :");
        System.out.println("---------------------------------------------------------");
        for (int i=0;i<train.length;i++){
            train[i].toCityTime(s2,t1);
        }
        System.out.println("---------------------------------------------------------");
        System.out.println("Cписок поездов, следующих до пункта назначения \""+s1+"\",\nимеющие общие места :");
        System.out.println("---------------------------------------------------------");
        for (int i=0;i<train.length;i++){
            train[i].toCityCommon(s1);
        }
    }
}
