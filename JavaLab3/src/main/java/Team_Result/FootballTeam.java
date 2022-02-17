package Team_Result;

import java.util.Comparator;

class FootballTeam implements ITeam, Comparator<FootballTeam>
{

    private String teamName;
    private int points;
    private String sponsor;
    public int updatepoints;
    public FootballTeam()
    {
        String teamName="";
        int points=0;
        String sponsor="";
    }

    public FootballTeam(String teamName,int points,String sponsor)
    {
        this.teamName=teamName;
        this.points=points;
        this.sponsor=sponsor;
    }
    //update points from last game result
    public void updatePoints(String status)
    {
        if(status.equals("Win"))
        {
            this.points += 3;
            updatepoints=this.points;
        }
        if(status.equals("Drawn"))
        {
            this.points += 1;
            updatepoints=this.points;
        }
    }

    public String getTeamName()
    {
        return this.teamName;
    }

    public int getPoints()
    {
        return this.points;
    }
    public String getSponsor()
    {
        return this.sponsor;
    }
//get sorted data of football team by compare method
    @Override
    public int compare(FootballTeam a, FootballTeam b)
    {
        return a.getPoints() - b.getPoints();
    }
}

