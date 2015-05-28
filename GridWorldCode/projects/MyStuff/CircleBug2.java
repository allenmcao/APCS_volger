import info.gridworld.actor.Flower;
import info.gridworld.grid.Grid;
import info.gridworld.grid.Location;
import info.gridworld.actor.Bug;
import java.awt.Color;

public class CircleBug2 extends Bug
{
    public CircleBug2()
    {
 		
    }
    
    public void act()
    {
    	Grid gr = getGrid();
        Location loc = getLocation();
        turn();
        if (canMove())
        {
	        move();
	        Flower flower = new Flower(Color.YELLOW);
	        flower.putSelfInGrid(gr, loc);
        }
    }
}