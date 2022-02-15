import java.util.*;
public class Fixture {
    private List<Team> team;
    private int teamSize;
    private ArrayList<ArrayList<String>> rounds;

    public Fixture(List<Team> team) {
        this.team = team;
        this.teamSize = team.size();
    }

    public List<Team> getTeam() {
        return this.team;
    }

    public void setTeam(List<Team> team) {
        this.team = team;
    }


    public void fixtureTo()
    {
        int roundCount = this.teamSize-1;
        int matchCountPerRound=this.teamSize/2;
        ArrayList<ArrayList<String>> round = new ArrayList<>((roundCount*2));
        for(int i=0; i < roundCount*2; i++) {
            round.add(new ArrayList());
        }

        for (int i = 0; i < roundCount; i++)
        {
            for(int j=0;j<matchCountPerRound;j++)
            {
                int firstIndex=j;
                int secondIndex=(teamSize-1)-j;
                int k = i+this.teamSize-1;
                if (i % 2 == 0){
                    round.get(i).add(this.team.get(firstIndex).getTeamName() +"-"+ this.team.get(secondIndex).getTeamName());
                    round.get(k).add(this.team.get(secondIndex).getTeamName() +"-"+this.team.get(firstIndex).getTeamName());

                }else {
                    round.get(i).add(this.team.get(secondIndex).getTeamName() +"-"+this.team.get(firstIndex).getTeamName());
                    round.get(k).add(this.team.get(firstIndex).getTeamName() +"-"+ this.team.get(secondIndex).getTeamName());
                }
            }

            List<Team> newList=new ArrayList<>();
            newList.add(this.team.get(0));
            newList.add(this.team.get(this.team.size()-1));
            for(int k=1;k<this.team.size()-1;k++){
                newList.add(this.team.get(k));
            }
            this.team = newList;
        }

        this.rounds = round;
    }

    public void fixturePrint()
    {
        int roundCount = (this.teamSize-1)*2;
        for (int i = 0; i < roundCount; i++) {

            System.out.println("Round:" + (i+1));
            System.out.println("-------------------------------------------");
            for(int j=0; j < this.rounds.get(i).size(); j++)
            {
                System.out.println(this.rounds.get(i).get(j) );
            }
            //System.out.println(this.rounds.get(i).toString());
            System.out.println("-------------------------------------------");
        }
    }

}
