package Team_Result;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
//Implementation and main method
public class GameResult {
    //Read the CSV file
    public static BufferedReader readFile(String fileName)
    {
        ClassLoader classloader = GameResult.class.getClassLoader();
        InputStream in = classloader.getResourceAsStream(fileName);
        BufferedReader br = new BufferedReader(new InputStreamReader(in));
        return br;
    }
    public static void SortedList(ArrayList<FootballTeam> t1, ArrayList<BasketballTeam> t2)
    {
        //collection sort method sorts the data
        Collections.sort(t1, new FootballTeam());
        Collections.sort(t2, new BasketballTeam());
        System.out.println("|------------------------------Football Team-------------------------------| ");
        System.out.println("Team Name | Points | Sponsor");
        for (int i = 0; i < t1.size(); i++)
        {
            System.out.println(t1.get(i).getTeamName()+"  |  "+t1.get(i).getPoints()+"  |  "+t1.get(i).getSponsor());
        }
        System.out.println("|-----------------------------Basketball Team----------------------=-------|");

        System.out.println("Team Name | Points ");
        for (int i = 0; i < t2.size(); i++)
        {
            System.out.println(t2.get(i).getTeamName()+"  |  "+t2.get(i).getPoints());
        }
    }
    public void createTeams()
    {

        //Read file
        BufferedReader teamData = null;
        try {
            teamData = readFile("teams.csv");
        } catch (Exception e1) {
            e1.printStackTrace();
        }
        //Create Arraylist of class type
        ArrayList<FootballTeam> footballList =new ArrayList<FootballTeam>();
        ArrayList<BasketballTeam> basketballList =new ArrayList<BasketballTeam>();
        //Create instance
        FootballTeam football;
        BasketballTeam basketball;
        String line;
        try {
            while ((line = teamData.readLine()) != null)
            {
                String details[]=line.split(",");
                if(details[0].equals("Basketball"))
                {
                    basketball=new BasketballTeam(details[1],Integer.parseInt(details[2]));
                    basketballList.add(basketball);
                }
                if(details[0].equals("Football"))
                {
                    football=new FootballTeam(details[1],Integer.parseInt(details[2]),details[3]);
                    footballList.add(football);
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        SortedList(footballList,basketballList);
        getResult(footballList,basketballList);
    }

    public void getResult(ArrayList<FootballTeam> t1, ArrayList<BasketballTeam> t2)
    {
        String line;
        BufferedReader resultData = null;
        try {
            resultData = readFile("results.csv");
        } catch (Exception e1) {
            e1.printStackTrace();
        }


        ArrayList<String[]> resulList =new ArrayList<>();

        try {
            while ((line = resultData.readLine()) != null)
            {
                String details[]=line.split(",");
                resulList.add(details);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        for(int i=0;i<resulList.size();i++)
        {
            int j=0;
            for(int m=0;m<t1.size();m++)
            {
                if(t1.get(m).getTeamName().equals(resulList.get(i)[0]))
                {
                    t1.get(m).updatePoints(resulList.get(i)[1]);
                    j++;
                }
            }
            if(j==0)
            {
                for(int m=0;m<t2.size();m++)
                {
                    if(t2.get(m).getTeamName().equals(resulList.get(i)[0]))
                    {
                        t2.get(m).updatePoints(resulList.get(i)[1]);
                    }
                }
            }

        }
        System.out.println("New Result after update point");
        SortedList(t1,t2);
    }
    public static void main(String[] args)
    {
        GameResult g=new GameResult();
        g.createTeams();


    }
}
