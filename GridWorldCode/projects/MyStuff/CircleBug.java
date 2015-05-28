import info.gridworld.actor.Flower;
import info.gridworld.grid.Grid;
import info.gridworld.grid.Location;
import info.gridworld.actor.Bug;
import java.awt.Color;

public class CircleBug extends Bug
{
    public CircleBug()
    {
 
    }
    
    public void act()
    {
    	Grid gr = getGrid();
        Location loc = getLocation();
        turn();
    	move();
        Flower flower = new Flower(Color.YELLOW);
        flower.putSelfInGrid(gr, loc);
    }
}