package Team_Result;


//import org.junit.Before;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class FootballTeamTest
{
   FootballTeam f;
@Before
public void setup()
{
    f=new FootballTeam("Chelsea",34,"Happy Foot");
    System.out.println("Running Test cases For FootBall Class");
}
    @Test
    public void updatePoints()
    {
        f.updatePoints("Win");
    assertEquals(37,f.updatepoints);
        System.out.println("updatePoints runs successfully");

    }

    @Test
    public void getTeamName()
    {
        assertEquals("Chelsea",f.getTeamName());
        System.out.println("getTeamName runs successfully");
    }

    @Test
    public void getPoints()
    {
        f.updatePoints("Win");
        assertEquals(37,f.getPoints());
        System.out.println("getPoints runs successfully");

    }
}