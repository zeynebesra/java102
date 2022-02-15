
import java.util.*;

public class Main {
    public static void main(String[] args) {

        // takımları ekle ve sırala

        ArrayList<Team> teamList = new ArrayList<>();
        teamList.add(new Team("Fenerbahçe",0, 0, 0, 0));
        teamList.add(new Team("Galatasaray",0, 0, 0, 0));
        teamList.add(new Team("Beşiktaş",0, 0, 0, 0));
        teamList.add(new Team("Bursaspor",0, 0, 0, 0));
        teamList.add(new Team("Trabzonspor",0, 0, 0, 0));
        teamList.add(new Team("Başakşehir",0, 0, 0, 0));

        System.out.println("-------------------------------------------");
        System.out.println(" TAKIMLAR ");
        System.out.println("-------------------------------------------");

        for (Team team : teamList) {
            System.out.println(team.getTeamName());
        }

        // Çift Takım
        System.out.println("-------------------------------------------");
        System.out.println("-------------------------------------------");
        System.out.println("Çift Takım Senaryo");
        System.out.println("-------------------------------------------");
        System.out.println("-------------------------------------------");
        Fixture fixture = new Fixture(teamList);

        fixture.fixtureTo();
        fixture.fixturePrint();

        // Tek takım

        System.out.println("-------------------------------------------");
        System.out.println("Tek Takım Senaryo");
        System.out.println("-------------------------------------------");
        System.out.println("-------------------------------------------");
        teamList.add(new Team("Altay",0, 0, 0, 0));
        teamList.add(new Team("Bay",0, 0, 0, 0));
        Fixture fixture2 = new Fixture(teamList);

        fixture2.fixtureTo();
        fixture2.fixturePrint();


        //


    }
}
