package Team_Result;

import java.util.Comparator;

class BasketballTeam implements ITeam, Comparator<BasketballTeam>
{
    public int updatepoints;
    private String teamName;
    private int points;

    public BasketballTeam()
    {
        String teamName="";
        int points=0;
    }

    public BasketballTeam(String teamName,int points)
    {
        this.teamName=teamName;
        this.points=points;
    }


    public void updatePoints(String status)
    {//updates the point from last game result
        if(status.equals("Win"))
        {
            this.points += 2;
            updatepoints=this.points;
        }
    }
    //compare Football team data to print in order sort asc
    public int compare(FootballTeam a, FootballTeam b)
    {

        return a.getPoints() - b.getPoints();
    }
    public String getTeamName() {
        return this.teamName;
    }

    public int getPoints() {
        return this.points;
    }

    @Override
    // compare and sort asc
    public int compare(BasketballTeam a, BasketballTeam b)
    {

        return a.getPoints() - b.getPoints();
    }
}
