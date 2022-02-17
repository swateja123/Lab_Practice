//import Team_Result.BasketballTeam;
package Team_Result;

import org.junit.Before;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class BasketballTeamTest
{
 public BasketballTeam b;
@Before
public void setup()
{
    b=new BasketballTeam("Chelsea",33);
    System.out.println("Running test Cases for BasketBall Class");
}
    @org.junit.Test
    public void updatePoints()
    {
        b.updatePoints("Win");
        assertEquals(35,b.updatepoints);
        System.out.println("updatePoints Successfully run");
    }
    @org.junit.Test
    public void getTeamName()
    {
        assertEquals("Chelsea",b.getTeamName());
        System.out.println("getTeamName Successfully run");
    }

    @org.junit.Test
    public void getPoints()
    {
        b.updatePoints("Win");
        assertEquals(35,b.getPoints());
        System.out.println("getPoints Successfully run");
    }
}