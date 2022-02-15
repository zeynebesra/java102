public class Team {
    private String teamName;
    private int teamPuan;
    private int teamWin;
    private int teamDefeat;
    private int teamDraw;
    private String[] rounds;


    public Team(String teamName, int teamPuan, int teamWin, int teamDefeat, int teamDraw) {
        this.teamName = teamName;
        this.teamPuan = teamPuan;
        this.teamWin = teamWin;
        this.teamDefeat = teamDefeat;
        this.teamDraw = teamDraw;
    }

    public String getTeamName() {
        return this.teamName;
    }

    public void setTeamName(String teamName) {
        this.teamName = teamName;
    }

    public int getTeamPuan() {
        return this.teamPuan;
    }

    public void setTeamPuan(int teamPuan) {
        this.teamPuan = teamPuan;
    }

    public int getTeamWin() {
        return this.teamWin;
    }

    public void setTeamWin(int teamWin) {
        this.teamWin = teamWin;
    }

    public int getTeamDefeat() {
        return this.teamDefeat;
    }

    public void setTeamDefeat(int teamDefeat) {
        this.teamDefeat = teamDefeat;
    }

    public int getTeamDraw() {
        return this.teamDraw;
    }

    public void setTeamDraw(int teamDraw) {
        this.teamDraw = teamDraw;
    }

    public String[] getRounds() {
        return this.rounds;
    }

    public void setRounds(String[] rounds) {
        this.rounds = rounds;
    }


}