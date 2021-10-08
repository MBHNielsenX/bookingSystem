import java.util.Date;
public class Main {
    public static void main(String[] args) {
        //Når der der bliver oprettet event bliver det tilføjet til et array
        //Hvert event har et eller flere bands som bliver tilføjet til et event array
        Act eminem = new Act("eminemContract.pdf",1500000,"Eminem 😎",new Date(2021,10,06,20,00));
        Act coldplay = new Act("coldplayContract.pdf", 100000,"Coldplay",new Date(2021,10,06,21,30));
        Act taylorSwift = new Act("taylorSwiftContract.pdf",600000,"Taylor Swift",new Date(2021,10,06,18,00));


        Act[] actList = {taylorSwift,eminem,coldplay};


        Venue køgeTorv = new Venue("Køge Torv", "Køge");
        Schedule køgeFestugeSched = new Schedule(køgeTorv, actList);
        Event køgeFestUge = new Event(køgeFestugeSched);






    }
}
