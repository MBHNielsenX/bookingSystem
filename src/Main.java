import java.util.*;
public class Main {
    public static void main(String[] args) {
        Act eminem = new Act("eminemContract.pdf",1500000,"Eminem 😎");
        Date eminemPlayTime = new Date(2021,10,06,20,00);
        Act coldplay = new Act("coldplayContract.pdf", 100000,"Coldplay");
        Date coldplayPlayTime = new Date(2021,10,06,21,30);
        Act taylorSwift = new Act("taylorSwiftContract.pdf",600000,"Taylor Swift");
        Date taylorSwiftPlayTime = new Date(2021,10,06,18,00);

        Act[] actList = {taylorSwift,eminem,coldplay};
        Date[] actPlaytime = {taylorSwiftPlayTime,eminemPlayTime,coldplayPlayTime};

        Venue køgeTorv = new Venue("Køge Torv", "Køge");
        Schedule køgeFestugeSched = new Schedule(actPlaytime,køgeTorv, actList);
        Event køgeFestUge = new Event(køgeFestugeSched);

        System.out.println(køgeFestUge);
    }
}
